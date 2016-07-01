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
@WebServlet(name = "PanierServlet", urlPatterns = {"/panier"})
public class PanierServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        ArticleService aserv = new ArticleService();
        Article article = aserv.rechercherParId(Long.parseLong(req.getParameter("id")));
        
        req.setAttribute("article", article);
        
        req.getRequestDispatcher("panier.jsp").forward(req, resp);
    }

    

}
