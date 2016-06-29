/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.service;

import store.dao.UtilisateurDAO;
import store.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurService {
    
       public Utilisateur connexion(String login, String mdp) {

        UtilisateurDAO dao = new UtilisateurDAO();

        return dao.connexion(login, mdp);

    }
    
}
