/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;


public class Client {
    private int numCli;
    private String titre;
    private String nomcli;
    private String prenomcli;
    private String adressecli;
    private String cpcli;
    private String villecli;
    private String telephonecli;
    private String observationscli;
   

    public Client() {
    }

    public Client(int numCli, String titre, String nomcli, String prenomcli, String adressecli, String cpcli, String villecli, String telephonecli, String observationscli) {
        this.numCli = numCli;
        this.titre = titre;
        this.nomcli = nomcli;
        this.prenomcli = prenomcli;
        this.adressecli = adressecli;
        this.cpcli = cpcli;
        this.villecli = villecli;
        this.telephonecli = telephonecli;
        this.observationscli = observationscli;
    }

    public int getNumCli() {
        return numCli;
    }

    public String getTitre() {
        return titre;
    }

    public String getNomcli() {
        return nomcli;
    }

    public String getPrenomcli() {
        return prenomcli;
    }

    public String getAdressecli() {
        return adressecli;
    }

    public String getCpcli() {
        return cpcli;
    }

    public String getVillecli() {
        return villecli;
    }

    public String getTelephonecli() {
        return telephonecli;
    }

    public String getObservationscli() {
        return observationscli;
    }

    public void setNumCli(int numCli) {
        this.numCli = numCli;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public void setPrenomcli(String prenomcli) {
        this.prenomcli = prenomcli;
    }

    public void setAdressecli(String adressecli) {
        this.adressecli = adressecli;
    }

    public void setCpcli(String cpcli) {
        this.cpcli = cpcli;
    }

    public void setVillecli(String villecli) {
        this.villecli = villecli;
    }

    public void setTelephonecli(String telephonecli) {
        this.telephonecli = telephonecli;
    }

    public void setObservationscli(String observationscli) {
        this.observationscli = observationscli;
    }

     public String getNomPrenom()
    {
        String s="";
        s=nomcli+" "+prenomcli;
        return s;
    }
    public void setNomPrenom(String s) {
        
        s=nomcli+" "+prenomcli;
      this.nomcli=s;
      this.prenomcli=s;
    }
    
}
