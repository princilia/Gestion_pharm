/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;


public class LigneVente {
    private int numFacture;
    private int Numcli;
    private String Nomcli;
    private String Prenomcli;
    private int code_Prod;
    private String designation;
    private String delivrance;
    private int quantite_vente;
    private float tva;
    private float prix;
    private int stock;
    private int ancienStock;
    private int nouveauStock;
   

    public LigneVente(int numFacture, int code_Prod, int quantite_vente) {
        this.numFacture = numFacture;
        this.code_Prod = code_Prod;
        this.quantite_vente = quantite_vente;
    }

    public LigneVente(int numFacture, int Numcli, String Nomcli, String Prenomcli, int code_Prod, String designation, String delivrance, int quantite_vente, float tva, float prix) {
        this.numFacture = numFacture;
        this.Numcli = Numcli;
        this.Nomcli = Nomcli;
        this.Prenomcli = Prenomcli;
        this.code_Prod = code_Prod;
        this.designation = designation;
        this.delivrance = delivrance;
        this.quantite_vente = quantite_vente;
        this.tva = tva;
        this.prix = prix;
        
    }

   
    
    
    public LigneVente()
    {
        
    }
    

    public int getCode_Prod() {
        return code_Prod;
    }

   

    public String getNomcli() {
        return Nomcli;
    }

    public String getPrenomcli() {
        return Prenomcli;
    }

    public float getPrix() {
        return prix;
    }

    public String getDesignation() {
        return designation;
    }

    public int getStock() {
        return stock;
    }

    public float getTva() {
        return tva;
    }

    public String getNomPrenom()
    {   String s=this.Nomcli+" "+this.Prenomcli;
    return s;
    }

    public int getNumFacture() {
        return numFacture;
    }

    public int getNumcli() {
        return Numcli;
    }

    public String getDelivrance() {
        return delivrance;
    }

    public int getQuantite_vente() {
        return quantite_vente;
    }

    public void setNumFacture(int numFacture) {
        this.numFacture = numFacture;
    }

    public void setNumcli(int Numcli) {
        this.Numcli = Numcli;
    }

    public void setCode_Prod(int code_Prod) {
        this.code_Prod = code_Prod;
    }

    public void setDelivrance(String delivrance) {
        this.delivrance = delivrance;
    }

    public void setQuantite_vente(int quantite_vente) {
        this.ancienStock = this.quantite_vente;
        this.quantite_vente = quantite_vente;
    }

   
    public void setNomcli(String Nomcli) {
        this.Nomcli = Nomcli;
    }

    public void setPrenomcli(String Prenomcli) {
        this.Prenomcli = Prenomcli;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setStock(int stock) {
        
        this.stock = stock;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }
    public void setNomPrenom(String nom, String prenom) {
      this.Nomcli=nom;
      this.Prenomcli=prenom;
    }

    public int getAncienStock() {
        return ancienStock;
    }

   
    public void setAncienStock(int ancienStock) {
        this.ancienStock = ancienStock;
    }

   
    
    

    @Override
    public boolean equals(Object o) {
        boolean answer = super.equals(o);
        //verifier si o est une instance  de classe lignevente
        if (o instanceof LigneVente) {
            answer = new Integer(this.getCode_Prod()).equals(((LigneVente)o).getCode_Prod());
             
        }
        
        return answer;
    } 
}
