/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;


import persistence.IDaofournisseur;
import persistence.MySQL.DaoFactory;

import javax.swing.JOptionPane;

import transfertObject.Fournisseur;


public class JDFournisseur extends javax.swing.JDialog {
    
    /** Creates new form JDFournisseur*/
    public JDFournisseur(java.awt.Dialog parent, String titre) {
        super(parent, titre, true);
        initComponents();
        modif = fillComponents();
        getRootPane().setDefaultButton(jButtonValider);
        setLocation(parent.getX()+parent.getWidth()/3, parent.getY()+parent.getHeight()/8);
         this.jTextFieldNumfour.setVisible(false); 
        setVisible(true);
       
    }
    
    public JDFournisseur(java.awt.Dialog parent, String Titre, Fournisseur four)
    {
        super(parent, Titre, true);
        initComponents();
        modif = fillComponents(four);
        getRootPane().setDefaultButton(jButtonValider);
        setLocation(parent.getX()+parent.getWidth()/3, parent.getY()+parent.getHeight()/8);
         this.jTextFieldNumfour.setVisible(false); 
        setVisible(true);
       
        
    }

    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAdresse = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObserv = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldVille = new javax.swing.JTextField();
        jTextFieldNumfour = new javax.swing.JTextField();
        jTextFieldCP = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldTel = new javax.swing.JTextField();
        jTextFieldFax = new javax.swing.JTextField();
        jTextFieldSoc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonValider = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Societe:");

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Prénom :");

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Adresse :");

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("CP :");

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Observations :");

