/*Nama File : Main.java */
/*Deskripsi: file main untuk menjalankan class Dosen, MataKuliah, Kendaraan, dan Mahasiswa*/
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 07 Maret 2026 (Updated: 08 Maret 2026)*/
/*Lab: C1 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        /****************** Implementasi Class Dosen ******************/
        System.err.println();
        System.err.println("/****************** Implementasi Class Dosen ******************/");
        // contoh implementasi konstruktor tanpa parameter
        Dosen D1 = new Dosen(); 
        // contoh implementasi konstruktor dengan parameter
        Dosen D2 = new Dosen("123", "Raiden Shogun", "Informatika");

        // contoh implementasi printDosen
        System.err.println();
        System.err.println("----- Contoh Implementasi printDosen  -----");
        System.err.println("----- Isi D1 Saat Ini  -----");
        D1.printDosen();
        System.err.println("----- Isi D2 Saat Ini  -----");
        D2.printDosen();
        System.err.println();

        // contoh implementasi selektor
        System.err.println("----- Contoh Implementasi Selektor (pada D2)  -----");
        System.err.println("NIP dari Pak/Bu Dosen " + D2.getNama() + " dari Program Studi " + D2.getProdi());
        System.err.println("adalah " + D2.getNip() + ".");
        System.err.println();

        // contoh implementasi mutator
        D1.setNip("456");
        D1.setNama("Anya Forger");
        D1.setProdi("Kriminologi");
        System.err.println("----- Contoh Implementasi Mutator (pada D1) -----");
        D1.printDosen();
        System.err.println();

        
        /****************** Implementasi Class MataKuliah******************/
        System.err.println();
        System.err.println("/**************** Implementasi Class MataKuliah ***************/");
        // contoh implementasi konstruktor tanpa parameter
        MataKuliah MK1 = new MataKuliah();

        // contoh implementasi konstruktor dengan parameter
        MataKuliah MK2 = new MataKuliah("MK052", "Hukum Pidana", 3);

        // contoh implementasi printMataKuliah
        System.err.println();
        System.err.println("----- Contoh Implementasi printMataKuliah  -----");
        System.err.println("----- Isi MK1 Saat Ini  -----");
        MK1.printMataKuliah();
        System.err.println("----- Isi MK2 Saat Ini  -----");
        MK2.printMataKuliah();
        System.err.println();

        // contoh implementasi selektor
        System.err.println("----- Contoh Implementasi Selektor (pada MK2)  -----");
        System.err.println("Nama Mata Kuliah dengan idMatKul " + MK2.getIdMatKul() + " adalah " + MK2.getNama());
        System.err.println("dengan SKS sebanyak " + MK2.getSks() +".");
        System.err.println();

        // contoh implementasi mutator
        MK1.setIdMatKul("MK301");
        MK1.setNama("Struktur Data");
        MK1.setSks(4);
        System.err.println("----- Contoh Implementasi Mutator (pada MK1) -----");
        MK1.printMataKuliah();
        System.err.println();

        /****************** Implementasi Class Kendaraan******************/
        System.err.println();
        System.err.println("/**************** Implementasi Class Kendaraan****************/");
        // contoh implementasi konstruktor tanpa parameter
        Kendaraan KD1 = new Kendaraan();

        // contoh implementasi konstruktor dengan parameter
        Kendaraan KD2 = new Kendaraan("HB9K2RH", "motor");

        // contoh implementasi printMataKuliah
        System.err.println();
        System.err.println("----- Contoh Implementasi printKendaraan  -----");
        System.err.println("----- Isi KD1 Saat Ini  -----");
        KD1.printKendaraan();
        System.err.println("----- Isi KD2 Saat Ini  -----");
        KD2.printKendaraan();
        System.err.println();

        // contoh implementasi selektor
        System.err.println("----- Contoh Implementasi Selektor (pada KD2)  -----");
        System.err.println("Kendaraan dengan nomor plat " + KD2.getNoPlat() + " berjenis " + KD2.getJenis() + ".");
        System.err.println();

        // contoh implementasi mutator
        KD1.setNoPlat("H1234AB");
        KD1.setJenis("mobil");
        System.err.println("----- Contoh Implementasi Mutator (pada KD1)  -----");
        KD1.printKendaraan();
        System.err.println();

        /****************** Implementasi Class Mahasiswa******************/
        System.err.println();
        System.err.println("/**************** Implementasi Class Mahasiswa****************/");
        // contoh implementasi konstruktor tanpa parameter
        Mahasiswa M1 = new Mahasiswa();

        // contoh implementasi konstruktor dengan parameter
        Mahasiswa M2 = new Mahasiswa("1234", "Frieren Sipenasaran", "Kriminologi");

        // contoh implementasi printMhs
        System.err.println();
        System.err.println("------------- Contoh Implementasi printMhs -------------");
        System.err.println("----- Isi M1 (Nama, NIM, dan Prodi) Saat Ini  -----");
        M1.printMhs();
        System.err.println("----- Isi M2 (Nama, NIM, dan Prodi) Saat Ini  -----");
        M2.printMhs();
        System.err.println();

        // contoh implementasi printDetailMhs
        System.err.println("--------- Contoh Implementasi printDetailMhs  ----------");
        System.err.println("----- Isi M1 (Semua Atribut) Saat Ini  -----");
        M1.printDetailMhs();
        System.err.println();
        System.err.println("----- Isi M2 (Semua Atribut) Saat Ini  -----");
        M2.printDetailMhs();
        System.err.println();
        
        // contoh implementasi selektor
        System.err.println("------- Contoh Implementasi Selektor (pada M2)  -------");
        System.err.println("Hasil M2.getNama: " + M2.getNama());
        System.err.println("Hasil M2.getNim: " + M2.getNim());
        System.err.println("Hasil M2.getProdi: " + M2.getProdi());
        System.err.println();
        ArrayList<MataKuliah> temp;
        System.err.println("Hasil M2.getListMatKul: ");
        temp = M2.getListMatKul();
        if(temp.size() == 0){
            System.err.println("ListMatKul dari M2 kosong");
        }
        else{
            for(int i = 0; i < M2.getListMatKul().size(); i++){
                M2.getListMatKul().get(i).printMataKuliah();
                System.err.println("--------------------------------------------");
            }
        }
        System.err.println();
        System.err.println("Hasil M2.getDosenWali: ");
        M2.getDosenWali().printDosen();
        System.err.println();
        System.err.println("Hasil dari M2.getKendaraan: ");
        M2.getKendaraan().printKendaraan();
        System.err.println();

        // contoh implementasi mutator
        System.err.println("------- Contoh Implementasi Mutator (pada M1)  -------");
        M1.setNama("Kang Si Yeol");
        M1.setNim("5678");
        M1.setProdi("Informatika");
        ArrayList<MataKuliah> temp2 = new ArrayList<>();
        temp2.add(MK1);
        M1.setListMatKul(temp2);
        M1.setDosenWali(D2);
        M1.setKendaraan(KD1);
        M1.printDetailMhs();
        System.err.println();

        // contoh implementasi addMatKul
        System.err.println("----------- Contoh Implementasi addMatKul  -----------");
        MataKuliah MK3 = new MataKuliah("MK391", "Statistika", 2);
        MataKuliah MK5 = new MataKuliah("MK284", "Metode Numerik", 3);
        MataKuliah MK4 = new MataKuliah("MK095", "Pengantar Kriminologi", 3);

        M1.addMatKul(MK3);
        M1.addMatKul(MK5);
        M2.addMatKul(MK2);
        M2.addMatKul(MK4);

        System.err.println("---- Hasil M1.addMatKul(MK3) dan M1.addMatKul(MK5) ----");
        M1.printDetailMhs();
        System.err.println();
        System.err.println("---- Hasil M2.addMatKul(MK2) && M2.addMatKul(MK4) ----");
        System.err.println("---- dan M2.setDosenWali(D1) && M2.setKendaraan(KD2) ----");
        System.err.println("nb: biar ga kosong :) hehe");
        M2.setDosenWali(D1);
        M2.setKendaraan(KD2);
        M2.printDetailMhs();
        System.err.println();

        // contoh implementasi getJumlahSKS
        System.err.println("--------- Contoh Implementasi getJumlahSKS  ----------");
        System.err.println("Jumlah SKS yang diambil oleh " + M1.getNama() + " adalah " + M1.getJumlahSKS());
        System.err.println("Jumlah SKS yang diambil oleh " + M2.getNama() + " adalah " + M2.getJumlahSKS());
        System.err.println();

        // contoh implementasi getJumlahMatKul
        System.err.println("--------- Contoh Implementasi getJumlahMatKul  ----------");
        System.err.println("Banyak Mata Kuliah yang diambil oleh " + M1.getNama() + " adalah " + M1.getJumlahMatKul());
        System.err.println("Banyak Mata Kuliah yang diambil oleh " + M2.getNama() + " adalah " + M2.getJumlahMatKul());
        System.err.println();

        System.err.println("/*************************************************************/");

    }
}
