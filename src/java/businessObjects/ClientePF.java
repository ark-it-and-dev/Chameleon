package businessObjects;

import Enumerations.SexoClientePF;
import java.util.Date;

public class ClientePF extends Cliente {

    private Long id;
    private String cpf;
    private SexoClientePF sexo;
    private Date nascimento;

    public ClientePF() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

}
