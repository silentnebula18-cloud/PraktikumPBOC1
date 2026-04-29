package Anabul;
/*
Nama File : AnabulMain.java 
Deskripsi: Mengilustrasikan konsep polimorfisme Universal Inclusion
           menggunakan kelas Anabul serta kelas anaknya (Kucing, Anjing, Burung)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 27 April 2026 (Updated: 28 April 2026)
Lab: C1 
*/

public class AnabulMain {
    public static void main(String[] args) {
        /****************** Implementasi Class Anabul ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Anabul ******************/");
        // Pembuatan Objek
        Anabul A1 = new Anabul();
        Anabul A2 = new Anabul("Toni");

        // Implementasi Selektor
        System.out.println("/------------ Implementasi Selektor ------------/");
        System.out.println("Anabul ini bernama " + A1.getNama() + ".");
        System.out.println("Anabul ini bernama " + A2.getNama() + ".");
        System.out.println();

        // Implementasi Mutator
        System.out.println("/------------ Implementasi Mutator ------------/");
        System.out.println("Nama A1 sebelum: " + A1.getNama());
        A1.setNama("Bro");
        System.out.println("Nama A1 setelah: " + A1.getNama());
        System.out.println("Nama A2 sebelum: " + A2.getNama());
        A2.setNama("Bruh");
        System.out.println("Nama A2 setelah: " + A2.getNama());
        System.out.println();

        // Implementasi Metode Lainnya
        System.out.println("/------------ Implementasi Metode Lainnya ------------/");
        System.out.println("Anabul ini bergerak dengan cara "+ A1.Gerak() + " dan bersuara '" + A1.Suara() + "'.");
        System.out.println("Anabul ini bergerak dengan cara "+ A2.Gerak() + " dan bersuara '" + A2.Suara() + "'.");
        System.out.println();
        System.out.println("--- Informasi Anabul A1 ---");
        A1.printInfo();
        System.out.println();
        System.out.println("--- Informasi Anabul A2 ---");
        A2.printInfo();
        System.out.println();

        /****************** Implementasi Class Kucing ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Kucing ******************/");
        // Pembuatan Objek
        Anabul K1 = new Kucing();
        Kucing K2 = new Kucing("KicauMania");

        // Implementasi Selektor
        System.out.println("/------------ Implementasi Selektor ------------/");
        System.out.println("Kucing ini bernama " + K1.getNama() + ".");
        System.out.println("Kucing ini bernama " + K2.getNama() + ".");
        System.out.println();

        // Implementasi Mutator
        System.out.println("/------------ Implementasi Mutator ------------/");
        System.out.println("Nama K1 sebelum: " + K1.getNama());
        K1.setNama("Sis");
        System.out.println("Nama K1 setelah: " + K1.getNama());
        System.out.println("Nama K2 sebelum: " + K2.getNama());
        K2.setNama("Sista");
        System.out.println("Nama K2 setelah: " + K2.getNama());
        System.out.println();

        // Implementasi Metode Lainnya
        System.out.println("/------------ Implementasi Metode Lainnya ------------/");
        System.out.println("Kucing ini bergerak dengan cara "+ K1.Gerak() + " dan bersuara '" + K1.Suara() + "'.");
        System.out.println("Kucing ini bergerak dengan cara "+ K2.Gerak() + " dan bersuara '" + K2.Suara() + "'.");
        System.out.println();
        System.out.println("--- Informasi Kucing K1 ---");
        K1.printInfo();
        System.out.println();
        System.out.println("--- Informasi Kucing K2 ---");
        K2.printInfo();
        System.out.println();

        /****************** Implementasi Class Anjing ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Anjing ******************/");
        // Pembuatan Objek
        Anabul J1 = new Anjing();
        Anjing J2 = new Anjing("Hehe");

        // Implementasi Selektor
        System.out.println("/------------ Implementasi Selektor ------------/");
        System.out.println("Anjing ini bernama " + J1.getNama() + ".");
        System.out.println("Anjing ini bernama " + J2.getNama() + ".");
        System.out.println();

        // Implementasi Mutator
        System.out.println("/------------ Implementasi Mutator ------------/");
        System.out.println("Nama J1 sebelum: " + J1.getNama());
        J1.setNama("Uwau");
        System.out.println("Nama J1 setelah: " + J1.getNama());
        System.out.println("Nama J2 sebelum: " + J2.getNama());
        J2.setNama("Skrrt");
        System.out.println("Nama J2 setelah: " + J2.getNama());
        System.out.println();

        // Implementasi Metode Lainnya
        System.out.println("/------------ Implementasi Metode Lainnya ------------/");
        System.out.println("Anjing ini bergerak dengan cara "+ J1.Gerak() + " dan bersuara '" + J1.Suara() + "'.");
        System.out.println("Anjing ini bergerak dengan cara "+ J2.Gerak() + " dan bersuara '" + J2.Suara() + "'.");
        System.out.println();
        System.out.println("--- Informasi Anjing J1 ---");
        J1.printInfo();
        System.out.println();
        System.out.println("--- Informasi Anjing J2 ---");
        J2.printInfo();
        System.out.println();

        /****************** Implementasi Class Burung ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Burung ******************/");
        // Pembuatan Objek
        Anabul B1 = new Burung();
        Burung B2 = new Burung("KicauMania");

        // Implementasi Selektor
        System.out.println("/------------ Implementasi Selektor ------------/");
        System.out.println("Burung ini bernama " + B1.getNama() + ".");
        System.out.println("Burung ini bernama " + B2.getNama() + ".");
        System.out.println();

        // Implementasi Mutator
        System.out.println("/------------ Implementasi Mutator ------------/");
        System.out.println("Nama B1 sebelum: " + B1.getNama());
        B1.setNama("Ayyo");
        System.out.println("Nama B1 setelah: " + B1.getNama());
        System.out.println("Nama B2 sebelum: " + B2.getNama());
        B2.setNama("Yeah");
        System.out.println("Nama B2 setelah: " + B2.getNama());
        System.out.println();

        // Implementasi Metode Lainnya
        System.out.println("/------------ Implementasi Metode Lainnya ------------/");
        System.out.println("Burung ini bergerak dengan cara "+ B1.Gerak() + " dan bersuara '" + B1.Suara() + "'.");
        System.out.println("Burung ini bergerak dengan cara "+ B2.Gerak() + " dan bersuara '" + B2.Suara() + "'.");
        System.out.println();
        System.out.println("--- Informasi Burung B1 ---");
        B1.printInfo();
        System.out.println();
        System.out.println("--- Informasi Burung B2 ---");
        B2.printInfo();
        System.out.println();

    }

    // end of class AnabulMain
}
