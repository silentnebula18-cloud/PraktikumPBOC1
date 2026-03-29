/*Nama File : Pengusaha.java */
/*Deskripsi: berisi atribut dan methods dalam class Pengusaha */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 29 Maret 2026*/
/*Lab: C1 */

package Pajak;

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    /*********************ATRIBUT*********************/
    private String NPWP;
    private static int counterPengusaha;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Pengusaha(){
        counterPengusaha++;
    }

    // konstruktor dengan parameter 
    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String NPWP){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.NPWP = NPWP;
        counterPengusaha++;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut NPWP
    public String getNPWP(){
        return this.NPWP;
    }

    // mengembalikan nilai atribut static counterPengusaha
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut NPWP
    public void setNPWP(String NPWP){
        this.NPWP = NPWP;
    }
    
    /*------------------LAINNYA-------------------*/
    // print nilai atribut-atribut (non-static) 
    @Override
    public void cetakInfo(){
        System.out.println("NPWP                    : " + this.NPWP);
        super.cetakInfo();
        System.out.println("(Static) Banyak Pengusaha : " + counterPengusaha);
    }

    // menghitung masa kerja seorang Pengusaha
    public int hitungMasaKerja(){
        return (int) (LocalDate.now().toEpochDay() - this.tgl_mulai_kerja.toEpochDay()) + 6;
    }

    // menghitung dan mengembalikan jumlah pajak berdasarkan pendapatan (Pengusaha)
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    // end of Class Pengusaha
}
