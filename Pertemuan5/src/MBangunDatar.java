/*Nama File : MBangunDatar.java */
/*Deskripsi: main untuk menggunakan class BangunDatar, Persegi, dan Lingkaran*/
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 12 Maret 2026*/
/*Lab: C1 */

public class MBangunDatar {
    public static void main(String[] args){
        /****************** Bagian 1 - Abstract Class ******************/
        /************ Nomor 3 ************/
        // BangunDatar B1 = new BangunDatar(); {muncul peringatan}
        
        BangunDatar P1 = new Persegi(10, "hitam", "putih");
        Persegi P2 = new Persegi(5, "merah", "biru");


        BangunDatar L1 = new Lingkaran(7, "hijau", "hijau");
        Lingkaran L2 = new Lingkaran(14, "ungu", "ungu");

        /************ Nomor 5 ************/
        System.out.println("----- Contoh Implementasi isEqualLuas  -----");

        System.out.println("Apakah luas P1 = P2? " + P1.isEqualLuas(P2));
        System.out.println("Apakah luas P1 = L1? " + P1.isEqualLuas(L1));
        System.out.println("Apakah luas P1 = L2? " + P1.isEqualLuas(L2));


    }
}
