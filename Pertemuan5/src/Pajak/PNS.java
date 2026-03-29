/*Nama File : PNS.java */
/*Deskripsi: berisi atribut dan methods dalam class PNS */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 29 Maret 2026*/
/*Lab: C1 */

package Pajak;

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    /*********************ATRIBUT*********************/
    private String NIP;
    private static int counterPNS;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public PNS(){
        counterPNS++;
    }

    // konstruktor dengan parameter 
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String NIP){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }

    // konstruktor dengan parameter (input untuk semua atribut, kecuali alamat)
    public PNS(String nama, String tgl_mulai_kerja, double pendapatan, String NIP){
        super(nama, tgl_mulai_kerja, null, pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut NIP
    public String getNIP(){
        return this.NIP;
    }

    // mengembalikan nilai atribut static counterPNS
    public static int getCounterPNS(){
        return counterPNS;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    
    /*------------------LAINNYA-------------------*/
    // print nilai atribut-atribut (non-static) 
    @Override
    public void cetakInfo(){
        System.out.println("NIP                     : " + this.NIP);
        super.cetakInfo();
        System.out.println("(Static) Banyak PNS     : " + counterPNS);
    }

    // menghitung masa kerja seorang PNS
    public int hitungMasaKerja(){
        return (int) (LocalDate.now().toEpochDay() - this.tgl_mulai_kerja.toEpochDay()) + 8;
    }

    // menghitung dan mengembalikan jumlah pajak berdasarkan pendapatan (PNS)
    public double hitungPajak(){
        return 0.1 * pendapatan;
    }

    // end of Class PNS
}
