
package transfertObject;


public class Produit {
   private int code_prod ; 
   private int numFour ; 
   private String societe ;
   private String Designation ; 
   private String fV_An ;
   private String fV_Fr ;
   private String fV_Nl ;
  private String pack_fr ;
  private String pack_nl ;
  private String pack_en ;
  private String delivrance;
  private String composition ;
   private float prix  ; 
   private float tva ;
   private String rangement;
   private int stock ; 
   private int quantite_min;
   private TypeAlarm typeAlarme; 
   public enum TypeAlarm {SONORE, VISUEL}

    public Produit() {
    }

    public Produit(String societe) {
        this.societe = societe;
    }

    public Produit(int code_prod, String Designation, String composition, String rangement, int stock, int quantite_min, TypeAlarm typeAlarme) {
        this.code_prod = code_prod;
        this.Designation = Designation;
        this.composition = composition;
        this.rangement = rangement;
        this.stock = stock;
        this.quantite_min = quantite_min;
        this.typeAlarme = typeAlarme;
    }
    

    public Produit(int code_prod, String Designation, String fV_An, String fV_Fr, String fV_Nl, String pack_fr, String pack_nl, String pack_en, String delivrance, String composition, float prix, float tva, String rangement, int stock) {
        this.code_prod = code_prod;
        this.Designation = Designation;
        this.fV_An = fV_An;
        this.fV_Fr = fV_Fr;
        this.fV_Nl = fV_Nl;
        this.pack_fr = pack_fr;
        this.pack_nl = pack_nl;
        this.pack_en = pack_en;
        this.delivrance = delivrance;
        this.composition = composition;
        this.prix = prix;
        this.tva = tva;
        this.rangement = rangement;
        this.stock = stock;
    }

    public Produit(int code_prod, String Designation, String fV_An, String fV_Fr, String fV_Nl, String pack_fr, String pack_nl, String pack_en, String delivrance, String composition, float prix, float tva, String rangement, int stock, int quantite_min, TypeAlarm typeAlarme) {
        this.code_prod = code_prod;
        this.Designation = Designation;
        this.fV_An = fV_An;
        this.fV_Fr = fV_Fr;
        this.fV_Nl = fV_Nl;
        this.pack_fr = pack_fr;
        this.pack_nl = pack_nl;
        this.pack_en = pack_en;
        this.delivrance = delivrance;
        this.composition = composition;
        this.prix = prix;
        this.tva = tva;
        this.rangement = rangement;
        this.stock = stock;
        this.quantite_min = quantite_min;
        this.typeAlarme = typeAlarme;
    }
    

    public Produit(int code_prod, int numFour,  String Designation, String fV_An, String fV_Fr, String fV_Nl, String pack_fr, String pack_nl, String pack_en, String delivrance, String composition, float prix, float tva, String rangement, int stock) {
        this.code_prod = code_prod;
        this.numFour = numFour;
        this.Designation = Designation;
        this.fV_An = fV_An;
        this.fV_Fr = fV_Fr;
        this.fV_Nl = fV_Nl;
        this.pack_fr = pack_fr;
        this.pack_nl = pack_nl;
        this.pack_en = pack_en;
        this.delivrance = delivrance;
        this.composition = composition;
        this.prix = prix;
        this.tva = tva;
        this.rangement = rangement;
        this.stock = stock;
    }

    

    public Produit(int code_prod, int numFour, String societe, String Designation, String fV_An, String fV_Fr, String fV_Nl, String pack_fr, String pack_nl, String pack_en, String delivrance, String composition, float prix, float tva, String rangement,int stock) {
        this.code_prod = code_prod;
        this.numFour = numFour;
        this.societe = societe;
        this.Designation = Designation;
        this.fV_An = fV_An;
        this.fV_Fr = fV_Fr;
        this.fV_Nl = fV_Nl;
        this.pack_fr = pack_fr;
        this.pack_nl = pack_nl;
        this.pack_en = pack_en;
        this.delivrance = delivrance;
        this.composition = composition;
        this.prix = prix;
        this.tva = tva;
        this.rangement = rangement;
        this.stock = stock;
    }
    
   

    public String getSociete() {
        return societe;
    }
    public void setSociete(String societe) {
        this.societe = societe;
    }
    

    public int getCode_prod() {
        return code_prod;
    }

    public void setCode_prod(int code_prod) {
        this.code_prod = code_prod;
    }

    public int getNumFour() {
        return numFour;
    }

    public void setNumFour(int numFour) {
        this.numFour = numFour;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getTva() {
        return tva;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getfV_An() {
        return fV_An;
    }

    public String getfV_Fr() {
        return fV_Fr;
    }

    public String getfV_Nl() {
        return fV_Nl;
    }

    public String getPack_fr() {
        return pack_fr;
    }

    public String getPack_nl() {
        return pack_nl;
    }

    public String getPack_en() {
        return pack_en;
    }

    public String getDelivrance() {
        return delivrance;
    }

    public String getComposition() {
        return composition;
    }

    public String getRangement() {
        return rangement;
    }

    public void setfV_An(String fV_An) {
        this.fV_An = fV_An;
    }

    public void setfV_Fr(String fV_Fr) {
        this.fV_Fr = fV_Fr;
    }

    public void setfV_Nl(String fV_Nl) {
        this.fV_Nl = fV_Nl;
    }

    public void setPack_en(String pack_en) {
        this.pack_en = pack_en;
    }

    public void setPack_fr(String pack_fr) {
        this.pack_fr = pack_fr;
    }

    public void setPack_nl(String pack_nl) {
        this.pack_nl = pack_nl;
    }

    public void setDelivrance(String delivrance) {
        this.delivrance = delivrance;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public void setRangement(String rangement) {
        this.rangement = rangement;
    }
   
    
    public void typeAlarme(TypeAlarm typeAlarm){
        this.typeAlarme = typeAlarm;
    }
    
    public TypeAlarm getTypeAlarm(){
        return typeAlarme;
    }

    public int getQuantite_min() {
        return quantite_min;
    }

    public void setQuantite_min(int quantite_min) {
        this.quantite_min = quantite_min;
    }
    
    
}
