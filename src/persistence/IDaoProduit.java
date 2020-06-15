package persistence;
import java.util.ArrayList;
import transfertObject.LigneVente;
import transfertObject.Produit;


public interface IDaoProduit {

    ArrayList<Produit> selectProduit();
    ArrayList<Produit>  selectProduitModif();
    ArrayList <Produit> selectProduitParSociete (String societe); 
     boolean ajoutProduit(Produit pro);
    boolean deleteProduit (int Code_Prod);
    boolean updateProduit (Produit pro);
    ArrayList selectProduitCodeprod(int codeprod);
    ArrayList ProduitParDesignation (String designation);
    ArrayList ProduitParDelivrance (String deli);
    int getNumProduitstock(int id);
    int getNumProduitDesignation(String disigni);
    boolean updatestockProduit (Produit produit);
    void maJVstock (LigneVente lignevente, int codeprod);
    ArrayList<Produit>  selectProduitCompareStockQuantite();
}
