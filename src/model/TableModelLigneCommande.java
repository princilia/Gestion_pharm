package model;

import java.util.ArrayList;
import transfertObject.Commande;
import transfertObject.Fournisseur;
import transfertObject.LigneCommande;
import transfertObject.Livrer;
import transfertObject.Produit;



public class TableModelLigneCommande extends javax.swing.table.AbstractTableModel {
    private ArrayList <LigneCommande> ligneComs;
    private Fournisseur fourn;
    private Commande com;
    private Livrer livrer;
    
    private String[] columnNames = {"code_produit","Designation Produit ","Quantité_commandée"};
    /**
     *
     * @param myList
     */
    public TableModelLigneCommande(ArrayList ligneComs)
    {
        this.ligneComs=ligneComs;
        
    } 
    public TableModelLigneCommande()
    {
        
        
    } 
    
    
    @Override
    public int getRowCount() {
        return com == null ? 0 : com.getLigneComs().size();
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
     
        
        LigneCommande mycm = ligneComs.get(row);
        Produit p = mycm.getProduit();
        
     
        
        String[] i = new String[]{String.valueOf(p.getCode_prod()), p.getDesignation(), String.valueOf(mycm.getQuantite_renouvele())};
        
        return i[col];
        

    }
  
    public void setMyList (Commande commande)
    {
        this.com = commande;
        this.fourn = commande.getFournisseur();
        this.ligneComs = commande.getLigneComs();
        refresh();
    }
    
    public void setMylistLigneComs(ArrayList ligneComs){
        this.ligneComs = ligneComs;
        refresh();
    }
    
    public ArrayList <LigneCommande> getMyList ()
    {
        return ligneComs;
    }
    
    public LigneCommande getMyList (int index)
    {
        return ligneComs.get(index);
        
    }
    
    public void refresh(){
      
        this.fireTableDataChanged();
    }
    
    
}
