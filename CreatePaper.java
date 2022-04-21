
package onlineexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class CreatePaper extends javax.swing.JFrame {

   
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sqr;
    String examname;
    String subject;
    String subjectcode;
    String allowgrade;
    String quection;
    String ans01;
    String ans02;
    String ans03;
    String ans04;
    String correctans;
    String quectionNumber;
    
    
    
    public CreatePaper() {
        initComponents();
        conn=DBConnect.connect();
        tablelord();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtsubject = new javax.swing.JTextField();
        cmbalgrade = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpaper = new javax.swing.JTable();
        txtans01 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtans04 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtans02 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtans03 = new javax.swing.JTextField();
        txtcorrectans = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtque = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txtsubcode = new javax.swing.JTextField();
        cmbexam = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtquenumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 186, 131));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(2, 33, 62));
        jPanel2.setForeground(new java.awt.Color(2, 33, 62));

        jLabel12.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 170, 0));
        jLabel12.setText("Setup Pepar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addContainerGap(487, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Answer 01");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 70, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Allow Grade");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quection");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Exam Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Subject ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel1.add(txtsubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 210, -1));

        cmbalgrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Grade", "Grade 01", "Grade 02", "Grade 03", "Grade 04", "Grade 05" }));
        jPanel1.add(cmbalgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 210, -1));

        tblpaper.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblpaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpaperMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblpaper);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 630, 160));

        txtans01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtans01ActionPerformed(evt);
            }
        });
        jPanel1.add(txtans01, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 210, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 100, 30));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 100, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 100, 30));

        jButton4.setBackground(new java.awt.Color(0, 255, 0));
        jButton4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 100, 30));

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Answer 04");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));
        jPanel1.add(txtans04, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 210, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Answer 02");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));
        jPanel1.add(txtans02, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 210, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Answer 03");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));
        jPanel1.add(txtans03, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 210, -1));
        jPanel1.add(txtcorrectans, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 130, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correct Answer Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        txtque.setColumns(20);
        txtque.setRows(5);
        jScrollPane1.setViewportView(txtque);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 210, 60));

        jLabel10.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Subject Code ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel1.add(txtsubcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 210, -1));

        cmbexam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Exam", "First Exam", "Mid Exam", "End Exam" }));
        jPanel1.add(cmbexam, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 210, -1));

        jLabel11.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quection Number");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, -1));
        jPanel1.add(txtquenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void getData()
    {
    
     examname = cmbexam.getSelectedItem().toString();
     subject = txtsubject.getText();
     subjectcode = txtsubcode.getText();
     allowgrade = cmbalgrade.getSelectedItem().toString();
     quection = txtque.getText();
     ans01 =txtans01.getText();
     ans02 = txtans02.getText();
     ans03 = txtans03.getText();
     ans04 = txtans04.getText();
     correctans = txtcorrectans.getText();
     quectionNumber = txtquenumber.getText();
     
    }
    
    private void clear()
    {
    
     cmbexam.setSelectedIndex(0);
     txtsubject.setText("");
     txtsubcode.setText("");
     cmbalgrade.setSelectedIndex(0);
     txtque.setText("");
     txtans01.setText("");
     txtans02.setText("");
     txtans03.setText("");
     txtans04.setText("");
     txtcorrectans.setText("");
     txtquenumber.setText("");
     
     
    }
     private void tablelord()
    {
        try {
            String sql="SELECT `exam` as 'Exam', `subject` as 'Subject', `subcode` as 'Sub Code', `grade` as 'Grade',queNumber as 'Quection Number', `que` as 'Quection', `ans01` as 'Answer 01', `ans02` as 'Answer 02', `ans03` as 'Answer 03', `ans04` as 'Answer 04', `correctans` as 'Correct Answer' FROM `setPaper`";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblpaper.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
     //  theader();
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        getData();
         try {
                String q= "INSERT INTO `setPaper`(`exam`, `subject`, `subcode`, `grade`,queNumber, `que`, `ans01`, `ans02`, `ans03`, `ans04`, `correctans`) VALUES ('"+examname+"', '"+subject+"','"+subjectcode+"','"+allowgrade+"','"+quectionNumber+"','"+quection+"','"+ans01+"','"+ans02+"','"+ans03+"','"+ans04+"','"+correctans+"')";               
                pst=conn.prepareStatement(q);                
                pst.execute(); 
                tablelord();
                clear();
                 JOptionPane.showMessageDialog(rootPane,"Successfully Added");
                    } 
                catch (Exception e) 
                {
                JOptionPane.showMessageDialog(rootPane,e);
                } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtans01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtans01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtans01ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       getData();
        try {
              String squpdate = "UPDATE `setPaper` SET `exam`='"+examname+"',`subject`='"+subject+"',`subcode`='"+subjectcode+"',`grade`='"+allowgrade+"',`que`='"+quection+"',`ans01`='"+ans01+"',`ans02`='"+ans02+"',`ans03`='"+ans03+"',`ans04`='"+ans04+"',`correctans`='"+correctans+"' WHERE queNumber = '"+quectionNumber+"'";
              pst=conn.prepareStatement(squpdate);
                pst.execute();  
                tablelord();
                clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,e);              
            }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int x=JOptionPane.showConfirmDialog(rootPane, "Do you realy want to delete");
        if(x==0)
        {
            if(quectionNumber.length()>0)
            {
        try {
           
                String sql="DELETE FROM `setPaper` WHERE queNumber='"+ quectionNumber +"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                
                tablelord();
                clear();
           JOptionPane.showMessageDialog(rootPane, "sccessfully Delete");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Select Student to Delete");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblpaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpaperMouseClicked
        
        DefaultTableModel tmodel=(DefaultTableModel)tblpaper.getModel();
        int selectrowindex=tblpaper.getSelectedRow();
        cmbexam.setSelectedItem((tmodel.getValueAt(selectrowindex, 0).toString()));
        txtsubject.setText(tmodel.getValueAt(selectrowindex, 1).toString());
         txtsubcode.setText(tmodel.getValueAt(selectrowindex, 2).toString());
         cmbalgrade.setSelectedItem((tmodel.getValueAt(selectrowindex, 3).toString()));
         quectionNumber = (tmodel.getValueAt(selectrowindex, 4).toString());
         txtquenumber.setText(tmodel.getValueAt(selectrowindex, 4).toString());
         txtque.setText(tmodel.getValueAt(selectrowindex, 5).toString());
         txtans01.setText(tmodel.getValueAt(selectrowindex, 6).toString());
         txtans02.setText(tmodel.getValueAt(selectrowindex, 7).toString());
         txtans03.setText(tmodel.getValueAt(selectrowindex, 8).toString());
         txtans04.setText(tmodel.getValueAt(selectrowindex, 9).toString());
         txtcorrectans.setText(tmodel.getValueAt(selectrowindex, 10).toString());
        
        
        
    }//GEN-LAST:event_tblpaperMouseClicked

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreatePaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePaper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbalgrade;
    private javax.swing.JComboBox cmbexam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblpaper;
    private javax.swing.JTextField txtans01;
    private javax.swing.JTextField txtans02;
    private javax.swing.JTextField txtans03;
    private javax.swing.JTextField txtans04;
    private javax.swing.JTextField txtcorrectans;
    private javax.swing.JTextArea txtque;
    private javax.swing.JTextField txtquenumber;
    private javax.swing.JTextField txtsubcode;
    private javax.swing.JTextField txtsubject;
    // End of variables declaration//GEN-END:variables
}
