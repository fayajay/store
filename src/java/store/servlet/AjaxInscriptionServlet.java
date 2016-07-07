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

/**
 *
 * @author admin
 */
@WebServlet(name = "AjaxInscriptionServlet", urlPatterns = {"/ajax_inscription"})
public class AjaxInscriptionServlet extends HttpServlet {


    
        @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        PrintWriter out = resp.getWriter();
        String login, mdp, nom;
        login = req.getParameter("login");
        mdp = req.getParameter("mdp");
        nom = req.getParameter("nom");
        
        out.print(login + " " + mdp + " " + nom);
 
       
}
}
