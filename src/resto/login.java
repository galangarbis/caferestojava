/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto;

import aksi.aksi_login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Hack_IT
 */
public class login extends javax.swing.JFrame {

    public Connection con;
    public Statement st;
    ResultSet ress;
    String hakakses;

    /**
     * Creates new form log
     */
    public login() {
        initComponents();
        add();
    }

//    void login() {
//        try {
//            con = new koneksi.koneksi().getConnection();
//            st = con.createStatement();
//            String sql = "select hak_akses from login where id ='" + ab.getText() + "'and pass ='" + cd.getText() + "';";
//            ress = st.executeQuery(sql);
//            while (ress.next()) {
//                hakakses = ress.getString(1);
//            }
//            if (hakakses.equals("Manager")) {
//                JOptionPane.showMessageDialog(null, "Selamat Datang Andim ");
//                this.setVisible(false);
//                new bos().setVisible(true);
////            new t2().setVisible(true);
//            } else if (hakakses.equals("Pegawai")) {
//                JOptionPane.showMessageDialog(null, "Selamat Datang Entri");
//                this.setVisible(false);
//                new RestoF().setVisible(true);
//
////            new t3().setVisible(true);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "maaf");
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ab = new javax.swing.JTextField();
        cd = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SISTEM PEMESANAN MENU CAFE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 10, 540, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 140, 150, 14);

        ab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abActionPerformed(evt);
            }
        });
        jPanel1.add(ab);
        ab.setBounds(270, 160, 160, 28);

        cd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdActionPerformed(evt);
            }
        });
        jPanel1.add(cd);
        cd.setBounds(270, 220, 160, 25);

        jButton2.setText("BATAL");
        jPanel1.add(jButton2);
        jButton2.setBounds(360, 270, 70, 30);

        jButton1.setText("MASUK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 270, 80, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 200, 150, 14);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Milk-Carton-Print-Packaging-Tutorial-InstaTuts-final-image.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-10, 0, 440, 280);

        jButton3.setText("KELUAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(440, 270, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abActionPerformed

    private void cdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ab;
    private javax.swing.JPasswordField cd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

void add(){
    aksi_login aksi=new aksi_login(this);
    jButton1.addMouseListener(aksi.simpan);
    jButton2.addMouseListener(aksi.batal);
    jButton3.addMouseListener(aksi.keluar);
}

    public JTextField getab() {
        return ab;
    }

    public void setab(JTextField ab) {
        this.ab = ab;
    }
    
//    cd
    public JPasswordField getcd() {
        return cd;
    }

    public void setcd(JPasswordField cd) {
        this.cd = cd;
    }
}
