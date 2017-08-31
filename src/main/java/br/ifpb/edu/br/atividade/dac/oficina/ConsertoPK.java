/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.edu.br.atividade.dac.oficina;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ifpb
 */

@Embeddable
public class ConsertoPK implements Serializable {
    
    @ManyToMany
    @JoinColumn
    private Oficina oficina;
    
    @ManyToMany
    @JoinColumn
    private Funcionario funcionario;
    
    @Temporal(TemporalType.DATE)
    private LocalDate dataConserto;

    public ConsertoPK() {
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDate getDataConserto() {
        return dataConserto;
    }

    public void setDataConserto(LocalDate dataConserto) {
        this.dataConserto = dataConserto;
    }
    
}
