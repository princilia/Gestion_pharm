/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;


import persistence.IDaoCommande;
import persistence.IDaoLigneCommande;
import persistence.IDaoProduit;
import persistence.IDaofournisseur;
import persistence.MySQL.DaoFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import model.TableModelFournisseur;
import model.TableModelLigneCommande;
import model.TableModelProduit;
import transfertObject.Commande;
import transfertObject.Fournisseur;
import transfertObject.LigneCommande;
import transfertObject.Produit;

public class JIFCommande extends JInternalFrame {
    
     JDRechercheProduit jdRechercheProduit;
    /**
     * Creates new form JIFLigneCom
     */
    public JIFCommande() {   
        
        initComponents();
        fillComponents();
        jTextFQte1.setText("1");
     
        
    }
    
   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLC = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLbCom1 = new javax.swing.JLabel();
        jLbProd1 = new javax.swing.JLabel();
        jLbQte1 = new javax.swing.JLabel();
        jTextFQte1 = new javax.swing.JTextField();
        jButtonFr = new javax.swing.JButton();
        jTextFieldFournisseur = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldProduit = new javax.swing.JTextField();
        jButtonRechProduit = new javax.swing.JButton();
        jLabelNumCommande = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Date now = new Date();
        SimpleDateFormat dateParser = new SimpleDateFormat("dd/MM/yyyy");
        String tmp = dateParser.format(now);
        jFormattedTextFieldDate = new javax.swing.JFormattedTextField();
        jButtonListCmd = new javax.swing.JButton();
        jButtonModifCmd = new javax.swing.JButton();
        jButtonSauverCommande = new javax.swing.JButton();
        jBtnAjout = new javax.swing.JButton();

        setTitle("Commandes");
        setVisible(true);

