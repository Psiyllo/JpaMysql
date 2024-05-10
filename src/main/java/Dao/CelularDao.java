package Dao;

import dominio.Celular;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CelularDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ex-jpa");
    EntityManager em = emf.createEntityManager();

    public Celular create(Celular celular) {
        em.getTransaction().begin();
        em.persist(celular);
        em.getTransaction().commit();
        return celular;
    }

    public List<Celular> listAll() {
        return em.createQuery("select p from celular p", Celular .class).getResultList();
    }
}
