/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExaminationSeatAllotment;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Dellpc
 */
public class roomallocation extends javax.swing.JFrame {

    /**
     * Creates new form roomallocation
     */
    public roomallocation() {
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

        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        clear = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        txtrid = new javax.swing.JTextField();
        txttotalstud = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        txtsid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtusn = new javax.swing.JLabel();
        txtusn1 = new javax.swing.JTextField();
        view = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        add.setBackground(new java.awt.Color(0, 51, 255));
        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(340, 450, 73, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setText("TOTAL STUDENTS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 370, 159, 22);

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(640, 400, 91, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("FACULTY_ ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 300, 119, 22);

        txtrid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtridKeyPressed(evt);
            }
        });
        jPanel1.add(txtrid);
        txtrid.setBounds(500, 240, 170, 30);
        jPanel1.add(txttotalstud);
        txttotalstud.setBounds(500, 360, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("SUBJECT_ ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 180, 118, 22);
        jPanel1.add(txtfid);
        txtfid.setBounds(500, 300, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("ROOM _ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 240, 96, 22);

        back.setBackground(new java.awt.Color(0, 51, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(420, 520, 81, 31);
        jPanel1.add(txtsid);
        txtsid.setBounds(500, 170, 170, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("ROOM ALLOCATION");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 50, 239, 29);

        txtusn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtusn.setForeground(new java.awt.Color(51, 255, 51));
        txtusn.setText("USN");
        jPanel1.add(txtusn);
        txtusn.setBounds(270, 120, 38, 22);

        txtusn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusn1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtusn1);
        txtusn1.setBounds(500, 110, 170, 30);

        view.setBackground(new java.awt.Color(0, 51, 255));
        view.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setText("VIEW");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view);
        view.setBounds(500, 450, 83, 31);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brown.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 900, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try
{
   Class.forName("com.mysql.jdbc.Driver");  
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examseat","root","");
   Statement st=con.createStatement();
   String q,s,t,r,f,u;
   s=txtsid.getText();
   t=txttotalstud.getText();
   r=txtrid.getText();
   f=txtfid.getText();
   u=txtusn1.getText();
   q="insert into roomallocation values('"+s+"','"+t+"','"+r+"','"+f+"','"+u+"')";
   st.execute(q);
   JOptionPane.showMessageDialog(this,"Roomallocation added");
          
}
catch(Exception e)
{
     JOptionPane.showMessageDialog(null,e);
}
    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        txtsid.setText("");
        txttotalstud.setText("");
        txtrid.setText("");
        txtfid.setText("");
        txtusn1.setText("");
        
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        dispose();
         mainscreen m=new mainscreen();
        m.setVisible(true);
        
    }//GEN-LAST:event_backActionPerformed

    private void txtusn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusn1ActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed

         dispose();
        vroomallocation ra=new vroomallocation();
        ra.setVisible(true);
    }//GEN-LAST:event_viewActionPerformed

    private void txtridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtridKeyPressed
        // TODO add your handling code here:
          try{
             Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examseat","root","");
        String u;
         u=txtrid.getText();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){ 
        
         String display="select seats from room where room_id='"+u+"';";
          
         PreparedStatement pst=con.prepareStatement(display);
         ResultSet rs=pst.executeQuery(display);
         rs.next();
         
         txttotalstud.setText(rs.getString("seats"));
            
         }
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(modstudent.class.getName()).log(Level.SEVERE, null, ex);
        }
                                     

    }//GEN-LAST:event_txtridKeyPressed

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
            java.util.logging.Logger.getLogger(roomallocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roomallocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roomallocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roomallocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roomallocation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton add;
    private javax.swing.JButton back;
    private javax.swing.JToggleButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtfid;
    private javax.swing.JTextField txtrid;
    private javax.swing.JTextField txtsid;
    private javax.swing.JTextField txttotalstud;
    private javax.swing.JLabel txtusn;
    private javax.swing.JTextField txtusn1;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}