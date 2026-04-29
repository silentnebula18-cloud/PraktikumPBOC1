package CivitasAkademika;
/*
Nama File : CivAkademikaMain.java 
Deskripsi: Mengilustrasikan konsep polimorfisme Universal Inclusion
           menggunakan kelas Seminar dan CivitasAkademika(kelas anak: Dosen dan Mahasiswa)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 28 April 2026 (Updated: 29 April 2026)
Lab: C1 
*/

public class CivAkademikaMain {
    public static void main(String[] args) {
        /****************** Implementasi Class Seminar ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Seminar ******************/");
        // Pembuatan Objek
        // Objek Dosen
        Dosen D1 = new Dosen("Lucy Gray", "Ekonomi", "1012");
        Dosen D2 = new Dosen("Coriolanus", "Seni Pertunjukan", "1034");

        // Objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("Katniss", "2012", D1, "Manajemen");
        Mahasiswa M2 = new Mahasiswa("Peeta", "2043", D1, "Manajemen");
        Mahasiswa M3 = new Mahasiswa("Primrose", "2054", D2, "Tari");
        Mahasiswa M4 = new Mahasiswa("Haymitch", "2065", D2, "Musik");
        Mahasiswa M5 = new Mahasiswa("Effie", "2094", D2, "Teater");

        // List Statis
        CivitasAkademika[] PS1 = new CivitasAkademika[2];
        CivitasAkademika[] PS2 = new CivitasAkademika[3];
        CivitasAkademika[] PS3 = new CivitasAkademika[3];

        PS1[0] = D1; PS1[1] = M1;
        PS2[0] = D2; PS2[1] = M3; PS2[2] = M4;  
        PS3[0] = D2; PS3[1] = M3; PS3[2] = M2;

        // Objek Seminar
        Seminar SM1 = new Seminar();
        Seminar SM2 = null;
        try{
            SM2 = new Seminar("Eksplorasi Kreativitas Digital dalam Seni Kontemporer", 
                              PS3, 3);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        // Implementasi Selektor
        System.out.println("/------------ Implementasi Selektor ------------/");
        System.out.println("Seminar '" + SM1.getJudul() + "' diikuti " + SM1.getBanyakPeserta() + " peserta.");
        System.out.println("Berikut nama-nama peserta seminar tersebut: ");
        for(int i=0; i < SM1.getBanyakPeserta(); i++){
            System.out.println("- " + SM1.getPesertas()[i].getNama());
        }
        System.out.println();

        System.out.println("Seminar '" + SM2.getJudul() + "' diikuti " + SM2.getBanyakPeserta() + " peserta.");
        System.out.println("Berikut nama-nama peserta seminar tersebut: ");
        for(int i=0; i < SM2.getBanyakPeserta(); i++){
            System.out.println("- " + SM2.getPesertas()[i].getNama());
        }
        System.out.println();

        // Implementasi Mutator dan printInfo
        System.out.println("/------------ Implementasi Mutator dan printInfo ------------/");
        System.out.println("--- Implementasi pada objek Seminar SM1 ---");
        System.out.println("--- Sebelum ---");
        SM1.printInfo();
        SM1.setJudul("Strategi Ekonomi Digital di Era Globalisasi");
        SM1.setPesertas(PS1);
        try{
            SM1.setBanyakPeserta(2);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("--- Setelah ---");
        SM1.printInfo();
        System.out.println();

        System.out.println("--- Implementasi pada objek Seminar SM2 ---");
        System.out.println("--- Sebelum ---");
        SM2.printInfo();
        SM2.setJudul("Inovasi Seni Pertunjukan di Era Digital");
        SM2.setPesertas(PS2);
        try{
            SM2.setBanyakPeserta(3);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("--- Setelah ---");
        SM2.printInfo();
        System.out.println();

        // Implementasi Metode Lainnya
        System.out.println("/------------ Implementasi Metode Lainnya ------------/");
        System.out.println();
        System.out.println("// countPeserta()");
        System.out.println("Banyak Peserta Seminar SM1: " + SM1.countPeserta());
        System.out.println("Banyak Peserta Seminar SM2: " + SM2.countPeserta());
        
        System.out.println();
        System.out.println("// registrasi(CivitasAkademika P)");
        System.out.println("Registrasi Mahasiswa M2 ke Seminar SM1");
        SM1.registrasi(M2);
        System.out.println("--- Hasil setelah registrasi");
        SM1.printInfo();
        System.out.println("-----------------------------------------------");
        System.out.println("Registrasi Mahasiswa M5 ke Seminar SM2");
        SM2.registrasi(M5);
        System.out.println("--- Hasil setelah registrasi");
        SM2.printInfo();

        System.out.println();
        System.out.println("// tampilPeserta()");
        System.out.println("-- SM1");
        SM1.tampilPeserta();
        System.out.println();
        System.out.println("-- SM2");
        SM2.tampilPeserta();

        System.out.println();
        System.out.println("// countMahasiswa()");
        System.out.println("Terdapat " + SM1.countMahasiswa() + " mahasiswa yang mengikuti seminar SM1");
        System.out.println("Terdapat " + SM2.countMahasiswa() + " mahasiswa yang mengikuti seminar SM2");
        System.out.println();

        /****************** Implementasi Class Dosen (anak dari CivitasAkademika) ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Dosen (anak dari CivitasAkademika) ******************/");
        // Pembuatan Objek
        CivitasAkademika CAD1 = new Dosen();
        Dosen DD2 = new Dosen("Sari", "Teknik", "1099");

        // Implementasi Selektor
        System.out.println("/------------ Implementasi Selektor ------------/");
        System.out.println("Civitas Akademika bernama " + CAD1.getNama() + " memiliki jabatan sebagai Dosen");
        System.out.println("Civitas Akademika bernama " + DD2.getNama() + " memiliki jabatan sebagai Dosen.");
        System.out.println("Ia mengajar di Fakultas " + DD2.getFalkutas() + ". NIP: " + DD2.getNIP());
        
        System.out.println();
        System.out.println("Banyak Civitas Akademika saat ini: " + CivitasAkademika.getCACounter());
        System.out.println("Keterangan: 7 dibuat di bagian Implementasi Seminar dan");
        System.out.println("2 di bagian Implementasi Class Dosen (anak dari CivitasAkademika)");
        System.out.println();
        System.out.println("Banyak Dosen saat ini: " + Dosen.getDosenCounter());
        System.out.println("Keterangan: 2 dibuat di bagian Implementasi Seminar dan");
        System.out.println("2 di bagian Implementasi Class Dosen (anak dari CivitasAkademika)");
        System.out.println();

        // Implementasi Mutator dan printInfo() (dari kelas CivitasAkademika dan Dosen)
        System.out.println("/------------ Implementasi Mutator dan printInfo() (dari kelas CivitasAkademika dan Dosen) ------------/");
        System.out.println("--- Implementasi pada objek Dosen CAD1 ---");
        System.out.println("--- Sebelum ---");
        CAD1.printInfo();
        CAD1.setNama("GaSukaSayur");
        System.out.println("--- Setelah ---");
        CAD1.printInfo();
        System.out.println();

        System.out.println("--- Implementasi pada objek Dosen DD2 ---");
        System.out.println("--- Sebelum ---");
        DD2.printInfo();
        DD2.setNama("PengenAyamGeprek");
        DD2.setNIP("5000");
        DD2.setFakultas("Seni");
        System.out.println("--- Setelah ---");
        DD2.printInfo();
        System.out.println();

        // Implementasi Metode Lainnya
        System.out.println("/------------ Implementasi Metode Lainnya ------------/");
        System.out.println();
        System.out.println("// printCACounter()");
        CivitasAkademika.printCACounter();
        Dosen.printCACounter();

        System.out.println();
        System.out.println("// printDosenCounter()");
        Dosen.printDosenCounter();

        System.out.println();
        System.out.println("// getNomor()");
        System.out.println("Nomor CAD1: " + CAD1.getNomor());
        System.out.println("Nomor DD2: " + DD2.getNomor());

        System.out.println();

         /****************** Implementasi Class Mahasiswa (anak dari CivitasAkademika) ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Mahasiswa (anak dari CivitasAkademika) ******************/");
        // Pembuatan Objek
        CivitasAkademika CAM1 = new Mahasiswa();
        Mahasiswa MM2 = new Mahasiswa("Yunjin", "5123", D2, "Teater");

        // Implementasi Selektor
        System.out.println("Civitas Akademika bernama " + CAM1.getNama() + " adalah seorang mahasiswa.");
        System.out.println("Civitas Akademika bernama " + MM2.getNama() + " adalah seorang mahasiswa.");
        System.out.println("Jurusannya adalah " + MM2.getJurusan() + " dan NIM-nya adalah " + MM2.getNIM() + ".");
        System.out.println("Dosen walinya bernama " + MM2.getDosenWali().getNama());

        System.out.println();
        System.out.println("Banyak Civitas Akademika saat ini: " + CivitasAkademika.getCACounter());
        System.out.println("Keterangan: 7 dibuat di bagian Implementasi Seminar,");
        System.out.println("2 di bagian Implementasi Class Dosen (anak dari CivitasAkademika),");
        System.out.println("2 di bagian Implementasi Class Mahasiswa (anak dari CivitasAkademika).");
        System.out.println();
        System.out.println("Banyak Mahasiswa saat ini: " + Mahasiswa.getMhsCounter());
        System.out.println("Keterangan: 5 dibuat di bagian Implementasi Seminar dan");
        System.out.println("2 di bagian Implementasi Class Mahasiswa (anak dari CivitasAkademika).");
        System.out.println();

        // Implementasi Mutator dan printInfo() (dari kelas CivitasAkademika dan Mahasiswa)
        System.out.println("/------------ Implementasi Mutator dan printInfo() (dari kelas CivitasAkademika dan Mahasiswa) ------------/");
        System.out.println("--- Implementasi pada objek Mahasiswa CAM1 ---");
        System.out.println("--- Sebelum ---");
        CAM1.printInfo();
        CAM1.setNama("ILoveMatcha");
        System.out.println("--- Setelah ---");
        CAM1.printInfo();
        System.out.println();

        System.out.println("--- Implementasi pada objek Mahasiswa MM2 ---");
        System.out.println("--- Sebelum ---");
        MM2.printInfo();
        MM2.setNama("MatchaLoveMe");
        MM2.setNIM("9090");
        MM2.setWali(DD2);
        MM2.setJurusan("Seni Berdebat");
        System.out.println("--- Setelah ---");
        MM2.printInfo();
        System.out.println();

        // Implementasi Metode Lainnya
        System.out.println("/------------ Implementasi Metode Lainnya ------------/");
        System.out.println();
        System.out.println("// printCACounter()");
        CivitasAkademika.printCACounter();
        Mahasiswa.printCACounter();

        System.out.println();
        System.out.println("// prinMhsCounter()");
        Mahasiswa.printMhsCounter();

        System.out.println();
        System.out.println("// getNomor()");
        System.out.println("Nomor CAM1: " + CAM1.getNomor());
        System.out.println("Nomor MM2: " + MM2.getNomor());

        System.out.println();
        System.out.println("// tampilDataMahasiswa()");
        MM2.tampilDataMahasiswa();

        System.out.println();
    }

    // end of class CivAkademikaMain
}
