/*Nama File : Kendaraan.java */
/*Deskripsi: berisi atribut dan methods dalam class Kendaraan */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 05 Maret 2026 (Updated: 07 Maret 2026)*/
/*Lab: C1 */

public class Kendaraan {
    /*********************ATRIBUT*********************/
    private String noPlat;
    private String jenis;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor Kendaraan tanpa parameter
    public Kendaraan(){
        this.noPlat = "N/A";
        this.jenis = "N/A";
    }

    // konstruktor Kendaraan dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan noPlat dari Kendaraan
    public String getNoPlat(){
        return this.noPlat;
    }

    // mengembalikan jenis dari Kendaraan
    public String getJenis(){
        return this.jenis;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah isi atribut noPlat dari Kendaraan
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    // mengubah isi atribut jenis dari Kendaraan
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    /*------------------LAINNYA-------------------*/
    // print isi semua atribut dari Kendaraan
    public void printKendaraan(){
        System.err.println("Nomor Plat: " + this.noPlat);
        System.err.println("Jenis: " + this.jenis);
    }

    // end of class Kendaraan
}
