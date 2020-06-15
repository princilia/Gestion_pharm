/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;
import java.util.ArrayList;
import transfertObject.Client;

public interface IDaoClient {
    boolean ajoutClient(Client cli);;
    boolean deleteClient(int numCli);
    boolean updateClient(Client cli);
    ArrayList selectClient();
    
    ArrayList selectClientCp(String codePost);
    ArrayList selectClientTit(String titre); 
    ArrayList selectClientVil(String ville);
    ArrayList selectClientNom(String nom); 
    ArrayList selectClientNumCli(int numCli);
    ArrayList selectClientVilTit(String ville, String titre);
    ArrayList selectClientNomTit(String nom, String titre);
    ArrayList selectClientCpTit(String cp, String titre);
    int getObCliParNom(String Nom);
}
