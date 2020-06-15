/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;


public class FactureImprimer {
    private int code;
    private String designation;
    
    private String Delivrance;
    
    private int Quantite_vente;
           
    private float prix;
    private float tva;
    
    public FactureImprimer(int code, String designation, String Delivrance, int Quantite_vente, float prix, float tva) {
        this.code = code;
        this.designation = designation;     
        
        this.Delivrance = Delivrance;
        this.Quantite_vente = Quantite_vente;
        this.prix = prix;
        this.tva = tva;
        
    }

    
    
    public FactureImprimer()
    {
    
    }

   

    public String getDelivrance() {
        return Delivrance;
    }

    

   

    public void setDelivrance(String Delivrance) {
        this.Delivrance = Delivrance;
    }

   
    

    public int getCode() {
        return code;
    }

    public String getDesignation() {
        return designation;
    }

    public float getPrix() {
        return prix;
    }

    public int getQuantite_vente() {
        return Quantite_vente;
    }

    public float getTva() {
        return tva;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setQuantite_vente(int Quantite_vente) {
        this.Quantite_vente = Quantite_vente;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }
    
    
    
}
