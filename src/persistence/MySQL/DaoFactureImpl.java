/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.MySQL;

import persistence.IDaoFacture;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import transfertObject.Client;

import transfertObject.FactureImprimer;
import transfertObject.ObjectTransfert;
import transfertObject.Facture;


public class DaoFactureImpl implements IDaoFacture {
    
    public static DaoFactureImpl uniqueInstance = new DaoFactureImpl();
    
    public static DaoFactureImpl getInstance(){
    
        return uniqueInstance;
}

    @Override
    public boolean ajoutFacture(Facture fact) {
        boolean ok = ConnexionLogin.actionQuery("Insert into facture (NumFacture,Id_User,Numcli ,DateVente, " +
        "Paye) values (" +fact.getNumFacture() + "," + fact.getId_user() + ","  + fact.getNumCli() +  ","  + fact.getDateSQL() + "," + fact.getPaye() + ")");
        return ok;
    }

    @Override
    public boolean deleteFacture(int numFacture) {
         boolean ok = ConnexionLogin.actionQuery("Delete from facture  where NumFacture = " + numFacture + "");
         return ok;
    }

    @Override
    public boolean updateFacture(Facture fact) {
      
         boolean ok = ConnexionLogin.actionQuery("Update facture set Id_user =" + fact.getId_user() +
        ", NumCli =" + fact.getNumCli() + ", DateVente = " + fact.getDateSQL() + ", Paye = " + fact.getPaye() + " where NumFacture = " + 
         fact.getNumFacture());
        return ok;
    }

