/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.service;

import java.util.List;
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
    
    public void inscription(Utilisateur u) {

        UtilisateurDAO dao = new UtilisateurDAO();
        
        List<Utilisateur> listeUtilAvecCeLogin = dao.rechercherParLogin(u.getLogin());
      
        if (listeUtilAvecCeLogin.size() > 0) {
            throw new RuntimeException("Ce login existe déjà");
        }

        dao.ajouterUtilisateur(u);
    }
    
    

}
