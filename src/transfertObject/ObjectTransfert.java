/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class ObjectTransfert {    
   
    public static String getDateEU(Date date){
        String tmp;
        if(date !=null){
            SimpleDateFormat dateParser=new SimpleDateFormat("dd/MM/yyyy");
            tmp=dateParser.format(date);
        }
        else
            tmp="";      
        return tmp;
    }
    
    public static String getDateSql(Date date){
        String tmp;
        if(date !=null){
            SimpleDateFormat dateParser=new SimpleDateFormat("yyyy-MM-dd");
            tmp=dateParser.format(date);
        }
        else
            tmp="";      
        return tmp;
    }
    
    public static Date setDateEU(String date){
        Date d=null;
        String d1=null;
        DateFormat dateParser=new SimpleDateFormat("dd/MM/yyyy");
        if(date!=null){
            try{
                d=dateParser.parse(date);
                dateParser=DateFormat.getInstance();
                d1=dateParser.format(d);
            }catch(ParseException e){
                System.out.println(e);
            }
        }
        return d;
    }
}
