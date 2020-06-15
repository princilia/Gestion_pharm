 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import persistence.IDaoLigneVente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import transfertObject.LigneVente;

public class DaoLigneVenteImpl implements IDaoLigneVente {
    
    public static DaoLigneVenteImpl uniqueInstance = new DaoLigneVenteImpl();
    
    public static DaoLigneVenteImpl getInstance(){
    
        return uniqueInstance;
}

    @Override
    public boolean ajoutLigneVente(LigneVente lv) {
        boolean ok = ConnexionLogin.actionQuery("Insert into lignevente ( Code_Prod,NumFacture ,Quantite_vente ) "
                 + "values (" +lv.getCode_Prod() + "," + lv.getNumFacture() + "," + lv.getQuantite_vente() + ")");
         
        DaoProduitImpl daoProduitMySQL = (DaoProduitImpl) DaoFactory.getDAOProduit();
        if (daoProduitMySQL == null) {
      
        }
        daoProduitMySQL.maJVstock(lv, lv.getCode_Prod());
        return ok;
    }

    @Override
    public boolean deleteLigneVente(LigneVente lv) {
        DaoProduitImpl daoProduitMySQL = (DaoProduitImpl) DaoFactory.getDAOProduit();   
        boolean ok = ConnexionLogin.actionQuery("Delete from lignevente where NumFacture = " + lv.getNumFacture() + 
                 " and Code_Prod =" + lv.getCode_Prod());
           
        daoProduitMySQL.maJVstock(lv, lv.getCode_Prod());
        return ok;
    }

    @Override
    public boolean updateLigneVente(LigneVente lv) {
        boolean ok = ConnexionLogin.actionQuery("Update lignevente set Quantite_vente = " + lv.getQuantite_vente() +
        " where NumFacture =" + lv.getNumFacture() + " and Code_Prod = " + lv.getCode_Prod());
        return ok;
    }

