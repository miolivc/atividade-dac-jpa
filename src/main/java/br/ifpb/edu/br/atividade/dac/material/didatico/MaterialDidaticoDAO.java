/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.edu.br.atividade.dac.material.didatico;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author ifpb
 */

public class MaterialDidaticoDAO {

    private final EntityManager manager;

    public MaterialDidaticoDAO() {
        this.manager = Persistence.createEntityManagerFactory("atividade-dac").createEntityManager();
    }
    
    public void add(MaterialDidatico material) {
        manager.getTransaction().begin();
        manager.persist(material);
        manager.getTransaction().commit();
    }
    
    public void remove(MaterialDidatico material) {
        manager.getTransaction().begin();
        manager.remove(material);
        manager.getTransaction().commit();
    }
    
    public MaterialDidatico get(MaterialDidaticoPK pk) {
        MaterialDidatico material = null;
        manager.getTransaction().begin();
        material = manager.find(MaterialDidatico.class, pk);
        manager.getTransaction().commit();
        return material;
    }
    
    public List<MaterialDidatico> get() {
        List<MaterialDidatico> materiais = manager
                .createQuery("SELECT m FROM MaterialDidatico m", MaterialDidatico.class)
                .getResultList();
        return materiais;
    }
}