        jTableLC.setModel(myModel);
        jTableLC.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableLC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLCMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableLC);

        jLbCom1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLbCom1.setForeground(new java.awt.Color(0, 0, 255));
        jLbCom1.setText("Fournisseur");

        jLbProd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLbProd1.setForeground(new java.awt.Color(0, 0, 255));
        jLbProd1.setText("Produits   ");

        jLbQte1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLbQte1.setForeground(new java.awt.Color(0, 0, 255));
        jLbQte1.setText("Quantité ");

        jTextFQte1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFQte1KeyTyped(evt);
            }
        });

        jButtonFr.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonFr.setForeground(new java.awt.Color(0, 102, 102));
        jButtonFr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search-icon.png"))); // NOI18N
        jButtonFr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFrActionPerformed(evt);
            }
        });

        jTextFieldFournisseur.setEditable(false);
        jTextFieldFournisseur.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Numéro Com");

        jTextFieldProduit.setEditable(false);
        jTextFieldProduit.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldProduit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldProduitKeyReleased(evt);
            }
        });

        jButtonRechProduit.setForeground(new java.awt.Color(0, 0, 255));
        jButtonRechProduit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search-icon.png"))); // NOI18N
        jButtonRechProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechProduitActionPerformed(evt);
            }
        });

        jLabelNumCommande.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelNumCommande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Date ");

        jFormattedTextFieldDate.setText(tmp);
        jFormattedTextFieldDate.setEditable(false);
        jFormattedTextFieldDate.setFont(new java.awt.Font("Traditional Arabic", 0, 11)); // NOI18N

        jButtonListCmd.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButtonListCmd.setForeground(new java.awt.Color(0, 0, 153));
        jButtonListCmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search-icon.png"))); // NOI18N
        jButtonListCmd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonListCmdMouseClicked(evt);
            }
        });
        jButtonListCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListCmdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(72, 72, 72))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLbCom1)
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextFieldFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jButtonFr, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFormattedTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24)
                        .addComponent(jLabelNumCommande, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonListCmd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLbProd1)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRechProduit))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLbQte1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFQte1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(399, 399, 399))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jFormattedTextFieldDate, jLabelNumCommande});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonFr, jButtonListCmd});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbCom1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFr)
                            .addComponent(jTextFieldFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jFormattedTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonListCmd)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNumCommande, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonRechProduit)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLbProd1)
                                        .addComponent(jTextFieldProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFQte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLbQte1))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonFr, jButtonListCmd, jButtonRechProduit, jFormattedTextFieldDate, jLabelNumCommande, jTextFQte1, jTextFieldFournisseur, jTextFieldProduit});

        jButtonModifCmd.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButtonModifCmd.setForeground(new java.awt.Color(0, 102, 204));
        jButtonModifCmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icones/Modify.png"))); // NOI18N
        jButtonModifCmd.setText("Modifier");
        jButtonModifCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifCmdActionPerformed(evt);
            }
        });

        jButtonSauverCommande.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButtonSauverCommande.setForeground(new java.awt.Color(0, 0, 153));
        jButtonSauverCommande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icones/valider.png"))); // NOI18N
        jButtonSauverCommande.setText("Sauver ");
        jButtonSauverCommande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSauverCommandeMouseClicked(evt);
            }
        });

        jBtnAjout.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jBtnAjout.setForeground(new java.awt.Color(0, 0, 255));
        jBtnAjout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajout.jpg"))); // NOI18N
        jBtnAjout.setText("ajout ");
        jBtnAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAjoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 455, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSauverCommande, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonModifCmd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnAjout, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnAjout, jButtonModifCmd, jButtonSauverCommande});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnAjout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonModifCmd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSauverCommande)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtnAjout, jButtonModifCmd, jButtonSauverCommande});

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonFrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFrActionPerformed
          
           new JDRechercheFournisseur(this, "recherche",four);
           
    }//GEN-LAST:event_jButtonFrActionPerformed

    private void jTextFQte1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFQte1KeyTyped
        if(! Character.isDigit(evt.getKeyChar()))
        evt.consume();
    }//GEN-LAST:event_jTextFQte1KeyTyped

    private void jBtnAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAjoutActionPerformed
        
        if(jTextFieldProduit.getText().isEmpty()||jTextFQte1.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Veuillez remplir les champs.","Gestion Pharm",JOptionPane.INFORMATION_MESSAGE);
            
       } else{
            
        LigneCommande ligneC = new LigneCommande();
            ligneC.setNumCom(cmd.getNumCom());
            System.out.println(cmd.getNumCom());
            ligneC.setProduit(produit);
            ligneC.setQuantite_renouvele(Integer.parseInt(jTextFQte1.getText()));
            
            if (cmd.getLigneComs().contains(ligneC)){
                
                int idx = cmd.getLigneComs().indexOf(ligneC);
                LigneCommande l = (LigneCommande) cmd.getLigneComs().get(idx);
                l.setQuantite_renouvele(l.getQuantite_renouvele()+ligneC.getQuantite_renouvele());
               
            }else {
                //ajout ma collection  des produits
                cmd.getLigneComs().add(ligneC);
            }
            
        
        jTextFieldProduit.setText("");
        jTextFQte1.setText("1");
        
        myModel.setMyList(cmd);
        refreshModel();
        produit=null;
        
        
                
        }   
               
    }//GEN-LAST:event_jBtnAjoutActionPerformed

    private void jTextFieldProduitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProduitKeyReleased

    }//GEN-LAST:event_jTextFieldProduitKeyReleased

    private void jButtonRechProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechProduitActionPerformed

        
           new JDRechercheProduit(this, "ECRAN  pro",produit);
           
            refreshModel();
    }//GEN-LAST:event_jButtonRechProduitActionPerformed

    private void jTableLCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLCMouseClicked
       
          LigneCommande lc = cmd.getLigneComs().get(jTableLC.getSelectedRow());
       fillComponentsModif(lc);
        
    }//GEN-LAST:event_jTableLCMouseClicked

    private void jButtonSauverCommandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSauverCommandeMouseClicked
      
   
       if(cmd.getFournisseur()==null){
           JOptionPane.showMessageDialog(null,"Veuillez selectionner un fournisseur.","Gestion Pharm",JOptionPane.INFORMATION_MESSAGE);
        
        }else{   
        
        daoCom.ajoutCommande(cmd);
        fillComponents();
        jTextFieldFournisseur.setText("");
         JOptionPane.showMessageDialog(null, " la commande est sauvée avec succès");
        }
         
    }//GEN-LAST:event_jButtonSauverCommandeMouseClicked

    private void jButtonListCmdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListCmdMouseClicked
        
    }//GEN-LAST:event_jButtonListCmdMouseClicked

    private void jButtonListCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListCmdActionPerformed
        
        new JDListeCmdPro(this, "ListeCmd",cmd);
    }//GEN-LAST:event_jButtonListCmdActionPerformed

    private void jButtonModifCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifCmdActionPerformed
        if (jTableLC.getSelectedRow() == -1)
        JOptionPane.showMessageDialog(null,"Sélectionnez d'abord une ligne  svp !","Gestion Pharm",JOptionPane.INFORMATION_MESSAGE);
        else {
            //selection la ligne et modifier 
          cmd.getLigneComs().get(jTableLC.getSelectedRow()).setQuantite_renouvele(Integer.valueOf(jTextFQte1.getText()));
            daoLgc.updateLigneCom(cmd, jTableLC.getSelectedRow());
            
             
             refreshModel();
             myModel.setMyList(cmd);
             produit=null;
             jTextFQte1.setText("");
             jTextFieldProduit.setText("");
       }
    }//GEN-LAST:event_jButtonModifCmdActionPerformed
    
    
    private void fillComponents(LigneCommande lc){
       
        
        jTextFQte1.setText(String.valueOf(lc.getQuantite_renouvele()));
        jTextFieldProduit.setText(lc.getDesignation());
        jTextFieldFournisseur.setText(lc.getNoml());
        jLabelNumCommande.setText(String.valueOf(lc.getNumCom()));
        
        jFormattedTextFieldDate.setText(lc.getDateBE());
        
    }
    
    private void fillComponentsModif(LigneCommande lc){
       
       
        jTextFQte1.setText(String.valueOf(lc.getQuantite_renouvele()));
        jTextFieldProduit.setText(lc.getProduit().getDesignation());
        jTextFieldFournisseur.setText(cmd.getFournisseur().getNomFr());
        jLabelNumCommande.setText(String.valueOf(cmd.getNumCom()));
        
        jFormattedTextFieldDate.setText(cmd.getDateBE());
        
    }
    
    
    private void fillComponents(){
        cmd=new Commande();
        jLabelNumCommande.setText(""+daoCom.getNumCom());
        cmd.setNumCom(daoCom.getNumCom());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
               
        try {
             date = sdf.parse(jFormattedTextFieldDate.getText());
        } catch (ParseException ex) {
             Logger.getLogger(JIFCommande.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cmd.setDateCom(date);
        
        myModel.setMyList(cmd);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAjout;
    private javax.swing.JButton jButtonFr;
    private javax.swing.JButton jButtonListCmd;
    private javax.swing.JButton jButtonModifCmd;
    private javax.swing.JButton jButtonRechProduit;
    private javax.swing.JButton jButtonSauverCommande;
    private javax.swing.JFormattedTextField jFormattedTextFieldDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNumCommande;
    private javax.swing.JLabel jLbCom1;
    private javax.swing.JLabel jLbProd1;
    private javax.swing.JLabel jLbQte1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableLC;
    private javax.swing.JTextField jTextFQte1;
    private javax.swing.JTextField jTextFieldFournisseur;
    private javax.swing.JTextField jTextFieldProduit;
    // End of variables declaration//GEN-END:variables

   
    private void refreshModel()
    {
           
            myModelPro.setMyList(daoprod.selectProduitCompareStockQuantite());
           myModelFour.setMyList(daoFour.selectFournisseur());
   
        
    }
    
     
      public  void setFour(Fournisseur fournisseur) {
            cmd.setFournisseur(fournisseur);
            jTextFieldFournisseur.setText(fournisseur.getNomFr());
            
    }
   
   
     public void setProduct(Produit produit){
        this.produit = produit;
        jTextFieldProduit.setText(produit.getDesignation());
    }
     
    private IDaoLigneCommande daoLgc=DaoFactory.getDaoLigneCommande();
    private IDaoCommande daoCom = DaoFactory.getDaoCommande();
    private IDaofournisseur daoFour = DaoFactory.getDaofournisseur();
    private IDaoProduit daoprod=DaoFactory.getDAOProduit();
    
    public ArrayList<String> motKey = new ArrayList<String>();
   
    private TableModelLigneCommande myModel = new model.TableModelLigneCommande(null);//ligne commande
    private TableModelProduit myModelPro =new model.TableModelProduit(daoprod.selectProduit()); //produit
    private TableModelFournisseur myModelFour =new model.TableModelFournisseur(daoFour.selectFournisseur());//fournisseur

    static String designationp ="", delivrancep="" ;

    boolean choix = false;
    LigneCommande lc;
    Produit produit;
    Fournisseur four;
    Commande cmd;
}

