package Piaraan;
/*
Nama File : mainPiaraan.java 
Deskripsi: aplikasi dari metode-metode yang ada di dalam kelas Piaraan.
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 13 Mei 2026
Lab: C1 
*/

public class mainPiaraan {
    public static void main(String[] args) {
        /****************** Aplikasi Class Piaraan ******************/
        System.out.println();
        System.out.println("/****************** Aplikasi Class Piaraan ******************/");
        // Pembuatan Objek
        Piaraan P = new Piaraan();
        System.out.println("*Membuat objek Piaraan P");

        System.out.println("*Membuat objek Piaraan P0");
        Piaraan P0 = new Piaraan();

        System.out.println();

        // i. Aplikasi getNbelm
        System.out.println("// i. Aplikasi getNbelm");
        System.out.println("Banyak elemen Lanabul P: " + P.getNbelm());
        System.out.println("Banyak elemen Lanabul P0: " + P0.getNbelm());

        System.out.println();

        // ii. Aplikasi enqueueAnabul
        System.out.println("// ii. Aplikasi enqueueAnabul");
        System.out.println("*Memasukan objek Anabul ke P.");
        Anabul in = new Anabul("Ahaha");
        P.enqueueAnabul(in);
        System.out.println("*Memasukan objek Anjing ke P.");
        P.enqueueAnabul(new Anjing("Bahaha"));
        System.out.println("*Memasukan objek Burung ke P.");
        P.enqueueAnabul(new Burung("Cupapi"));
        System.out.println("*Memasukan objek Kucing ke P.");
        P.enqueueAnabul(new Kucing("Dehehe", 4.5));
        System.out.println("*Memasukan objek Anggora ke P.");
        P.enqueueAnabul(new Anggora("Fehehe", 4.0, "biru"));
        System.out.println("*Memasukan objek KembangTelon ke P.");
        P.enqueueAnabul(new KembangTelon("Gehehe", 4.3, "Persia"));
        System.out.println("*Memasukan null ke P.");
        P.enqueueAnabul(null);
        System.out.println();

        // ix. Aplikasi showJenisAnabul
        System.out.println("// ix. Aplikasi showJenisAnabul");
        System.out.println("*showJenisAnabul pada objek P");
        P.showJenisAnabul();
        System.out.println("Banyak elemen: " + P.getNbelm());
        System.out.println();
        System.out.println("*showJenisAnabul pada objek P0");
        P0.showJenisAnabul();
        System.out.println("Banyak elemen: " + P0.getNbelm());

        System.out.println();

        // iii. Aplikasi isMember
        System.out.println("// iii. Aplikasi isMember");
        System.out.println("Apakah 'in' anggota Lanabul dari P? " + P.isMember(in));
        System.out.println("Apakah 'in' anggota Lanabul dari P0? " + P0.isMember(in));
        System.out.println("Apakah new Anabul(\"Ahaha\") anggota Lanabul dari P? " + P.isMember(new Anabul("Ahaha")));
        System.out.println("Apakah new Anabul(\"Ahaha\") anggota Lanabul dari P0? " + P0.isMember(new Anabul("Ahaha")));
        System.out.println("Apakah null anggota Lanabul dari P? " + P.isMember(null));
        System.out.println("Apakah null anggota Lanabul dari P0? " +  P0.isMember(null));

        System.out.println();

        // vi. Aplikasi showAnabul
        System.out.println("// vi. Aplikasi showAnabul");
        System.out.println("-- P.showAnabul()");
        P.showAnabul();
        System.out.println();
        System.out.println("-- P0.showAnabul()");
        P0.showAnabul();

        System.out.println();

        // iv. Aplikasi getAnabul
        System.out.println("// iv. Aplikasi getAnabul");
        System.out.println("Nama anabul pada urutan pertama (P): " + P.getAnabul().getNama());
        System.out.println("-- Cek Lanabul dari P");
        P.showAnabul();
        System.out.println();
        System.out.println("*Mencoba getAnabul pada P0");
        Anabul x = P0.getAnabul();
        System.out.println("-- Cek Lanabul dari P0");
        P0.showAnabul();

        System.out.println();

        // v. Aplikasi dequeueAnabul
        System.out.println("// v. Aplikasi dequeueAnabul");
        System.out.println("Nama anabul pada urutan pertama: " + P.dequeueAnabul().getNama());
        System.out.println("-- Cek Lanabul dari P");
        P.showAnabul();
        System.out.println();
        System.out.println("*Mencoba dequeueAnabul pada P0");
        Anabul y = P0.dequeueAnabul();
        System.out.println("-- Cek Lanabul dari P0");
        P0.showAnabul();

        System.out.println();

        // vii. Aplikasi countKucing
        System.out.println("// vii. Aplikasi countKucing");
        System.out.println("Banyak objek Kucing pada Lanabul (P): " + P.countKucing());
        System.out.println("Banyak objek Kucing pada Lanabul (P0): " + P0.countKucing());

        System.out.println();

        // viii. Aplikasi bobotKucing
        System.out.println("// viii. Aplikasi bobotKucing");
        System.out.println("Total bobot objek Kucing pada Lanabul (P): " + P.bobotKucing() + " kg");
        System.out.println("Total bobot objek Kucing pada Lanabul (P0): " + P0.bobotKucing() + " kg");
   
    }

    // end of class mainPiaraan
}
