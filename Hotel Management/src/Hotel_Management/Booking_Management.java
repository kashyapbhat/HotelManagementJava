/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel_Management;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KashyapBhat
 */
public class Booking_Management extends javax.swing.JFrame {

    /**
     * Creates new form Booking_Management
     */
    public Booking_Management() {
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

        cadd = new javax.swing.JLabel();
        cname = new javax.swing.JLabel();
        cpost = new javax.swing.JLabel();
        cemail = new javax.swing.JLabel();
        cnum = new javax.swing.JLabel();
        cid = new javax.swing.JLabel();
        j1 = new javax.swing.JTextField();
        j2 = new javax.swing.JTextField();
        j3 = new javax.swing.JTextField();
        j4 = new javax.swing.JTextField();
        j5 = new javax.swing.JTextField();
        j6 = new javax.swing.JTextField();
        cdob = new javax.swing.JLabel();
        cgen = new javax.swing.JLabel();
        cidt = new javax.swing.JLabel();
        cout = new javax.swing.JLabel();
        cin = new javax.swing.JLabel();
        cnation = new javax.swing.JLabel();
        j7 = new com.toedter.components.JLocaleChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        crt = new javax.swing.JLabel();
        crnum = new javax.swing.JLabel();
        j8 = new com.toedter.calendar.JDateChooser();
        j11 = new com.toedter.calendar.JDateChooser();
        j12 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jbtnexit = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        j15 = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jbtndelete = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        j14 = new javax.swing.JComboBox<>();
        j13 = new javax.swing.JComboBox<>();
        j9 = new javax.swing.JComboBox<>();
        j10 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1840, 834));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cadd.setText("Address:");
        getContentPane().add(cadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        cname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cname.setText("Name:");
        getContentPane().add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        cpost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cpost.setText("Post_Code:");
        getContentPane().add(cpost, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        cemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cemail.setText("Email:");
        cemail.setToolTipText("");
        getContentPane().add(cemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        cnum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cnum.setText("Contact_Number:");
        getContentPane().add(cnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 20));

        cid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cid.setText("Customer_Id:");
        cid.setToolTipText("");
        getContentPane().add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        j1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 140, 30));

        j2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 120, -1));

        j3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 120, -1));

        j4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });
        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 120, -1));

        j5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(j5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 120, -1));

        j6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(j6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 120, -1));

        cdob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cdob.setText("Date_of_birth:");
        getContentPane().add(cdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        cgen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cgen.setText("Gender:");
        getContentPane().add(cgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        cidt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cidt.setText("Id_Type:");
        getContentPane().add(cidt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        cout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cout.setText("Check_out_date:");
        getContentPane().add(cout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        cin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cin.setText("Check_in_date:");
        getContentPane().add(cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        cnation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cnation.setText("Nationality:");
        cnation.setToolTipText("");
        getContentPane().add(cnation, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));
        getContentPane().add(j7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 120, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer_Id", "Name", "Adress", "Post_code", "Contact_Number", "Email", "Nationality", "Date_of_birth", "Id_Type", "Gender", "Check_in_date", "Check_out_date", "Room_Type", "Room_Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 1470, 530));

        crt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        crt.setText("Room_Type:");
        getContentPane().add(crt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, 20));

        crnum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        crnum.setText("Room_Number:");
        getContentPane().add(crnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, 20));
        getContentPane().add(j8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 120, -1));
        getContentPane().add(j11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 120, -1));
        getContentPane().add(j12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 120, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnexit.setText("EXIT");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 60, 160, 80));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Room_Type:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Room_Number:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setText("Total_Cost:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Room_Type:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Room_Number:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 20));

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 120, -1));

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 120, -1));

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 120, -1));

        j15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j15ActionPerformed(evt);
            }
        });
        jPanel1.add(j15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 180, 40));

        update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 160, 80));

        jbtndelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtndelete.setText("DELETE");
        jbtndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, 160, 80));

        jreset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jreset.setText("RESET");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        jPanel1.add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 60, 160, 80));

        insert.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 160, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 1800, 200));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, -1, -1));

        j14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "002", "003", "004", "005", "006", "007", "008", "009", "010", "011", "012", "013", "014", "015", "016", "017", "018", "019", "020" }));
        getContentPane().add(j14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 120, -1));

        j13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Family" }));
        getContentPane().add(j13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 120, -1));

        j9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Voter_Id", "Driving_License", "Student_id", "Passport" }));
        getContentPane().add(j9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 120, -1));

        j10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(j10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j1ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j4ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void j15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j15ActionPerformed
private JFrame frame;
    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit.","Hotel Management System",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeleteActionPerformed
        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"No data to delete","Hotel Management System",JOptionPane.OK_OPTION);
            }
            else
                JOptionPane.showMessageDialog(null,"Show which row to delete","Hotel Management System",JOptionPane.OK_OPTION);
        }
        else model.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_jbtndeleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Hotel Booking Update Confirmed","Hotel Management System",JOptionPane.OK_OPTION);
        }}
    }//GEN-LAST:event_updateActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        j1.setText(null);
        j2.setText(null);
        j3.setText(null);
        j4.setText(null);
        j6.setText(null);
        j5.setText(null);
        
    }//GEN-LAST:event_jresetActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
               
        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
            j1.getText(),
            j2.getText(),
            j3.getText(),
            j4.getText(),
            j5.getText(),
            j6.getText(),
            j7.getSelectedItem(),
            j8.getDate(),
            j9.getSelectedItem(),
            j10.getSelectedItem(),
            j11.getDate(),
            j12.getDate(),
            j13.getSelectedItem(),
            j14.getSelectedItem(),
            
        });
        int sr=700;
        int dr=1200;
        int fr=3000;
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Date ci=null;
        Date co=null;
        try{
            ci= format.parse(format.format(j11.getDate()));
            co= format.parse(format.format(j12.getDate()));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        long c=ci.getTime() - co.getTime();
        int diff=(int) (c/1000/60/60/24);
        
        if(j13.getSelectedItem().equals("Single"))
        j15.setText(Integer.toString(diff*sr));
        else
            if(j13.getSelectedItem().equals("Double"))
                 j15.setText(Integer.toString(diff*dr));
            else 
                if (j13.getSelectedItem().equals("Family"))
                        j15.setText(Integer.toString(diff*fr));
    }//GEN-LAST:event_insertActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Booking_Management().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadd;
    private javax.swing.JLabel cdob;
    private javax.swing.JLabel cemail;
    private javax.swing.JLabel cgen;
    private javax.swing.JLabel cid;
    private javax.swing.JLabel cidt;
    private javax.swing.JLabel cin;
    private javax.swing.JLabel cname;
    private javax.swing.JLabel cnation;
    private javax.swing.JLabel cnum;
    private javax.swing.JLabel cout;
    private javax.swing.JLabel cpost;
    private javax.swing.JLabel crnum;
    private javax.swing.JLabel crt;
    private javax.swing.JButton insert;
    private javax.swing.JTextField j1;
    private javax.swing.JComboBox<String> j10;
    private com.toedter.calendar.JDateChooser j11;
    private com.toedter.calendar.JDateChooser j12;
    private javax.swing.JComboBox<String> j13;
    private javax.swing.JComboBox<String> j14;
    private javax.swing.JTextField j15;
    private javax.swing.JTextField j2;
    private javax.swing.JTextField j3;
    private javax.swing.JTextField j4;
    private javax.swing.JTextField j5;
    private javax.swing.JTextField j6;
    private com.toedter.components.JLocaleChooser j7;
    private com.toedter.calendar.JDateChooser j8;
    private javax.swing.JComboBox<String> j9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JButton jbtndelete;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jreset;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
