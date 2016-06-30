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
 * @author kellyleclerc
 */
@WebServlet(name = "StoreServlet", urlPatterns = {"/store"})
public class StoreServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
        ArticleService aserv = new ArticleService();
        List<Article> store = aserv.listerArticle();
        
        req.setAttribute("article", store);
        
        req.getRequestDispatcher("store.jsp").forward(req, resp);
    }

}
