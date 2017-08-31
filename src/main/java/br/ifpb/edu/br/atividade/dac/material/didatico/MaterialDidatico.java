package br.ifpb.edu.br.atividade.dac.material.didatico;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MaterialDidatico implements Serializable {

    @EmbeddedId
    private MaterialDidaticoPK primaryKey;
    
    @Column(length = 155)
    private String titulo;
    
    @Column(columnDefinition = "TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;
    
    @Column(columnDefinition = "TEXT")
    private String descricao;
    
    @Column(length = 55)
    private String autor;
    
    @Column(length = 15)
    @Enumerated(EnumType.STRING)
    private TipoMaterialDidatico tipo;
    
    private boolean publico;
    
    @Column(columnDefinition = "DECIMAL(6,2)")
    private double tamanho;

    public MaterialDidatico() {
    }

    public MaterialDidaticoPK getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(MaterialDidaticoPK primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public TipoMaterialDidatico getTipo() {
        return tipo;
    }

    public void setTipo(TipoMaterialDidatico tipo) {
        this.tipo = tipo;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "MaterialDidatico{" + "primaryKey=" + primaryKey + ", titulo=" +
                titulo + ", dataCadastro=" + dataCadastro + ", descricao=" + 
                descricao + ", autor=" + autor + ", tipo=" + tipo + ", publico="
                + publico + ", tamanho=" + tamanho + '}';
    }
    
    
    
}
