/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import transfertObject.Facture;

public class TableModelFacture extends DefaultTableModel {
    private String[] columnNames = {"Numéro facture","Nom Utilisateur","Date","Montant fact","Montant Rendu"};
    private ArrayList <Facture> myList ;

    public TableModelFacture (ArrayList myList)
    {
        this.myList = myList;
        
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return (myList != null) ? myList.size() : 0;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        
        Facture myVen = myList.get(row);
        switch (col)
        {
            case 0 :    return myVen.getNumFacture();
            case 1 :    return myVen.getNomId();
            case 2 :    return myVen.getDateBE();
            case 3 :    return String.format("%.2f",myVen.getPaye());
            case 4 :    return String.format("%.2f",myVen.getApayer());
            default :   return null;
        }
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }   
    
    public void setMyList (ArrayList myList)
    {
        this.myList = myList;
        refresh();
    }
    
    public ArrayList <Facture> getMyList ()
    {
        return myList;
    }
    
    public Facture getMyList (int index)
    {
        return myList.get(index);
    }
    
    public void refresh(){  
        this.fireTableDataChanged();
    }      
}
