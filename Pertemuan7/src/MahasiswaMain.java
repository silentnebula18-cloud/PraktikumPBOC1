/*
Nama File : Mahasiswa.java 
Deskripsi: Mengilustrasikan konsep polimorfisme Ad Hoc Overloading
           menggunakan kelas Mahasiswa
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 26 April 2026
Lab: C1 
*/

public class MahasiswaMain {
    public static void main(String[] args) {
        /****************** Implementasi Class Mahasiswa ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Mahasiswa ******************/");
        // Pembuatan Objek
        Mahasiswa M1 = new Mahasiswa();
        
        Mahasiswa M2 = new Mahasiswa("123", "Raye", "Marine Science");

        Mahasiswa M3 = new Mahasiswa(M2);

        // Implementasi Selektor
        System.out.println("/------------ Implementasi Selektor ------------/");
        System.out.println("Mahasiswa (NIM: " + M1.getNIM() + ") bernama " + M1.getNama());
        System.out.println("mengambil Program Studi " + M1.getProgramStudi() + ".");
        System.out.println();
        System.out.println("Mahasiswa (NIM: " + M2.getNIM() + ") bernama " + M2.getNama());
        System.out.println("mengambil Program Studi " + M2.getProgramStudi() + ".");
        System.out.println();
        System.out.println("Mahasiswa (NIM: " + M3.getNIM() + ") bernama " + M3.getNama());
        System.out.println("mengambil Program Studi " + M3.getProgramStudi() + ".");
        System.out.println();
        System.out.println("Total objek dari kelas Mahasiswa: " + Mahasiswa.getMhsCounter());
        System.out.println();

        // Implementasi Mutator (+printInfoMhs)
        System.out.println("/------------ Implementasi Mutator (+printInfoMhs) ------------/");
        
        System.out.println();
        System.out.println("----- Impelementasi pada M1 -----");
        System.out.println("------------ Sebelum ------------");
        M1.printInfoMhs();
        M1.setNIM("456");
        M1.setNama("Rami");
        M1.setProgramStudi(M2);
        System.out.println("------------ Setelah ------------");
        System.out.println("-- (setProgramStudi varian 3) --");
        M1.printInfoMhs();

        System.out.println();
        System.out.println("----- Impelementasi pada M2 -----");
        System.out.println("------------ Sebelum ------------");
        M2.printInfoMhs();
        M2.setNIM("789");
        M2.setNama("Anne");
        M2.setProgramStudi();
        System.out.println("------------ Setelah ------------");
        System.out.println("-- (setProgramStudi varian 1) --");
        M2.printInfoMhs();

        System.out.println();
        System.out.println("----- Impelementasi pada M3 -----");
        System.out.println("------------ Sebelum ------------");
        M3.printInfoMhs();
        M3.setNIM("891");
        M3.setNama("Josh");
        M3.setProgramStudi("Sejarah");
        System.out.println("------------ Setelah ------------");
        System.out.println("-- (setProgramStudi varian 2) --");
        M3.printInfoMhs();

        System.out.println();

        // Implementasi Metode Lainnya
        System.out.println("/------------ Implementasi Metode Lainnya ------------/");
        System.out.println("----- printMhsCounter() (static) -----");
        Mahasiswa.printMhsCounter();
        System.out.println();
    }

    // end of class MahasiswaMain
}
