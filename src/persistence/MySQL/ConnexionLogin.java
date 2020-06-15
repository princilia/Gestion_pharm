package persistence.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnexionLogin {
    private static Connection conn;
    private String driver;
    private String url ;
    private String username;
    private String password;
       
    public ConnexionLogin() {
        ResourceBundle bundle = ResourceBundle.getBundle("mysql", Locale.getDefault());
        this.driver = bundle.getString("DRIVER");
        this.url = bundle.getString("URL");
        this.username = bundle.getString("USERNAME");
        this.password = bundle.getString("PASSWORD");
        
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username,password);
            
        }
        catch(ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    //faire fonctionner la base de donnée
    public Connection connexionDatabase(String driver, String url, String username, String password){
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username,password);
        }
        catch(ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }   
        return conn;     
    }
    //pour fermer la bd
    public Connection closeconnexion(){
        try{
            conn.close();
            }catch (Exception e){
                System.err.println(e);        
             }
        return conn;
        
    }
    
    public static Connection connection(){
        if (conn == null){
            new ConnexionLogin();
        }
        
        return conn;
    }
    
    /*elle retourne le resultat de la requete demande par l'utilisateur. */
    public static ResultSet selectQuery(String query)
    {
        ResultSet rs=null;
        try {
            Statement st = conn.createStatement();
            
            if(!conn.isClosed())
                rs=st.executeQuery(query);
            else
                System.out.println("Objet non connecte! Echec fonction.");
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    /*elle permet d'executer une requete d'action. */
    public static boolean actionQuery(String query) 
    {
	try {
            Statement st = conn.createStatement();
            
            st.executeUpdate(query);
            return true;
        }
        catch (SQLException ex){
            return false;
        }
    }
}