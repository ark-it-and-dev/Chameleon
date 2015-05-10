package Bean;

import br.com.ChameleonEJB.Model.Cliente;
import br.com.ChameleonEJB.Remote.ClienteRemote;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;

@ManagedBean
@ViewScoped
public class ValidaCadastroBean implements Serializable {

    @EJB
    ClienteRemote cliRemote;

    private UsuarioBean usuario = new UsuarioBean();
    private boolean proximo;

    public UsuarioBean getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioBean usuario) {
        this.usuario = usuario;
    }

    public void salvar() {
        FacesMessage msg = new FacesMessage("Cadastro Criado com Successo", "Bem Vindo :" + usuario.getNome() + " " + usuario.getSobrenome());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public boolean getProximo() {
        return proximo;
    }

    public void setProximo(boolean proximo) {
        this.proximo = proximo;
    }

    public String onFlowProcess(FlowEvent event) {
        if (proximo) {
            proximo = false;
            return "confirmar";
        } else {
            return event.getNewStep();
        }
    }

    public void verifyEmail(String email) {
        Cliente cli = cliRemote.getByEmail(email);
        if (cli == null) {
            //Envia para pag cadastroCliente.xhtml
        } else {
            FacesMessage msg = new FacesMessage("O email já existe. Favor informar outro e-mail para o cadastro");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
}
