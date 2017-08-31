package br.ifpb.edu.br.atividade.dac.oficina;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name = "oficina_seq", sequenceName = "oficina_seq")

public class Oficina implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "oficina_seq")
    private int id;
    
    @Embedded
    private Localizacao localizacao;
    
    @OneToMany
    private List<Funcionario> funcionarios;
    private double saldo;

    public Oficina() {
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
	
}
