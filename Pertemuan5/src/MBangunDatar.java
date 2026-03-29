/*Nama File : MBangunDatar.java */
/*Deskripsi: main untuk menggunakan class BangunDatar, Persegi, dan Lingkaran
             dan Interface IResize*/
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 26 Maret 2026 (Updated: 28 Maret 2026)*/
/*Lab: C1 */

public class MBangunDatar {
    public static void main(String[] args){
        /****************** Implementasi Class Persegi ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Persegi ******************/");
        // contoh implementasi konstruktor tanpa parameter
        Persegi P1 = new Persegi();

        // contoh implementasi konstruktor dengan parameter
        Persegi P2 = new Persegi(10.0, "ungu", "putih");
        BangunDatar P3 = new Persegi(11.0, "hitam", "hitam");

        // contoh implementasi printInfo
        System.out.println();
        System.out.println("----- Contoh Implementasi printInfo  -----");
        System.out.println("----- Isi P1 Saat Ini  -----");
        P1.printInfo();
        System.out.println("----- Isi P2 Saat Ini  -----");
        P2.printInfo();
        System.out.println("----- Isi P3 Saat Ini  -----");
        P3.printInfo();
        System.out.println();

        // contoh implementasi selektor
        System.out.println("----- Contoh Implementasi Selektor -----");
        System.out.println("Bangun Datar P1 memiliki jumlah sisi " + P1.getJmlSisi() + ", ");
        System.out.println("warna " + P1.getWarna() + ", dan border " + P1.getBorder() + ".");
        System.out.println("Panjang sisi P1 adalah " + P1.getSisi());
        System.out.println("Bangun Datar P2 memiliki jumlah sisi " + P2.getJmlSisi() + ", ");
        System.out.println("warna " + P2.getWarna() + ", dan border " + P2.getBorder());
        System.out.println("Panjang sisi P2 adalah " + P2.getSisi());
        System.out.println("Bangun Datar P3 memiliki jumlah sisi " + P3.getJmlSisi() + ", ");
        System.out.println("warna " + P3.getWarna() + ", dan border " + P3.getBorder());
        System.out.println("getSisi() tidak bisa digunakan pada P3 karena objek tersebut");
        System.out.println("termasuk kelas BangunDatar (walaupun diinstansiasi sebagai Persegi)");
        System.out.println("dan getSisi() bukan hasil override.");
        System.out.println();

        // contoh implementasi mutator 
        System.out.println("----- Contoh Implementasi Mutator -----");
        P1.setJmlSisi(3);
        P1.setWarna("kuning");
        P1.setBorder("kuning");
        P1.setSisi(5.0);
        System.out.println("----- Isi P1 setelah dimutasi  -----");
        P1.printInfo();

        P2.setWarna("hijau");
        P2.setBorder("hijau");
        P2.setSisi(8.5);
        System.out.println("----- Isi P2 setelah dimutasi  -----");
        P2.printInfo();

        P3.setWarna("biru");
        P3.setBorder("biru");
        System.out.println("----- Isi P3 setelah dimutasi  -----");
        P3.printInfo();
        System.out.println("setSisi(double Sisi) tidak bisa dipakai pada P3");
        System.out.println("untuk alasan yang sama dengan getSisi() sebelumnya.");
        System.out.println();

        // contoh implementasi getLuas, getKeliling, getDiagonal
        System.out.println("---- Contoh Implementasi getLuas, getKeliling, getDiagonal ----");
        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Keliling P1: " + P1.getKeliling());
        System.out.println("Panjang Diagonal P1: " + P1.getDiagonal());
        System.out.println("-----------------------------");
        System.out.println("Luas P2: " + P2.getLuas());
        System.out.println("Keliling P2: " + P2.getKeliling());
        System.out.println("Panjang Diagonal P2: " + P2.getDiagonal());
        System.out.println("-----------------------------");
        System.out.println("Luas P3: " + P3.getLuas());
        System.out.println("Keliling P3: " + P3.getKeliling());
        System.out.println("getDiagonal() tidak bisa dipakai pada P3");
        System.out.println("untuk alasan yang sama dengan getSisi() sebelumnya.");
        System.out.println();

        // contoh implementasi isEqualLuas
        System.out.println("----- Contoh Implementasi isEqualLuas -----");
        System.out.println("Apakah luas P1 dan P2 sama? " + P1.isEqualLuas(P2));
        System.out.println("Apakah luas P1 dan P3 sama? " + P1.isEqualLuas(P3));
        System.out.println("Apakah luas P2 dan P3 sama? " + P3.isEqualLuas(P2));
        System.out.println();

        // contoh implementasi isEqualKeliling
        System.out.println("----- Contoh Implementasi isEqualKeliling -----");
        System.out.println("Apakah keliling P1 dan P2 sama? " + P1.isEqualKeliling(P2));
        System.out.println("Apakah keliling P1 dan P3 sama? " + P1.isEqualKeliling(P3));
        System.out.println("Apakah keliling P2 dan P3 sama? " + P3.isEqualKeliling(P2));
        System.out.println();

        // contoh implementasi zoomIn
        System.out.println("----- Contoh Implementasi zoomIn -----");
        P1.zoomIn();
        System.out.println("Panjang sisi P1 setelah zoomIn: " + P1.getSisi());
        P2.zoomIn();
        System.out.println("Panjang sisi P2 setelah zoomIn: " + P2.getSisi());
        System.out.println("P3.zoomIn() tidak bisa dijalankan karena Persegi yang implementasi IResize, bukan BangunDatar");
        System.out.println();

        // contoh implementasi zoomOut
        System.out.println("----- Contoh Implementasi zoomOut -----");
        P1.zoomOut();
        System.out.println("Panjang sisi P1 setelah zoomOut: " + P1.getSisi());
        P2.zoomOut();
        System.out.println("Panjang sisi P2 setelah zoomOut: " + P2.getSisi());
        System.out.println("P3.zoomOut() tidak bisa dijalankan karena Persegi yang implementasi IResize, bukan BangunDatar");
        System.out.println();

        // contoh implementasi zoom
        System.out.println("----- Contoh Implementasi zoom -----");
        P1.zoom(2);
        System.out.println("Panjang sisi P1 setelah zoom(2): " + P1.getSisi());
        P2.zoom(2);
        System.out.println("Panjang sisi P2 setelah zoom(2): " + P2.getSisi());
        System.out.println("P3.zoom(2) tidak bisa dijalankan karena Persegi yang implementasi IResize, bukan BangunDatar");
        System.out.println();

        // contoh implementasi printCounterBangunDatar
        System.out.println("----- printCounterBangunDatar -----");
        BangunDatar.printCounterBangunDatar();
        System.out.println();

        /****************** Implementasi Class Lingkaran ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Lingkaran ******************/");

        // contoh implementasi konstruktor tanpa parameter
        Lingkaran L1 = new Lingkaran();

        // contoh implementasi konstruktor dengan parameter
        Lingkaran L2 = new Lingkaran(7.0, "biru", "biru");
        BangunDatar L3 = new Lingkaran(14.0, "kuning", "kuning");

        // contoh implementasi printInfo
        System.out.println();
        System.out.println("----- Contoh Implementasi printInfo  -----");
        System.out.println("----- Isi L1 Saat Ini  -----");
        L1.printInfo();
        System.out.println("----- Isi L2 Saat Ini  -----");
        L2.printInfo();
        System.out.println("----- Isi L3 Saat Ini  -----");
        L3.printInfo();
        System.out.println();

        // contoh implementasi selektor 
        System.out.println("----- Contoh Implementasi Selektor -----");
        System.out.println("Bangun Datar L1 memiliki jumlah sisi " + L1.getJmlSisi() + ", ");
        System.out.println("warna " + L1.getWarna() + ", dan border " + L1.getBorder() + ".");
        System.out.println("Panjang jari-jari L1 adalah " + L1.getJari());
        System.out.println("Bangun Datar L2 memiliki jumlah sisi " + L2.getJmlSisi() + ", ");
        System.out.println("warna " + L2.getWarna() + ", dan border " + L2.getBorder());
        System.out.println("Panjang jari-jari L2 adalah " + L2.getJari());
        System.out.println("Bangun Datar L3 memiliki jumlah sisi " + L3.getJmlSisi() + ", ");
        System.out.println("warna " + L3.getWarna() + ", dan border " + L3.getBorder());
        System.out.println("getJari() tidak bisa digunakan pada P3 karena objek tersebut");
        System.out.println("termasuk kelas BangunDatar (walaupun diinstansiasi sebagai Persegi)");
        System.out.println("dan getJari() bukan hasil override.");
        System.out.println();

        // contoh implementasi mutator 
        System.out.println("----- Contoh Implementasi Mutator -----");
        L1.setWarna("kuning");
        L1.setBorder("kuning");
        L1.setJari(7.0);
        System.out.println("----- Isi L1 setelah dimutasi  -----");
        L1.printInfo();

        L2.setWarna("hijau");
        L2.setBorder("hijau");
        L2.setJari(15.0);
        System.out.println("----- Isi L2 setelah dimutasi  -----");
        L2.printInfo();

        L3.setWarna("kuning");
        L3.setBorder("kuning");
        System.out.println("----- Isi L3 setelah dimutasi  -----");
        L3.printInfo();
        System.out.println("setJari(double jari) tidak bisa dipakai pada P3");
        System.out.println("untuk alasan yang sama dengan getJari() sebelumnya.");
        System.out.println();

        // contoh implementasi getLuas, getKeliling
        System.out.println("---- Contoh Implementasi getLuas, getKeliling ----");
        System.out.println("Luas L1: " + L1.getLuas());
        System.out.println("Keliling L1: " + L1.getKeliling());
        System.out.println("-----------------------------");
        System.out.println("Luas L2: " + L2.getLuas());
        System.out.println("Keliling L2: " + L2.getKeliling());
        System.out.println("-----------------------------");
        System.out.println("Luas L3: " + L3.getLuas());
        System.out.println("Keliling L3: " + L3.getKeliling());
        System.out.println();

        // contoh implementasi isEqualLuas
        System.out.println("----- Contoh Implementasi isEqualLuas -----");
        System.out.println("Apakah luas L1 dan L2 sama? " + L1.isEqualLuas(L2));
        System.out.println("Apakah luas L1 dan L3 sama? " + L1.isEqualLuas(L3));
        System.out.println("Apakah luas L2 dan L3 sama? " + L3.isEqualLuas(L2));
        System.out.println();

        // contoh implementasi isEqualKeliling
        System.out.println("----- Contoh Implementasi isEqualKeliling -----");
        System.out.println("Apakah keliling L1 dan L2 sama? " + L1.isEqualKeliling(L2));
        System.out.println("Apakah keliling L1 dan L3 sama? " + L1.isEqualKeliling(L3));
        System.out.println("Apakah keliling L2 dan L3 sama? " + L3.isEqualKeliling(L2));
        System.out.println();

        // contoh implementasi zoomIn
        System.out.println("----- Contoh Implementasi zoomIn -----");
        L1.zoomIn();
        System.out.println("Lanjang sisi L1 setelah zoomIn: " + L1.getJari());
        L2.zoomIn();
        System.out.println("Lanjang sisi L2 setelah zoomIn: " + L2.getJari());
        System.out.println("L3.zoomIn() tidak bisa dijalankan karena Lingkaran yang implementasi IResize, bukan BangunDatar");
        System.out.println();

        // contoh implementasi zoomOut
        System.out.println("----- Contoh Implementasi zoomOut -----");
        L1.zoomOut();
        System.out.println("Panjang sisi L1 setelah zoomOut: " + L1.getJari());
        L2.zoomOut();
        System.out.println("Panjang sisi L2 setelah zoomOut: " + L2.getJari());
        System.out.println("L3.zoomOut() tidak bisa dijalankan karena Lingkaran yang implementasi IResize, bukan BangunDatar");
        System.out.println();

        // contoh implementasi zoom
        System.out.println("----- Contoh Implementasi zoom -----");
        L1.zoom(2);
        System.out.println("Panjang sisi L1 setelah zoom(2): " + L1.getJari());
        L2.zoom(2);
        System.out.println("Panjang sisi L2 setelah zoom(2): " + L2.getJari());
        System.out.println("L3.zoom(2) tidak bisa dijalankan karena Lingkaran yang implementasi IResize, bukan BangunDatar");
        System.out.println();

        // contoh implementasi printCounterBangunDatar
        System.out.println("----- printCounterBangunDatar -----");
        BangunDatar.printCounterBangunDatar();
        System.out.println();


    }
}
