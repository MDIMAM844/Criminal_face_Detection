package NewPack;


/*
 * Operator.java
 *

 */

import java.awt.Image;
import java.io.*;
import java.sql.*;
import javax.swing.*;
public class Operator extends javax.swing.JFrame {

    /** Creates new form Operator */
    public Operator() {
        initComponents();
        jLabel2.setVisible(false);
        jTextField1.setVisible(false);
        jButton2.setVisible(false);
       
       jLabel21.setVisible(false);
       jLabel6.setVisible(false);
       jLabel7.setVisible(false);
       jLabel4.setVisible(false);
       jLabel5.setVisible(false);
       jLabel9.setVisible(false);
       jLabel10.setVisible(false);
       jLabel8.setVisible(false);
       jLabel14.setVisible(false);
       jLabel13.setVisible(false);
       jLabel11.setVisible(false);
       
       jLabel18.setVisible(false);
       jLabel16.setVisible(false);
       jLabel24.setVisible(false);
       jLabel15.setVisible(false);
       jLabel20.setVisible(false);
       jLabel17.setVisible(false);
       jLabel12.setVisible(false);
       jLabel19.setVisible(false);
       jLabel27.setVisible(false);
       jLabel22.setVisible(false);
       jLabel23.setVisible(false);
       
       jLabel26.setVisible(false);
       jLabel25.setVisible(false);
       
       jButton3.setVisible(false);
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 150, 150));
        setMinimumSize(new java.awt.Dimension(800, 580));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 102));
        jLabel1.setText("OPERATOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 0, 190, 42);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("ADD NEW CRIMINAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 90, 180, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 102));
        jLabel2.setText("Existing Criminal ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 100, 128, 17);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 90, 150, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Click");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 90, 80, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 102));
        jLabel3.setText("TO VIEW CRIMINAL DETAILS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 260, 22);
        getContentPane().add(jLabel25);
        jLabel25.setBounds(450, 236, 220, 190);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 102));
        jLabel4.setText("Alias Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 236, 79, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 102));
        jLabel5.setText("D.O.B    :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 271, 59, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 102));
        jLabel6.setText("First Name :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(92, 173, 77, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 102));
        jLabel7.setText("Last Name :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(94, 201, 75, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 102));
        jLabel8.setText("City   :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(126, 376, 43, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 102));
        jLabel9.setText("Age     :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 306, 49, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 102));
        jLabel10.setText("Gender :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(115, 334, 54, 17);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 255, 102));
        jLabel12.setText("Gender");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(180, 334, 45, 17);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 255, 102));
        jLabel11.setText("Crime Involved :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(64, 481, 105, 17);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 255, 102));
        jLabel13.setText("Arrest Date :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(87, 446, 82, 17);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 255, 102));
        jLabel14.setText("State :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(128, 411, 41, 17);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 255, 102));
        jLabel19.setText("City");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(180, 374, 110, 17);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 255, 102));
        jLabel18.setText("Criminal ID");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(180, 144, 75, 17);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 255, 102));
        jLabel15.setText("Alias Name");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(180, 234, 110, 17);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 255, 102));
        jLabel16.setText("First Name");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(180, 174, 100, 17);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 255, 102));
        jLabel17.setText("Age");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(180, 304, 24, 17);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 255, 102));
        jLabel20.setText("D.O.B");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(180, 274, 90, 17);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 255, 102));
        jLabel21.setText("Criminal ID :");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(85, 145, 84, 17);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 255, 102));
        jLabel22.setText("Arrest Date");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(180, 444, 100, 17);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 255, 102));
        jLabel23.setText("Crime Involved");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(180, 484, 130, 17);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 255, 102));
        jLabel24.setText("Last Name");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(180, 204, 100, 17);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 255, 102));
        jLabel26.setText("PHOTO");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(530, 210, 44, 14);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 255, 102));
        jLabel27.setText("State");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(180, 414, 110, 17);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(130, 510, 60, 25);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setText("Crop Images Upload");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(590, 90, 200, 31);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("SignOut");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(710, 0, 90, 30);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("Click Here");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(310, 50, 130, 30);

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton7.setText("Delete Criminal Details");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(450, 50, 230, 31);

        jLabel28.setForeground(new java.awt.Color(153, 255, 102));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewPack/resources/operator.jpg"))); // NOI18N
        getContentPane().add(jLabel28);
        jLabel28.setBounds(-10, 0, 810, 560);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
       jLabel21.setVisible(true);
       jLabel6.setVisible(true);
       jLabel7.setVisible(true);
       jLabel4.setVisible(true);
       jLabel5.setVisible(true);
       jLabel9.setVisible(true);
       jLabel10.setVisible(true);
       jLabel8.setVisible(true);
       jLabel14.setVisible(true);
       jLabel13.setVisible(true);
       jLabel11.setVisible(true);
       
       jLabel18.setVisible(true);
       jLabel16.setVisible(true);
       jLabel24.setVisible(true);
       jLabel15.setVisible(true);
       jLabel20.setVisible(true);
       jLabel17.setVisible(true);
       jLabel12.setVisible(true);
       jLabel19.setVisible(true);
       jLabel27.setVisible(true);
       jLabel22.setVisible(true);
       jLabel23.setVisible(true);
       
       jLabel26.setVisible(true);
       jLabel25.setVisible(true);
       
       jButton3.setVisible(true);
         try {
               String f = jTextField1.getText();
               Class.forName("com.mysql.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime", "root", "root");
               PreparedStatement st = conn.prepareStatement("select * from new_details where cr_id ='"+f+"' ");
               ResultSet rs = st.executeQuery();
               if(rs.next()){
              
              String f1 = rs.getString("cr_id");
              if(f.equals(f1)){
                  jLabel18.setText(rs.getString("cr_id"));
                  jLabel16.setText(rs.getString("fname"));
                  jLabel24.setText(rs.getString("lname"));
                  jLabel15.setText(rs.getString("alias"));
                  jLabel20.setText(rs.getString("dob"));
                  jLabel17.setText(rs.getString("age"));
                  jLabel12.setText(rs.getString("gender"));
                  jLabel19.setText(rs.getString("city"));
                  jLabel27.setText(rs.getString("state"));
                  jLabel22.setText(rs.getString("ardate"));
                  jLabel23.setText(rs.getString("crime"));
                  
                    Blob blob = rs.getBlob("image");
                    byte[] a= blob.getBytes(1, (int) blob.length());
                    ImageIcon imgf=new ImageIcon(a); 
                    int width=imgf.getIconWidth();  
                    int height=imgf.getIconHeight(); 
                     jLabel25.setIcon(imgf);
                   }
                }
               else{
                  JOptionPane.showMessageDialog(null,"No such Criminal ID found...! ","Error",2);
              }
              }catch (ClassNotFoundException ex) {
            System.out.print(ex);
        }
        catch (SQLException ex1) {
              System.out.print(ex1);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new New_Criminal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       jTextField1.setText("");
       jLabel21.setVisible(false);
       jLabel6.setVisible(false);
       jLabel7.setVisible(false);
       jLabel4.setVisible(false);
       jLabel5.setVisible(false);
       jLabel9.setVisible(false);
       jLabel10.setVisible(false);
       jLabel8.setVisible(false);
       jLabel14.setVisible(false);
       jLabel13.setVisible(false);
       jLabel11.setVisible(false);
       
       jLabel18.setVisible(false);
       jLabel16.setVisible(false);
       jLabel24.setVisible(false);
       jLabel15.setVisible(false);
       jLabel20.setVisible(false);
       jLabel17.setVisible(false);
       jLabel12.setVisible(false);
       jLabel19.setVisible(false);
       jLabel27.setVisible(false);
       jLabel22.setVisible(false);
       jLabel23.setVisible(false);
       
       jLabel26.setVisible(false);
       jLabel25.setVisible(false);
       
       jButton3.setVisible(false);
       
       jLabel18.setText("");
       jLabel16.setText("");
       jLabel24.setText("");
       jLabel15.setText("");
       jLabel20.setText("");
       jLabel17.setText("");
       jLabel12.setText("");
       jLabel19.setText("");
       jLabel27.setText("");
       jLabel22.setText("");
       jLabel23.setText("");
       
       jLabel26.setText("");
       jLabel25.setIcon(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new crop_image().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         jLabel2.setVisible(true);
         jTextField1.setVisible(true);
         jButton2.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new Delete().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Operator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}