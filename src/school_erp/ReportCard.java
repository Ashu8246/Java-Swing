/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_erp;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static school_erp.DbConnector.*;

/**
 *
 * @author Ashu
 */
public class ReportCard extends javax.swing.JFrame {

    /**
     * Creates new form ReportCard
     */
    public ReportCard() {
        initComponents();
        setLocation(400,120);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Sid = new javax.swing.JTextField();
        Sroll = new javax.swing.JTextField();
        Sname = new javax.swing.JTextField();
        Sclass = new javax.swing.JTextField();
        Sphysics = new javax.swing.JTextField();
        Smaths = new javax.swing.JTextField();
        Schemistry = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textpanel = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        SRwID = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField8.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report Card", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ID : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 50, 71, 24));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Roll No. : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 92, 71, 24));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Name : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 134, 71, 24));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Class : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 176, 71, 24));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Marks : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 218, 296, 24));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Physics : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 260, 70, 24));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Maths : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 302, 70, 24));

        jLabel8.setText("--------------------------------------------------------------------------");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 201, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Chemistry :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 344, 70, 24));

        Sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidActionPerformed(evt);
            }
        });
        jPanel1.add(Sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 50, 190, 24));
        jPanel1.add(Sroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 94, 190, -1));
        jPanel1.add(Sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 136, 190, -1));
        jPanel1.add(Sclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 178, 190, -1));
        jPanel1.add(Sphysics, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 262, 190, -1));
        jPanel1.add(Smaths, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 304, 190, -1));
        jPanel1.add(Schemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 346, 190, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 386, 89, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 387, 80, -1));

        textpanel.setEditable(false);
        jScrollPane1.setViewportView(textpanel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 19, 301, 527));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Search Result with ID: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 431, -1, -1));

        SRwID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRwIDActionPerformed(evt);
            }
        });
        jPanel1.add(SRwID, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 428, 133, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 466, 90, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Back");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 25, 60, 19));

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
    }// </editor-fold>//GEN-END:initComponents

    private void SidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = Sid.getText();
        String name = Sname.getText();
        String roll = Sroll.getText();
        String Class = Sclass.getText();
        String phy = Sphysics.getText();
        String mth = Smaths.getText();
        String che = Schemistry.getText();
        
        //Dtatbase Connection
        //DbConnector dbc = new DbConnector();
        //dbc.Connection();
        
        try 
        {
            Statement st = con.createStatement();
            
            double p1 = Double.parseDouble(phy);
            
            double m1 = Double.parseDouble(mth);
            
            double c1 = Double.parseDouble(che);
            
            double total = ((p1+m1+c1)*100)/300;
            
            String grade;
            
            if (total>=80)
            {
                grade = "A+";
            }
            else if(total>=70 && total <80)
            {
                grade = "A";
            }
            else if(total>=60 && total <70)
            {
                grade = "B+";
            }
            else if(total>=50 && total <60)
            {
                grade = "B";
            }
            else if(total>=40 && total <50)
            {
                grade = "C";
            }
            else if(total>=30 && total <40)
            {
                grade = "D";
            }
            else
            {
                grade = "Fail";
            }
            String query = "INSERT INTO `stu_reportcard`(`id`,`name`,`roll`,`class`,`physics`,`maths`,`chemistry`,`grade`) VALUES ('"+id+"','"+name+"','"+roll+"','"+Class+"','"+p1+"','"+m1+"','"+c1+"','"+grade+"')";
            st.executeUpdate(query);
            textpanel.setText("Report Card\n\nStudent Name : "+name+"\n\nClass :\t"+Class+"\n\nMarks\n\nPhysics :\t"+phy+"\n\nChemistry :\t"+che+"\n\nMaths :\t"+mth+"\n\nTotal in Numbers : "+total+"\n\nGrade :\t"+grade);
            
            JOptionPane.showMessageDialog(null, "Submitted Successfully!");
            
            Sid.setText("");
            Sname.setText("");
            Sroll.setText("");
            Sclass.setText("");
            Sphysics.setText("");
            Smaths.setText("");
            Schemistry.setText("");
        
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Sid.setText("");
        Sname.setText("");
        Sroll.setText("");
        Sclass.setText("");
        Sphysics.setText("");
        Smaths.setText("");
        Schemistry.setText("");
        textpanel.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SRwIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SRwIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SRwIDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DbConnector dbc = new DbConnector();
        dbc.Connection();
        String id = SRwID.getText();
        try
            {
                String query="select * from stu_reportcard where id='"+id+"'";
                
                Statement st = con.createStatement();
                ResultSet rs= st.executeQuery(query);
                if(rs.next())
                {
                    String sid =rs.getString(1);
                    String sname =rs.getString(2);
                    String sroll =rs.getString(3);
                    String sclass =rs.getString(4);
                    String sphy =rs.getString(5);
                    String smth =rs.getString(6);
                    String sche =rs.getString(7);
                    String sgrade =rs.getString(8);
                    
                    
                    Sid.setText(sid);
                    Sname.setText(sname);
                    Sroll.setText(sroll);
                    Sclass.setText(sclass);
                    
                    double p1 = Double.parseDouble(sphy);
            
                    double m1 = Double.parseDouble(smth);

                    double c1 = Double.parseDouble(sche);

                    double stotal = ((p1+m1+c1)*100)/300;
                    
                    textpanel.setText("Report Card\n\nStudent Name : "+sname+"\n\nClass :\t"+sclass+"\n\nMarks\n\nPhysics :\t"+sphy+"\n\nChemistry :\t"+sche+"\n\nMaths :\t"+smth+"\n\nTotal in Numbers : "+stotal+"\n\nGrade :\t"+sgrade);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "No Data Found!");
                }
            } 
            catch (SQLException e) 
            {
                System.out.println(e);
            }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        Welcome we = new Welcome();
        we.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(ReportCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SRwID;
    private javax.swing.JTextField Schemistry;
    private javax.swing.JTextField Sclass;
    private javax.swing.JTextField Sid;
    private javax.swing.JTextField Smaths;
    private javax.swing.JTextField Sname;
    private javax.swing.JTextField Sphysics;
    private javax.swing.JTextField Sroll;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextPane textpanel;
    // End of variables declaration//GEN-END:variables
}