    @Override
    public ArrayList selectFacture() {
         ArrayList <Facture> myList = new ArrayList(); 
         
        String req = "select NumFacture,V.id_user,NomId,V.Numcli,Nomcli,Prenomcli,DateVente,Paye,Apayer from facture V, client C,utilisateur U "
                +"where V.numcli=C.numcli and V.id_user=U.id_user order by 1  ";
                
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                 myList.add(new Facture(resu.getInt("NumFacture"),resu.getInt("Id_user"), resu.getString("NomId"),resu.getInt("Numcli"),resu.getString("Nomcli"),resu.getString("Prenomcli"),
                                       resu.getDate("DateVente"),resu.getFloat("Paye"),resu.getFloat("APayer") ));
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
    
     public ArrayList  selectFactureParNumCli(String nom,String prenom)
    {
        ArrayList <Facture> myList = new ArrayList();
        String req = "select NumFacture,V.id_user,NomId,V.Numcli,C.NomCli,C.PrenomCli,DateVente,Paye,Apayer from facture V, client C,utilisateur U"
                +"where V.numcli=C.numcli and V.id_user=U.id_user and  C.Nomcli like '"+nom+"' and C.Prenomcli like '"+prenom+"' order by 1 ";
       
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {                
                  myList.add(new Facture(resu.getInt("NumFacture"),resu.getInt("Id_user"), resu.getString("NomId"),resu.getInt("Numcli"),resu.getString("Nomcli"),resu.getString("Prenomcli"),
                                       resu.getDate("DateVente"),resu.getFloat("Paye"),resu.getFloat("APayer") ));
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
    public ArrayList selectFactureNomCli()
    {
        ArrayList <Client> myList = new ArrayList();
                
        String req =  "Select c.NumCli,c.Titre,c.Nomcli ,c.Prenomcli,c.Adressecli, c.CPcli,c.Villecli,telephonecli,c.Observationscli  from facture ven,client c where ven.NumCli = c.Numcli Group by 1";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //création de l'objet Client
                myList.add(new Client(resu.getInt(1),resu.getString(2),resu.getString(3),resu.getString(4),
                        resu.getString(5),resu.getString(6),resu.getString(7),resu.getString(8),resu.getString(9)));
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
    public ArrayList selectFactureNumCli(int numCli)
    {
        ArrayList <Facture> myList = new ArrayList();
                
        String req = "select NumFacture,V.id_user,NomId,V.Numcli,Nomcli,Prenomcli,DateVente,Paye,Apayer from facture V, client C,utilisateur U "
                     + "where  V.numcli=C.numcli and V.id_user=U.id_user and C.NumCli = " + numCli +" order by NumFacture desc";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                  myList.add(new Facture(resu.getInt("NumFacture"),resu.getInt("Id_user"), resu.getString("NomId"),resu.getInt("Numcli"),resu.getString("Nomcli"),resu.getString("Prenomcli"),
                                       resu.getDate("DateVente"),resu.getFloat("Paye"),resu.getFloat("APayer") ));
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
    public ArrayList selectFactureNumFacture(int numF)
    {
        ArrayList <Facture> myList = new ArrayList();
                
        String req = "select NumFacture,V.id_user,NomId,V.Numcli,Nomcli,Prenomcli,DateVente,Paye,Apayer from facture V, client C,utilisateur U "
                     + "where  V.numcli=C.numcli and V.id_user=U.id_user and C.NumFacture = " + numF  +" orber by NumFacture desc";
                     System.err.println(req);
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                  myList.add(new Facture(resu.getInt("NumFacture"),resu.getInt("Id_user"), resu.getString("NomId"),resu.getInt("Numcli"),resu.getString("Nomcli"),resu.getString("Prenomcli"),
                                       resu.getDate("DateVente"),resu.getFloat("Paye"),resu.getFloat("APayer") ));
                   
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
    public ArrayList selectFactureImprimer(int numfacture) {
        ArrayList<FactureImprimer> myList = new ArrayList();

        String req = "Select P.Code_Prod, P.Designation, P.Delivrance, L.quantite_vente,P.Prix, P.TVA from LigneVente L, produit P "
                + "where L.Code_Prod = P.Code_Prod and L.NumFacture = " + numfacture + " order by 1";

        ResultSet resu = ConnexionLogin.selectQuery(req);
        try {
            while (resu.next())
            {  
                myList.add(new FactureImprimer(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getInt(4),resu.getFloat(5),resu.getFloat(6)));
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
    public ArrayList selectFactureDate(Date dat)
    {
        ArrayList <Facture> myList = new ArrayList();
                
        String req = "select NumFacture,V.id_user,NomId,V.Numcli,Nomcli,Prenomcli,DateVente,Paye,Apayer from facture V, client C,utilisateur U"
                + " where  V.numcli=C.numcli and V.id_user=U.id_user and V.DateVente ='"+ ObjectTransfert.getDateSql(dat) +"'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                  myList.add(new Facture(resu.getInt("NumFacture"),resu.getInt("Id_user"), resu.getString("NomId"),resu.getInt("Numcli"),resu.getString("Nomcli"),resu.getString("Prenomcli"),
                                       resu.getDate("DateVente"),resu.getFloat("Paye"),resu.getFloat("APayer") ));
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
    public ArrayList selectFacturePayer(boolean payer)
    {
        ArrayList <Facture> myList = new ArrayList();
                
        String req = "select NumFacture,V.id_user,NomId,V.Numcli,Nomcli,Prenomcli,DateVente,Paye,Apayer from facture V, client C,utilisateur U"
                + " where  V.numcli=C.numcli and V.id_user=U.id_user and V.Paye = "+ payer;
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                  myList.add(new Facture(resu.getInt("NumFacture"),resu.getInt("Id_user"), resu.getString("NomId"),resu.getInt("Numcli"),resu.getString("Nomcli"),resu.getString("Prenomcli"),
                                       resu.getDate("DateVente"),resu.getFloat("Paye"),resu.getFloat("APayer") ));
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
    public ArrayList selectFactureNumCliPayer(int numCli, boolean payer)
    {
        ArrayList <Facture> myList = new ArrayList();
                
        String req = "select NumFacture,V.id_user,NomId,V.Numcli,Nomcli,Prenomcli,DateVente,Paye,Apayer from facture V, client C,utilisateur U "
                + "where  V.numcli=C.numcli and V.id_user=U.id_user and C.NumCli = "+ numCli +" and V.Paye = "+ payer;
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                   myList.add(new Facture(resu.getInt("NumFacture"),resu.getInt("Id_user"), resu.getString("NomId"),resu.getInt("Numcli"),resu.getString("Nomcli"),resu.getString("Prenomcli"),
                                       resu.getDate("DateVente"),resu.getFloat("Paye"),resu.getFloat("APayer") ));
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
    public ArrayList selectFactureNumCliDate(int numCli, Date dat)
    {
        ArrayList <Facture> myList = new ArrayList();
                
        String req = "select NumFacture,V.id_user,NomId,V.Numcli,Nomcli,Prenomcli,DateVente,Paye,Apayer from facture V, client C,utilisateur U "
                + "where  V.numcli=C.numcli and V.id_user=U.id_user and V.DateVente = '"+ ObjectTransfert.getDateSql(dat) + "' and C.NumCli = "+ numCli;
       
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                 myList.add(new Facture(resu.getInt("NumFacture"),resu.getInt("Id_user"), resu.getString("NomId"),resu.getInt("Numcli"),resu.getString("Nomcli"),resu.getString("Prenomcli"),
                                       resu.getDate("DateVente"),resu.getFloat("Paye"),resu.getFloat("APayer") ));
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
    public ArrayList selectFactureDatPayer(Date dat,boolean payer)
    {
        ArrayList <Facture> myList = new ArrayList();
                
        String req = "select NumFacture,V.id_user,NomId,V.Numcli,Nomcli,Prenomcli,DateVente,Paye,Apayer from facture V, client C,utilisateur U"
                + " where  V.numcli=C.numcli and V.id_user=U.id_user and V.Paye = "+ payer+" and V.DateVente ='"+ObjectTransfert.getDateSql(dat)+"'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
                
            {  
                
               myList.add(new Facture(resu.getInt("NumFacture"),resu.getInt("Id_user"), resu.getString("NomId"),resu.getInt("Numcli"),resu.getString("Nomcli"),resu.getString("Prenomcli"),
                                       resu.getDate("DateVente"),resu.getFloat("Paye"),resu.getFloat("Apayer") ));
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
    public ArrayList selectFactureNumCliDatPayer(int numCli, Date dat, boolean payer)
    {
        ArrayList <Facture> myList = new ArrayList();
        
        String req = "select NumFacture,V.id_user,NomId,V.Numcli,Nomcli,Prenomcli,DateVente,Paye,Apayer from facture V, client C,utilisateur U "
                + " where  V.numcli=C.numcli and V.id_user=U.id_user and V.Paye = "+ payer+" and V.DateVente ='"+ObjectTransfert.getDateSql(dat)+
                "' and NumCli ="+numCli;
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                  myList.add(new Facture(resu.getInt("NumFacture"),resu.getInt("Id_user"), resu.getString("NomId"),resu.getInt("Numcli"),resu.getString("Nomcli"),resu.getString("Prenomcli"),
                                       resu.getDate("DateVente"),resu.getFloat("Paye"),resu.getFloat("Apayer") ));
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
   public int getObFactureParNomPrenom(String NomPrenom) {
    ArrayList<Facture> myList = this.selectFacture();
    Client ob=new Client();
    int nbr=0;
     for(int i=0;i<myList.size();i++)
     {
       if(myList.get(i).getNomPrenomvente().toUpperCase().compareTo((String)NomPrenom.toUpperCase())==0)
     
              {
                  nbr=i;
                  break;
              }
             }
        
        return nbr;
    

    }
    
    @Override 
    public boolean MAJMontantFact (Facture fact){
        
        return ConnexionLogin.actionQuery("Update Facture set paye="+fact.getPaye()+",Apayer="+fact.getApayer()+" where NumFacture="+fact.getNumFacture());
    }

    
}

