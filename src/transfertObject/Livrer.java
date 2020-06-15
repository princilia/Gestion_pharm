/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;

import java.util.ArrayList;


public class Livrer {
    
     private int quantite_livrer;
    private int quantite_restant;
    private int quantite_commander;
    private Produit produit;
     private LigneCommande lingecom;

    public LigneCommande getLingecom() {
        return lingecom;
    }

    public void setLingecom(LigneCommande lingecom) {
        this.lingecom = lingecom;
    }
     

    public int getQuantite_commander() {
        return quantite_commander;
    }

    public void setQuantite_commander(int quantite_commander) {
        this.quantite_commander = quantite_commander;
    }
    
    public int getQuantite_livrer() {
        return quantite_livrer;
    }

    public int getQuantite_restant() {
        return quantite_restant;
    }

    public void setQuantite_livrer(int quantite_livrer) {
        this.quantite_livrer = quantite_livrer;
    }

    public void setQuantite_restant(int quantite_restant) {
        this.quantite_restant = quantite_restant;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
    public Produit getProduit(){
        return produit;
    }

   
    
}
