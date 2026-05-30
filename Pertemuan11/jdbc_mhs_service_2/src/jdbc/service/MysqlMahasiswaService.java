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
    public void add(String nama){
        String query = "INSERT INTO mahasiswa(nama) VALUES ('" + nama + "')";
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
    
    // Reset indeks tabel mahasiswa
    public void indexReset(){
        String query = "CALL indexReset()";
        try{
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil index reset");
        }catch (SQLException e){
            System.out.println("Gagal index reset: " + e.getMessage());
        }
    }
    
    // Mengetahui indeks selajutnya yang akan diberi jika ada data yang dimasukan
    public Integer getNextIdx(){
        Integer idx = 1;
        String query = "SELECT MAX(id) FROM mahasiswa";
        try{
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if(rs.next()){
                idx = rs.getInt(1);
                if(idx >= 0){
                    idx = idx + 1;
                }
            }
        }catch (SQLException e){
            System.out.println("Gagal getNextIdx: " + e.getMessage());
        }
        return idx;
    }
    
    // Memeriksa  pakah tabel kosong
    public boolean isEmpty(){
        String query = "SELECT COUNT(*) FROM mahasiswa";
        try{
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if(rs.next()){
                int nData = rs.getInt(1);
                return nData == 0;
            }
        }catch (SQLException e){
            System.out.println("Gagal cek isEmpty: " + e.getMessage());
        }
        return true;
    }
    
    // Menutup koneksi ke DB
    public void closeConnection(){
        MysqlUtilities.closeConnection();
    }
}
