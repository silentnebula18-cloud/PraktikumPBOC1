/*Nama File : MataKuliah.java */
/*Deskripsi: berisi atribut dan methods dalam class Mahasiswa */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 05 Maret 2026 */

public class MataKuliah {
    /*********************ATRIBUT*********************/
    private String idMatkul;
    private String NamaMatkul;
    private int sks;


    /*********************METHOD*********************/
    public MataKuliah(){
        this("", "", 0);
    }

    public MataKuliah(String idMatKul, String NamaMatkul, int sks){
        this.idMatkul = idMatKul;
        this.NamaMatkul = NamaMatkul;
        this.sks = sks;
    }

    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNamaMatkul(){
        return NamaMatkul;
    }

    public int getSKS(){
        return sks;
    }

    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNamaMatkul(String NamaMatkul){
        this.NamaMatkul = NamaMatkul;
    }

    public void setsks(int sks){
        this.sks = sks;
    }

    public void printMataKuliah(){
        System.err.println("Id Mata Kuliah: " + this.idMatkul);
        System.err.println("Nama MatKul: " + this.NamaMatkul);
        System.err.println("SKS: " + this.sks);
    }
}
