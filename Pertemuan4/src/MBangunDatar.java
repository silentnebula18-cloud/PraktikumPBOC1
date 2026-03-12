/*Nama File : MBangunDatar.java */
/*Deskripsi: main untuk menggunakan class BangunDatar, Persegi, dan Lingkaran*/
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 12 Maret 2026*/
/*Lab: C1 */

public class MBangunDatar {
    public static void main(String[] args){
        /****************** Implementasi Class BangunDatar ******************/
        System.err.println();
        System.err.println("/****************** Implementasi Class BangunDatar ******************/");
        // contoh implementasi konstruktor tanpa parameter
        BangunDatar BD1 = new BangunDatar();

        // contoh implementasi konstruktor dengan parameter
        BangunDatar BD2 = new BangunDatar(5, "putih", "hitam");
        
        // contoh implementasi printInfo
        System.err.println();
        System.err.println("----- Contoh Implementasi printInfo  -----");
        System.err.println("----- Isi BD1 Saat Ini  -----");
        BD1.printInfo();
        System.err.println("----- Isi BD2 Saat Ini  -----");
        BD2.printInfo();
        System.err.println();

        // contoh implementasi selektor
        System.err.println("----- Contoh Implementasi Selektor  -----");
        System.err.println("Bangun Datar BD1 memiliki jumlah sisi " + BD1.getJmlSisi() + ", ");
        System.err.println("warna " + BD1.getWarna() + ", dan border" + BD1.getBorder());
        System.err.println("Bangun Datar BD2 memiliki jumlah sisi " + BD2.getJmlSisi() + ", ");
        System.err.println("warna " + BD2.getWarna() + ", dan border" + BD2.getBorder());
        System.err.println();

        // contoh implementasi mutator
        System.err.println("----- Contoh Implementasi Mutator  -----");
        BD1.setBorder("merah");
        BD1.setJmlSisi(3);
        BD1.setWarna("biru");
        System.err.println("----- Isi BD1 setelah dimutasi  -----");
        BD1.printInfo();
        System.err.println();

        // contoh implementasi printCounterBangunDatar
        System.err.println("----- Contoh Implementasi printCounterBangunDatar  -----");
        BangunDatar.printCounterBangunDatar();
        System.err.println();

        /****************** Implementasi Class Persegi ******************/
        System.err.println();
        System.err.println("/****************** Implementasi Class Persegi ******************/");
        // // contoh implementasi konstruktor tanpa parameter
        // BangunDatar P1 = new Persegi();

        // // contoh implementasi konstruktor dengan parameter
        // BangunDatar P2 = new Persegi(0, null, null);



    }
}
