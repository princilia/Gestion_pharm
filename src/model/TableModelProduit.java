
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import transfertObject.Produit;



public class TableModelProduit  extends AbstractTableModel {
  private String[] columnNames = {"DESIGNATION","FORME","CONDITIONNEMENT","DELIVRANCE","COMPOSITION","PRIX","TVA","RANGEMENT","STOCK"};
    private ArrayList <Produit> myList;

    public TableModelProduit(){}
    
    public TableModelProduit(ArrayList<Produit> myList) {
        this.myList = myList;
    }

  

    

    @Override
    public int getRowCount() {
        return myList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
     @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
       
        Produit myPro = myList.get(row);
        switch (col)
        {
           
            case 0 :    return myPro.getDesignation();
            case 1 :    return myPro.getfV_Fr();
            case 2 :    return myPro.getPack_fr();
            case 3 :    return myPro.getDelivrance();
            case 4 :    return myPro.getComposition();
            case 5 :    return myPro.getPrix();
            case 6 :    return myPro.getTva();
            case 7 :    return myPro.getRangement();
            case 8 :    return myPro.getStock();
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
    
    public ArrayList <Produit> getMyList ()
    {
        return myList;
    }
    
    public Produit getMyList (int index)
    {
        return myList.get(index);
    }  
    
    public void setProduits(ArrayList produits){
        myList = produits;
    }
}
