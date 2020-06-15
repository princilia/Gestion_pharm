package persistence.MySQL;

import persistence.IDaoProduit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import transfertObject.LigneVente;
import transfertObject.Produit;
import transfertObject.Produit.TypeAlarm;

public class DaoProduitImpl implements IDaoProduit {
    
   private static DaoProduitImpl UniqueIntance = new DaoProduitImpl();

     public static DaoProduitImpl getIntance() {
        return UniqueIntance;
    }
     
     @Override
    public boolean ajoutProduit(Produit pro) {
         boolean ok = ConnexionLogin.actionQuery("Insert into produit (Code_prod,Designation, fV_An, fV_Fr, fV_Nl,pack_fr,pack_nl,pack_en," +
        "delivrance,composition, prix,tva,rangement,stock,quantite_min,typeAlarme) values (" +pro.getCode_prod() + ",'" + pro.getDesignation() + "','" + pro.getfV_An() + "','" + pro.getfV_Fr() +
         "','" + pro.getfV_Nl() + "','" +pro.getPack_fr() + "','" + pro.getPack_nl() +  "','" + pro.getPack_en() + "','" + pro.getDelivrance()+          
        "','" + pro.getComposition() + "','" + pro.getPrix() + "','" + pro.getTva() +  "','" + pro.getRangement() + "','" + pro.getStock()+ "','" + pro.getQuantite_min()+ "','" + pro.getTypeAlarm()+  "')");
        
        return ok;
    }
   
    public boolean deleteProduit (int Code_Prod)
    {
         boolean ok = ConnexionLogin.actionQuery("Delete from produit where Code_Prod = " + Code_Prod + "");
         return ok;
    }
   
    public boolean updateProduit (Produit pro)
    {
        String req = "Update produit set Designation ='" + pro.getDesignation() +
        "', fv_An ='" +  pro.getfV_An() + "', fv_Fr ='" +  pro.getfV_Fr()+ "',fv_Nl ='" +  pro.getfV_Nl() + 
        "', pack_fr ='" +  pro.getPack_fr() + "', pack_nl ='" +  pro.getPack_nl()+ "',pack_en ='" +  pro.getPack_en() + 
        "', delivrance ='" +pro.getDelivrance()+ "', Composition ='" + pro.getComposition()  + "', Prix =" + pro.getPrix() +
        ", tva =" + pro.getTva()+  ", Rangement ='" + pro.getRangement()+ "', stock ='" + pro.getStock()+ "', quantite_min='" + pro.getQuantite_min()+ "', typeAlarme ='" + pro.getTypeAlarm().ordinal() + "' where Code_prod =" + pro.getCode_prod();
       
        boolean ok= ConnexionLogin.actionQuery(req);
        return ok;
    }
   

     @Override
    public ArrayList<Produit>  selectProduit(){
        
        ArrayList <Produit> myList = new ArrayList();
        String req ="select * from produit order by 1";
         ResultSet resu = ConnexionLogin.selectQuery (req);
            try {
            while (resu.next())
                { 
                   myList.add( new Produit(resu.getInt("code_prod"),resu.getString("designation"),resu.getString("FV_An"),resu.getString("FV_FR"),resu.getString("FV_Nl"),resu.getString("pack_fr"),resu.getString("pack_nl"),resu.getString("pack_en"),
                                resu.getString("delivrance"),resu.getString("composition"), resu.getFloat("prix"),resu.getFloat("tva"),resu.getString("rangement"), resu.getInt("stock"),resu.getInt("quantite_min"),TypeAlarm.values()[resu.getInt("typeAlarme")]));
                }
            }catch (SQLException e)
            {
                System.out.println(e.toString());
                System.exit(-1);
            }
            
        return myList;   
      
    
    
    }
    
    @Override
    public ArrayList<Produit>  selectProduitModif(){
        
        ArrayList <Produit> myList = new ArrayList();
        String req ="select code_prod,designation ,composition,rangement,stock,quantite_min, typealarme from produit order by 1";
         ResultSet resu = ConnexionLogin.selectQuery (req);
            try {
            while (resu.next())
                { 
                   myList.add( new Produit(resu.getInt("code_prod"),resu.getString("designation"),resu.getString("Composition"),resu.getString("rangement"),
                                 resu.getInt("stock"),resu.getInt("quantite_min"),TypeAlarm.values()[resu.getInt("typeAlarme")]));
                }
            }catch (SQLException e)
            {
                System.out.println(e.toString());
                System.exit(-1);
            }
            
        return myList;   
    }
    
