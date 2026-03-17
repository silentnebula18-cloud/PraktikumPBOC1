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
        System.err.println("warna " + BD1.getWarna() + ", dan border " + BD1.getBorder());
        System.err.println("Bangun Datar BD2 memiliki jumlah sisi " + BD2.getJmlSisi() + ", ");
        System.err.println("warna " + BD2.getWarna() + ", dan border " + BD2.getBorder());
        System.err.println();

        // contoh implementasi mutator
        System.err.println("----- Contoh Implementasi Mutator  -----");
        BD1.setJmlSisi(3);
        BD1.setWarna("biru");
        BD1.setBorder("merah");
        System.err.println("----- Isi BD1 setelah dimutasi  -----");
        BD1.printInfo();

        BD2.setJmlSisi(9);
        BD2.setWarna("oranye");
        BD2.setBorder("biru");
        System.err.println("----- Isi BD2 setelah dimutasi  -----");
        BD2.printInfo();
        System.err.println();

        // contoh implementasi printCounterBangunDatar
        System.err.println("----- Contoh Implementasi printCounterBangunDatar  -----");
        BangunDatar.printCounterBangunDatar();
        System.err.println();

        /****************** Implementasi Class Persegi ******************/
        System.err.println();
        System.err.println("/****************** Implementasi Class Persegi ******************/");
        // contoh implementasi konstruktor tanpa parameter
        Persegi P1 = new Persegi();

        // contoh implementasi konstruktor dengan parameter
        Persegi P2 = new Persegi(10.0, "ungu", "putih");

        // contoh implementasi printInfo
        System.err.println();
        System.err.println("----- Contoh Implementasi printInfo  -----");
        System.err.println("----- Isi P1 Saat Ini  -----");
        P1.printInfo();
        System.err.println("----- Isi P2 Saat Ini  -----");
        P2.printInfo();
        System.err.println();

        // contoh implementasi selektor
        System.err.println("----- Contoh Implementasi Selektor -----");
        System.err.println("Bangun Datar P1 memiliki jumlah sisi " + P1.getJmlSisi() + ", ");
        System.err.println("warna " + P1.getWarna() + ", dan border " + P1.getBorder() + ".");
        System.err.println("Panjang sisi P1 adalah " + P1.getSisi());
        System.err.println("Bangun Datar P2 memiliki jumlah sisi " + P2.getJmlSisi() + ", ");
        System.err.println("warna " + P2.getWarna() + ", dan border " + P2.getBorder());
        System.err.println("Panjang sisi P2 adalah " + P2.getSisi());
        System.err.println();

        // contoh implementasi mutator 
        System.err.println("----- Contoh Implementasi Mutator -----");
        P1.setJmlSisi(3);
        P1.setWarna("kuning");
        P1.setBorder("kuning");
        P1.setSisi(5.0);
        System.err.println("----- Isi P1 setelah dimutasi  -----");
        P1.printInfo();

        P2.setWarna("hijau");
        P2.setBorder("hijau");
        P2.setSisi(8.5);
        System.err.println("----- Isi P2 setelah dimutasi  -----");
        P2.printInfo();
        System.err.println();

        // contoh implementasi getLuas, getKeliling, getDiagonal
        System.err.println("---- Contoh Implementasi getLuas, getKeliling, getDiagonal ----");
        System.err.println("Luas P1: " + P1.getLuas());
        System.err.println("Keliling P1: " + P1.getKeliling());
        System.err.println("Panjang Diagonal P1: " + P1.getDiagonal());
        System.err.println("-----------------------------");
        System.err.println("Luas P2: " + P2.getLuas());
        System.err.println("Keliling P2: " + P2.getKeliling());
        System.err.println("Panjang Diagonal P2: " + P2.getDiagonal());
        System.err.println();

        // contoh implementasi printCounterBangunDatar
        System.err.println("----- printCounterBangunDatar -----");
        BangunDatar.printCounterBangunDatar();
        System.err.println();

        /****************** Implementasi Class Lingkaran ******************/
        System.err.println();
        System.err.println("/****************** Implementasi Class Lingkaran ******************/");

        // contoh implementasi konstruktor tanpa parameter
        Lingkaran L1 = new Lingkaran();

        // contoh implementasi konstruktor dengan parameter
        Lingkaran L2 = new Lingkaran(7.0, "biru", "biru");

        // contoh implementasi printInfo
        System.err.println();
        System.err.println("----- Contoh Implementasi printInfo  -----");
        System.err.println("----- Isi L1 Saat Ini  -----");
        L1.printInfo();
        System.err.println("----- Isi L2 Saat Ini  -----");
        L2.printInfo();
        System.err.println();

        // contoh implementasi selektor 
        System.err.println("----- Contoh Implementasi Selektor -----");
        System.err.println("Bangun Datar L1 memiliki jumlah sisi " + L1.getJmlSisi() + ", ");
        System.err.println("warna " + L1.getWarna() + ", dan border " + L1.getBorder() + ".");
        System.err.println("Panjang jari-jari L1 adalah " + L1.getJari());
        System.err.println("Bangun Datar L2 memiliki jumlah sisi " + L2.getJmlSisi() + ", ");
        System.err.println("warna " + L2.getWarna() + ", dan border " + L2.getBorder());
        System.err.println("Panjang jari-jari L2 adalah " + L2.getJari());
        System.err.println();

        // contoh implementasi mutator 
        System.err.println("----- Contoh Implementasi Mutator -----");
        L1.setWarna("kuning");
        L1.setBorder("kuning");
        L1.setJari(7.0);
        System.err.println("----- Isi L1 setelah dimutasi  -----");
        L1.printInfo();

        L2.setWarna("hijau");
        L2.setBorder("hijau");
        L2.setJari(15.0);
        System.err.println("----- Isi L2 setelah dimutasi  -----");
        L2.printInfo();
        System.err.println();

        // contoh implementasi getLuas, getKeliling
        System.err.println("---- Contoh Implementasi getLuas, getKeliling ----");
        System.err.println("Luas L1: " + L1.getLuas());
        System.err.println("Keliling L1: " + L1.getKeliling());
        System.err.println("-----------------------------");
        System.err.println("Luas L2: " + L2.getLuas());
        System.err.println("Keliling L2: " + L2.getKeliling());
        System.err.println();

        // contoh implementasi printCounterBangunDatar
        System.err.println("----- printCounterBangunDatar -----");
        BangunDatar.printCounterBangunDatar();
        System.err.println();



        





    }
}
