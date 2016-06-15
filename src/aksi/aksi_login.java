/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aksi;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import resto.RestoF;
import resto.bos;
import resto.login;

/**
 *
 * @author Hack_IT
 */
public class aksi_login {

    login login;

    Connection con;
    Statement st;
    ResultSet ress;
    String hakakses;
    int total = 0;
    int i, j, k;
    String baru;
    String harga = "";
    String temp = "";

    public aksi_login(login login) {
        this.login = login;
//        tanggal_1();
    }

//    public void tanggal_1() {
//        java.util.Date skrg = new java.util.Date();
//        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd-MM-yyyy");
//        getresto().gettanggal().setText(kal.format(skrg));
//        getresto().gettanggal().disable();
//    }
    public login getlogin() {
        return login;
    }

    public void setlogin(login login) {
        this.login = login;
    }

    void login() {
        try {
            con = new koneksi().getConnection();
            st = con.createStatement();
            String sql = "select hak_akses from login where id ='" + getlogin().getab().getText() + "'and pass ='" + getlogin().getcd().getText() + "';";
            ress = st.executeQuery(sql);
            while (ress.next()) {
                hakakses = ress.getString(1);
            }
            if (hakakses.equals("Manager")) {
                JOptionPane.showMessageDialog(null, "Selamat Datang Andim ");
                login.setVisible(false);
                new bos().setVisible(true);
//            new t2().setVisible(true);
            } else if (hakakses.equals("Pegawai")) {
                JOptionPane.showMessageDialog(null, "Selamat Datang Entri");
                login.setVisible(false);
                new RestoF().setVisible(true);

//            new t3().setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "maaf");
        }
    }

    
    public MouseAdapter simpan = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (simpan == simpan) {
                login();
            }

        }

    };
    
    public MouseAdapter keluar = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (keluar == keluar) {
                System.exit(0);
            }

        }

    };
    
    public MouseAdapter batal = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (batal == batal) {
                getlogin().getab().setText("");
                getlogin().getcd().setText("");
            }

        }

    };
}
