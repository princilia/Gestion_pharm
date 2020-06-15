/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import transfertObject.Client;


public class TableModelClients extends javax.swing.table.AbstractTableModel{
    
    private String[] columnNames = {"NumCli","Titre","Nom","Prénom","Adresse","CP","Ville","Téléphone","Observations"};
    private ArrayList <Client> myList;

    public TableModelClients (ArrayList myList)
    {
        this.myList = myList;
    }
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return myList.size();
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        
        Client myCli = myList.get(row);
        switch (col)
        {
            case 0 :    return myCli.getNumCli();
            case 1 :    return myCli.getTitre();
            case 2 :    return myCli.getNomcli();
            case 3 :    return myCli.getPrenomcli();
            case 4 :    return myCli.getAdressecli();
            case 5 :    return myCli.getCpcli();
            case 6 :    return myCli.getVillecli();
            case 7 :    return myCli.getTelephonecli();
            case 8 :    return myCli.getObservationscli();
            default :   return null;
        }
    }

  
    
    public void setMyList (ArrayList myList)
    {
        this.myList = myList;
        refresh();
        
    }
    
    public ArrayList <Client> getMyList ()
    {
        return myList;
    }
    
    public Client getMyList (int index)
    {
        return myList.get(index);
    }
    
    public void refresh(){
        this.fireTableDataChanged();
    }
    
   
    
}
