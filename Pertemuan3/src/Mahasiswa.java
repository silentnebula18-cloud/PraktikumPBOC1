/*Nama File : Mahasiswa.java */
/*Deskripsi: berisi atribut dan methods dalam class Mahasiswa */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 05 Maret 2026 (Updated: 07-08 Maret 2026)*/
/*Lab: C1 */

import java.util.ArrayList;

public class Mahasiswa {
    /*********************ATRIBUT*********************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor Mahasiswa tanpa parameter
    public Mahasiswa(){
        this.nim = "N/A";
        this.nama = "N/A";
        this.prodi = "N/A";
        this.listMatKul = new ArrayList<>(50);
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // konstruktor Mahasiswa dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>(50);
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    /*------------------SELEKTOR-------------------*/
    // megembalikan nim dari Mahasiswa
    public String getNim(){
        return this.nim;
    }

    // megembalikan nama dari Mahasiswa
    public String getNama(){
        return this.nama;
    }

    // megembalikan prodi dari Mahasiswa
    public String getProdi(){
        return this.prodi;
    }

    // megembalikan array listMatkul dari Mahasiswa
    public ArrayList<MataKuliah> getListMatKul(){
        return this.listMatKul;
    }

    // megembalikan dosenWali dari Mahasiswa
    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    // megembalikan kendaraan dari Mahasiswa
    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah isi atribut nim dari Mahasiswa
    public void setNim(String nim){
        this.nim = nim;
    }

    // mengubah isi atribut nama dari Mahasiswa
    public void setNama(String nama){
        this.nama = nama;
    }

    // mengubah isi atribut prodi dari Mahasiswa
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    // mengubah isi atribut listMatKul dari Mahasiswa
    public void setListMatKul(ArrayList<MataKuliah> listMatKul){
        this.listMatKul = listMatKul;
    }

    // mengubah isi atribut DosenWali dari Mahasiswa
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali ;
    }

    // mengubah isi atribut Kendaraan dari Mahasiswa
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    /*------------------LAINNYA-------------------*/
    // menambahkan sebuah mata kuliah ke atribut listMatKul
    public void addMatKul(MataKuliah newMatKul){
        this.listMatKul.add(newMatKul);
    }

    // mendapatkan jumlah SKS mata kuliah yang diambil mahasiswa
    public int getJumlahSKS(){
        int jmlSKS = 0;

        for(int i = 0; i < this.listMatKul.size(); i++){
            jmlSKS += this.listMatKul.get(i).getSks();
        }

        return jmlSKS;
    }

    // mendapatkan jumlah mata kuliah yang diambil mahasiwa
    public int getJumlahMatKul(){
        return this.listMatKul.size();
    }

    // menampilkan nim, nama, dan prodi Mahasiswa
    public void printMhs(){
        System.err.println("Nama: " + this.nama);
        System.err.println("NIM: " + this.nim);
        System.err.println("Program Studi: " + this.prodi);
    }

    // menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, 
    // data dosen wali, dan data kendaraan Mahasiswa
    public void printDetailMhs(){
        System.err.println("---------------------------------------------");
        System.err.println("-------------- Data Mahasiswa --------------");
        printMhs();

        System.err.println("--------- Mata Kuliah yang diambil ---------");
        if(this.listMatKul.size() == 0){
            System.err.println("Tidak ada");
        }
        else{
            for(int i = 0; i < this.listMatKul.size(); i++){
                this.listMatKul.get(i).printMataKuliah();
                System.err.println("--------------------------------------------");
            }
        }

        System.err.println("-------------- Data Dosen Wali -------------");
        if(this.dosenWali.getNip() == "N/A" && this.dosenWali.getNip() == "N/A" && this.dosenWali.getProdi() == "N/A"){
            System.err.println("Tidak ada");
        }
        else{
            this.dosenWali.printDosen();
        }

        System.err.println("-------------- Data Kendaraan --------------");
        if(this.kendaraan.getNoPlat() == "N/A" && this.kendaraan.getJenis() == "N/A"){
            System.err.println("Tidak ada");
        }
        else{
            this.kendaraan.printKendaraan();
        }

        System.err.println("---------------------------------------------");
    }

    // end of class Mahasiswa
}
