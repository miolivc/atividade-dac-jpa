/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.edu.br.atividade.dac.material.didatico;

import java.util.Date;

/**
 *
 * @author ifpb
 */
public class MaterialDidaticoApp {
    
    public static void main(String[] args) {
        
        MaterialDidaticoPK pKey = new MaterialDidaticoPK();
        pKey.setCodigo(2121211);
        pKey.setOrigem("Biblioteca");
        
        MaterialDidatico material = new MaterialDidatico();
        material.setPrimaryKey(pKey);
        material.setAutor("Fowler");
        material.setDataCadastro(new Date(20030203));
        material.setDescricao("Um material de UML");
        material.setPublico(true);
        material.setTamanho(1212);
        material.setTipo(TipoMaterialDidatico.APOSTILA);
        material.setTitulo("UML Essencial: Uma abordagem prática");
        
        MaterialDidaticoDAO dao = new MaterialDidaticoDAO();
        dao.add(material);
        
        for (MaterialDidatico m : dao.get()) {
            System.out.println("Item list:" + m);
        } 
        
        
        System.out.println("Selected Item: " + dao.get(pKey));
        
        dao.remove(material);
        
    }
    
}
