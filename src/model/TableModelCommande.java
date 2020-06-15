/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import transfertObject.Commande;
import transfertObject.Fournisseur;


public class TableModelCommande extends javax.swing.table.AbstractTableModel {
    
 private String[] columnNames = {"Numéro Commande","Date Commandée","NomFournisseur"};
    private ArrayList <Commande> myList;

    public TableModelCommande (ArrayList myList)
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
        
        Commande myCmd = myList.get(row);
        Fournisseur fourn =myCmd.getFournisseur();
        switch (col)
        {
            case 0 :    return myCmd.getNumCom();
            case 1 :    return myCmd.getDateBE();
            case 2  :   return fourn.getNomFr();
            default :   return null;
        }
    }  
    
    public void setMyList (ArrayList myList)
    {
        this.myList = myList;
        this.fireTableDataChanged();
    }
    
    public ArrayList <Commande> getMyList ()
    {
        return myList;
    }
    
    public Commande getMyList (int index)
    {
        return myList.get(index);
    }
    
  
}
