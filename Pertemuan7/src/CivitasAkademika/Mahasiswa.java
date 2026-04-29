package CivitasAkademika;
/*
Nama File : Mahasiswa.java 
Deskripsi: atribut dan metode dari kelas Mahasiswa (anak dari kelas abstrak CivitasAkademika)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 28 April 2026
Lab: C1 
*/

public class Mahasiswa extends CivitasAkademika {
    /*********************ATRIBUT*********************/
    private String NIM;
    private Dosen DosenWali;
    private String Jurusan;
    private static int MhsCounter;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Mahasiswa(){
        super();
        NIM = "N/A";
        DosenWali = new Dosen();
        Jurusan = "N/A";
        MhsCounter++;
    }

    // konstruktor dengan parameter 
    public Mahasiswa(String Nama, String NIM, Dosen DosenWali, String Jurusan){
        super(Nama);
        this.NIM = NIM;
        this.DosenWali = DosenWali;
        this.Jurusan = Jurusan;
        MhsCounter++;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut NIM
    public String getNIM(){
        return NIM;
    }

    // mengembalikan nilai atribut DosenWali
    public Dosen getDosenWali(){
        return DosenWali;
    }
    
    // mengembalikan nilai atribut Jurusan
    public String getJurusan(){
        return Jurusan;
    }

    // mengembalikan nilai atribut MhsCounter (static)
    public static int getMhsCounter(){
        return MhsCounter;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut NIM
    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    // mengubah nilai atribut DosenWali
    public void setWali(Dosen DosenWali){
        this.DosenWali = DosenWali;
    }

    // mengubah nilai atribut Jurusan
    public void setJurusan(String Jurusan){
        this.Jurusan = Jurusan;
    }
    
    /*------------------LAINNYA-------------------*/
    // print nilai atribut-atribut (non-static) 
    public void printInfo(){
        System.out.println("--- Info Mahasiswa ---");
        super.printInfo();
        System.out.println("NIM     : " + NIM);
        System.out.println("Jurusan : " + Jurusan);
        System.out.println("--- Info Dosen Wali");
        System.out.println("Nama    :" + DosenWali.getNama());
        System.out.println("NIP     : " + DosenWali.getNIP());
    }

    // print nilai atribut MhsCounter (static)
    public static void printMhsCounter(){
        System.out.println("Banyak Mahasiswa  : " + MhsCounter);
    }

    // fungsi untuk mengembalikan nomor
    public String getNomor(){
        return this.NIM;
    }

    // menampilkan data NIM, Nama Mahasiswa, dan Nama Dosenwali
    public void tampilDataMahasiswa(){
        System.out.println("--- Data Mahasiswa ---");
        System.out.println("NIM Mahasiswa    : " + NIM);
        System.out.println("Nama Mahasiswa   : " + this.getNama());
        System.out.println("Nama Dosen Wali  : " + DosenWali.getNama());
    }

    // end of class Mahasiswa
}
