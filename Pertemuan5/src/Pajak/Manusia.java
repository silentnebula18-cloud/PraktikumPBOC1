/*Nama File : Manusia.java */
/*Deskripsi: berisi atribut dan methods dalam abstract class Manusia (sub-class: PNS, Pengusaha, Petani)*/
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 28 Maret 2026 (Updated: 29 Maret 2026)*/
/*Lab: C1 */

package Pajak;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    /*********************ATRIBUT*********************/
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Manusia(){
        counterMns++;
    }

    // konstruktor dengan parameter 
    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = Manusia.strToLocalDate(tgl_mulai_kerja);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut nama
    public String getNama(){
        return nama;
    }

    // mengembalikan nilai atribut tgl_mulai_kerja
    public LocalDate getTglMulaiKerja(){
        return tgl_mulai_kerja;
    }

    // mengembalikan nilai atribut alamat
    public String getAlamat(){
        return alamat;
    }

    // mengembalikan nilai atribut pendapatan
    public double getPendapatan(){
        return pendapatan;
    }

    // mengembalikan nilai atribut static (counterMns)
    public static int getCounterMns(){
        return counterMns;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // mengubah nilai atribut tgl_mulai_kerja
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    // mengubah nilai atribut alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    // mengubah nilai atribut pendapatan
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }
    
    /*------------------LAINNYA-------------------*/
    // menampilkan nilai atribut-atribut (non-static) 
    public void cetakInfo(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String sTgl = this.tgl_mulai_kerja.format(format);
        String sPdp = String.format("%.1f", this.pendapatan);

        System.out.println("Nama                    : " + this.nama);
        System.out.println("Tanggal Mulai Kerja     : " + sTgl);
        System.out.println("Alamat                  : " + this.alamat);
        System.out.println("Pendapatan              : " + sPdp);
        System.out.println("(Static) Banyak Manusia : " + counterMns);
    }

    // metode abstrak untuk menghitung masa kerja
    public abstract int hitungMasaKerja();

    // menerima tanggal dalam bentuk String dan mengembalikannya dalam bentuk LocalDate
    public static LocalDate strToLocalDate(String tgl){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(tgl, format);
    }


    // end of class Manusia

}
