/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;
import java.util.ArrayList;
import java.util.Date;
import transfertObject.Commande;

public interface IDaoCommande {
    boolean ajoutCommande(Commande cmd);;
    boolean deleteCommande(int numCmd);
    boolean updateCommande(Commande cmd);
    int getNumCom();
    ArrayList selectCommande();
    ArrayList selectCommandesParNumFour(String societe,String nom);
    ArrayList selectCommandeNomFour();
    ArrayList selectCommandeNumFour(int numFour);
    ArrayList <Commande> selectCommandeParSociete (String societe);
    ArrayList <Commande> selectCommandeParNomFr (String nom);
    ArrayList selectCommandeNumFourDate(int numCom, Date dat);
    ArrayList selectCommandeDate(Date dat);
    ArrayList selectCommandeLComProdFr();
    
    
    
    
    
}
