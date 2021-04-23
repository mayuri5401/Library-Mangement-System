/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import project.ConnectionPrivider;
    
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

/**
 *
 * @author mayuri
 */
public class ISSUE extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
   PreparedStatement pst;

    /**
     * Creates new form ISSUE
     */
    public ISSUE() {
        initComponents();
             
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtbook = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        txtbname = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtpub = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("CLOSE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Student Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 280, 53));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("studentid:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 149, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 149, 27));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("fathername:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 149, 27));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("coursename:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 149, 27));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("issuedate:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 149, 32));

        txt1.setBackground(new java.awt.Color(102, 0, 153));
        txt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 159, 32));

        txt2.setBackground(new java.awt.Color(102, 0, 153));
        txt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 159, 32));

        txt3.setBackground(new java.awt.Color(102, 0, 153));
        txt3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 159, 32));

        txt4.setBackground(new java.awt.Color(102, 0, 153));
        txt4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 159, 32));

        date.setBackground(new java.awt.Color(102, 0, 153));
        date.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 159, 37));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mayuri\\OneDrive\\Documents\\NetBeansProjectsw\\LibraryManagement\\dist\\Icon 1\\issue book.png")); // NOI18N
        jButton1.setText("issuebook");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 170, 34));

        jButton2.setBackground(new java.awt.Color(102, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mayuri\\OneDrive\\Documents\\NetBeansProjectsw\\LibraryManagement\\dist\\Icon 1\\icons8-search-50.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 70, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Book ID:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 147, -1, 23));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("BookName:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 120, 23));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("price:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 317, 87, 23));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Publisher:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 388, 87, 23));

        txtbook.setBackground(new java.awt.Color(102, 0, 153));
        txtbook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtbook.setForeground(new java.awt.Color(255, 255, 255));
        txtbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookActionPerformed(evt);
            }
        });
        getContentPane().add(txtbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 143, 198, 31));

        jButton3.setBackground(new java.awt.Color(102, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\mayuri\\OneDrive\\Documents\\NetBeansProjectsw\\LibraryManagement\\dist\\Icon 1\\icons8-search-50.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 73, 50));

        txtbname.setBackground(new java.awt.Color(102, 0, 153));
        txtbname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtbname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 198, 33));

        txtprice.setBackground(new java.awt.Color(102, 0, 153));
        txtprice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtprice.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 312, 198, 33));

        txtpub.setBackground(new java.awt.Color(102, 0, 153));
        txtpub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtpub.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 383, 198, 33));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setText("Book Deatils");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 70, 256, 49));

        jButton6.setBackground(new java.awt.Color(0, 0, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\mayuri\\OneDrive\\Documents\\NetBeansProjectsw\\LibraryManagement\\dist\\Icon 1\\icons8-close-sign-48.png")); // NOI18N
        jButton6.setText("close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\mayuri\\OneDrive\\Documents\\NetBeansProjectsw\\LibraryManagement\\dist\\Icon 1\\abstract-blur-defocused-bookshelf-library.jpg")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
     
  
        String abc=txt1.getText();
       String sql;
        sql = "select * from student where studentid = "+abc+"";
             
       try {
            con = ConnectionPrivider.getCon();
            
           pst=con.prepareStatement(sql);
           rs=pst.executeQuery();  
           if(rs.next()){
               txt2.setText(rs.getString(2));
                txt3.setText(rs.getString(3));
                 txt4.setText(rs.getString(4));
                 rs.close();
                 pst.close();
                 
           }
           else
           {
                 JOptionPane.showMessageDialog(null,"student id is wrong");
           }
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sql="INSERT INTO `issue`(`bookid`, `name`, `price`, `publisher`, `studentid`, `sname`, `fathername`, `coursename`, `issuedate`)"+"VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            pst=con.prepareStatement(sql);
            pst.setString(1, txtbname.getText());
             pst.setString(2, txtbook.getText());
              pst.setString(3, txtprice.getText());
               pst.setString(4, txtpub.getText());
                pst.setString(5, txt1.getText());
                pst.setString(6, txt2.getText());
                pst.setString(7, txt3.getText());
                pst.setString(8, txt4.getText());
           String dob;
           SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
           dob=dformat.format(date.getDate());
            pst.setString(9, dob);
            pst.execute();
             JOptionPane.showMessageDialog(null,"book issued sucessfully"); 
            
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e); 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookActionPerformed
       
    }//GEN-LAST:event_txtbookActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String a2=txtbook.getText();
        String sql;
        sql = "select * from newbook where bookid = "+a2+"";
        try{
                con = ConnectionPrivider.getCon();
            
           pst=con.prepareStatement(sql);
           rs=pst.executeQuery();  
             if(rs.next()){
               txtbname.setText(rs.getString(2));
                txtprice.setText(rs.getString(4));
                txtpub.setText(rs.getString(3));
                
                 rs.close();
                 pst.close();
                 
           }
           else
           {
                 JOptionPane.showMessageDialog(null,"book id is wrong");
           }
        
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ISSUE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ISSUE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ISSUE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ISSUE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ISSUE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtbook;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpub;
    // End of variables declaration//GEN-END:variables
}
