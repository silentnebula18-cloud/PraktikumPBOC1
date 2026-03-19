/*Nama File : Dosen.java */
/*Deskripsi: berisi atribut dan methods dalam class Dosen*/
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 19 Maret 2026*/
/*Lab: C1 */

public class Dosen extends Pegawai{
    /*********************ATRIBUT*********************/
    protected String Fakultas;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
     public Dosen(){
        super();
        this.setJabatan("Dosen");
        this.Fakultas = "N/A";
    }

    // konstruktor dengan parameter 
    public Dosen(String NIP, String Nama, Date TglLahir, Date TMT, float GajiPokok, String Fakultas){
        super(NIP, Nama, TglLahir, TMT, "Dosen", GajiPokok);
        this.Fakultas = Fakultas;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut Fakultas
    public String getFakultas(){
        return this.Fakultas;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut Fakultas
    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }
    
    /*------------------LAINNYA-------------------*/
    // print nilai atribut-atribut (non-static) 
    @Override
    public void printInfo(){
        System.out.println("NIP               : " + this.NIP);
        System.out.println("Nama              : " + this.Nama);
        System.out.println("Tanggal Lahir     : " + this.TglLahir.getSDate());
        System.out.println("TMT               : " + this.TMT.getSDate());
        System.out.println("Jabatan           : " + this.Jabatan);
        System.out.println("Fakultas          : " + this.Fakultas);
        System.out.println("Gaji Pokok        : " + this.getSUang(this.GajiPokok));
    }

    // end of Class Dosen

}
