/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import util.cryptingUtil;
import persistence.IDaoUtilisateur;
import persistence.MySQL.DaoFactory;
import java.awt.Frame;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;



import transfertObject.Utilisateur;


public class JDUtilisateur extends javax.swing.JDialog {
    
   
    /** Creates new form JDClient */
    public JDUtilisateur(Frame parent, String titre) {
        super(parent, titre, true);
        initComponents();
        modif = fillComponents(util);
        getRootPane().setDefaultButton(jButtonValider);
        setLocation(parent.getX()+parent.getWidth()/3, parent.getY()+parent.getHeight()/8);
        this.jTextFieldId_User.setVisible(false);
        jPasswordFieldAncienMDP.setEnabled(false);
        
        motKey.add("Employé");
        motKey.add("Stagiaire");
         for (String s : motKey)
            
            jComboBoxType.addItem(s.toString());
        
        
        setVisible(true);
    }
    
    //modification
    public JDUtilisateur(Frame parent, String Titre, Utilisateur util)
    {
        super(parent, Titre, true);
        initComponents();
        jPasswordFieldConfirmepw.setEnabled(false);
        jPasswordFieldPass.setEnabled(false);
        modif = fillComponents(util);
        getRootPane().setDefaultButton(jButtonValider);
        setLocation(parent.getX()+parent.getWidth()/3, parent.getY()+parent.getHeight()/8);
        jTextFieldId_User.setVisible(false);
        jTextFieldUsername.setEditable(false);
        this.util = util;
        
        motKey.add("Employé");
        motKey.add("Stagiaire");
         for (String s : motKey)
            
            jComboBoxType.addItem(s.toString());
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldId_User = new javax.swing.JTextField();
        jComboBoxType = new javax.swing.JComboBox();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordFieldConfirmepw = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordFieldAncienMDP = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jButtonValider = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("inserer utilisateur"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Type:");

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Prénom :");

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Nom d'utilisateur:");

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Mot de passe:");

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Nom :");

        jTextFieldId_User.setEditable(false);

        jComboBoxType.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jComboBoxType.setForeground(new java.awt.Color(0, 0, 204));

        jTextFieldNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomKeyTyped(evt);
            }
        });

        jTextFieldPrenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrenomKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("confirmer mot de passe:");

        jPasswordFieldConfirmepw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldConfirmepwKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Ancien mot de passe:");

        jPasswordFieldAncienMDP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldAncienMDPKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldAncienMDPKeyReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel6)
                    .add(jLabel5)
                    .add(jLabel4)
                    .add(jLabel3)
                    .add(jLabel7)
                    .add(jLabel2)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldId_User, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBoxType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPasswordFieldAncienMDP)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldNom)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldPrenom)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldUsername)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPasswordFieldPass, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPasswordFieldConfirmepw)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(43, 43, 43)
                .add(jTextFieldId_User, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jComboBoxType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel7)
                    .add(jTextFieldNom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jTextFieldPrenom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel4)
                    .add(jTextFieldUsername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 25, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jPasswordFieldAncienMDP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jPasswordFieldPass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jPasswordFieldConfirmepw, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonValider.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonValider.setForeground(new java.awt.Color(0, 51, 204));
        jButtonValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icones/chercheAssiste.png"))); // NOI18N
        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jButtonAnnuler.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAnnuler.setForeground(new java.awt.Color(0, 51, 204));
        jButtonAnnuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icones/Erase.png"))); // NOI18N
        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jButtonValider)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButtonAnnuler)
                .add(51, 51, 51))
        );

        jPanel2Layout.linkSize(new java.awt.Component[] {jButtonAnnuler, jButtonValider}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(4, 4, 4)
                        .add(jButtonAnnuler, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jButtonValider)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed

        if(verifierChamps()){      
            if(!daoUtil.existUser(util)){    
                try {
                    System.out.println("add");
                    daoUtil.ajoutUtilisateur(util);
                    this.dispose();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            } 
            else {
                try {
                    System.out.println("Update");
                    daoUtil.updateUtilisateur(util);
                    this.dispose();
                } catch(Exception e){
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
        }  
        
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
      
        this.dispose();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jTextFieldNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomKeyTyped
           if (!Character.isLetter(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNomKeyTyped

    private void jTextFieldPrenomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrenomKeyTyped
          if (!Character.isLetter(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPrenomKeyTyped

    private void jPasswordFieldConfirmepwKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmepwKeyTyped

                            
    }//GEN-LAST:event_jPasswordFieldConfirmepwKeyTyped

    private void jPasswordFieldAncienMDPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldAncienMDPKeyPressed
        
    }//GEN-LAST:event_jPasswordFieldAncienMDPKeyPressed

    private void jPasswordFieldAncienMDPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldAncienMDPKeyReleased
        boolean rep = false;
        try {
            //compare les deux password
            rep = cryptingUtil.encryptPassword(jPasswordFieldAncienMDP.getText()).equals(util.getPassword());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(JDUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(JDUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            jPasswordFieldPass.setEnabled(rep);
            jPasswordFieldConfirmepw.setEnabled(rep);
        }            
    }//GEN-LAST:event_jPasswordFieldAncienMDPKeyReleased
    
public boolean verifierChamps()
{
    boolean isCorrect = false;
            
    //verifier si le champs sont vide            
    isCorrect = !"".equals(jTextFieldNom.getText());  
    isCorrect = !"".equals(jTextFieldPrenom.getText()) && isCorrect;
    isCorrect = !"".equals(jTextFieldUsername.getText()) && isCorrect;
        
    if (!"".equals(jPasswordFieldPass.getText())&& isCorrect) {
        if(jPasswordFieldPass.getText().equals(jPasswordFieldConfirmepw.getText())){
            isCorrect = true;
        } else {
            isCorrect = false;
        }
    } else {
       isCorrect = false;
    }

    if(isCorrect){

        try {
            util.setType(Utilisateur.TypeUtilisateur.valueOf(jComboBoxType.getSelectedItem().toString()));
            util.setNomId(jTextFieldNom.getText());
            util.setPrenomId(jTextFieldPrenom.getText());
            util.setUsername(jTextFieldUsername.getText());
            util.setPassword(cryptingUtil.encryptPassword(jPasswordFieldPass.getText()));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(JDUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(JDUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Veuillez remplir  les champs.", "Gestion Pharm", JOptionPane.INFORMATION_MESSAGE );
    }
    
    return isCorrect;
}
  
private boolean fillComponents(Utilisateur util)
{
    jComboBoxType.setSelectedItem(util.getType());
    jTextFieldNom.setText(util.getNomId());
    jTextFieldPrenom.setText(util.getPrenomId());
    jTextFieldUsername.setText(util.getUsername());
    
    modif = true;
    return modif;
   
}





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldAncienMDP;
    private javax.swing.JPasswordField jPasswordFieldConfirmepw;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JTextField jTextFieldId_User;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables

    private IDaoUtilisateur daoUtil = DaoFactory.getDaoUtilisateur();
    boolean modif = false ,dataOk =false;
    Utilisateur util = new Utilisateur();
    String temp ="";
    String mDP="";
    public ArrayList<String> motKey = new ArrayList<String>();
}
