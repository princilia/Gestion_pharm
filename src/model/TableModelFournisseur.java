/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

import transfertObject.Fournisseur;


public class TableModelFournisseur extends javax.swing.table.AbstractTableModel{
    
    private String[] columnNames = {"NumFour","Société","Nom","Prénom","Adresse","CP","Ville","téléphone","fax","Observations"};
    private ArrayList <Fournisseur> myList;

    public TableModelFournisseur (ArrayList myList)
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
        
        Fournisseur myfour = myList.get(row);
        switch (col)
        {
            case 0 :    return myfour.getNumFour();
            case 1 :    return myfour.getSociete();
            case 2 :    return myfour.getNomFr();
            case 3 :    return myfour.getPrenomFr();
            case 4 :    return myfour.getAdresseFr();
            case 5 :    return myfour.getCpFr();
            case 6 :    return myfour.getVilleFr();
            case 7 :    return myfour.getTel();
            case 8 :    return myfour.getFax();
            case 9 :    return myfour.getObservationsFr();
            default :   return null;
        }
    }

   
    
    public void setMyList (ArrayList myList)
    {
        this.myList = myList;
        this.fireTableDataChanged();
    }
    
    public ArrayList <Fournisseur> getMyList ()
    {
        return myList;
    }
    
    public Fournisseur getMyList (int index)
    {
        return myList.get(index);
    }
    
   
}
