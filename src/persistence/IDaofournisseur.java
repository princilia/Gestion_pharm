/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.ArrayList;
import transfertObject.Fournisseur;

public interface IDaofournisseur {
    boolean ajoutFournisseur(Fournisseur four);;
    boolean deleteFournisseur(int numFour);
    boolean updateFournisseur( Fournisseur four);
    ArrayList selectFournisseur();
    ArrayList selectFournisseurCp(String codePost);
    ArrayList selectFournisseurSoc(String societe); 
    ArrayList selectFournisseurVil(String ville);
    ArrayList selectFournisseurNom(String nom); 
    ArrayList selectFournisseurNumFour(int numFour);
    ArrayList selectFournisseurVilSoc(String ville, String societe);
    ArrayList selectFournisseurNomSoc(String nom, String societe);
    ArrayList selectFournisseurCpSoc(String cp, String societe);
    int getNumFour(String nomF);
    
}
