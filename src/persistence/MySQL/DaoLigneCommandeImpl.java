 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.MySQL;

import persistence.IDaoLigneCommande;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import transfertObject.Commande;
import transfertObject.Fournisseur;
import transfertObject.LigneCommande;
import transfertObject.Livrer;

public class DaoLigneCommandeImpl implements IDaoLigneCommande {
    
    public static DaoLigneCommandeImpl uniqueInstance = new DaoLigneCommandeImpl();
    
    public static DaoLigneCommandeImpl getInstance(){
    
        return uniqueInstance;
}

    @Override
    public boolean ajoutLigneCom(int numCom, LigneCommande lc) {
        
        return ConnexionLogin.actionQuery("Insert into lignecommande (NumCom, Code_Prod, Quantite_renouvele, Quantite_restant ) "
                 + "values (" +numCom + ", " + lc.getProduit().getCode_prod() + ", " + lc.getQuantite_renouvele() + ", " + lc.getQuantite_renouvele() + ")");
    }
     

    @Override
    public boolean deleteLigneCom(LigneCommande lc) {
         return ConnexionLogin.actionQuery("Delete from lignecommande where NumCom = " + lc.getNumCom() + 
                 " and Code_Prod =" + lc.getCode_Prod());
    }

    @Override
    public boolean updateLigneCom(LigneCommande lc) {  
        return ConnexionLogin.actionQuery("Update lignecommande set Quantite_renouvele = " + lc.getQuantite_renouvele() +
        " where NumCom =" + lc.getNumCom() + " and Code_Prod = " + lc.getCode_Prod());
    }
    @Override
     public boolean updateLigneCom(Commande cmd, int idx ) {  
  
        
        return ConnexionLogin.actionQuery("Update lignecommande set Quantite_renouvele = "
                + cmd.getLigneComs().get(idx).getQuantite_renouvele() +
        " where NumCom =" + cmd.getNumCom() + " and Code_Prod = " + cmd.getLigneComs().get(idx).getCode_Prod());
    }

