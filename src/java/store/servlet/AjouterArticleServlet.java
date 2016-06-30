/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AjouterArticleServlet", urlPatterns = {"/ajouterArticle"})
public class AjouterArticleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("ajouterArticle.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Article a = new Article();
        a.setNom(req.getParameter("nom"));
        a.setPrix(Long.parseLong(req.getParameter("prix")));
        a.setStock(Integer.parseInt(req.getParameter("stock")));
        
        ArticleService aserv = new ArticleService();
        aserv.enregistrerNewArticle(a);
        
        resp.sendRedirect("listeArticle");
    }



}
