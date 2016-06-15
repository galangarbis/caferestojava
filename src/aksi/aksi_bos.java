/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aksi;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import resto.RestoF;
import resto.bos;
import resto.login;

/**
 *
 * @author Hack_IT
 */
public class aksi_bos {

    bos bos;

    Connection con;
    Statement st;
    ResultSet ress;
    String hakakses;
    int total = 0;
    int i, j, k;
    String baru;
    String harga = "";
    String temp = "";

    public aksi_bos(bos login) {
        this.bos = login;
        tanggal_1();
        tabel_petugas();
        tabel_laporan();
    }

    public bos getbos() {
        return bos;
    }
// tanggal

    public void tanggal_1() {
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd-MM-yyyy");
        getbos().gettanggal().setText(kal.format(skrg));
        getbos().gettanggal().disable();
    }

// tabel pegawan
    public void tabel_petugas() {
        DefaultTableModel tebel = new DefaultTableModel();
        tebel.addColumn("ID");
        tebel.addColumn("Nama");
        tebel.addColumn("Password");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "");

            //JOptionPane.showMessageDialog(null, "ok");
            String sql = "select * from login";
            st = con.createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                tebel.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3)});

            }
            getbos().gettb_petugas().setModel(tebel);
        } catch (Exception e) {
        }
    }

    ;
    
    
//   tabel laporan
    public void tabel_laporan() {
        DefaultTableModel tebel = new DefaultTableModel();
        tebel.addColumn("Atas Nama");
        tebel.addColumn("Menu");
        tebel.addColumn("Jumlah");
        tebel.addColumn("Tanggal");
        tebel.addColumn("Total");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "");

            //JOptionPane.showMessageDialog(null, "ok");
//            String sql = "select * from pemesanan";
            String sql = "SELECT * FROM `pemesanan` where tanggal like '" + getbos().gettanggal().getText() + "'";
            st = con.createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                tebel.addRow(new Object[]{res.getString(2), res.getString(6), res.getString(3), res.getString(4), res.getString(5)});

            }
            getbos().gettb_laporan().setModel(tebel);
        } catch (Exception e) {
        }
    }

    ;
    
    

    public void setbos(bos bos) {
        this.bos = bos;
    }

    void simpan() {
//        con = new koneksi.koneksi().getConnection();
        try {
//                    Connection con = new koneksi().getConnection();
            con = new koneksi().getConnection();
            String sql = "insert into login values('" + getbos().getuser().getText() + "','" + getbos().getpass().getText() + "','" + getbos().getsbg().getSelectedItem() + "')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data BERHASIL biologi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tabel_petugas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data GAGAL tersimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e);
        }
    }

    ;    
    public MouseAdapter simpan = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (simpan == simpan) {
                simpan();
            }

        }

    };

    void cari() {
        try {
            Statement stat = con.createStatement();
            String sql = "SELECT * FROM `login` where id like '" + getbos().getuser().getText() + "'";
            ResultSet isi = stat.executeQuery(sql);
            if (isi.next()) {
                getbos().getuser().setText(isi.getString(1));
                getbos().getpass().setText(isi.getString(2));
                getbos().getsbg().setSelectedItem(isi.getString(3));

            } else {
                JOptionPane.showMessageDialog(null, "barang tidak ada..!");
            }
            stat.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error :" + ex);
        }
    }

    public MouseAdapter cari = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (cari == cari) {
                cari();
            }

        }

    };

    void ganti() {
        try {
            Statement stm = con.createStatement();
            String sql = "update login set pass ='" + getbos().getpass().getText() + "',hak_akses='" + getbos().getsbg().getSelectedItem()
                    + "' where id='" + getbos().getuser().getText() + "';";
            stm.executeUpdate(sql);
            stm.close();
            JOptionPane.showMessageDialog(null, "ID Berhasil Diganti");
            tabel_petugas();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error :" + ex);
        }
    }

    public MouseAdapter ganti = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (ganti == ganti) {
                ganti();
            }

        }

    };

    void hapus() {
        try {
            st = con.createStatement();
            String sql = "DELETE from login" + " where id='" + getbos().getuser().getText() + "'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "ID Telah di Hapus");
            tabel_petugas();
            st.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error :" + ex);
        }
    }

    public MouseAdapter hapus = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (hapus == hapus) {
                hapus();
            }

        }

    };

    public MouseAdapter cetak = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (cetak == cetak) {
//                hapus();
                try {
                   getbos().gettb_laporan().print();
                } catch (Exception e) {
                }
            }

        }

    };
}
