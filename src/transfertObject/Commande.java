/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Commande {
    private int numCom;
    private Date dateCom;
         
    private ArrayList<LigneCommande> ligneComs = new ArrayList<LigneCommande>();
    private Fournisseur fourn;
   
    public Commande(){}
    
    public Commande(int numCom, Date dateCom) {
        this.numCom = numCom;

        this.dateCom = dateCom;
    }
    
    public int getNumCom() {
        return numCom;
    }

    public void setNumCom(int numCom) {
        this.numCom = numCom;
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

    public String getDateSQL() {
        String tmp;

        if (this.dateCom == null)
          tmp = "";
        else
          {
          SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-MM-dd");
          tmp = "'" + dateParser.format(this.dateCom) + "'";
          }
        return tmp;
    }

    public String getDateUS() {
        String tmp;

        if (this.dateCom == null)
          tmp = "";
        else
          {
          tmp = this.dateCom.toString();
          }
        return tmp;
    }
    
    public void setLigneCom(LigneCommande ligneCom){
        ligneComs.add(ligneCom);
    }
    
    public ArrayList<LigneCommande> getLigneComs(){
        return ligneComs;
    }
    
    public void setFournisseur(Fournisseur fournisseur) {
        this.fourn = fournisseur;
    }
    
    public Fournisseur getFournisseur() {
        return fourn;
    }
}
