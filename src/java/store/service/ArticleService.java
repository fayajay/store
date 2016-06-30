/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.service;

import java.util.List;
import store.dao.ArticleDAO;
import store.entity.Article;

/**
 *
 * @author admin
 */
public class ArticleService {
    
    public List<Article> listerArticle() {
        return new ArticleDAO().listerArticle();
    }
    
    public Article rechercherParId(long articleId) {
        return new ArticleDAO().rechercherParId(articleId);
    }
    
    public void enregistrerNewArticle(Article a) {
        new ArticleDAO().enregistrerNewArticle(a);
    }
    
    public void supprimerArticle (long id) {
        new ArticleDAO().supprimerArticle(id);
    }
    
    public void modifierStockArticle (Article a) {
        new ArticleDAO().modifierStockArticle(a);
    }
    
    
    
}
