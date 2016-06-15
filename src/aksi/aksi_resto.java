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

/**
 *
 * @author Hack_IT
 */
public class aksi_resto {

    RestoF restoF;

    Connection con;
    Statement st;
    ResultSet ress;

    int total = 0;
    int i, j, k;
    String baru;
    String harga = "";
    String temp = "";

    public aksi_resto(RestoF restoF) {
        this.restoF = restoF;
        tanggal_1();
    }

    public void tanggal_1() {
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd-MM-yyyy");
        getresto().gettanggal().setText(kal.format(skrg));
        getresto().gettanggal().disable();
    }

    public RestoF getresto() {
        return restoF;
    }

    public void setresto(RestoF restoF) {
        this.restoF = restoF;
    }

    void simpan() {
        try {
            con = new koneksi().getConnection();
            String sql = "insert into pemesanan values('" + 0 + "','" + getresto().getatas_nama().getText() + "','" + getresto().getTEXTjml().getText() + "','" + getresto().gettanggal().getText() + "','" + getresto().getTEXTharga().getText() + "','" + getresto().getnama().getText() + "')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data BERHASIL biologi", "Informasi", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data GAGAL tersimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e);
        }
    }
    ;
    // simpan
    public MouseAdapter simpan = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (simpan == simpan) {
                simpan();
                try {
                    getresto().getTabel().print();
                } catch (Exception e) {
                }
            }

        }

    };

    // add
    public MouseAdapter add = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (add == add) {
                try {
                    String a, b, c, d;//a=nama , b=jumlah , c=harga , d=total
                    int p, r, u, s, t;
                    r = Integer.parseInt(getresto().getTEXTjml().getText());
                    u = Integer.parseInt(getresto().getsatuan().getText());

                    s = r * u;

                    d = Integer.toString(s);

                    if (getresto().getnama().getText() != "") {
                        a = getresto().getnama().getText();
                        b = getresto().getTEXTjml().getText();
                        c = getresto().getsatuan().getText();
                        getresto().getTabel().setValueAt(a, i, 0);
                        getresto().getTabel().setValueAt(b, i, 1);
                        getresto().getTabel().setValueAt(c, i, 2);
                        getresto().getTabel().setValueAt(d, i, 3);
                        i++;
                        p = Integer.parseInt(d);
                        j = j + p;
                        String baru5 = Integer.toString(j);
                        getresto().getTEXTharga().setText(baru5);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Input Salah", "RestoKu", JOptionPane.ERROR_MESSAGE);
                }
            }

        }

    };

    public MouseAdapter bersih = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (bersih == bersih) {
                if (getresto().getTEXTharga().getText() != "0") {
                    getresto().getnama().setText("");
                    getresto().getTEXTbayar().setText("0");
                    j = 0;
                    getresto().getsatuan().setText("");
                    getresto().getTEXTjml().setText("0");
                    getresto().getTEXTharga().setText("0");
                    temp = "";
                    harga = "";
                    getresto().getsatuan().setText("");
                    getresto().getTEXTkembalian().setText("0");
                    for (; i >= 0; i--) {
                        getresto().getTabel().setValueAt(null, i, 0);
                        getresto().getTabel().setValueAt(null, i, 1);
                        getresto().getTabel().setValueAt(null, i, 2);
                        getresto().getTabel().setValueAt(null, i, 3);
                    }
                    i = 0;
                }
            }

        }

    };
    
    public MouseAdapter kopi_ireng = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (kopi_ireng==kopi_ireng) {
                 try {
            con = new koneksi().getConnection();
            st = (com.mysql.jdbc.Statement) con.createStatement();
            String sql = "SELECT * FROM `menu` WHERE id_menu='" + "1" + "'";
            st = con.createStatement();
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {
//                getmenu_utama().getkombo().addItem(res.getString(1));
                getresto().getnama().setText(res.getString(2));
                getresto().getsatuan().setText(res.getString(3));
            }
        } catch (Exception e) {
        }

            }

        }

    };
    
    public MouseAdapter kopi_ijo = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (kopi_ijo==kopi_ijo) {
                 try {
            con = new koneksi().getConnection();
            st = (com.mysql.jdbc.Statement) con.createStatement();
            String sql = "SELECT * FROM `menu` WHERE id_menu='" + "2" + "'";
            st = con.createStatement();
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {
//                getmenu_utama().getkombo().addItem(res.getString(1));
                getresto().getnama().setText(res.getString(2));
                getresto().getsatuan().setText(res.getString(3));
            }
        } catch (Exception e) {
        }

            }

        }

    };
    
    
    public MouseAdapter josua = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (josua==josua) {
                 try {
            con = new koneksi().getConnection();
            st = (com.mysql.jdbc.Statement) con.createStatement();
            String sql = "SELECT * FROM `menu` WHERE id_menu='" + "3" + "'";
            st = con.createStatement();
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {
//                getmenu_utama().getkombo().addItem(res.getString(1));
                getresto().getnama().setText(res.getString(2));
                getresto().getsatuan().setText(res.getString(3));
            }
        } catch (Exception e) {
        }

            }

        }

    };
    
    
    public MouseAdapter susu = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (susu==susu) {
                 try {
            con = new koneksi().getConnection();
            st = (com.mysql.jdbc.Statement) con.createStatement();
            String sql = "SELECT * FROM `menu` WHERE id_menu='" + "4" + "'";
            st = con.createStatement();
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {
//                getmenu_utama().getkombo().addItem(res.getString(1));
                getresto().getnama().setText(res.getString(2));
                getresto().getsatuan().setText(res.getString(3));
            }
        } catch (Exception e) {
        }

            }

        }

    };
    
    public MouseAdapter Indomi = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (Indomi==Indomi) {
                 try {
            con = new koneksi().getConnection();
            st = (com.mysql.jdbc.Statement) con.createStatement();
            String sql = "SELECT * FROM `menu` WHERE id_menu='" + "5" + "'";
            st = con.createStatement();
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {
//                getmenu_utama().getkombo().addItem(res.getString(1));
                getresto().getnama().setText(res.getString(2));
                getresto().getsatuan().setText(res.getString(3));
            }
        } catch (Exception e) {
        }

            }

        }

    };
    
    public MouseAdapter mariam = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (mariam==mariam) {
                 try {
            con = new koneksi().getConnection();
            st = (com.mysql.jdbc.Statement) con.createStatement();
            String sql = "SELECT * FROM `menu` WHERE id_menu='" + "6" + "'";
            st = con.createStatement();
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {
//                getmenu_utama().getkombo().addItem(res.getString(1));
                getresto().getnama().setText(res.getString(2));
                getresto().getsatuan().setText(res.getString(3));
            }
        } catch (Exception e) {
        }

            }

        }

    };
    public MouseAdapter goreng = new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            if (goreng==goreng) {
                 try {
            con = new koneksi().getConnection();
            st = (com.mysql.jdbc.Statement) con.createStatement();
            String sql = "SELECT * FROM `menu` WHERE id_menu='" + "7" + "'";
            st = con.createStatement();
            ResultSet res = st.executeQuery(sql);

            while (res.next()) {
//                getmenu_utama().getkombo().addItem(res.getString(1));
                getresto().getnama().setText(res.getString(2));
                getresto().getsatuan().setText(res.getString(3));
            }
        } catch (Exception e) {
        }

            }

        }

    };
}
