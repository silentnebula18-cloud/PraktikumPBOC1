package CivitasAkademika;
/*
Nama File : Dosen.java 
Deskripsi: atribut dan metode dari kelas Dosen (anak dari kelas abstrak CivitasAkademika)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 28 April 2026
Lab: C1 
*/

public class Dosen extends CivitasAkademika {
    /*********************ATRIBUT*********************/
    private String NIP;
    private String Fakultas;
    private static int DosenCounter;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Dosen(){
        super();
        NIP = "N/A";
        Fakultas = "N/A";
        DosenCounter++;
    }

    // konstruktor dengan parameter 
    public Dosen(String Nama, String Fakultas, String NIP){
        super(Nama);
        this.NIP = NIP;
        this.Fakultas = Fakultas;
        DosenCounter++;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut NIP
    public String getNIP(){
        return NIP;
    }

    // mengembalikan nilai atribut Fakultas
    public String getFalkutas(){
        return Fakultas;
    }

    // mengembalikan nilai atribut DosenCounter (static)
    public static int getDosenCounter(){
        return DosenCounter;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    // mengubah nilai atribut Fakultas
    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }
    
    /*------------------LAINNYA-------------------*/
    // print nilai atribut-atribut (non-static) 
    public void printInfo(){
        System.out.println("----- Info Dosen -----");
        super.printInfo();
        System.out.println("NIP     : " + NIP);
        System.out.println("Fakultas: " + Fakultas);
    }

    // print nilai atribut DosenCounter (static)
    public static void printDosenCounter(){
        System.out.println("Banyak Dosen  : " + DosenCounter);
    }

    // fungsi untuk mengembalikan nomor
    public String getNomor(){
        return this.NIP;
    }

    // end of class Dosen
}
