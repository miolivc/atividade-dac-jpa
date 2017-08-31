package br.ifpb.edu.br.atividade.dac.oficina;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Localizacao implements Serializable {

    private String rua;
    private int numero;
    private String cidade;

    public Localizacao() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    	
}
