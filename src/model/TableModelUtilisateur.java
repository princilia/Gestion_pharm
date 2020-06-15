/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import transfertObject.Utilisateur;


public class TableModelUtilisateur extends javax.swing.table.AbstractTableModel{
    
    private String[] columnNames = {"Type","Nom","Prenom","Nom d'utilisateur"};
    private ArrayList <Utilisateur> myList;

    public TableModelUtilisateur (ArrayList myList)
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
       
        Utilisateur myUtil = myList.get(row);
        switch (col)
        {
            
            case 0 :    return myUtil.getType();
            case 1 :    return myUtil.getNomId();
            case 2 :    return myUtil.getPrenomId();
            case 3 :    return myUtil.getUsername();
            
            default :   return null;
        }
    }

    
    public void refresh() {
        this.fireTableDataChanged();
    }
    
    public void setMyList (ArrayList myList)
    {
        this.myList = myList;
        refresh();
    }
    
    public ArrayList <Utilisateur> getMyList ()
    {
        return myList;
    }
    
    public Utilisateur getMyList (int index)
    {
        return myList.get(index);
    }
    
   
}
