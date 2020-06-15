/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;


public class Fournisseur {
    private int numFour;
    private String societe;
    private String nomFr;
    private String prenomFr;
    private String adresseFr;
    private String cpFr;
    private String villeFr;
    private String tel;
    private String fax;
    private String observationsFr;

    public Fournisseur() {
    }

    public Fournisseur(int numFour, String societe, String nomFr, String prenomFr, String adresseFr, String cpFr, String villeFr, String tel, String fax, String observationsFr) {
        this.numFour = numFour;
        this.societe = societe;
        this.nomFr = nomFr;
        this.prenomFr = prenomFr;
        this.adresseFr = adresseFr;
        this.cpFr = cpFr;
        this.villeFr = villeFr;
        this.tel = tel;
        this.fax = fax;
        this.observationsFr = observationsFr;
    }

    public void setNumFour(int numFour) {
        this.numFour = numFour;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public void setNomFr(String nomFr) {
        this.nomFr = nomFr;
    }

    public void setPrenomFr(String prenomFr) {
        this.prenomFr = prenomFr;
    }

    public void setAdresseFr(String adresseFr) {
        this.adresseFr = adresseFr;
    }

    public void setCpFr(String cpFr) {
        this.cpFr = cpFr;
    }

    public void setVilleFr(String villeFr) {
        this.villeFr = villeFr;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setObservationsFr(String observationsFr) {
        this.observationsFr = observationsFr;
    }

    public int getNumFour() {
        return numFour;
    }

    public String getSociete() {
        return societe;
    }

    public String getNomFr() {
        return nomFr;
    }

    public String getPrenomFr() {
        return prenomFr;
    }

    public String getAdresseFr() {
        return adresseFr;
    }

    public String getCpFr() {
        return cpFr;
    }

    public String getVilleFr() {
        return villeFr;
    }

    public String getTel() {
        return tel;
    }

    public String getFax() {
        return fax;
    }

    public String getObservationsFr() {
        return observationsFr;
    }

    public String getNomPrenom()
    {
        String s="";
        s=nomFr+" "+prenomFr;
        return s;
    }
    
}
