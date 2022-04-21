
package onlineexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Paper extends javax.swing.JFrame {

    
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sqr;
    int queNo=0;
    int trueAns = 0;
    int falseAns = 0;
    String subname;
    String subcode;
    String exam;
    String regNum;
    String ansnum = "0";
    String correctAns="";
    
    public Paper() {
        initComponents();
        conn=DBConnect.connect();
        loadQue();
        lblregisternum.setText(Login.registerNumber);
        lblgrade.setText(Login.grade);
        panelord();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblsubcode = new javax.swing.JLabel();
        lblexamname = new javax.swing.JLabel();
        lblregisternum = new javax.swing.JLabel();
        lblgrade = new javax.swing.JLabel();
        lblquection = new javax.swing.JLabel();
        rbtans01 = new javax.swing.JRadioButton();
        rbtans02 = new javax.swing.JRadioButton();
        rbtans03 = new javax.swing.JRadioButton();
        rbtans04 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblanswer = new javax.swing.JTable();
        lblqueNum = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblquenumbers = new javax.swing.JLabel();
        lblmark = new javax.swing.JLabel();
        lblcorrectans = new javax.swing.JLabel();
        lblfalseans = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(2, 33, 62));

        jLabel8.setFont(new java.awt.Font("Sitka Heading", 3, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 170, 0));
        jLabel8.setText("Paper");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addContainerGap(583, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 60));

        lblsubcode.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblsubcode.setForeground(new java.awt.Color(0, 186, 131));
        lblsubcode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsubcode.setText("Exam Code");
        jPanel1.add(lblsubcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 230, -1));

        lblexamname.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblexamname.setForeground(new java.awt.Color(0, 186, 131));
        lblexamname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblexamname.setText("Exam Name");
        jPanel1.add(lblexamname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 230, -1));

        lblregisternum.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        lblregisternum.setForeground(new java.awt.Color(0, 186, 131));
        lblregisternum.setText("Register Number");
        jPanel1.add(lblregisternum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lblgrade.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        lblgrade.setForeground(new java.awt.Color(0, 186, 131));
        lblgrade.setText("Grade");
        jPanel1.add(lblgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        lblquection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblquection.setText("Quection");
        jPanel1.add(lblquection, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        buttonGroup1.add(rbtans01);
        rbtans01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtans01.setText("answer 01");
        jPanel1.add(rbtans01, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        buttonGroup1.add(rbtans02);
        rbtans02.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtans02.setText("Answer 02");
        jPanel1.add(rbtans02, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        buttonGroup1.add(rbtans03);
        rbtans03.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtans03.setText("Answer 03");
        jPanel1.add(rbtans03, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        buttonGroup1.add(rbtans04);
        rbtans04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtans04.setText("Answer 04");
        jPanel1.add(rbtans04, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 293, 140, 30));

        tblanswer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblanswer);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 590, 170));

        lblqueNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblqueNum.setText("00");
        jPanel1.add(lblqueNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jPanel5.add(jPanel1, "card2");

        jPanel3.setBackground(new java.awt.Color(0, 186, 131));

        jPanel4.setBackground(new java.awt.Color(2, 33, 62));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Complate Exam");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No Of quections");

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correct Answers");

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("False Answers");

        jLabel7.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Marks");

        jButton2.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jButton2.setText("finish");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblquenumbers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblquenumbers.setForeground(new java.awt.Color(255, 255, 255));
        lblquenumbers.setText("Quections");

        lblmark.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblmark.setForeground(new java.awt.Color(255, 255, 255));
        lblmark.setText("Mark");

        lblcorrectans.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcorrectans.setForeground(new java.awt.Color(255, 255, 255));
        lblcorrectans.setText("Correct");

        lblfalseans.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblfalseans.setForeground(new java.awt.Color(255, 255, 255));
        lblfalseans.setText("false");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Exam Finish");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblquenumbers)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(lblcorrectans))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(lblfalseans))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblmark)
                                    .addComponent(jLabel7))
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(220, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(216, 216, 216)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblquenumbers)
                    .addComponent(lblcorrectans)
                    .addComponent(lblfalseans)
                    .addComponent(lblmark))
                .addGap(91, 91, 91)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 121, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(385, Short.MAX_VALUE)))
        );

        jPanel5.add(jPanel3, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        int xx = Integer.parseInt(ansnum);
//       if(xx>0)
//       {
        getData();
         try {
                String q= "INSERT INTO `answer`(`exam`, `subname`, `subcode`, `registernum`, `quenum`, `answer`) VALUES ('"+exam+"', '"+subname+"','"+subcode+"','"+Login.registerNumber+"','"+queNo+"','"+ansnum+"')";               
                pst=conn.prepareStatement(q);                
                pst.execute(); 
              //  tablelord();
               
                 JOptionPane.showMessageDialog(rootPane,"Successfully Recorded");
                    } 
                catch (Exception e) 
                {
                JOptionPane.showMessageDialog(rootPane,e);
                } 
                                if(correctAns.equals(ansnum))
                           {
                               trueAns = trueAns+1;
                           }
                           else
                           {
                               falseAns = falseAns+1;
                           }
        
        int x = Integer.parseInt(lblqueNum.getText());
        if(x==10)
        {
        jPanel5.removeAll();
        jPanel5.repaint();
        jPanel5.revalidate();
        
        jPanel5.add(jPanel3);
        jPanel5.repaint();
        jPanel5.revalidate(); 
        finish();
        
        }
        else{
        loadQue();
        }
        
//       }
//       else
//       {
//           JOptionPane.showMessageDialog(rootPane, "Select Answer");
//       }
        tablelord();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        try {
             String q= "INSERT INTO `mark`(`subcode`, `regnum`, `totalque`, `correctans`, `falseans`, `avgmark`) VALUES ('"+ExamLogin.correctPaper+"', '"+Login.registerNumber+"','"+lblqueNum.getText()+"','"+lblcorrectans.getText()+"','"+lblfalseans.getText()+"','"+lblmark.getText()+"')";               
                pst=conn.prepareStatement(q);                
                pst.execute(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
       
        Home ho= new Home();
        ho.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void finish()
    {
    
    lblquenumbers.setText(queNo+"");
    lblcorrectans.setText(trueAns+"");
    lblfalseans.setText(falseAns+"");
    
    Double tans= Double.valueOf(trueAns);
    Double marks = (tans/10) * 100;
    lblmark.setText(marks+"%");
    
    
    
    
    }
    
     private void tablelord()
    {
        try {
            String sql="SELECT `exam` as 'Exam', `subname` as 'Subject Name', `subcode` as 'Subject Code', `registernum` as 'Register Number', `quenum` as 'Quection Number', `answer` as 'Answer' FROM `answer` WHERE subcode = '"+ExamLogin.correctPaper+"' and registernum = '"+Login.registerNumber+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblanswer.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
           
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
     //  theader();
    }
    
    private void panelord()
    {
        jPanel5.removeAll();
        jPanel5.repaint();
        jPanel5.revalidate();
        
        jPanel5.add(jPanel1);
        jPanel5.repaint();
        jPanel5.revalidate();
    
    }
    
    private void getData()
    {
    
        exam = lblexamname.getText();
        if(rbtans01.isSelected())
        {
            ansnum = "1";
        }
        else if(rbtans02.isSelected())
        {
            ansnum = "2";
        }
        else if(rbtans03.isSelected())
        {
            ansnum = "3";
        }
        else if(rbtans04.isSelected())
        {
            ansnum = "4";
        }
        
    }
    
    private void loadQue()
    {
    
        queNo = queNo+1;
         try {
            String sql="SELECT `exam`, `subject`, `subcode`, `grade`, `queNumber`, `que`, `ans01`, `ans02`, `ans03`, `ans04`, `correctans` FROM `setpaper` where queNumber='"+queNo+"' and subcode = '"+ExamLogin.correctPaper+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
           
               lblexamname.setText(rs.getString("exam"));
               subname=(rs.getString("subject"));
               subcode=(rs.getString("subcode"));
               lblsubcode.setText(subname + "-" + subcode);
               lblqueNum.setText(rs.getString("queNumber"));
               lblquection.setText(rs.getString("que"));
               rbtans01.setText(rs.getString("ans01"));
               rbtans02.setText(rs.getString("ans02"));
               rbtans03.setText(rs.getString("ans03"));
               rbtans04.setText(rs.getString("ans04"));
               correctAns = rs.getString("correctans");
           
           }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
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
            java.util.logging.Logger.getLogger(Paper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcorrectans;
    private javax.swing.JLabel lblexamname;
    private javax.swing.JLabel lblfalseans;
    private javax.swing.JLabel lblgrade;
    private javax.swing.JLabel lblmark;
    private javax.swing.JLabel lblqueNum;
    private javax.swing.JLabel lblquection;
    private javax.swing.JLabel lblquenumbers;
    private javax.swing.JLabel lblregisternum;
    private javax.swing.JLabel lblsubcode;
    private javax.swing.JRadioButton rbtans01;
    private javax.swing.JRadioButton rbtans02;
    private javax.swing.JRadioButton rbtans03;
    private javax.swing.JRadioButton rbtans04;
    private javax.swing.JTable tblanswer;
    // End of variables declaration//GEN-END:variables
}
