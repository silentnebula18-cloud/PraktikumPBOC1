/*Nama File : Dosen.java */
/*Deskripsi: berisi atribut dan methods dalam class Dosen */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 05 Maret 2026 */

public class Dosen {
    /*********************ATRIBUT*********************/
    private String nip;
    private String nama;
    private String prodi;

    /*********************METHOD*********************/
    public Dosen(){
        nip = "0";
        nama = "N/A";
        prodi = "empty";
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNIP(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }
    public String getProdi(){
        return this.prodi;
    }

    public void setNIP(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}
