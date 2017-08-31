/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.edu.br.atividade.dac.material.didatico;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ifpb
 */

@Embeddable
public class MaterialDidaticoPK implements Serializable {
    
    @Column(length = 45)
    private String origem;
    
    @Column(columnDefinition = "BIGINT")
    private long codigo;

    public MaterialDidaticoPK() {
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    
}
