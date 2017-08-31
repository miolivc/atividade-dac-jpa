package br.ifpb.edu.br.atividade.dac.oficina;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Funcionario implements Serializable {

    @Id
    private String cpf;
    private String rg;
    private String nome;
    private double salario;
    
    @OneToOne
    @Enumerated(EnumType.STRING)
    private FuncaoFuncionario funcao;
   
    @ManyToMany(mappedBy = "conserto")
    private List<Conserto> conserto;

    public Funcionario() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public FuncaoFuncionario getFuncao() {
        return funcao;
    }

    public void setFuncao(FuncaoFuncionario funcao) {
        this.funcao = funcao;
    }
}
