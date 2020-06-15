package model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import transfertObject.LigneVente;



public class TableModelLigneVente extends DefaultTableModel {
private ArrayList <LigneVente> myList;
    private String[] columnNames = {"Designation","Delivrance","Quantité","Prix TTC","Total TTC"};
    /**
     *
     * @param myList
     */
    public TableModelLigneVente(ArrayList myList)
    {
        this.myList=myList;
    }     

    @Override
    public int getRowCount() {
        return (myList != null) ? myList.size() : 0;
    }

    @Override
    public int getColumnCount() {
       return columnNames.length;    }
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
    
        LigneVente mycm = myList.get(row);
        
        float j= (float) (mycm.getPrix()*1.21);
        float k= (float) mycm.getQuantite_vente()*j;
      
        switch (col)
        {
            case 0 :    return mycm.getDesignation();
            case 1 :    return mycm.getDelivrance();
            case 2 :    return mycm.getQuantite_vente();
            case 3 :    return String.format("%.2f", j);
            case 4 :    return String.format("%.2f", k);   
            default :   return null;
        } 
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    
    public void setMyList (ArrayList myList)
    {
        this.myList = myList;
        refresh();
    }
    
    public ArrayList<LigneVente> getMyList ()
    {
        return myList;
    }
    
    public LigneVente getMyList (int index)
    {
        return myList.get(index);
    }
    
    public void refresh(){
        this.fireTableDataChanged();
    }
}
