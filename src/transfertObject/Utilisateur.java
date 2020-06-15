/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;


public class Utilisateur {
    public enum TypeUtilisateur { Employé, Stagiaire, Gerant }
    int id_user;
    String nomId;
    String prenomId;
    String username;
    String password;
    String ConfirmeMP;
    TypeUtilisateur type;

    public Utilisateur() {
    }

    public Utilisateur(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    
    
    public Utilisateur(int id_user, String nomId, String prenomId, String username, String password, TypeUtilisateur type) {
        this.id_user = id_user;
        this.nomId = nomId;
        this.prenomId = prenomId;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public String getNomId() {
        return nomId;
    }

    public String getPrenomId() {
        return prenomId;
    }

    public void setNomId(String nomId) {
        this.nomId = nomId;
    }

    public void setPrenomId(String prenomId) {
        this.prenomId = prenomId;
    }

  

    public int getId_user() {
        return id_user;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public TypeUtilisateur getType() {
        return type;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(TypeUtilisateur type) {
        this.type = type;
    }

    public String getConfirmeMP() {
        return ConfirmeMP;
    }

    public void setConfirmeMP(String ConfirmeMP) {
        this.ConfirmeMP = ConfirmeMP;
    }

   
    
    
    
    
}
