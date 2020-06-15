/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;
import java.util.ArrayList;
import java.util.Date;
import transfertObject.Facture;

public interface IDaoFacture {
    boolean ajoutFacture(Facture fact);
    boolean deleteFacture(int numFacture);
    boolean updateFacture(Facture fact);
    ArrayList selectFacture();
    ArrayList  selectFactureParNumCli(String nom,String prenom);
    ArrayList selectFactureNomCli();
    ArrayList selectFactureNumCli(int numCli);
    ArrayList selectFactureImprimer(int num);
    ArrayList selectFactureDate(Date dat);
    ArrayList selectFacturePayer(boolean payer);
    ArrayList selectFactureNumCliPayer(int numCli, boolean payer);
    ArrayList selectFactureNumCliDate(int numCli, Date dat);
    ArrayList selectFactureDatPayer(Date dat,boolean payer);
    ArrayList selectFactureNumCliDatPayer(int numCli, Date dat, boolean payer);
    int getObFactureParNomPrenom(String NomPrenom);
     ArrayList selectFactureNumFacture(int numF);
     boolean MAJMontantFact (Facture fact);
     
    
    
}
