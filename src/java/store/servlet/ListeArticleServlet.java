/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import store.entity.Article;
import store.service.ArticleService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListeArticleServlet", urlPatterns = {"/listeArticle"})
public class ListeArticleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        ArticleService aserv = new ArticleService();
        List<Article> articleEnStock = aserv.listerArticle();
        
        req.setAttribute("article", articleEnStock);
        
        req.getRequestDispatcher("listeArticle.jsp").forward(req, resp);
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Article a = new ArticleService().rechercherParId(Long.parseLong(req.getParameter("id")));
        a.setStock(Integer.parseInt(req.getParameter("stock")));
        
        ArticleService aserv = new ArticleService();
        aserv.modifierStockArticle(a);
        resp.sendRedirect("listeArticle");
        
    }
    
}
