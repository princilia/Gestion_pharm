/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;
import java.util.ArrayList;

import transfertObject.LigneVente;


public interface IDaoLigneVente {
    boolean ajoutLigneVente(LigneVente lv);;
    boolean deleteLigneVente(LigneVente lv);
    boolean updateLigneVente(LigneVente lv);
    ArrayList selectLigneVenteCdProd(int codProd);
    ArrayList selectLigneVente();
    ArrayList selectLigneVenteParNumCli(int numCli);
    ArrayList selectLigneVenteParCodepro(int codeprod);
    ArrayList selectLigneVenteParNumfacture(int numF);
    ArrayList selectLigneVenteQte(int qte);
    ArrayList selectCodProd();
    ArrayList  selectVenteParclipro(String nom,String prenom,String produit);
    ArrayList  selectVenteParcli(String nom,String prenom);
    ArrayList  selectVenteParpro(String designation);
    void updateVentlignesQuantité (LigneVente ligneVente);
    boolean updateVerifierStock (int id,int stock);
}
