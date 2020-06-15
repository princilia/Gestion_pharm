package presentation;

import persistence.IDaoClient;
import persistence.IDaoLigneVente;
import persistence.IDaoProduit;
import persistence.IDaoFacture;
import persistence.MySQL.DaoFactory;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import model.TableModelFacture;
import model.TableModelLigneVente;
import model.TableModelProduit;
import transfertObject.Client;
import transfertObject.LigneVente;
import transfertObject.Produit;
import transfertObject.Facture;

public final class JDLigneVente extends javax.swing.JDialog {

    /**
     * Creates new form JDAjoutLigneCom
     */
    JDRechercheProduit jdRechercheProduit;
    
     public JDLigneVente(Frame Parent, String titre, Client cl,Produit prod) {
         
       super(Parent, titre, true);
     
       this.clt= cl;
        initComponents();
    
        getRootPane().setDefaultButton(jBtnOK);
         setLocationByPlatform(true);
          setLocation(Parent.getX()+Parent.getWidth()/3, Parent.getY()+Parent.getHeight()/8);
        setVisible(true);
        
    }
     
     public JDLigneVente(Dialog Parent,String titre,Client cl,Produit prod) {
        super(Parent, titre, true);
        pr=prod;
        initComponents();
        getRootPane().setDefaultButton(jBtnOK);
        setLocation(Parent.getX()+Parent.getWidth()/3, Parent.getY()+Parent.getHeight()/3);
        setLocationByPlatform(true);
        setVisible(true);
    }
    
     public JDLigneVente(Frame parent, String titre, LigneVente ltv,Client cl,Produit prod, Facture facture) {
        super(parent, titre, true);
         
        initComponents();
        clt=cl;
        pr=prod;
        ven = facture;
        getRootPane().setDefaultButton(jBtnOK);
        setLocation(parent.getX()+parent.getWidth()/3, parent.getY()+parent.getHeight()/3);
        fillComponents(lv);
        setVisible(true);
    }
     
    private void fillComponents(LigneVente ltv) {
       jTextFieldNomClient.setText(clt.getNomcli()+" "+clt.getPrenomcli());
       ltv.setNomPrenom(clt.getNomcli(), clt.getPrenomcli());
       jTextFieldNomClient.setText(ltv.getNomPrenom());
       jTextFQte.setText("1");
    }
    
    public LigneVente traitVerifier() {
        LigneVente lv = new LigneVente();
        try  {    
            lv.setQuantite_vente(Integer.parseInt(jTextFQte.getText()));
            lv.setCode_Prod(Integer.parseInt(jTextFieldProduit.getText()));
            lv.setNumcli(Integer.parseInt(jTextFieldNomClient.getText()));
        }catch(Exception e){
             
        }
        
        return lv;
    }
    
