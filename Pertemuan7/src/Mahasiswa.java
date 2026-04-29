/*
Nama File : Mahasiswa.java 
Deskripsi: atribut dan metode dari kelas Mahasiswa
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 26 April 2026 (Updater: 27 April 2026)
Lab: C1 
*/
public class Mahasiswa {
    /*********************ATRIBUT*********************/
    private String NIM;
    private String Nama;
    private String ProgramStudi;
    private static int MhsCounter;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Mahasiswa(){
        NIM = "-999";
        Nama = "n/a";
        ProgramStudi = "n/a";
        MhsCounter++;
    }

    // konstruktor dengan tiga parameter input
    public Mahasiswa(String NIM, String Nama, String ProgramStudi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
        MhsCounter++;
    }

    // konstruktor dengan input parameter objek Mahasiswa
    public Mahasiswa(Mahasiswa M){
        this.NIM = M.getNIM();
        this.Nama = M.getNama();
        this.ProgramStudi = M.getProgramStudi();
        MhsCounter++;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut NIM
    public String getNIM(){
        return NIM;
    }

    // mengembalikan nilai atribut Nama
    public String getNama(){
        return Nama;
    }

    // mengembalikan nilai atribut ProgramStudi
    public String getProgramStudi(){
        return ProgramStudi;
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

    // mengubah nilai atribut Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // mengubah nilai atribut ProgramStudi 
    // (varian ke-1: tanpa parameter) 
    public void setProgramStudi(){
        this.ProgramStudi = "Kosong";
    }
    // (varian ke-2: input dengan satu parameter string)
    public void setProgramStudi(String ProgramStudi){
        this.ProgramStudi = ProgramStudi;
    }
    // (varian ke-3: input dengan satu parameter objek Mahasiswa lain)
    public void setProgramStudi(Mahasiswa M){
        this.ProgramStudi = M.getProgramStudi();
    }

    /*------------------LAINNYA-------------------*/
    // print nilai atribut-atribut (non-static) 
    public void printInfoMhs(){
        System.out.println("NIM           : " + NIM);
        System.out.println("Nama          : " + Nama);
        System.out.println("Program Studi : " + ProgramStudi);
    }

    // print nilai atribut (static)
    public static void printMhsCounter(){
       System.out.println("Total Mahasiswa: " + Mahasiswa.getMhsCounter());
    }

    // end of class Mahasiswa
}