    @Override
    public ArrayList selectLigneVente() {
         ArrayList <LigneVente> myList = new ArrayList();
           
        String req = "Select L.NumFacture, V.NumCli,  C.Nomcli, C .Prenomcli,L.Code_Prod, P.Designation,P.Delivrance,L.Quantite_vente ,P.Prix, P.TVA "
                       +" FROM ligneVente L, facture V, client C, produit P  where "+" L.NumFacture = V.NumFacture"+" AND V.NumCli = C.NumCli"+
                        " AND L.Code_Prod = P.Code_Prod"+" ORDER BY 1 " ;
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new LigneVente(resu.getInt(1), resu.getInt(2), resu.getString(3),resu.getString(4),resu.getInt(5), resu.getString(6),
                                        resu.getString(7),resu.getInt(8),resu.getFloat(9), resu.getFloat(10)));
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
    public ArrayList selectLigneVenteParNumCli(int numCli)
    {
        ArrayList <LigneVente> myList = new ArrayList();
                
        String req = "Select L.NumFacture, C.NumCli,  C.Nomcli, C .Prenomcli,L.Code_Prod, P.Designation,P.Delivrance,L.Quantite_vente ,P.Prix, P.TVA "
                       +" FROM ligneVente L, facture V, client C, produit P  where "+" L.NumFacture = V.NumFacture"+" AND V.NumCli = C.NumCli"+
                        " AND L.Code_Prod = P.Code_Prod"+" and C.numCli like '"+numCli+"%'";  
       
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                
               myList.add(new LigneVente(resu.getInt(1), resu.getInt(2), resu.getString(3),resu.getString(4),resu.getInt(5), resu.getString(6),
                                        resu.getString(7),resu.getInt(8),resu.getFloat(9), resu.getFloat(10)));
                   
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
    public ArrayList selectLigneVenteParCodepro(int codeprod)
    {
        ArrayList <LigneVente> myList = new ArrayList();
                
        String req = "Select L.NumFacture, C.NumCli,  C.Nomcli, C .Prenomcli,L.Code_Prod, P.Designation,P.Delivrance,L.Quantite_vente ,P.Prix, P.TVA "
                       +" FROM ligneVente L, facture V, client C, produit P  where "+" L.NumFacture = V.NumFacture"+" AND V.NumCli = C.NumCli"+
                        " AND L.Code_Prod = P.Code_Prod"+" and P.Code_prod like '"+codeprod+"%'";  
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                
               myList.add(new LigneVente(resu.getInt(1), resu.getInt(2), resu.getString(3),resu.getString(4),resu.getInt(5), resu.getString(6),
                                        resu.getString(7),resu.getInt(8),resu.getFloat(9), resu.getFloat(10)));
                   
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
    public ArrayList<LigneVente> selectLigneVenteParNumfacture(int numF) {
        ArrayList <LigneVente> myList = new ArrayList();       
        String req = "Select L.NumFacture, C.NumCli,  C.Nomcli, C .Prenomcli,L.Code_Prod, P.Designation,P.Delivrance,L.Quantite_vente ,P.Prix, P.TVA "
                       +" FROM ligneVente L, facture V, client C, produit P  where "+" L.NumFacture = V.NumFacture"+" AND V.NumCli = C.NumCli"+
                        " AND L.Code_Prod = P.Code_Prod"+" and V.numFacture like '"+numF+"%'";
                       
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
              myList.add(new LigneVente(resu.getInt("NumFacture"), resu.getInt("Numcli"), resu.getString("nomcli"),resu.getString("prenomcli"),resu.getInt("Code_Prod"), resu.getString("Designation"),
                                        resu.getString("delivrance"),resu.getInt("Quantite_vente"), resu.getFloat("tva"), resu.getFloat("prix")));
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
    public ArrayList selectLigneVenteCdProd(int codProd) {
         ArrayList <LigneVente> myList = new ArrayList();
                
        String req = "Select * from lignevente where Code_Prod = "+ codProd;
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new LigneVente(resu.getInt(1),resu.getInt(2), resu.getInt(3)));
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
    public ArrayList selectLigneVenteQte(int qte) {
         ArrayList <LigneVente> myList = new ArrayList();
                
        String req = "Select * from ligneVente where Quantite_vente = "+ qte;
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new LigneVente(resu.getInt(1),resu.getInt(2), resu.getInt(3)));
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
    public ArrayList selectCodProd()
    {
       ArrayList <Integer> cod = new ArrayList();
       String req = "Select Code_Prod from produit";
       ResultSet resu = ConnexionLogin.selectQuery(req);
       try
       {
           while(resu.next())
           {
               cod.add(new Integer(resu.getInt(1)));
           }
       }catch(SQLException e)
       {
          System.out.println(e.toString());
          System.exit(-1); 
       }
       
       return cod;
    }
    
    
    @Override
    public ArrayList  selectVenteParclipro(String nom,String prenom,String produit)
    {
          ArrayList <LigneVente> myList = new ArrayList();
       
          
          String req = "Select L.NumFacture, V.NumCli,  C.Nomcli, C.Prenomcli,L.Code_Prod, P.Designation,P.Delivrance,L.Quantite_vente ,P.Prix, P.TVA "
                       +" FROM ligneVente L, facture V, client C, produit P  where "+" L.NumFacture = V.NumFacture"+" AND V.NumCli = C.NumCli"+
                        " AND L.Code_Prod = P.Code_Prod and P.Designation like '"+produit+"' and  C.Prenomcli like '"+prenom+"' and C.Nomcli like '"+nom+"' ORDER BY 1 ";
   
       ResultSet resu = ConnexionLogin.selectQuery(req);
        try {
            while (resu.next())
            {  
                myList.add(new LigneVente(resu.getInt(1), resu.getInt(2), resu.getString(3),resu.getString(4),resu.getInt(5), resu.getString(6),
                                        resu.getString(7),resu.getInt(8),resu.getFloat(9), resu.getFloat(10)));
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
        }
        return myList;
    }
    
    
    @Override
    public ArrayList  selectVenteParcli(String nom,String prenom)
    {
          ArrayList <LigneVente> myList = new ArrayList();
       
          
          String req = "Select L.NumFacture, V.NumCli,  C.Nomcli, C.Prenomcli,L.Code_Prod, P.Designation,P.Delivrance,L.Quantite_vente ,P.Prix, P.TVA "
                       +" FROM ligneVente L, facture V, client C, produit P  where "+" L.NumFacture = V.NumFacture"+" AND V.NumCli = C.NumCli"+
                        " AND L.Code_Prod = P.Code_Prod and   C.Prenomcli like '"+prenom+"' and C.Nomcli like '"+nom+"' ORDER BY 1 ";
   
       ResultSet resu = ConnexionLogin.selectQuery(req);
        try {
            while (resu.next())
            {  
                myList.add(new LigneVente(resu.getInt(1), resu.getInt(2), resu.getString(3),resu.getString(4),resu.getInt(5), resu.getString(6),
                                        resu.getString(7),resu.getInt(8),resu.getFloat(9), resu.getFloat(10)));
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
        }
        return myList;
    }
    
    @Override
    public ArrayList  selectVenteParpro(String designation)
    {
          ArrayList <LigneVente> myList = new ArrayList();
       
          
          String req = "Select L.NumFacture, V.NumCli,  C.Nomcli, C.Prenomcli,L.Code_Prod, P.Designation,P.Delivrance,L.Quantite_vente ,P.Prix, P.TVA "
                       +" FROM ligneVente L, facture V, client C, produit P  where "+" L.NumFacture = V.NumFacture"+" AND V.NumCli = C.NumCli"+
                        " AND L.Code_Prod = P.Code_Prod and   P.Designation like '"+designation+"' ORDER BY 1 ";
   
       ResultSet resu = ConnexionLogin.selectQuery(req);
        try {
            while (resu.next())
            {  
                myList.add(new LigneVente(resu.getInt(1), resu.getInt(2), resu.getString(3),resu.getString(4),resu.getInt(5), resu.getString(6),
                                        resu.getString(7),resu.getInt(8),resu.getFloat(9), resu.getFloat(10)));
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
        }
        return myList;
    }
   
    @Override
    public void updateVentlignesQuantité (LigneVente ligneVente)
    {
   
        try {
            Connection conn = ConnexionLogin.connection();
            
            System.out.println("Rectifier la quantité du produit " + ligneVente.getDesignation());
            
            DaoProduitImpl daoProduitMySQL = (DaoProduitImpl) DaoFactory.getDAOProduit();
            
            if (daoProduitMySQL == null) {
              
            }
            
            String query = "Update LigneVente set Quantite_vente = ? where Code_prod=? and numfacture=?";
            PreparedStatement ps = conn.prepareCall(query);
            ps.setInt(1, ligneVente.getQuantite_vente());
            ps.setInt(2, ligneVente.getCode_Prod());
            ps.setInt(3, ligneVente.getNumFacture());
            
            ps.execute();
                    
            daoProduitMySQL.maJVstock(ligneVente, ligneVente.getCode_Prod());
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoLigneVenteImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
     public boolean updateVerifierStock (int id,int stock)
    {
        boolean ok = ConnexionLogin.actionQuery("Update Produit set Stock ="+stock+" where Code_prod="+id);
        
        return ok;
    }

   
    
    
    
    
    
    
    
    
}

