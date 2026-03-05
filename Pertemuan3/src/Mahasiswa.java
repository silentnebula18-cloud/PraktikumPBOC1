/*Nama File : Mahasiswa.java */
/*Deskripsi: berisi atribut dan methods dalam class Mahasiswa */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 05 Maret 2026 */

import java.util.ArrayList;

public class Mahasiswa {
    /*********************ATRIBUT*********************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*********************METHOD*********************/
    public Mahasiswa(){
        this.nim = "0";
        this.nama = "N/A";
        this.prodi = "empty";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public String getNIM(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public ArrayList<MataKuliah> getListMatkul(){
        return this.listMatkul;
    }

    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    public void setNIM(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setListMatkul(ArrayList<MataKuliah> listMatkul){
        this.listMatkul = listMatkul;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali ;
    }

    public void set(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah newMataKuliah){
        listMatkul.add(newMataKuliah);
    }

    public int getJumlahSKS(){
        int jmlSKS = 0;
        for(int i = 0; i < this.listMatkul.size(); i++){
            jmlSKS = this.listMatkul.get(i).getSKS();
        }

        return jmlSKS;
    }

    public void printMahasiswa(){
        System.err.println("Nama: " + this.nama);
        System.err.println("NIM" + this.nim);
        System.err.println("Prodi: " + this.prodi);
    }

    // public void printDetailMhs(){
    //     printMahasiswa();
    //     System.err.println("Mata Kuliah yang diambil: ");
    //     for(int i = 0; i < this.listMatkul.size(); i++){

    //     }
    // }

}
