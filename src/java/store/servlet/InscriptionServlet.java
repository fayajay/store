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
import store.entity.Utilisateur;
import store.service.UtilisateurService;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author admin
 */
@WebServlet(name = "InscriptionServlet", urlPatterns = {"/inscription"})
public class InscriptionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        
        req.getRequestDispatcher("inscription.jsp").forward(req, resp);
    }
    
        @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Utilisateur u = new Utilisateur();
        
        u.setLogin(req.getParameter("login"));
        u.setMdp(req.getParameter("mdp"));
        u.setAdresse(req.getParameter("adresse"));
        
        
        
        UtilisateurService us = new UtilisateurService();
   
        us.inscription(u);
        
        req.getSession().setAttribute("utilConnecte", u);
        
       
        resp.sendRedirect("listeArticle");
       
        
       
    }

}
