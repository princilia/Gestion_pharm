 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.MySQL;
import persistence.IDaoCommande;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import transfertObject.Commande;  
import transfertObject.Fournisseur;
import transfertObject.ObjectTransfert;
import transfertObject.LigneCommande;
import transfertObject.Produit;


public class DaoCommandeImpl implements IDaoCommande {
    
    public static DaoCommandeImpl uniqueInstance = new DaoCommandeImpl();
    Produit produit;
    public static DaoCommandeImpl getInstance(){
    
        return uniqueInstance;
}

    @Override
    public boolean ajoutCommande(Commande cmd) {
        DaoLigneCommandeImpl dao = new DaoLigneCommandeImpl();
     
       // Ajouter les ligne de commande dans la Table Command.
       // Puis Ajouter la commande 
        
         boolean ok = ConnexionLogin.actionQuery("Insert into commande ( NumFour,  " +
        "DateCom) values (" + cmd.getFournisseur().getNumFour() +"," + cmd.getDateSQL()  + ")");
         
        for (LigneCommande l : cmd.getLigneComs()){
            dao.ajoutLigneCom(cmd.getNumCom(), l);
        }
             
        return ok;
    }

    @Override
    public boolean deleteCommande(int numCmd) {
         boolean ok = ConnexionLogin.actionQuery("Delete from commande where NumCom = " + numCmd + "");
         return ok;
    }

    @Override
    public boolean updateCommande(Commande cmd) {
       
        boolean ok = ConnexionLogin.actionQuery("Update commande set NumFour =" + cmd.getFournisseur().getNumFour() +
             ", DateCom = " + cmd.getDateSQL() + " where NumCom = " +  cmd.getNumCom());
        return ok;
    }
    
