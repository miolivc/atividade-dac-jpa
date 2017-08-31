package br.ifpb.edu.br.atividade.dac.oficina;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "conserto_seq", sequenceName = "conserto_seq")

public class Conserto implements Serializable {

    @EmbeddedId
    private ConsertoPK consertoPK;
    
    @Column(columnDefinition = "NUMERIC(8,2)")
    private double valor;
    
    public Conserto() {
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ConsertoPK getConsertoPK() {
        return consertoPK;
    }

    public void setConsertoPK(ConsertoPK consertoPK) {
        this.consertoPK = consertoPK;
    }

}
