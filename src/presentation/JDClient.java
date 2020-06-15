/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import persistence.IDaoClient;
import persistence.MySQL.DaoFactory;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import transfertObject.Client;



public class JDClient extends javax.swing.JDialog {
    
    /** Creates new form JDClient */
    public JDClient(Frame parent, String titre) {
        super(parent, titre, true);
        initComponents();
        modif = fillComponents();
        getRootPane().setDefaultButton(jButtonValider);
        setLocation(parent.getX()+parent.getWidth()/3, parent.getY()+parent.getHeight()/8);
         this.jTextFieldNumcli.setVisible(false); 
        setVisible(true);
      
    }


    JDClient(JFrame parent, String modification_client, Client cli) {
        super(parent,modification_client , true);
        initComponents();
        modif = fillComponents(cli);
        getRootPane().setDefaultButton(jButtonValider);
        setLocation(parent.getX()+parent.getWidth()/3, parent.getY()+parent.getHeight()/8);
        this.jTextFieldNumcli.setVisible(false); 
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
        jTextFieldCp = new javax.swing.JTextField();
        jTextFieldNumcli = new javax.swing.JTextField();
        jComboBoxTitre = new javax.swing.JComboBox();
        jTextFieldVille = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTel = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonValider = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Titre :");

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

        jTextFieldCp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCpKeyTyped(evt);
            }
        });

        jTextFieldNumcli.setEditable(false);

        jComboBoxTitre.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jComboBoxTitre.setForeground(new java.awt.Color(0, 0, 204));
        jComboBoxTitre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monsieur", "Madame", "Mademoiselle" }));

        jTextFieldVille.setAutoscrolls(false);
        jTextFieldVille.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldVilleKeyTyped(evt);
            }
        });

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

        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Téléphone:");

        jTextFieldTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelKeyTyped(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(47, 47, 47)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel8)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel5)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel4)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel7)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(41, 41, 41)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel9)
                            .add(jLabel6))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 25, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldAdresse, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 280, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldNumcli, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBoxTitre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldNom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldPrenom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 207, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(11, 11, 11)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldVille, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldTel)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldCp)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(43, 43, 43)
                .add(jTextFieldNumcli, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jComboBoxTitre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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
                    .add(jTextFieldCp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jTextFieldVille, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(jTextFieldTel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 20, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6))
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
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 199, Short.MAX_VALUE)
                .add(jButtonAnnuler)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(new java.awt.Component[] {jButtonAnnuler, jButtonValider}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jButtonAnnuler, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButtonValider, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(18, 18, 18)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        if(jTextFieldNom.getText().equals(" ") || jTextFieldPrenom.getText().equals("")|| jTextFieldAdresse.getText().equals("")||jTextFieldCp.getText().equals("") 
           ||jTextFieldVille.getText().equals("")||jTextFieldTel.getText().equals("") ){
             JOptionPane.showMessageDialog(null,"SVP VEUILLEZ REMPLIR VOS CHAMPS !","Gestion Pharm",JOptionPane.INFORMATION_MESSAGE);
              
        }
        else {  
            Client cli = null;    
            try {
                cli = this.traitComponent();
                if(cli.getNumCli() != 0)
                    daoCli.updateClient(cli);
                else
                    daoCli.ajoutClient(cli);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Il y'a une erreur au moment de la validation !","Gestion Pharm",JOptionPane.ERROR_MESSAGE);
            }
          
            dispose();
        }
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
       
        dispose();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jTextFieldVilleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVilleKeyTyped
       
         if(!Character.isLetter(evt.getKeyChar()))
            evt.consume();
        
    }//GEN-LAST:event_jTextFieldVilleKeyTyped

    private void jTextFieldCpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCpKeyTyped
      
            if (! Character.isDigit(evt.getKeyChar()))
            {
                 evt.consume();
            }

    }//GEN-LAST:event_jTextFieldCpKeyTyped

    private void jTextFieldTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelKeyTyped
     

            if (! Character.isDigit(evt.getKeyChar()))
            {
                 evt.consume();
            }

    }//GEN-LAST:event_jTextFieldTelKeyTyped

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

    
public Client traitComponent()
{       
        int pos = 0;
        Client  cli = new Client();
        
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
        
        if(jTextFieldCp.getText().length() > 5)
        {
            JOptionPane.showMessageDialog(null, "Le code Postal doit avoir MAXIMUM 5 CHIFFRES ", "Avertissement",JOptionPane.ERROR_MESSAGE);
            jTextFieldCp.setText(jTextFieldCp.getText().substring(0, 5));
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
        
         ///// ce petit code envoie un message d' avertissement pour tout le numéro de telephone > 10 chiffres ....
        
        if(jTextFieldTel.getText().length() > 15)
        {
            JOptionPane.showMessageDialog(null, "Le numéro de téléphone  doit avoir MAXIMUM 10 CHIFFRES ", "Avertissement",JOptionPane.ERROR_MESSAGE);
            jTextFieldVille.setText(jTextFieldVille.getText().substring(0, 15));
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
            cli.setNumCli(Integer.parseInt(jTextFieldNumcli.getText()));
        cli.setTitre(jComboBoxTitre.getSelectedItem().toString());
        cli.setNomcli(jTextFieldNom.getText());
        cli.setPrenomcli(jTextFieldPrenom.getText());
        cli.setAdressecli(jTextFieldAdresse.getText());
        cli.setCpcli(jTextFieldCp.getText());
        cli.setVillecli(jTextFieldVille.getText());
        cli.setTelephonecli(jTextFieldTel.getText());
        cli.setObservationscli(jTextAreaObserv.getText());
        
           return cli;
         
    
 
}

  
private boolean fillComponents(Client cli)
{
    jTextFieldNumcli.setText(String.valueOf(cli.getNumCli()));
    jComboBoxTitre.setSelectedItem(cli.getTitre());
    jTextFieldNom.setText(cli.getNomcli());
    jTextFieldPrenom.setText(cli.getPrenomcli());
    jTextFieldAdresse.setText(cli.getAdressecli());
    jTextFieldCp.setText(cli.getCpcli());
    jTextFieldVille.setText(cli.getVillecli());
    jTextFieldTel.setText(String.valueOf(cli.getTelephonecli()));
    jTextAreaObserv.setText(cli.getObservationscli());
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
    private javax.swing.JComboBox jComboBoxTitre;
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
    private javax.swing.JTextField jTextFieldCp;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldNumcli;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JTextField jTextFieldVille;
    // End of variables declaration//GEN-END:variables

    private IDaoClient daoCli = DaoFactory.getDaoClient();
    boolean modif = false ,dataOk =false;
    String temp ="";
}
