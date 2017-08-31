/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.edu.br.atividade.dac.oficina;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author ifpb
 */
public class ConsertoDAO {
    
    private final EntityManager manager;

    public ConsertoDAO() {
        this.manager = Persistence.createEntityManagerFactory("atividade-dac").createEntityManager();
    }
    
    public void add(Conserto conserto) {
        manager.getTransaction().begin();
        manager.persist(conserto);
        manager.getTransaction().commit();
    }
    
    public void remove(Conserto conserto) {
        manager.getTransaction().begin();
        manager.remove(conserto);
        manager.getTransaction().commit();
    }
    
    public Conserto get(ConsertoPK pk) {
        Conserto conserto;
        manager.getTransaction().begin();
        conserto = manager.find(Conserto.class, pk);
        manager.getTransaction().commit();
        return conserto;
    }
    
    public List<Conserto> get() {
        List<Conserto> consertos = manager
                .createQuery("SELECT c FROM Conserto c", Conserto.class)
                .getResultList();
        return consertos;
    }
}