package businessObjects;

import Enumerations.SexoClientePF;
import java.util.Date;
import java.util.List;

public class Cliente {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String telefone1;
    private String telefone2;
    private List<Endereco> listaEndereco;
    private List<Pedido> listaPedido;

    //dados do cliente pf
    private String cpf;
    private SexoClientePF sexo;
    private Date nascimento;

    //dados do cliente pj
    private String cnpj;
    private String razaoSocial;
    private String inscEstadual;

    //Criação de um cliente PF
    public Cliente(Long id, String nome, String email, String senha, String telefone1, String cpf, SexoClientePF sexo, Date nascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone1 = telefone1;
        this.cpf = cpf;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    //Criação de um cliente pj
    public Cliente(Long id, String nome, String email, String senha, String telefone1, String cnpj, String razaoSocial, String inscEstadual) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone1 = telefone1;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscEstadual = inscEstadual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public List<Endereco> getListaEndereco() {
        return listaEndereco;
    }

    public void setListaEndereco(List<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
    }

    public List<Pedido> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(List<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public SexoClientePF getSexo() {
        return sexo;
    }

    public void setSexo(SexoClientePF sexo) {
        this.sexo = sexo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

}
