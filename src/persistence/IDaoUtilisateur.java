/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;
import java.sql.SQLException;
import java.util.ArrayList;

import transfertObject.Utilisateur;
import transfertObject.Utilisateur.TypeUtilisateur;

public interface IDaoUtilisateur {
    void ajoutUtilisateur(Utilisateur util)throws Exception; 
    boolean deleteUtilisateur(int id_user);
    void updateUtilisateur(Utilisateur util)throws Exception; 
    ArrayList selectUtilisateur();
    ArrayList selectUtilisateurTyp(TypeUtilisateur type); 
    ArrayList selectUtilisateurNomTyt(String nom, TypeUtilisateur type);
    ArrayList selectUtilisateurNom(String nom); 
    ArrayList selectUtilisateurId_user(int id_user);
    ArrayList selectUtilisateurUsername(String username);
    boolean existUser(Utilisateur username);
    public Utilisateur getUtilisateurByUserName(String username);
    public Utilisateur getUtilisateurPasswordByUserNameAndPassword(String username, String password) throws SQLException;
}