        jTextAreaObserv.setColumns(20);
        jTextAreaObserv.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObserv);

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Nom :");

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Ville :");

        jTextFieldVille.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldVilleKeyTyped(evt);
            }
        });

        jTextFieldNumfour.setEditable(false);

        jTextFieldCP.setAutoscrolls(false);
        jTextFieldCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCPKeyTyped(evt);
            }
        });

        jTextFieldNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomKeyTyped(evt);
            }
        });

        jTextFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });
        jTextFieldPrenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrenomKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Téléphone:");

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Fax:");

        jTextFieldTel.setAutoscrolls(false);
        jTextFieldTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelKeyTyped(evt);
            }
        });

        jTextFieldFax.setAutoscrolls(false);
        jTextFieldFax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFaxKeyTyped(evt);
            }
        });

        jTextFieldSoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSocKeyTyped(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(15, 15, 15)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel10)
                    .add(jLabel9)
                    .add(jLabel6)
                    .add(jLabel8)
                    .add(jLabel5)
                    .add(jLabel4)
                    .add(jLabel3)
                    .add(jLabel7)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 79, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldAdresse, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 280, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldCP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldNumfour, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldNom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldPrenom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 207, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldFax)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldTel)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldVille, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldSoc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(43, 43, 43)
                .add(jTextFieldNumfour, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jTextFieldSoc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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
                    .add(jTextFieldAdresse, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jTextFieldCP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jTextFieldVille, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel9)
                    .add(jTextFieldTel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel10)
                    .add(jTextFieldFax, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 19, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel6)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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
                .add(56, 56, 56))
        );

        jPanel2Layout.linkSize(new java.awt.Component[] {jButtonAnnuler, jButtonValider}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonValider)
                    .add(jButtonAnnuler))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        if(jTextFieldSoc.getText().equals(" ") || jTextFieldNom.getText().equals(" ") || jTextFieldPrenom.getText().equals("")|| jTextFieldAdresse.getText().equals("")||jTextFieldCP.getText().equals("") 
           ||jTextFieldVille.getText().equals("")||jTextFieldTel.getText().equals("")||jTextFieldFax.getText().equals("") ){
             JOptionPane.showMessageDialog(null,"SVP VEUILLEZ REMPLIR VOS CHAMPS !","Gestion Pharm",JOptionPane.INFORMATION_MESSAGE);
              
        }else {
        boolean ok;
        
        Fournisseur  four = new Fournisseur();  
        four = this.traitComponent();
        if(!dataOk){
            if(!modif)
                ok = daoFour.ajoutFournisseur(four);
            else
                ok = daoFour.updateFournisseur(four);
        
            if (!ok)
            JOptionPane.showMessageDialog(null,"Il y'a une erreur au moment de la validation !","Avertissement",JOptionPane.ERROR_MESSAGE);
        }
        
        this.dispose();
        
        }  
        
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
       
        this.dispose();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jTextFieldCPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCPKeyTyped
    

            if (! Character.isDigit(evt.getKeyChar()))
            {
                 evt.consume();
            }

    }//GEN-LAST:event_jTextFieldCPKeyTyped

    private void jTextFieldTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelKeyTyped
        if (! Character.isDigit(evt.getKeyChar()))
            {
                 evt.consume();
            }
    }//GEN-LAST:event_jTextFieldTelKeyTyped

    private void jTextFieldFaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFaxKeyTyped
        if (! Character.isDigit(evt.getKeyChar()))
            {
                 evt.consume();
            }
    }//GEN-LAST:event_jTextFieldFaxKeyTyped

    private void jTextFieldNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomKeyTyped
       //ne permettre  que la saisie des lettres dans le textfield nom
         if(!Character.isLetter(evt.getKeyChar()))
            evt.consume();
        
    }//GEN-LAST:event_jTextFieldNomKeyTyped

    private void jTextFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrenomActionPerformed

    private void jTextFieldPrenomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrenomKeyTyped
          if (!Character.isLetter(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar())){
            evt.consume();
        }
        
    }//GEN-LAST:event_jTextFieldPrenomKeyTyped

    private void jTextFieldSocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSocKeyTyped
          if (!Character.isLetter(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar())){
            evt.consume();
        };
    }//GEN-LAST:event_jTextFieldSocKeyTyped

    private void jTextFieldVilleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVilleKeyTyped
       if (!Character.isLetter(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldVilleKeyTyped

    
public Fournisseur traitComponent()
{
        
        int pos = 0;
        Fournisseur  four = new Fournisseur();
        
        
        ///// dans cee code  nous devons nous assurer qu'il est possible d'entrer des données contenant des quotes////
        
        if(jTextFieldSoc.getText().contains("'"))
        {
            pos = jTextFieldSoc.getText().indexOf("'");
            temp = jTextFieldSoc.getText().substring(0, pos+1)+"'"+jTextFieldSoc.getText().substring(pos+1);
            temp = temp.trim(); ///// pour effacer les caractéres de début et fin de text/////
            jTextFieldSoc.setText(temp); 
        }
        
        
        if(jTextFieldNom.getText().contains("'"))
        {
            pos = jTextFieldNom.getText().indexOf("'");
            temp = jTextFieldNom.getText().substring(0, pos+1)+"'"+jTextFieldNom.getText().substring(pos+1);
            temp = temp.trim(); ///// c' est pour effacer les caractéres de début et fin de texte/////
            jTextFieldNom.setText(temp);
           
        }
        
        //// ce petit  code permet de s'assurer que la premiére lettre du Nom est en majuscule/////
        temp = jTextFieldNom.getText();
        if(!temp.equals("")){
           String firstCharN = temp.substring(0, 1).toUpperCase();
           firstCharN += temp.substring(1); 
           jTextFieldNom.setText(firstCharN);
        }
        else
          jTextFieldNom.setText(temp);      
        
        if(jTextFieldPrenom.getText().contains("'"))
        {
            pos = jTextFieldPrenom.getText().indexOf("'");
            temp = jTextFieldPrenom.getText().substring(0, pos+1)+"'"+jTextFieldPrenom.getText().substring(pos+1);
            temp = temp.trim(); // pour effacer les caractéres de début et de la fin de text///////
            jTextFieldPrenom.setText(temp);
            
        }
        ///// ce petit code permet de s'assurer que la premiére lettre du prénom est en majuscule////////
        temp = jTextFieldPrenom.getText();
        if(!temp.equals(""))
        {
            String firstChar = temp.substring(0, 1).toUpperCase();
            firstChar += temp.substring(1);
            jTextFieldPrenom.setText(firstChar);
        }
        else
            jTextFieldPrenom.setText(temp);
        
        ///// ici nous devons nous assurer qu'il est possible d'entrer des données contenant des quotes/////
        
        if(jTextFieldAdresse.getText().contains("'"))
        {
            pos = jTextFieldAdresse.getText().indexOf("'");
            temp = jTextFieldAdresse.getText().substring(0, pos+1)+"'"+jTextFieldAdresse.getText().substring(pos+1);
            temp = temp.trim(); // pour effacer les caractéres de début et de fin de text
            jTextFieldAdresse.setText(temp);
         
        }
        
        ///// ce petit code envoie un message d' avertissement pour tout code postal > 5 chiffres ....
        
        if(jTextFieldCP.getText().length() > 5)
        {
            JOptionPane.showMessageDialog(null, "Le code Postal doit avoir MAXIMUM 5 CHIFFRES ", "Avertissement",JOptionPane.ERROR_MESSAGE);
            jTextFieldCP.setText(jTextFieldCP.getText().substring(0, 5));
            dataOk=true;
        }
        
        ///// dans cee code  nous devons nous assurer qu'il est possible d'entrer des données contenant des quotes////
        
        if(jTextFieldVille.getText().contains("'"))
        {
            pos = jTextFieldVille.getText().indexOf("'");
            temp = jTextFieldVille.getText().substring(0, pos+1)+"'"+jTextFieldVille.getText().substring(pos+1);
            temp = temp.trim(); ///// pour effacer les caractéres de début et fin de text/////
            jTextFieldVille.setText(temp); 
        }
        
        
        ///// ce  code envoie un message d' avertissement pour tout le numero > 10 chiffres ....
        
        if(jTextFieldTel.getText().length() > 15)
        {
            JOptionPane.showMessageDialog(null, "Le numéro du téléphone doit avoir MAXIMUM 15 CHIFFRES ", "Avertissement",JOptionPane.ERROR_MESSAGE);
            jTextFieldTel.setText(jTextFieldTel.getText().substring(0, 15));
            dataOk=true;
        }
        
         ///// ce  code envoie un message d' avertissement pour tout le numero > 10 chiffres ....
        
        if(jTextFieldFax.getText().length() > 15)
        {
            JOptionPane.showMessageDialog(null, "Le numéro du fax doit avoir MAXIMUM 10 CHIFFRES ", "Avertissement",JOptionPane.ERROR_MESSAGE);
            jTextFieldFax.setText(jTextFieldFax.getText().substring(0, 15));
            dataOk=true;
        }
        
        ///// ici nous devons nous assurer qu'il est possible d'entrer des données contenant des quotes////
        
        if(jTextAreaObserv.getText().contains("'"))
        {
            pos = jTextAreaObserv.getText().indexOf("'");
            temp = jTextAreaObserv.getText().substring(0, pos+1)+"'"+jTextAreaObserv.getText().substring(pos+1);
            jTextAreaObserv.setText(temp);
        } 
        if(modif)
            four.setNumFour(Integer.parseInt(jTextFieldNumfour.getText()));
        four.setSociete(jTextFieldSoc.getText());
        four.setNomFr(jTextFieldNom.getText());
        four.setPrenomFr(jTextFieldPrenom.getText());
        four.setAdresseFr(jTextFieldAdresse.getText());
        four.setCpFr(jTextFieldCP.getText());
        four.setVilleFr(jTextFieldVille.getText());
        four.setTel(jTextFieldTel.getText());
        four.setFax(jTextFieldFax.getText());
        four.setObservationsFr(jTextAreaObserv.getText());
        
        
        return four ;
}
  
private boolean fillComponents(Fournisseur four)
{
    jTextFieldNumfour.setText(String.valueOf(four.getNumFour()));
    jTextFieldSoc.setText(four.getSociete());
    jTextFieldNom.setText(four.getNomFr());
    jTextFieldPrenom.setText(four.getPrenomFr());
    jTextFieldAdresse.setText(four.getAdresseFr());
    jTextFieldCP.setText(four.getCpFr());
    jTextFieldVille.setText(four.getVilleFr());
    jTextFieldTel.setText(four.getTel());
    jTextFieldFax.setText(four.getFax());
    jTextAreaObserv.setText(four.getObservationsFr());
    modif = true;
    return modif;
}

private boolean fillComponents()
{
     return modif;
}


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObserv;
    private javax.swing.JTextField jTextFieldAdresse;
    private javax.swing.JTextField jTextFieldCP;
    private javax.swing.JTextField jTextFieldFax;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldNumfour;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JTextField jTextFieldSoc;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JTextField jTextFieldVille;
    // End of variables declaration//GEN-END:variables

    private IDaofournisseur daoFour = DaoFactory.getDaofournisseur();
    boolean modif = false ,dataOk =false;
    String temp ="";
}
