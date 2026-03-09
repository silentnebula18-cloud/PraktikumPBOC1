/*Nama File : Dosen.java */
/*Deskripsi: berisi atribut dan methods dalam class Dosen */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 05 Maret 2026 (Updated: 07 Maret 2026)*/
/*Lab: C1 */

public class Dosen {
    /*********************ATRIBUT*********************/
    private String nip;
    private String nama;
    private String prodi;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor Dosen tanpa parameter
    public Dosen(){
        nip = "N/A";
        nama = "N/A";
        prodi = "N/A";
    }

    // konstruktor Dosen dengan parameter 
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nip dari Dosen
    public String getNip(){
        return this.nip;
    }

    // mengembalikan Nama dari Dosen
    public String getNama(){
        return this.nama;
    }

    // mengembalikan Prodi dari Dosen
    public String getProdi(){
        return this.prodi;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah isi atribut nip dari Dosen
    public void setNip(String nip){
        this.nip = nip;
    }

    // mengubah isi atribut Nama dari Dosen
    public void setNama(String nama){
        this.nama = nama;
    }

    // mengubah isi atribut Prodi dari Dosen
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    /*------------------LAINNYA-------------------*/
    // print isi semua atribut dari Dosen
    public void printDosen(){
        System.err.println("Nama Dosen: " + this.nama);
        System.err.println("NIP: " + this.nip);
        System.err.println("Program Studi: " + this.prodi);
    }

    // end of class Dosen
}
