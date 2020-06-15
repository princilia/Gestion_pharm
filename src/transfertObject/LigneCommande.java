/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LigneCommande {
    // Commande
    private int numCom;
    private Date dateCom;
    private int NumFour;
    private String Nomfr;
    private String Prenoml;
    
    // produit
    private int code_Prod;
    private String designation;
    private float prix;
    private float tva;
    
    private Produit produit;
    private boolean Achanger;
    
    private int quantite_renouvele;
    private int quantite_livrer;
    private int quantite_restant;
    private int stock;
    
    private Commande com;
    private Fournisseur fourn;
    
     private boolean estSauvegarder;
   
    public LigneCommande(int numCom, int code_Prod, int quantite_renouvele) {
        this.numCom = numCom;
        this.code_Prod = code_Prod;
        this.quantite_renouvele = quantite_renouvele;
    }
    
    public LigneCommande(Date dateCom ,String nomfr,String designation,int quantite_renouvele,int quantite_livrer,int quantite_restant){
        this.dateCom=dateCom;
        this.Nomfr=nomfr;
        this.designation=designation;
        this.quantite_renouvele= quantite_renouvele;
        this.quantite_livrer=quantite_livrer;
        this.quantite_restant=quantite_restant;
    }
    
    

    public LigneCommande(int numCom, int code_Prod, int NumFour, String Nomfr, String Prenoml, String designation, float prix, float tva, int stock, int quantite_renouvele,  Date dateCom) {
        this.numCom = numCom;
        this.code_Prod = code_Prod;
        this.NumFour = NumFour;
        this.Nomfr = Nomfr;
        this.Prenoml = Prenoml;
        this.designation = designation;
        this.prix = prix;
        this.tva = tva;
        this.stock = stock;
        this.quantite_renouvele = quantite_renouvele;
        
        this.dateCom=dateCom;
    }

    
    
    public LigneCommande()
    {
        
    }
    
    
    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
    public Produit getProduit(){
        return produit;
    }

    public int getCode_Prod() {
        return code_Prod;
    }

    public int getNumCom() {
        return numCom;
    }

    
    public void setCode_Prod(int code_Prod) {
        this.code_Prod = code_Prod;
    }

    public void setNumCom(int numCom) {
        this.numCom = numCom;
    }

    public int getQuantite_renouvele() {
        return quantite_renouvele;
    }

    public int getNumFour() {
        return NumFour;
    }

    public String getNoml() {
        return Nomfr;
    }

    public String getPrenoml() {
        return Prenoml;
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
    {   String s=this.Nomfr+" "+this.Prenoml;
        return s;
    }

    public void setQuantite_renouvele(int quantite_renouvele) {
        this.quantite_renouvele = quantite_renouvele;
    }

    public void setNumFour(int NumFour) {
        this.NumFour = NumFour;
    }

    public void setNoml(String Noml) {
        this.Nomfr = Noml;
    }

    public void setPrenoml(String Prenoml) {
        this.Prenoml = Prenoml;
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

    public Date getDateCom() {
        return dateCom;
    }

    public void setDateCom(Date dateCom) {
        this.dateCom = dateCom;
    }
    
    public String getDateBE() {
        String tmp;

        if (this.dateCom == null)
          tmp = "";
        else
          {
          SimpleDateFormat dateParser = new SimpleDateFormat("dd/MM/yyyy");
          tmp = dateParser.format(this.dateCom);
          }
        return tmp;
    }

    public void setDateBE(String dateCom) {
        SimpleDateFormat dateParser = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateCom = dateParser.parse(dateCom);
        } catch (ParseException ex) {
            Logger.getLogger(Commande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isAchanger() {
        return Achanger;
    }

    public void setAchanger(boolean Achanger) {
        this.Achanger = Achanger;
    }

    public String getNomfr() {
        return Nomfr;
    }

    public int getQuantite_livrer() {
        return quantite_livrer;
    }

    public int getQuantite_restant() {
        return quantite_restant;
    }

    public void setNomfr(String Nomfr) {
        this.Nomfr = Nomfr;
    }

    public void setQuantite_livrer(int quantite_livrer) {
        this.quantite_livrer = quantite_livrer;
    }

    public void setQuantite_restant(int quantite_restant) {
        this.quantite_restant = quantite_restant;
    }
    
     @Override
    public boolean equals(Object o) {
        boolean answer = super.equals(o);
        //verifier si o est une instance  de classe lignecommande 
        if (o instanceof LigneCommande) {
            answer = this.getId().equals(((LigneCommande)o).getId());
        }
      
        
        return answer;
    } 
    
    private String getId(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.getNumCom());
        sb.append(this.getProduit().getCode_prod());
        return sb.toString() ;
    }
}
    
    

