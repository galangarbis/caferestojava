package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksi {

    Connection con;
    Statement st;
    public Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/cafe", "root", "");
            JOptionPane.showMessageDialog(null, "Konesi ke Database BERHASIL");
            st=con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Konesi ke Database GAGAL");
        }
        return con;
    }

}