    public void setProduct(Produit produit){
        this.pr = produit;
        jTextFieldProduit.setText(produit.getDesignation());
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLbCom = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLbProd = new javax.swing.JLabel();
        jLbQte = new javax.swing.JLabel();
        jTextFQte = new javax.swing.JTextField();
        jTextFieldNomClient = new javax.swing.JTextField();
        jTextFieldProduit = new javax.swing.JTextField();
        jButtonRechProduit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBtnOK = new javax.swing.JButton();
        jBtnAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("insert lignevente"); // NOI18N

        jLbCom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLbCom.setForeground(new java.awt.Color(0, 0, 204));
        jLbCom.setText("Nom client                           :");

        jLbProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLbProd.setForeground(new java.awt.Color(0, 0, 204));
        jLbProd.setText("Produit(s)                            :");

        jLbQte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLbQte.setForeground(new java.awt.Color(0, 0, 204));
        jLbQte.setText("Quantité_Vente                     :");

        jTextFQte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFQteKeyTyped(evt);
            }
        });

        jTextFieldNomClient.setEditable(false);

        jTextFieldProduit.setEditable(false);

        jButtonRechProduit.setForeground(new java.awt.Color(0, 0, 255));
        jButtonRechProduit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search-icon.png"))); // NOI18N
        jButtonRechProduit.setText("recherche produit");
        jButtonRechProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechProduitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLbQte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLbProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLbCom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldProduit)
                    .addComponent(jTextFQte, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jTextFieldNomClient))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRechProduit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLbCom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbProd)
                    .addComponent(jTextFieldProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRechProduit))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbQte)
                    .addComponent(jTextFQte, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        jBtnOK.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jBtnOK.setForeground(new java.awt.Color(0, 51, 204));
        jBtnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icones/valider.png"))); // NOI18N
        jBtnOK.setText("OK");
        jBtnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOKActionPerformed(evt);
            }
        });

        jBtnAnnuler.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jBtnAnnuler.setForeground(new java.awt.Color(0, 0, 255));
        jBtnAnnuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icones/annuler.png"))); // NOI18N
        jBtnAnnuler.setText("Annuler");
        jBtnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jBtnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jBtnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBtnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOKActionPerformed
        
        if(jTextFieldProduit.getText().isEmpty()||jTextFQte.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"svp veuillez remplir les champs  !","Gestion Pharm",JOptionPane.INFORMATION_MESSAGE);
        }else{
            int numFac = ven.getNumFacture();
        
            lv.setNumFacture(numFac) ;

            lv.setCode_Prod(pr.getCode_prod());
            lv.setQuantite_vente(Integer.parseInt(jTextFQte.getText()));
             //il parcours tout l'enregistrement  et demande le suivant      
            Iterator <LigneVente> it = daoLv.selectLigneVenteParNumfacture(numFac).iterator();
            while (it.hasNext()){
                LigneVente lv = it.next();
           
            } 
            myModel.setMyList(daoLv.selectLigneVenteParNumfacture(numFac));
           
                if (pr.getStock() - Integer.valueOf(jTextFQte.getText()) <= pr.getQuantite_min()){
                    
                    switch(pr.getTypeAlarm()){
                        case SONORE :
                            Toolkit.getDefaultToolkit().beep();
                            break;
                        case VISUEL :
                           
                            JOptionPane.showMessageDialog(this,"Veuillez réapprovisionner le stock.");
                    }
                }
            if (daoLv.selectLigneVenteParNumfacture(numFac).contains(lv)){
               
                int idx = myModel.getMyList().indexOf(lv);
                LigneVente l = (LigneVente) myModel.getMyList().get(idx);
                l.setQuantite_vente(l.getQuantite_vente()+lv.getQuantite_vente());
              
                daoLv.updateVentlignesQuantité(l);
            } else {
                
                
                daoLv.ajoutLigneVente(lv);
                
            }

            ArrayList<LigneVente> listFact = daoLv.selectLigneVenteParNumfacture(numFac);
            float j,k; j=k=0;

            for(LigneVente lv : listFact){
                 j= new Float(lv.getPrix()*1.21);
                 k+=lv.getQuantite_vente()*j;
                
            }

            ven.setPaye(k);
            daoVen.MAJMontantFact(ven);

            jTextFQte.setText("1");
            refreshModel();
            this.dispose();       
        }
    }//GEN-LAST:event_jBtnOKActionPerformed

    private void jBtnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAnnulerActionPerformed
    
        int response = JOptionPane.showConfirmDialog(this, "Voulez-vous annuler la vente?","Gestion Pharm",JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            this.dispose();     
        }
    }//GEN-LAST:event_jBtnAnnulerActionPerformed

    private void jTextFQteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFQteKeyTyped
       if(! Character.isDigit(evt.getKeyChar()))
            evt.consume(); 
    }//GEN-LAST:event_jTextFQteKeyTyped

    private void jButtonRechProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechProduitActionPerformed
       
        
        new JDRechercheProduit(this, "ECRAN  pro",pr);
    
      refreshModel();
    }//GEN-LAST:event_jButtonRechProduitActionPerformed
    
   public void refreshModel(){
       mProModel.refresh();
   }
    
    
    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAnnuler;
    private javax.swing.JButton jBtnOK;
    private javax.swing.JButton jButtonRechProduit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLbCom;
    private javax.swing.JLabel jLbProd;
    private javax.swing.JLabel jLbQte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFQte;
    private javax.swing.JTextField jTextFieldNomClient;
    private javax.swing.JTextField jTextFieldProduit;
    // End of variables declaration//GEN-END:variables

       Client clt; 
       LigneVente ltv;
       Produit pr;
       Facture ven;
       
private IDaoLigneVente daoLv=DaoFactory.getDaoLigneVente();
private IDaoFacture daoVen=DaoFactory.getDaoFacture();
private IDaoClient daoCli = DaoFactory.getDaoClient();
private IDaoProduit daoPro = DaoFactory.getDAOProduit();
private TableModelLigneVente myModel=new model.TableModelLigneVente(null);
private TableModelProduit mProModel=new model.TableModelProduit(daoPro.selectProduit());
private TableModelFacture myModelFact=new model.TableModelFacture(daoVen.selectFacture());

private LigneVente lv= new LigneVente();
 private ArrayList <Client> cli = daoCli.selectClient();
 private ArrayList <Facture> v = daoVen.selectFacture();
 private ArrayList <LigneVente> lg = daoLv.selectLigneVente();
 private ArrayList <Produit> pro = daoPro.selectProduit();
}
