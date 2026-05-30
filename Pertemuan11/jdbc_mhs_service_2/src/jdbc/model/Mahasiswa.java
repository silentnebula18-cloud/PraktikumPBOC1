/**
 * File: Mahasiswa.java
 * Deskripsi: atribut dan metode kelas Mahasiswa. Kelas ini merupakan
 *            persistent object yang berperan sebagai model bagi tabel
 *            mahasiswa
 * Pembuat: Christianna Olivia Juniarti Manullang (24060124140168)
 * Tanggal: 28 Mei 2026
 */
package jdbc.model;
public class Mahasiswa {
    // ================= ATRIBUT =================
    private int id;
    private String nama;
    
    // ================= METODE =================
    // Constructor
    public Mahasiswa(){  
    }
    
    public Mahasiswa(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    // getter and setter
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa{" + "id = " + id + ", nama = " + nama + "}";
    }
}
