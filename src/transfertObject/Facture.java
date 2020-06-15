   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Facture {
    private  int numFacture;
    private int id_user;
    private String nomId; 
    private int numCli;
    private String nomcli;
    private String prenomcli;
    private Date dateVente;
    private float paye;
    private float Apayer;
    
    

    public Facture() {
    }

    public Facture(int numFacture, int id_user, int numCli, Date dateVente, float paye) {
        this.numFacture = numFacture;
        this.id_user = id_user;
        this.numCli = numCli;
        this.dateVente = dateVente;
        this.paye = paye;
    }

    public Facture(int numFacture, int id_user, String nomId, int numCli, String nomcli, String prenomcli, Date dateVente, float paye,float Apayer) {
        this.numFacture = numFacture;
        this.id_user = id_user;
        this.nomId = nomId;
        this.numCli = numCli;
        this.nomcli = nomcli;
        this.prenomcli = prenomcli;
        this.dateVente = dateVente;
        this.paye = paye;
        this.Apayer=Apayer;
    }

    
    public String getNomId() {
        return nomId;
    }

    public void setNomId(String nomId) {
        this.nomId = nomId;
    }

   

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

   
    public String getPrenomcli() {
        return prenomcli;
    }

    public void setPrenomcli(String prenomcli) {
        this.prenomcli = prenomcli;
    }

    public float getApayer() {
        return Apayer;
    }

    public void setApayer(float Apayer) {
        this.Apayer += Apayer;
    }
    

  
    

    public int getNumFacture() {
        return numFacture;
    }

  

    public int getNumCli() {
        return numCli;
    }

    public String getNomcli() {
        return nomcli;
    }

   

    

    public void setNumFacture(int numFacture) {
        this.numFacture = numFacture;
    }

   

    public void setNumCli(int numCli) {
        this.numCli = numCli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

   

   
    public Date getDateVente() {
        return dateVente;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }
    
    
    
     public String getDateBE() {
        String tmp;

        if (this.dateVente == null)
          tmp = "";
        else
          {
          SimpleDateFormat dateParser = new SimpleDateFormat("dd/MM/yyyy");
          tmp = dateParser.format(this.dateVente);
          }
        return tmp;
    }

    public void setDateBE(String dateVente) {
        SimpleDateFormat dateParser = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateVente = dateParser.parse(dateVente);
        } catch (ParseException ex) {
            Logger.getLogger(Commande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getDateSQL() {
        String tmp;

        if (this.dateVente == null)
          tmp = "";
        else
          {
          SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-MM-dd");
          tmp = "'" + dateParser.format(this.dateVente) + "'";
          }
        return tmp;
    }

    public String getDateUS() {
        String tmp;

        if (this.dateVente == null)
          tmp = "";
        else
          {
          tmp = this.dateVente.toString();
          }
        return tmp;
    }

    public float getPaye() {
        return paye;
    }
    

    public void setPaye(float paye) {
        this.paye = paye;
    }
    
    
    
    
     public String getNomPrenom()
    {
        String s="";
        s=nomcli+" "+prenomcli;
        return s;
    }
    
     public String getNomPrenomvente()
    {
        String s="";
        s=numFacture+" "+nomcli+" "+prenomcli;
        return s;
    }
     
     
}
