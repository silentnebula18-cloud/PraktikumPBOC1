/*Nama File : MataKuliah.java */
/*Deskripsi: berisi atribut dan methods dalam class Mahasiswa */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 05 Maret 2026 (Updated: 07 Maret 2026)*/
/*Lab: C1 */

public class MataKuliah {
    /*********************ATRIBUT*********************/
    private String idMatKul;
    private String nama;
    private int sks;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor MataKuliah tanpa parameter
    public MataKuliah(){
        this.idMatKul = "N/A";
        this.nama = "N/A";
        this.sks = 0;
    }

    // konstruktor MataKuliah dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan idMatKul dari MataKuliah
    public String getIdMatKul(){
        return idMatKul;
    }

    // mengembalikan nama dari MataKuliah
    public String getNama(){
        return nama;
    }

    // mengembalikan sks dari MataKuliah
    public int getSks(){
        return sks;
    }
    
    /*------------------MUTATOR-------------------*/
    // mengubah isi atribut idMatKul dari MataKuliah
    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    // mengubah isi atribut nama dari MataKuliah
    public void setNama(String nama){
        this.nama = nama;
    }

    // mengubah isi atribut sks dari MataKuliah
    public void setSks(int sks){
        this.sks = sks;
    }

    /*------------------LAINNYA-------------------*/
    // print isi semua atribut dari MataKuliah
    public void printMataKuliah(){
        System.err.println("idMatKul: " + this.idMatKul);
        System.err.println("Nama MatKul: " + this.nama);
        System.err.println("SKS: " + this.sks);
    }

    // end of class MataKuliah
}
