
package onlineexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class AddStudent extends javax.swing.JFrame {

   
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sqr;
    String rNumber;
    String name;
    String birthday;
    String grade;
    String password;
    
    public AddStudent() {
        initComponents();
        conn=DBConnect.connect();
        tablelord();
        autoId();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtrnumber = new javax.swing.JTextField();
        txtsname = new javax.swing.JTextField();
        datebirth = new com.toedter.calendar.JDateChooser();
        cmbgrade = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblstudent = new javax.swing.JTable();
        txtpassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 186, 131));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(2, 33, 62));

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 170, 0));
        jLabel6.setText("Manage Students");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 60));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Birth Day");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Grade");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registation Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel1.add(txtrnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, -1));
        jPanel1.add(txtsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, -1));

        datebirth.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(datebirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 160, -1));

        cmbgrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Grade", "Grade 01", "Grade 02", "Grade 03", "Grade 04", "Grade 05" }));
        jPanel1.add(cmbgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 160, -1));

        tblstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblstudentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblstudent);

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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 630, 190));
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 160, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 140, 30));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 140, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 51));
        jButton3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 140, 30));

        jButton4.setBackground(new java.awt.Color(0, 255, 0));
        jButton4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 140, 30));

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
    
        rNumber = txtrnumber.getText();
        name = txtsname.getText();
        grade = cmbgrade.getSelectedItem().toString();
        password = txtpassword.getText();
        birthday = ((JTextField)datebirth.getDateEditor().getUiComponent()).getText();
    }
    
    private void clear()
    {
    
        txtrnumber.setText("");
        txtsname.setText("");
        cmbgrade.setSelectedIndex(0);
        txtpassword.setText("");
        ((JTextField)datebirth.getDateEditor().getUiComponent()).setText("");
    }
     private void tablelord()
    {
        try {
            String sql="SELECT `rNumber` as 'Register Number', `sName` as 'Student Name', `sbirthday` as 'Birthday', `grade` as 'Grade' FROM `student`";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblstudent.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
          //autoId();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
     //  theader();
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       getData();
         try {
                String q= "INSERT INTO `student`(`rNumber`, `sName`, `sbirthday`, `grade`, `password`) VALUES ('"+rNumber+"', '"+name+"','"+birthday+"','"+grade+"','"+password+"')";               
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
         autoId();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     clear();
     autoId();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      getData();
        try {
              String squpdate = "UPDATE `student` SET `sName`='"+name+"',`sbirthday`='"+birthday+"',`grade`='"+grade+"',`password`='"+password+"' WHERE rNumber = '"+rNumber+"'";
              pst=conn.prepareStatement(squpdate);
                pst.execute();  
                tablelord();
                clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,e);              
            }  
        autoId();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x=JOptionPane.showConfirmDialog(rootPane, "Do you realy want to delete");
        if(x==0)
        {
            if(txtrnumber.getText().length()>0)
            {
        try {
           
                String sql="DELETE FROM `student` WHERE rNumber='"+ txtrnumber.getText() +"'";
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
        autoId();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstudentMouseClicked
       DefaultTableModel tmodel=(DefaultTableModel)tblstudent.getModel();
        int selectrowindex=tblstudent.getSelectedRow();
        txtrnumber.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        txtsname.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        ((JTextField)datebirth.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(selectrowindex, 2).toString());
        cmbgrade.setSelectedItem(tmodel.getValueAt(selectrowindex, 3).toString());
        
        try {
             String sql="SELECT password FROM `student` where rNumber = '"+txtrnumber.getText()+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
            txtpassword.setText(rs.getString("password"));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblstudentMouseClicked

private void autoId()
    {
        try {
             String sql="SELECT `rNumber` FROM `student` ORDER BY rNumber DESC LIMIT 1";
           // String q="SELECT returndate FROM borrowdetails where mid='"+ name +"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
                String rnno=rs.getString("rNumber");
                int co=rnno.length();
               String txt= rnno.substring(0, 2);
               String num=rnno.substring(2, co);
               int n=Integer.parseInt(num);
               n++;
               String snum=Integer.toString(n);
               String ftxt=txt+snum;
               txtrnumber.setText(ftxt);
              // rid.setText(ftxt);
               rNumber = ftxt;
            
           }
           else
           {
               txtrnumber.setText("RN1000");
             //  rid.setText("RN1000");
               rNumber = "RN1000";
           }
           
                            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
       
    }
    
   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbgrade;
    private com.toedter.calendar.JDateChooser datebirth;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblstudent;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtrnumber;
    private javax.swing.JTextField txtsname;
    // End of variables declaration//GEN-END:variables
}
