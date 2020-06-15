/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.MySQL;

import persistence.IDaoUtilisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import transfertObject.Utilisateur;
import transfertObject.Utilisateur.TypeUtilisateur;

public class DaoUtilisateurImpl implements IDaoUtilisateur {
    
    public static DaoUtilisateurImpl uniqueInstance = new DaoUtilisateurImpl();
    
    public static DaoUtilisateurImpl getInstance(){ 
        return uniqueInstance;
    }

    /**
     *
     * @param util
     * @throws Exception
     */
    @Override
    public void ajoutUtilisateur(Utilisateur util)throws Exception {
        Connection conn = ConnexionLogin.connection();
        
        String query = "Insert into utilisateur (NomId, PrenomId, username, password, type) values (?,?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareCall(query);

            ps.setString(1, util.getNomId());
            ps.setString(2, util.getPrenomId());
            ps.setString(3, util.getUsername());
            ps.setString(4, util.getPassword());
            ps.setString(5, util.getType().name());

            ps.execute();
        }catch(SQLException e){
            throw new Exception("Utilisateur non ajouter.");
        }            
    }
    
    @Override
    public boolean deleteUtilisateur(int id_user) {
        try{
            ConnexionLogin.actionQuery("Delete from utilisateur where id_user = " + id_user + "");
        }catch(Exception e){
            return false;   
        }
        return true;
    }
        
    @Override
    public void updateUtilisateur(Utilisateur util) throws Exception{
        String req = "Update utilisateur set nomId ='" + util.getNomId() +
        "', prenomId ='" + util.getPrenomId() + "', username ='" + util.getUsername() + "', Password ='" + util.getPassword() + 
        "', type ='" + util.getType() +"' where id_user =" + util.getId_user();
               
        ConnexionLogin.actionQuery(req);
    }
    
    @Override
    public ArrayList selectUtilisateur() {
        ArrayList <Utilisateur> myList = new ArrayList();
        Connection conn = ConnexionLogin.connection();
                
        try {
            String req = "Select * from Utilisateur";
            
            PreparedStatement ps = conn.prepareStatement(req);
            
            ResultSet rs = ps.executeQuery();
                        
            while (rs.next()) {
                //c'est création de l'objet utilisateur......
                
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setId_user(rs.getInt("id_user"));
                utilisateur.setNomId(rs.getString("nomid"));
                utilisateur.setPrenomId(rs.getString("prenomid"));
                utilisateur.setUsername(rs.getString("username"));
                utilisateur.setPassword(rs.getString("password"));
                utilisateur.setType(TypeUtilisateur.valueOf(rs.getString("type")));
                
                myList.add(utilisateur);
            }    
        } 
        catch (SQLException ex) {
            Logger.getLogger(DaoUtilisateurImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return myList;
    }
    
    @Override
    public ArrayList selectUtilisateurId_user(int id_user)
    {
      ArrayList <Utilisateur> myList = new ArrayList();
      
      String req = "Select * from utilisateur where Id_user  = "+ id_user;
        
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //c'est création de l'objet utilisateur......
                myList.add(new Utilisateur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5),TypeUtilisateur.valueOf(resu.getString(6))));
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
    public ArrayList selectUtilisateurNom(String nom)
    {
        ArrayList <Utilisateur> myList = new ArrayList();
                
        String req = "Select * from utilisateur where NomId like '"+nom+"%'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //c'est création de l'objet utilisateur......
                myList.add(new Utilisateur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5),TypeUtilisateur.valueOf(resu.getString(6))));
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
    public Utilisateur getUtilisateurByUserName(String UserName){
        
        return (Utilisateur)this.selectUtilisateurUsername(UserName).get(0);
    }
    @Override
    public ArrayList selectUtilisateurUsername(String username)
    {
        ArrayList <Utilisateur> myList = new ArrayList();
                
        String req = "Select * from utilisateur where Username like '"+username+"%'";
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //c'est création de l'objet utilisateur......
                myList.add(new Utilisateur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5),TypeUtilisateur.valueOf(resu.getString(6))));
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
    public ArrayList selectUtilisateurTyp(TypeUtilisateur type)
    {
      ArrayList <Utilisateur> myList = new ArrayList();
        
      String req = "Select * from utilisateur where Type like '"+ type.name() +"'";
      
        
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                //c'est création de l'objet utilisateur......
                myList.add(new Utilisateur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5),TypeUtilisateur.valueOf(resu.getString(6))));
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
    public ArrayList selectUtilisateurNomTyt(String nom, TypeUtilisateur type)
    {
         ArrayList <Utilisateur> myList = new ArrayList();
         
         String req = "Select * from utilisateur where ( Type Like '" + type.name() + "' and NomId Like'" + nom + "%')";
         
        ResultSet resu = ConnexionLogin.selectQuery (req);
        try {
            while (resu.next())
            {  
                 //c'est création de l'objet utilisateur......
                myList.add(new Utilisateur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5), TypeUtilisateur.valueOf(resu.getString(6))));
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
    public boolean existUser(Utilisateur userName) {

        boolean exist=false;
        ArrayList <Utilisateur> myList = new ArrayList();

        String req = "Select * from utilisateur where ( USERNAME Like '" + userName.getUsername() +"%')";

        ResultSet resu = ConnexionLogin.selectQuery (req);

        try {
            while (resu.next()){  
                 //c'est création de l'objet utilisateur......
                myList.add(new Utilisateur(resu.getInt(1),resu.getString(2), resu.getString(3),
                resu.getString(4), resu.getString(5),TypeUtilisateur.valueOf(resu.getString(6))));
            }
            
            exist=myList.size()>0;
        }
        catch (SQLException e)
        {
            System.out.println(e.toString());
        }

        return exist;
    }

    @Override
    public Utilisateur getUtilisateurPasswordByUserNameAndPassword(String username, String password) throws SQLException {
        Utilisateur utilisateur = null;
        
        Connection conn = ConnexionLogin.connection();

        String query = "select * from utilisateur where username like ? and password like ?";

        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();


        rs.next();

        utilisateur = new Utilisateur();
        utilisateur.setId_user(rs.getInt("ID_USER"));
        utilisateur.setNomId(rs.getString("nomid"));
        utilisateur.setPrenomId(rs.getString("prenomid"));
        utilisateur.setUsername(rs.getString("username"));
        utilisateur.setPassword(rs.getString("password"));
        System.out.println("user type : " + TypeUtilisateur.valueOf(rs.getString("type")));
        utilisateur.setType(TypeUtilisateur.valueOf(rs.getString("type")));
               
        return utilisateur;
    }
}
    
  



