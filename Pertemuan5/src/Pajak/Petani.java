/*Nama File : Petani.java */
/*Deskripsi: berisi atribut dan methods dalam class Petani */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 29 Maret 2026*/
/*Lab: C1 */

package Pajak;

import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    /*********************ATRIBUT*********************/
    private String asal_kota;
    private static int counterPetani;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Petani(){
        counterPetani++;
    }

    // konstruktor dengan parameter 
    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut asal_kota
    public String getAsalKota(){
        return this.asal_kota;
    }

    // mengembalikan nilai atribut static counterPetani
    public static int getCounterPetani(){
        return counterPetani;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut asal_kota
    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }
    
    /*------------------LAINNYA-------------------*/
    // print nilai atribut-atribut (non-static) 
    @Override
    public void cetakInfo(){
        System.out.println("Asal Kota               : " + this.asal_kota);
        super.cetakInfo();
        System.out.println("(Static) Banyak Petani  : " + counterPetani);
    }

    // menghitung masa kerja seorang Petani
    public int hitungMasaKerja(){
        return (int) (LocalDate.now().toEpochDay() - this.tgl_mulai_kerja.toEpochDay()) + 1;
    }

    // menghitung dan mengembalikan jumlah pajak berdasarkan pendapatan (Petani)
    public double hitungPajak(){
        return 0;
    }

    // end of Class Petani
}
