/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFile;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//classe de recuperation de données via ma bd access
public class testAccess {
    static  String ReplaceStr(String str) //creer une variable static pour utiliser ds while
        {String oupt=""; //ici la methode pour remplacer les caractères accent en simple pour mysql reconnait d'autre mot 
        if(str!=null)
        {
            oupt = str.replace("é", "e");
            oupt = oupt.replace("è", "e");
            oupt = oupt.replace("'", "''");
            oupt = oupt.replace("à", "a");
        }
        return oupt;
    }
    
    public static void main(String[] args) throws SQLException, FileNotFoundException, UnsupportedEncodingException, IOException{
        Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:/HUM-2014.12.15.accdb");
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT [cti],[mp_name],[PharmFormFr],[PharmFormNl],[PharmFormEn],[PackFr],[PackNl],[PackEn],[DelivFr],[ActSubsts] FROM [tbl_amm_h]");

        //je creer un fichier que g doit garnir mes insert puis  apres  l'inserer dans  via une rquete sql dans mysql
        Writer writer = null;// fichier vide

        try {
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            writer = new BufferedWriter(new OutputStreamWriter(
                  new FileOutputStream("C:\\Users\\user\\Documents\\script sql\\scripSQL"+timeStamp+".txt"), "utf-8"));
            
            while (rs.next()) {
                String q =("insert into produit (code_prod,designation,FV_An,FV_Fr,FV_Nl,pack_fr,pack_nl,pack_en,delivrance,composition) values ('"+ReplaceStr(rs.getString(1))+"','"+ReplaceStr(rs.getString(2))/*.replace("'","''")*/+"'"
                    + ",'"+ReplaceStr(rs.getString(5))+"','"+ReplaceStr(rs.getString(3))+"','"+ReplaceStr(rs.getString(4))+"','"+ReplaceStr(rs.getString(6))+"','"+ReplaceStr(rs.getString(7))+"','"+ReplaceStr(rs.getString(8))+"'"
                    + ",'"+ReplaceStr(rs.getString(9))+"','"+ReplaceStr(rs.getString(10))+"');\r\n"
                    + "");
            }
        } catch (IOException ex) {

        } finally {
             try {writer.close();} catch (Exception ex) {}
        }
    }
}