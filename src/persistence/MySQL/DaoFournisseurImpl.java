/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.MySQL;
import persistence.IDaofournisseur;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import transfertObject.Fournisseur;


public class DaoFournisseurImpl implements IDaofournisseur {
    
    public static DaoFournisseurImpl uniqueInstance = new DaoFournisseurImpl();
    
    public static DaoFournisseurImpl getInstance(){
    
        return uniqueInstance;
}

    @Override
    public boolean ajoutFournisseur(Fournisseur four) {
         boolean ok = ConnexionLogin.actionQuery("Insert into fournisseur (NumFour, societe, NomFr, PrenomFr, AdresseFr," +
        "CPFr, VilleFr,tel,fax,ObservationsFr) values (" +four.getNumFour() + ",'" + four.getSociete() + "','" + four.getNomFr() + "','" + four.getPrenomFr() +
        "','" + four.getAdresseFr() + "','" + four.getCpFr() + "','" + four.getVilleFr() + "','" + four.getTel() +  "','" + four.getFax() +"','" + four.getObservationsFr()+ "')");
        
        return ok;
    }
    

    @Override
    public boolean deleteFournisseur(int numFour) {
         boolean ok = ConnexionLogin.actionQuery("Delete from fournisseur where NumFour = " + numFour + "");
         return ok;
    }
    
   
    
    @Override
    public boolean updateFournisseur(Fournisseur four) {
        String req = "Update fournisseur set societe ='" + four.getSociete() +
        "', NomFr ='" + four.getNomFr() + "', PrenomFr ='" + four.getPrenomFr() + "', AdresseFr ='" + four.getAdresseFr() + 
        "', CPFr ='" + four.getCpFr()+ "', VilleFr ='" + four.getVilleFr()  + "', Tel ='" +four.getTel() + "', Fax ='" +four.getFax() + "', ObservationsFr ='" + four.getObservationsFr() +"' where NumFour =" + four.getNumFour();
       
        boolean ok= ConnexionLogin.actionQuery(req);
        return ok;
    }
    
  
    

    @Override
    public ArrayList selectFournisseur() {
         ArrayList <Fournisseur> myList = new ArrayList();
                
        String req = "Select * from fournisseur";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //c'est création de l'objet fournisseur......
                myList.add(new Fournisseur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8),resu.getString(9),resu.getString(10)));
             }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;

    }
    
    @Override
    public ArrayList selectFournisseurNumFour(int numFour)
    {
      ArrayList <Fournisseur> myList = new ArrayList();
      
      String req = "Select * from fournisseur where NumFour  = "+ numFour;
        
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //la création de l'objet fournisseur
                myList.add(new Fournisseur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8),resu.getString(9), resu.getString(10)));
             }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;  
    }
    
    @Override
    public ArrayList selectFournisseurCp(String codPost)
    {
        ArrayList <Fournisseur> myList = new ArrayList();
                
        String req = "Select * from fournisseur where CPFr Like '"+ codPost +"%'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                
                myList.add(new Fournisseur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8),resu.getString(9) ,resu.getString(10)));
             }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }
    
    @Override
    public ArrayList selectFournisseurSoc(String societe)
    {
      ArrayList <Fournisseur> myList = new ArrayList();
        
      String req = "Select * from fournisseur where societe  like '"+ societe +"'";
      
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //création de l'objet 
                myList.add(new Fournisseur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8),resu.getString(9) ,resu.getString(10)));
             }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;  
    }
    
    @Override
    public ArrayList selectFournisseurVil(String ville)
    {
        ArrayList <Fournisseur> myList = new ArrayList();
                
        String req = "Select * from fournisseur where VilleFr like '"+ ville+"%'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new Fournisseur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8), resu.getString(9),resu.getString(10)));
             }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }
    @Override
    public ArrayList selectFournisseurNom(String nom)
    {
        ArrayList <Fournisseur> myList = new ArrayList();
                
        String req = "Select * from fournisseur where NomFr like '"+nom+"%'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new Fournisseur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8),resu.getString(9), resu.getString(10)));
             }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }
    
    @Override
    public ArrayList selectFournisseurVilSoc(String ville, String societe)
    {
        ArrayList <Fournisseur> myList = new ArrayList();
                
        String req = "Select * from fournisseur where ( Societe like '" + societe + "' and VilleFr like '" + ville + "%')";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new Fournisseur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8), resu.getString(9),resu.getString(10)));
             }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }
    @Override
    public ArrayList selectFournisseurNomSoc(String nom, String societe)
    {
         ArrayList <Fournisseur> myList = new ArrayList();
         
         String req = "Select * from fournisseur where ( Societe Like '" + societe + "' and NomFr Like'" + nom + "%')";
         
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new Fournisseur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7), resu.getString(8),resu.getString(9),resu.getString(10)));
             }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
         
         return myList;
    }
    
    @Override
    public ArrayList selectFournisseurCpSoc(String cp, String societe)
    {
        ArrayList <Fournisseur> myList = new ArrayList();
        
        String req = "Select * from fournisseur where ( societe like '" + societe + "' and CPFr like '" + cp + "%')";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new Fournisseur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8) ,resu.getString(9),resu.getString(10)));
             }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
        
         return myList;
    }
    
    /* renvoie le numFournisseur dont le nom du fourn est passé en paramètre */
     @Override
    public int getNumFour(String nomF) {
        int num=-1;
        
        ResultSet resu = ConnexionLogin.selectQuery ("Select numFour from fournisseur where nomFr = '"
        +nomF+"'");
        
        try 
        {
            resu.next();
            num = resu.getInt(1);
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
        }
        return num;
    
    }
    
}

