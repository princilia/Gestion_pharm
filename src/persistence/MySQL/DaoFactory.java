/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.MySQL;

import persistence.IDaoClient;
import persistence.IDaoCommande;
import persistence.IDaoFacture;
import persistence.IDaoUtilisateur;
import persistence.IDaoLigneCommande;
import persistence.IDaofournisseur;
import persistence.IDaoProduit;
import persistence.IDaoLigneVente;

public class DaoFactory {
            
    public static IDaoClient getDaoClient(){
        return DaoClientImpl.getInstance();
    }
    
    public static IDaoUtilisateur getDaoUtilisateur(){
        return DaoUtilisateurImpl.getInstance();
    }
    
    public static IDaoCommande getDaoCommande(){
        return DaoCommandeImpl.getInstance();
    }
    
    public static IDaoLigneCommande getDaoLigneCommande(){
        return DaoLigneCommandeImpl.getInstance();
    }
    
    public static IDaoLigneVente getDaoLigneVente(){
        return DaoLigneVenteImpl.getInstance();
    }
 
    public static IDaofournisseur getDaofournisseur(){
        return DaoFournisseurImpl.getInstance();
    }
     
    public static IDaoProduit getDAOProduit(){
        return persistence.MySQL.DaoProduitImpl.getIntance();
    }
      
    public static IDaoFacture getDaoFacture(){
        return DaoFactureImpl.getInstance();
    }
}
