/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import transfertObject.FactureImprimer;


public class TableModelFactureImprimer extends javax.swing.table.AbstractTableModel {
    private String[] columnNames = {"Code  Produit","Désignation","delivrance","Quantite_vente","Prix","TVA"};
    private ArrayList <FactureImprimer> myList;

    public TableModelFactureImprimer (ArrayList myList)
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
        
        FactureImprimer  myFac = myList.get(row);
        switch (col)
        {
            case 0 :    return myFac.getCode();
            case 1 :    return myFac.getDesignation();
            case 2 :    return myFac.getDelivrance();
            case 3 :    return myFac.getQuantite_vente();
            case 4 :    return myFac.getPrix();
            case 5 :    return myFac.getTva();
            default :   return null;
        }
    }
    
    public void setMyList (ArrayList myList)
    {
        this.myList = myList;
        this.fireTableDataChanged();
    }
    
   
}
