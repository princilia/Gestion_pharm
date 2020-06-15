/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;
import java.awt.List;
import java.util.ArrayList;
import transfertObject.Commande;
import transfertObject.Fournisseur;
import transfertObject.LigneCommande;
import transfertObject.Livrer;

public interface IDaoLigneCommande {
    boolean ajoutLigneCom(int numCom, LigneCommande lc);;
    boolean deleteLigneCom(LigneCommande lc);
    boolean updateLigneCom(LigneCommande lc);
    boolean updateLigneCom(Commande cmd, int idx);
    ArrayList selectLigneComCdProd(int codProd);
    ArrayList selectLigneCommande();
    ArrayList selectLigneComNumc(int numCom);
    ArrayList selectLigneComQte(int qte);
    ArrayList selectCodProd();
    ArrayList  selectCommandesParclipro(String nom,String prenom,String produit);
    void selectSumQteParCdPro(Fournisseur fourn,Livrer livrer);
    ArrayList<LigneCommande> selectLignComParnumfCodP(Fournisseur fourn,Livrer livrer);
    boolean updateComlignesQuantité (LigneCommande lignecommande);
    boolean updateComlignestock (LigneCommande lignecommande);
    void updateLigncom(ArrayList<LigneCommande> ligneCommandes);
}
