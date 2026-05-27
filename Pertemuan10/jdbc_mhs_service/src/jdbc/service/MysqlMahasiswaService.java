/**
 * File: MysqlMahasiswaService.java
 * Deskripsi: menyediakan layanan (service/controller) bagi program utama
 *            dalam mengelola basisdata sehingga interaksi dengan basis data 
 *            dapat dilakukan secara object oriented 
 *            (dengan memanfaatkan model dan DB utility)
 * Pembuat: Christianna Olivia Juniarti Manullang (24060124140168)
 * Tanggal: 28 Mei 2026
 */
package jdbc.service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtilities;


public class MysqlMahasiswaService {
    // ================= ATRIBUT =================
    Connection koneksi = null;
    
    // ================= METODE =================
    // Constructor
    public MysqlMahasiswaService(){
        this.koneksi = MysqlUtilities.getConnection();
    }
    
    // Membuat objek Mahasiswa
    public Mahasiswa makeMhsObject(){
        Mahasiswa mhs = new Mahasiswa();
        return mhs;
    }
    
    // Menambahkan data Mahasiswa
    public void add(Mahasiswa mhs){
        String query = "INSERT INTO mahasiswa(id, nama) VALUES (" + mhs.getId() + ", '" + mhs.getNama() + "')";
        try{
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil insert");
        }catch (SQLException e){
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }
    
    // Update data Mahasiswa
    public void update(Mahasiswa mhs){
        String query = "UPDATE mahasiswa SET nama = '" + mhs.getNama() + "' WHERE id = " + mhs.getId();
        try{
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil update");
        }catch (SQLException e){
            System.out.println("Gagal update: " + e.getMessage());
        }
    }
    
    // Delete data Mahasiswa
    public void delete(int id){
        String query = "DELETE FROM mahasiswa WHERE id = " + id;
        try{
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil delete");
        }catch (SQLException e){
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }
    
    // Ambil mahasiswa sesuai id
    public Mahasiswa getById(int id){
        String query = "SELECT * FROM mahasiswa WHERE id = " + id;
        Mahasiswa mhs = makeMhsObject();
        try{
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if(rs.next()){
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        }catch(SQLException e){
            System.out.println("Gagal getById: " + e.getMessage());
        }
        return mhs;
    }
    
    // Ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll(){
        String query = "SELECT * FROM mahasiswa";
        List<Mahasiswa> listMhs = new ArrayList<>();
        try{
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while(rs.next()){
                Mahasiswa mhs = makeMhsObject();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                listMhs.add(mhs);
            }
        }catch(SQLException e){
            System.out.println("Gagal getAll: " + e.getMessage());
        }
        return listMhs;
    }
}
