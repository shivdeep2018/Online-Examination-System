
package onlineexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

  
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public static String registerNumber="";
    public static String grade="";
            
    public Login() {
        initComponents();
        conn=DBConnect.connect();
        registerNumber="";
        grade="";
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbtype = new javax.swing.JComboBox();
        lbluname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        txtpword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 33, 62));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 186, 131));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login As");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 29, -1, -1));

        cmbtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "Admin", "Student" }));
        cmbtype.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbtypePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel3.add(cmbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 30, 140, -1));

        lbluname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbluname.setForeground(new java.awt.Color(255, 255, 255));
        lbluname.setText("User Name");
        jPanel3.add(lbluname, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 96, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        jPanel3.add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, -1));
        jPanel3.add(txtpword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, -1));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jButton2.setText("Cancel");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(201, 22, 2));

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 3, 30)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 620, 280));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 170, 0));
        jLabel1.setText("Login Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbtypePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbtypePopupMenuWillBecomeInvisible
       
        int x=cmbtype.getSelectedIndex();
       if(x==2)
       {
       
           lbluname.setText("Register Number");
       }
       else
       {
           lbluname.setText("User Name");
       }
    }//GEN-LAST:event_cmbtypePopupMenuWillBecomeInvisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x = cmbtype.getSelectedIndex();
        String uname = txtuname.getText();
        String pword = txtpword.getText();
        if(x==1)
        {
            if(uname.equals("admin") && pword.equals("123"))
            {
                Home ho=new Home();
                ho.setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Error Login Details");
                txtuname.setText("");
                txtpword.setText("");
            }
        }
        else if(x==2)
        {
            try {
                    String sql="SELECT `rNumber`,grade, `password` FROM student WHERE rNumber='"+uname+"'";
                   // String q="SELECT returndate FROM borrowdetails where mid='"+ name +"'";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                   if(rs.next())
                   {
                        String password=rs.getString("password");
                        registerNumber = rs.getString("rNumber");
                        grade = rs.getString("grade");
                        if(pword.equals(password))
                        {
                        
                            Home ho=new Home();
                            ho.setVisible(true);
                            this.dispose();
                        
                        }

                   }
                   else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Error Login Details");
                        txtuname.setText("");
                        txtpword.setText("");
                    }
                   
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else
        {
           JOptionPane.showMessageDialog(rootPane, "Select login Type"); 
           txtuname.setText("");
           txtpword.setText("");
           cmbtype.setSelectedIndex(0);
        }
                
        
    }//GEN-LAST:event_jButton1ActionPerformed

  
    public static void main(String args[]) {
        
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbluname;
    private javax.swing.JPasswordField txtpword;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
