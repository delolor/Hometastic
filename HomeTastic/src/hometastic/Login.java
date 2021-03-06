/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometastic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ButtonCancel = new javax.swing.JButton();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordEntered = new javax.swing.JPasswordField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        ButtonLogin1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HomeTastic");
        setAutoRequestFocus(false);
        setSize(new java.awt.Dimension(960, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 66, 127));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, 40));

        jLabel3.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login as");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, 40));

        jLabel4.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, 40));

        ButtonCancel.setBackground(new java.awt.Color(255, 242, 0));
        ButtonCancel.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        ButtonCancel.setText("Cancel");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 170, 50));

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 390, 40));
        jPanel1.add(jPasswordEntered, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 390, 40));

        jRadioButton3.setBackground(new java.awt.Color(0, 66, 127));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Administrator");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(0, 66, 127));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("User");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(0, 66, 127));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Host");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        ButtonLogin1.setBackground(new java.awt.Color(255, 242, 0));
        ButtonLogin1.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        ButtonLogin1.setText("Login");
        ButtonLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogin1ActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 170, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 970, 320));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        jLabel2.setText("Login Page");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hometastic/Logo Colored (0.9).png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hometastic/Logo Colored (0.7).png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 230));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        // TODO add your handling code here:
        dispose();
        new Welcome().setVisible(true);
    }//GEN-LAST:event_ButtonCancelActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed
    
    
    String username;
    private void ButtonLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogin1ActionPerformed
        try
        { 
            jRadioButton1.setActionCommand("user");
            jRadioButton2.setActionCommand("host");
            jRadioButton3.setActionCommand("admin");
            String password = null;
            String query = null;
            String selection = buttonGroup1.getSelection().getActionCommand();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hometastic","root","1234");
            
            if(selection == "user"){
                query = "select  USER_ID, USER_PASS from user where USER_ID LIKE '%"+jTextFieldEmail.getText()+"%'";
                password = "USER_PASS";
                PreparedStatement statement = con.prepareStatement(query);
                ResultSet result = statement.executeQuery(); 
                if (result.next())
                {   
                    String dbasePassword=result.getString(password).trim();
                    String enteredPassword=jPasswordEntered.getText().trim();
                    if(dbasePassword.equals(enteredPassword)){
                            dispose();
                            username = jTextFieldEmail.getText();
                            new MainPage(username).setVisible(true);
                            
                            System.out.println("Welcome"); 
                    }
                    else
                            System.out.println("Sorry you are unauthorized");        
                }                     
                else
                {   
                    //System.out.println(query);
                    System.out.println("This email address is not registered");              
                }                      
                statement.close();
                con.close();  
            }
            
            else if (selection == "host"){
                query = "select  HOST_ID, HOST_PASS from host where HOST_ID LIKE '%"+jTextFieldEmail.getText()+"%'";
                password = "HOST_PASS";
                PreparedStatement statement = con.prepareStatement(query);
                ResultSet result = statement.executeQuery(); 
                if (result.next())
                {   
                    String dbasePassword=result.getString(password).trim();
                    String enteredPassword=jPasswordEntered.getText().trim();
                    if(dbasePassword.equals(enteredPassword)){
                            dispose();
                            username = jTextFieldEmail.getText();
                      
                            HostMainPage e = new HostMainPage(username);
                            e.setVisible(true);
                            
                            
                            System.out.println("Welcome"); 
                    }
                    else
                            System.out.println("Sorry you are unauthorized");        
                }                     
                else
                {   
                    //System.out.println(query);
                    System.out.println("This email address is not registered");              
                }                      
                statement.close();
                con.close(); 
                
            }
            
            else if (selection == "admin"){
                query = "select  ADMIN_ID, ADMIN_PASS from admin where ADMIN_ID LIKE '%"+jTextFieldEmail.getText()+"%'";
                password = "ADMIN_PASS";
                PreparedStatement statement = con.prepareStatement(query);
                ResultSet result = statement.executeQuery(); 
                if (result.next())
                {   
                    String dbasePassword=result.getString(password).trim();
                    String enteredPassword=jPasswordEntered.getText().trim();
                    if(dbasePassword.equals(enteredPassword)){
                            dispose();
                            username = jTextFieldEmail.getText();
                            new ManageReport(username).setVisible(true);
                            
                            System.out.println("Welcome"); 
                    }
                    else
                            System.out.println("Sorry you are unauthorized");        
                }                     
                else
                {   
                    //System.out.println(query);
                    System.out.println("This email address is not registered");              
                }                      
                statement.close();
                con.close(); 
            }
            
            //String query = "select  USER_ID, USER_PASS from user where USER_ID LIKE '%"+jTextFieldEmail.getText()+"%'";
            /*
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet result = statement.executeQuery(); 
            if (result.next())
            {   
                String dbasePassword=result.getString(password).trim();
                String enteredPassword=jPasswordEntered.getText().trim();
                if(dbasePassword.equals(enteredPassword)){
   			System.out.println("Welcome"); 
                }
                else
  			System.out.println("Sorry you are unauthorized");        
            }                     
            else
            {   
                //System.out.println(query);
                System.out.println("This email address is not registered");              
            }                      
            statement.close();
            con.close();    
            */
        }
        catch(SQLException se){
             se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();     
            System.out.println("Exception occurred while searching in the users table");
        }
    }//GEN-LAST:event_ButtonLogin1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonLogin1;
    private javax.swing.JLabel Logo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordEntered;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables
}