    public ArrayList <Produit> selectProduitParSociete (String societe)
    {
        ArrayList myList = new ArrayList();
 
    String req = "SELECT Code_Prod, P.NumFour, Societe,Designation,fV_An,fV_Fr,fV_Nl,pack_An,pack_Fr,pack_Nl,delivrance,composition, Prix, tva,rangement, Stock FROM produit P ,fournisseur f WHERE P.NumFour=f.NumFour  AND  Societe like '"+societe+"' order by 1";
     
    ResultSet resu = ConnexionLogin.selectQuery (req);
            try {
            while (resu.next())
                {  
                    myList.add( new Produit(resu.getInt(1),resu.getInt(2),resu.getString(3),resu.getString(4),resu.getString(5),resu.getString(6),resu.getString(7),resu.getString(8),resu.getString(9),
                                resu.getString(10),resu.getString(11),resu.getString(12), resu.getFloat(13),resu.getFloat(14),resu.getString(15), resu.getInt(16)));
                }
            }catch (SQLException e)
            {
                System.out.println(e.toString());
                System.exit(-1);
            }
            
        return myList; 
    
    }
    
    
    
    
     @Override
    public ArrayList selectProduitCodeprod(int codeprod) {
        
         ArrayList <Produit> myList = new ArrayList();
                
        String req = "Select * from Produit where  Code_prod like '"+codeprod+"%'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //c'est création de l'objet produit......
                myList.add( new Produit(resu.getInt(1),resu.getString(2),resu.getString(3),resu.getString(4),resu.getString(5),resu.getString(6),resu.getString(7),resu.getString(8),
                                resu.getString(9),resu.getString(10), resu.getFloat(11),resu.getFloat(12),resu.getString(13), resu.getInt(14)));
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
    public ArrayList ProduitParDesignation (String designation)
    {
      ArrayList <Produit> myList = new ArrayList();
        
      String req = "Select * from produit where Designation like '"+designation+"%'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //c'est création de l'objet produit......
                myList.add( new Produit(resu.getInt(1),resu.getString(2),resu.getString(3),resu.getString(4),resu.getString(5),resu.getString(6),resu.getString(7),resu.getString(8),
                                resu.getString(9),resu.getString(10), resu.getFloat(11),resu.getFloat(12),resu.getString(13), resu.getInt(14)));
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
    public ArrayList ProduitParDelivrance (String deli)
    {
      ArrayList <Produit> myList = new ArrayList();
        
      String req = "Select * from produit where Delivrance like '"+deli+"%'";
 
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //c'est création de l'objet produit......
                myList.add( new Produit(resu.getInt(1),resu.getString(2),resu.getString(3),resu.getString(4),resu.getString(5),resu.getString(6),resu.getString(7),resu.getString(8),
                                resu.getString(9),resu.getString(10), resu.getFloat(11),resu.getFloat(12),resu.getString(13), resu.getInt(14)));
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
    public int getNumProduitDesignation(String disigni) {
        int num=-1;
        
        ResultSet resu = ConnexionLogin.selectQuery ("Select Code_Prod from produit where Designation = '"
        +disigni+"'");
        
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
   @Override
    public int getNumProduitstock(int id){
        int num=-1;
        
        ResultSet resu = ConnexionLogin.selectQuery ("Select Stock from produit where Code_Prod ="
        +id+"");
        
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

    @Override
    public boolean updatestockProduit (Produit produit) {              
        return ConnexionLogin.actionQuery("Update Produit set Stock ="+produit.getStock()+" where Code_prod="+produit.getCode_prod());
    } 
    
    @Override
    public void maJVstock (LigneVente lignevente, int codeprod){
        
        ResultSet resu = ConnexionLogin.selectQuery("Select stock from Produit where code_prod = "+codeprod);
        
        try 
        {   
            resu.next();
            
            int stock = resu.getInt("stock") + lignevente.getAncienStock() - lignevente.getQuantite_vente() ;

            System.out.println("old " + lignevente.getAncienStock() + " new " + lignevente.getQuantite_vente());
            
            ConnexionLogin.actionQuery("Update Produit set Stock ="+stock+" where Code_prod="+codeprod);
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
        }
    }
    
    
     @Override
    public ArrayList<Produit>  selectProduitCompareStockQuantite(){
        
        ArrayList <Produit> myList = new ArrayList();
        String req ="select * from produit where stock <= quantite_min ";

         ResultSet resu = ConnexionLogin.selectQuery (req);
            try {
            while (resu.next())
                { 
                   myList.add( new Produit(resu.getInt("code_prod"),resu.getString("designation"),resu.getString("FV_An"),resu.getString("FV_FR"),resu.getString("FV_Nl"),resu.getString("pack_fr"),resu.getString("pack_nl"),resu.getString("pack_en"),
                                resu.getString("delivrance"),resu.getString("composition"), resu.getFloat("prix"),resu.getFloat("tva"),resu.getString("rangement"), resu.getInt("stock"),resu.getInt("quantite_min"),TypeAlarm.values()[resu.getInt("typeAlarme")]));
                }
            }catch (SQLException e)
            {
                System.out.println(e.toString());
                System.exit(-1);
            }
            
            
        return myList;   
      
    
    
    }
    
       
}
