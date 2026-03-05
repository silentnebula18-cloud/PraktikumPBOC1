/*Nama File : Kendaraan.java */
/*Deskripsi: berisi atribut dan methods dalam class Kendaraan */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 05 Maret 2026 */

public class Kendaraan {
    /*********************ATRIBUT*********************/
    private String noPlat;
    private String jenis;

    /*********************METHOD*********************/
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
