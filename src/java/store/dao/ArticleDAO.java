/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import store.entity.Article;

/**
 *
 * @author admin
 */
public class ArticleDAO {
    
    public List<Article> listerArticle() {
    EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
    return em.createQuery("SELECT a FROM Article a").getResultList();
    }
    
    public Article rechercherParId(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Article.class, id);
    }
    
    public void enregistrerNewArticle(Article a) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
    }
    
    public void supprimerArticle(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Article a = em.find(Article.class, id);
        em.remove(a);
        em.getTransaction().commit();
    }
    
    public void modifierStockArticle(Article a) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(a);
        em.getTransaction().commit();
    }
    
}
