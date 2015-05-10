package Bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginBean {

    private String login;
    private String senha;
    private String email;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void entrar() {
        
        if (email.equals("admin") && senha.equals("admin")) {
            //redireciona para página templateAdmin.xhtml
        } else {
            FacesMessage msg = new FacesMessage("Usuário / senha incorretos");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

}
