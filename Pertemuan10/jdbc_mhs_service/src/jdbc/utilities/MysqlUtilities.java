/**
 * File: MysqlUtilities.java
 * Deskripsi: mengelola koneksi dengan basis data yang digunakan
 * Pembuat: Christianna Olivia Juniarti Manullang (24060124140168)
 * Tanggal: 28 Mei 2026
 */
package jdbc.utilities;
import java.sql.*;

public class MysqlUtilities {
    
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if(koneksi == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                // sesuaikan username dan password
                String user = "root";
                String password = "mysql8034";
                koneksi = DriverManager.getConnection(url, user, password);
                if(koneksi != null){
                    System.out.println("Koneksi berhasil");
                }
            }catch(ClassNotFoundException cne){
                System.out.println("Gagal load driver : " + cne.getMessage());
            }catch(SQLException sqle){
                System.out.println("Gagal koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