    @Override
    public ArrayList selectLigneCommande() {
         ArrayList <LigneCommande> myList = new ArrayList();
           
        String req = "Select L.NumCom, F.NumFour, L.Code_Prod, NomFr, PrenomFr,Designation, Prix, TVA, Stock, Quantite_renouvele, dateCom "
                       +" FROM lignecommande L, commande C, fournisseur F, produit P  where "+" L.NumCom = C.NumCom"+" AND C.NumFour = F.NumFour"+
                        " AND L.Code_Prod = P.Code_Prod"+" ORDER BY 1 " ;
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new LigneCommande(resu.getInt("NumCom"), resu.getInt("NumFour"), resu.getInt("Code_Prod"),resu.getString("NomFr"),resu.getString("PrenomFr"), resu.getString("Designation"),
                resu.getFloat("Prix"),resu.getFloat("TVA"),resu.getInt("Stock"),resu.getInt("Quantite_renouvele"),resu.getDate("dateCom")));
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
    public ArrayList selectLigneComNumc(int numCom) {
         ArrayList <LigneCommande> myList = new ArrayList();
                
        String req = "Select L.NumCom, F.NumFour, L.Code_Prod, NomFr, PrenomFr,Designation, Prix, TVA, Stock, Quantite_renouvele, dateCom "
                       +" FROM lignecommande L, commande C, fournisseur F, produit P  where "+" L.NumCom = C.NumCom"+" AND C.NumFour = F.NumFour"+
                        " AND L.Code_Prod = P.Code_Prod"+" and L.numCom like '"+numCom+"%'"  ;
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
              myList.add(new LigneCommande(resu.getInt("NumCom"), resu.getInt("NumFour"), resu.getInt("Code_Prod"),resu.getString("NomFr"),resu.getString("PrenomFr"), resu.getString("Designation"),
                resu.getFloat("Prix"),resu.getFloat("TVA"),resu.getInt("Stock"),resu.getInt("Quantite_renouvele"),resu.getDate("dateCom")));
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
    public ArrayList selectLigneComCdProd(int codProd) {
         ArrayList <LigneCommande> myList = new ArrayList();
                
        String req = "Select * from lignecommande where Code_Prod = "+ codProd;
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new LigneCommande(resu.getInt(1),resu.getInt(2), resu.getInt(3)));
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
    public ArrayList selectLigneComQte(int qte) {
         ArrayList <LigneCommande> myList = new ArrayList();
                
        String req = "Select * from lignecommande where Quantite_renouvele = "+ qte;
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                myList.add(new LigneCommande(resu.getInt(1),resu.getInt(2), resu.getInt(3)));
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
    public ArrayList  selectCommandesParclipro(String nom,String prenom,String produit)
    {
          ArrayList <LigneCommande> myList = new ArrayList();
       
          
          String req = "SELECT L.NumCom, F.NumFour,L.Code_Prod, F.NomFr, F.PrenomFr,  Designation, Prix, TVA, Stock, Quantite_renouvele"
                        +" FROM lignecommande L, commande C, fournisseur F, produit P where "+" L.NumCom = C.NumCom"+" AND C.NumFour = F.NumFour"+
                        " AND L.Code_Prod = P.Code_Prod and P.Designation like '"+produit+"' and  F.PrenomFr like '"+prenom+"' and F.NomFr like '"+nom+"' ORDER BY 1 ";
   
       ResultSet resu = ConnexionLogin.selectQuery(req);
        try {
            while (resu.next())
            {  
                myList.add(new LigneCommande(resu.getInt(1), resu.getInt(2), resu.getInt(3),resu.getString(4),resu.getString(5), resu.getString(6),
                                        resu.getFloat(7),resu.getFloat(8),resu.getInt(9),resu.getInt(10),resu.getDate(11)));
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
        }
        return myList;
    }
     @Override
   //regrouper les quantités d'un produit commander par son fournisseur
    public void selectSumQteParCdPro(Fournisseur fourn,Livrer livrer){
        
         //System.out.println("selectSumQteParCdPro " + fourn.getNomFr());
         String req = 
                "select sum(quantite_restant)as qterestant " +
                " from LigneCommande l, commande c " +
                " where l.numcom = c.numcom "  +
                " and l.quantite_restant <> 0 " +
                " and l.code_prod = " + livrer.getProduit().getCode_prod() + 
                " and c.numfour = " + fourn.getNumFour() +
                " group by l.code_prod, c.numfour";
                            
        
        ResultSet resu = ConnexionLogin.selectQuery(req);
        
        livrer.setQuantite_restant(0);
        
        try {
            
            resu.next();
            //System.out.println("qté restant " + resu.getInt("qterestant"));
            livrer.setQuantite_restant(resu.getInt("qterestant"));
           
        } catch (SQLException ex) {
            Logger.getLogger(DaoLigneCommandeImpl.class.getName()).log(Level.SEVERE, null, ex);//il renvoie erreur  lorsqu'il na rien trouvé à la ligne
        }
    }
    
    
    @Override
    public ArrayList<LigneCommande> selectLignComParnumfCodP(Fournisseur fourn,Livrer livrer){
         ArrayList <LigneCommande> myList = new ArrayList();
        String req= "SELECT f.numfour,f.nomfr,p.designation,c.numcom,p.code_prod,l.quantite_renouvele,l.quantite_livrer,l.quantite_restant,c.datecom " +
                    " FROM produit p, lignecommande l, commande c, fournisseur f " +
                    " where p.code_prod=l.code_prod " +
                    " and l.numcom =c.numcom " +
                    " and f.numfour=c.numfour " +
                    " and l.QUANTITE_RESTANT<>0 " +
                    " and f.numfour = " +fourn.getNumFour()+
                    " and p.code_prod= "+livrer.getProduit().getCode_prod();
                
         ResultSet resu = ConnexionLogin.selectQuery(req);
         try {
            while (resu.next())
            {  
                LigneCommande lc = new LigneCommande(resu.getDate("dateCom"),resu.getString("nomfr"),resu.getString("designation") ,resu.getInt("quantite_renouvele"), resu.getInt("quantite_livrer"),resu.getInt("quantite_restant"));
                lc.setNumFour(resu.getInt("numfour"));
                lc.setNumCom(resu.getInt("numCom"));
                lc.setCode_Prod(resu.getInt("code_prod"));
                
                myList.add(lc);
                        
                        
           
            }
         
         } catch (SQLException e)
        {
            System.out.println(e.toString());
        }
        return myList;
    }
    
    
    
    @Override
    public boolean updateComlignesQuantité (LigneCommande lignecommande)
    {
        System.out.println("rectifier la qté ");
        lignecommande.setQuantite_renouvele(lignecommande.getQuantite_renouvele());
        return ConnexionLogin.actionQuery("Update LigneCommande set Quantite_renouvele ="+lignecommande.getQuantite_renouvele()+" where Code_prod="+lignecommande.getCode_Prod());
    }
    
     @Override
     public boolean updateComlignestock (LigneCommande lignecommande)
    {
        lignecommande.setStock(lignecommande.getStock() + lignecommande.getQuantite_renouvele());
        return ConnexionLogin.actionQuery("Update Produit set Stock ="+lignecommande.getStock()+" where Code_prod="+lignecommande.getCode_Prod());
    }

     
     @Override
     public void updateLigncom(ArrayList<LigneCommande> ligneCommandes){
         //System.out.println("update lingecommande");
        for(LigneCommande l: ligneCommandes){
           ConnexionLogin.actionQuery(
                   "update lignecommande " +
                   " set quantite_renouvele= "+l.getQuantite_renouvele()+
                   " ,quantite_livrer= "+l.getQuantite_livrer()+
                   " ,quantite_restant= "+l.getQuantite_restant()+ 
                   " where numcom="+l.getNumCom()+" and code_prod=" +l.getCode_Prod());
            
//            System.out.println("qté renouvele " + l.getQuantite_renouvele() + " qté livre " + l.getQuantite_livrer() + 
//                    " qté restant : " + l.getQuantite_restant());;
//                    
        }
          
      
        
     }
     
     
   
    
    
    
    
    
    
    
    
    
}

