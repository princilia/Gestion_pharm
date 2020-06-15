/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.MySQL;
import persistence.IDaoClient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import transfertObject.Client;


public class DaoClientImpl implements IDaoClient {
    
    public static DaoClientImpl uniqueInstance = new DaoClientImpl();
    
    public static DaoClientImpl getInstance(){
    
        return uniqueInstance;
}

    @Override
    public boolean ajoutClient(Client cli) {
        
        return  ConnexionLogin.actionQuery("Insert into client (NumCli, Titre, Nomcli, Prenomcli, Adressecli," +
            "CPcli, Villecli,telephonecli,Observationscli) values (" +cli.getNumCli() + ",'" + cli.getTitre() + "','" + cli.getNomcli() + "','" + cli.getPrenomcli() +
            "','" + cli.getAdressecli() + "','" + cli.getCpcli() + "','" + cli.getVillecli() +  "','" + cli.getTelephonecli() + "','" + cli.getObservationscli()+ "')");
        
    }
    

    @Override
    public boolean deleteClient(int numCli) {
         return ConnexionLogin.actionQuery("Update client set Deleted = 1 where NumCli = " + numCli + "");
          
    }
    
   
    
    @Override
    public boolean updateClient(Client cli) {
        
        String req = "Update client set Titre ='" + cli.getTitre() +
        "', Nomcli ='" + cli.getNomcli() + "', Prenomcli ='" + cli.getPrenomcli() + "', Adressecli ='" + cli.getAdressecli() + 
        "', CPcli ='" + cli.getCpcli()+ "', Villecli ='" + cli.getVillecli()  + "', Telephonecli ='" + cli.getTelephonecli() + "', Observationscli ='" + cli.getObservationscli() +"' where NumCli =" + cli.getNumCli();
       
        boolean ok= ConnexionLogin.actionQuery(req);
        return ok;
    }
    
  
    

    @Override
    public ArrayList selectClient() {
         ArrayList <Client> myList = new ArrayList();
                
        String req = "Select * from client where Deleted = 0";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //c'est création de l'objet Client......
                myList.add(new Client(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8),resu.getString(9)));
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
    public ArrayList selectClientNumCli(int numCli)
    {
      ArrayList <Client> myList = new ArrayList();
      
      String req = "Select * from client where Deleted = 0 and NumCli  = "+ numCli;
        
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //la création de l'objet Client
                myList.add(new Client(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8), resu.getString(9)));
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
    public ArrayList selectClientCp(String codPost)
    {
        ArrayList <Client> myList = new ArrayList();
                
        String req = "Select * from client where Deleted = 0 and CPcli Like '"+ codPost +"%'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                
                myList.add(new Client(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8), resu.getString(9)));
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
    public ArrayList selectClientTit(String titre)
    {
      ArrayList <Client> myList = new ArrayList();
        
      String req = "Select * from client where Deleted = 0 and Titre  like '"+ titre +"'";
      
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //création de l'objet 
                myList.add(new Client(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8), resu.getString(9)));
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
    public ArrayList selectClientVil(String ville)
    {
        ArrayList <Client> myList = new ArrayList();
                
        String req = "Select * from client where Deleted = 0 and Villecli like '"+ ville+"%'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new Client(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8), resu.getString(9)));
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
    public ArrayList selectClientNom(String nom)
    {
        ArrayList <Client> myList = new ArrayList();
                
        String req = "Select * from client where Deleted = 0 and Nomcli like '"+nom+"%'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new Client(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8), resu.getString(9)));
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
    public ArrayList selectClientVilTit(String ville, String titre)
    {
        ArrayList <Client> myList = new ArrayList();
                
        String req = "Select * from client where Deleted = 0 and ( Titre like '" + titre + "' and Villecli like '" + ville + "%')";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new Client(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8), resu.getString(9)));
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
    public ArrayList selectClientNomTit(String nom, String titre)
    {
         ArrayList <Client> myList = new ArrayList();
         
         String req = "Select * from client where Deleted = 0 and ( Titre Like '" + titre + "' and Nomcli Like'" + nom + "%')";
         
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new Client(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7), resu.getString(8),resu.getString(9)));
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
    public ArrayList selectClientCpTit(String cp, String titre)
    {
        ArrayList <Client> myList = new ArrayList();
        
        String req = "Select * from client where Deleted = 0 and ( Titre like '" + titre + "' and CPcli like '" + cp + "%')";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new Client(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), resu.getString(6),resu.getString(7),resu.getString(8) ,resu.getString(9)));
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
   public int getObCliParNom(String Nom) {
    ArrayList<Client> myList = this.selectClientNom(Nom);
    Client ob=new Client();
    int nbr=0;
     for(int i=0;i<myList.size();i++)
     {
       if(myList.get(i).getNomPrenom().toUpperCase().compareTo((String)Nom.toUpperCase())==0)
     
              {
                  nbr=i;
                  break;
              }
             }
        
        return nbr;
    
    
   }
}