    //methode pour recuperer le dernier valeur de la clé primaire et l'incremente de 1
     @Override
    public int getNumCom(){
        int r = 0;
        try {
            String req ="select NUMCOM from Commande order by NUMCOM desc";
            
            ResultSet resu = ConnexionLogin.selectQuery (req);
            resu.first();
            r = resu.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(DaoCommandeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return r + 1;
    }

    @Override
    public ArrayList selectCommande() {
         ArrayList <Commande> myList = new ArrayList();
        
          
        String req = "Select NumCom,F.numFour,societe,NomFr,DateCom from commande C,fournisseur F where C.NumFour=F.NumFour ORDER BY `C`.`datecom` desc,F.`NUMFOUR` asc ";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //création de l'objet Commande
                Commande com = new Commande(resu.getInt("NumCom"), resu.getDate("DateCom"));
                Fournisseur fourn = new Fournisseur();
                    fourn.setNumFour(resu.getInt("NumFour"));
                    fourn.setSociete(resu.getString("Societe"));
                    fourn.setNomFr(resu.getString("NomFr"));
                com.setFournisseur(fourn);
                
                myList.add(com);
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
    public ArrayList selectCommandeLComProdFr() {
         ArrayList <Commande> myList = new ArrayList();
        
          
        String req = "Select NumCom,F.numFour,societe,NomFr,DateCom from commande C,fournisseur F where C.NumFour=F.NumFour ORDER BY `C`.`datecom` desc,F.`NUMFOUR` asc";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //création de l'objet Commande
                Commande com = new Commande(resu.getInt("NumCom"), resu.getDate("DateCom"));
                Fournisseur fourn = new Fournisseur();
                    fourn.setNumFour(resu.getInt("NumFour"));
                    fourn.setNomFr(resu.getString("NomFr"));
                com.setFournisseur(fourn);
                
                myList.add(com);
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
      
    public ArrayList selectCommandesParNumFour(String societe,String nom)
    {
        ArrayList <Commande> myList = new ArrayList();
        
        String req = "Select NumCom, C.NumFour,Societe,NomFr,DateCom from commande C,fournisseur F   " +
                 "  where C.NumFour=F.NumFour  and  C.Societe like '"+societe+"' and C.NomFr like '"+nom+"' order by 1 ";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {                
                //création de l'objet Commande
                Commande com = new Commande(resu.getInt("NumCom"), resu.getDate("DateCom"));
                Fournisseur fourn = new Fournisseur();
                    fourn.setNumFour(resu.getInt("NumFour"));
                    fourn.setSociete(resu.getString("Societe"));
                    fourn.setNomFr(resu.getString("NomFr"));
                com.setFournisseur(fourn);
                
                myList.add(com);
                            
                            
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
    public ArrayList selectCommandeNomFour()
    {
        ArrayList <Fournisseur> myList = new ArrayList();
                
        String req = "Select c.NumFour,c.societe,c.NomFr ,c.PrenomFr,c.AdresseFr, c.CPFr,c.VilleFr,c.tel,c.fax,c.ObservationsFr  from Commande cmd ,Fournisseur c where cmd.NumFour = c.NumFour Group by 1";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //création de l'objet fournisseur
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
    public ArrayList selectCommandeNumFour(int numFour)
    {
        ArrayList <Commande> myList = new ArrayList();
                
        String req = "Select NumCom,C.numFour,Societe,NomFr,DateCom from commande C,fournisseur F where C.NumFour=F.NumFour and NumFour = " + numFour;
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //création de l'objet Commande
                Commande com = new Commande(resu.getInt("NumCom"), resu.getDate("DateCom"));
                Fournisseur fourn = new Fournisseur();
                    fourn.setNumFour(resu.getInt("NumFour"));
                    fourn.setSociete(resu.getString("Societe"));
                    fourn.setNomFr(resu.getString("NomFr"));
                com.setFournisseur(fourn);
                
                myList.add(com);
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
    public ArrayList <Commande> selectCommandeParSociete (String societe)
    {
        ArrayList myList = new ArrayList();
  
   String req = "Select NumCom, C.NumFour,Societe,NomFr,DateCom from commande C,fournisseur F   " +
                 "  where C.NumFour=F.NumFour  and  F.Societe like '"+societe+"'  order by 1 ";
        
    ResultSet resu = ConnexionLogin.selectQuery (req);
            try {
            while (resu.next())
                {  
                   //création de l'objet Commande
                Commande com = new Commande(resu.getInt("NumCom"), resu.getDate("DateCom"));
                Fournisseur fourn = new Fournisseur();
                    fourn.setNumFour(resu.getInt("NumFour"));
                    fourn.setSociete(resu.getString("Societe"));
                    fourn.setNomFr(resu.getString("NomFr"));
                com.setFournisseur(fourn);
                
                myList.add(com);
                }
            }catch (SQLException e)
            {
                System.out.println(e.toString());
                System.exit(-1);
            }
            
        return myList; 
    
    }
    @Override
    public ArrayList <Commande> selectCommandeParNomFr (String nom)
    {
        ArrayList myList = new ArrayList();
  
   String req = "Select NumCom, C.NumFour,Societe,NomFr,DateCom from commande C,fournisseur F   " +
                 "  where C.NumFour=F.NumFour  and  F.NomFr like '"+nom+"'  order by 1 ";
        
    ResultSet resu = ConnexionLogin.selectQuery (req);
            try {
            while (resu.next())
                {  
                    //création de l'objet Commande
                Commande com = new Commande(resu.getInt("NumCom"), resu.getDate("DateCom"));
                Fournisseur fourn = new Fournisseur();
                    fourn.setNumFour(resu.getInt("NumFour"));
                    fourn.setSociete(resu.getString("Societe"));
                    fourn.setNomFr(resu.getString("NomFr"));
                com.setFournisseur(fourn);
                
                myList.add(com);
                }
            }catch (SQLException e)
            {
                System.out.println(e.toString());
                System.exit(-1);
            }
            
        return myList; 
    
    }
     @Override
    public ArrayList selectCommandeNumFourDate(int numCom, Date dat)
    {
        ArrayList <Commande> myList = new ArrayList();
                
        String req = "Select NumCom,C.numFour,Societe,NomFr,DateCom from commande C,fournisseur F where C.NumFour=F.NumFour"
                + " and C.DateCom = '"+ ObjectTransfert.getDateSql(dat) + "' and C.NumCom = "+ numCom;
       
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                 //création de l'objet Commande
                Commande com = new Commande(resu.getInt("NumCom"), resu.getDate("DateCom"));
                Fournisseur fourn = new Fournisseur();
                    fourn.setNumFour(resu.getInt("NumFour"));
                    fourn.setSociete(resu.getString("Societe"));
                    fourn.setNomFr(resu.getString("NomFr"));
                com.setFournisseur(fourn);
                
                myList.add(com);
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
    public ArrayList selectCommandeDate(Date dat)
    {
        ArrayList <Commande> myList = new ArrayList();
                
        String req = "Select NumCom,C.numFour,Societe,NomFr,DateCom from commande C,fournisseur F "
                + "where C.NumFour=F.NumFour and DateCom ='"+ ObjectTransfert.getDateSql(dat) +"'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                  //création de l'objet Commande
                Commande com = new Commande(resu.getInt("NumCom"), resu.getDate("DateCom"));
                Fournisseur fourn = new Fournisseur();
                    fourn.setNumFour(resu.getInt("NumFour"));
                    fourn.setSociete(resu.getString("Societe"));
                    fourn.setNomFr(resu.getString("NomFr"));
                com.setFournisseur(fourn);
                
                myList.add(com);
             }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }
    
  
    
     
      
     
     
     
    
    
   
    
   
    
   

    
    
    
}

