package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import transfertObject.Livrer;
import transfertObject.Produit;

public class TableModelLivrer extends AbstractTableModel {
    private ArrayList <Livrer> ligneLivrer;
       
    private String[] columnNames = {"code_produit","Designation","Qté commandée", "Qté livrée", "Qte rest", "Qte surplus"};

    public TableModelLivrer() {
        ligneLivrer = new ArrayList<>();
    }
       
    @Override
    public int getRowCount() {
        return ligneLivrer == null ? 0 : ligneLivrer.size();
    }

    @Override
    public int getColumnCount() {
       return columnNames.length; }
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
         
        
        Livrer l = ligneLivrer.get(row);
        Produit p =l.getProduit();
        int tot =l.getQuantite_livrer()- l.getQuantite_restant();
       
             
        switch (col)
        {
         
            case 0 :    return p.getCode_prod();
            case 1 :    return p.getDesignation();
            case 2 :    return l.getQuantite_restant();
            case 3 :    return l.getQuantite_livrer();          
            case 4 :    return (tot<0) ?Math.abs(tot):0;
            case 5 :    return (tot > 0) ? tot : 0;
            
            default :   return null;
        
        }
    }
    

    
    public void setMyList (ArrayList <Livrer> livrer)
    {
        this.ligneLivrer = livrer;
        refresh();
    }
    
    public void setMyList (Livrer livrer)
    {
        ligneLivrer.add(livrer);
        refresh();
    }
    
    public ArrayList <Livrer> getMyList ()
    {
        return ligneLivrer;
    }
    
    public Livrer getMyList (int index)
    {
        return ligneLivrer.get(index);
        
    }
    
    public void refresh(){
        this.fireTableDataChanged();
    }
    
    
}
