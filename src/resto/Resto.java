package resto;


import koneksi.koneksi;

/*
 * Resto.java
 *
 * Created on June 16, 2007, 9:42 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Saut_private
 */
public class Resto {
    
    /** Creates a new instance of Resto */
    public Resto() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        koneksi kon=(koneksi) new koneksi().getConnection();
login log=new login();
log.setVisible(true);
    }
    
}
