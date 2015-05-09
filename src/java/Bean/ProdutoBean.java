package Bean;

import br.com.ChameleonEJB.DAO.ProdutoDAO;
import br.com.ChameleonEJB.Enum.StatusProduto;
import br.com.ChameleonEJB.Model.Produto;
import br.com.ChameleonEJB.Remote.ProdutoRemote;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProdutoBean {

    Produto produto = new Produto();
    @EJB
    ProdutoRemote prodDao;
    List<Produto> listaProdutos = new ArrayList<>();

    public ProdutoBean() {
        //listaProdutos = prodDao.allWhereStatusD();

        Produto prod = new Produto();
        prod.setNome("Biscoito");
        prod.setMarca("Trakinas");
        prod.setPreco(BigDecimal.valueOf(10.02));
        prod.setDescricao("Biscoito de chocolate Trakinas");
        listaProdutos.add(prod);

        prod = new Produto();
        prod.setNome("Chocolate");
        prod.setMarca("Bis");
        prod.setPreco(BigDecimal.valueOf(4.25));
        prod.setDescricao("Caixa de chocolate Bis");
        listaProdutos.add(prod);

        prod = new Produto();
        prod.setNome("Achocolatado");
        prod.setMarca("Toddy");
        prod.setPreco(BigDecimal.valueOf(25.00));
        prod.setDescricao("Achocolatado Toddy");
        listaProdutos.add(prod);

        prod = new Produto();
        prod.setNome("Biscoito");
        prod.setMarca("Cream Cracker");
        prod.setPreco(BigDecimal.valueOf(6.50));
        prod.setDescricao("Biscoito Cream Cracker");
        listaProdutos.add(prod);

        prod = new Produto();
        prod.setNome("Creme de chocolate");
        prod.setMarca("Nutella");
        prod.setPreco(BigDecimal.valueOf(49.99));
        prod.setDescricao("Creme de chocolate Nutella");
        listaProdutos.add(prod);
    }

    public List<Produto> getListaProdutos() {
        listaProdutos = prodDao.all();
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void adicionarProduto() {
        try {
            produto.setStatus(StatusProduto.D);
            prodDao.save(produto);
            System.out.println("sucesso");
        } catch (Exception erro) {
            System.out.println(erro.getMessage()
            );
        }
    }

    public void removerProduto(Produto p) {
        listaProdutos.remove(p);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
