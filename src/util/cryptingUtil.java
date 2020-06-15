/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

//ma classe text pour la cryptage de mot de passe
public class cryptingUtil {
   
    public static void main(String []args) throws NoSuchAlgorithmException{
    
        try {
            System.out.println(encryptPassword("111111111111111111111"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(cryptingUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static String encryptPassword(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest crypt = MessageDigest.getInstance("SHA-1");
        crypt.reset();
        crypt.update(password.getBytes("UTF-8"));

        return new BigInteger(1, crypt.digest()).toString(16);
    }
  
}
