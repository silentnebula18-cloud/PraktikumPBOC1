package CivitasAkademika;
/*
Nama File : Seminar.java 
Deskripsi: atribut dan metode dari kelas Seminar
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 28 April 2026 (Updated: 29 April 2026)
Lab: C1 
*/

public class Seminar {
    /*********************ATRIBUT*********************/
    private String Judul;
    private CivitasAkademika[] Pesertas;
    private int BanyakPeserta;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Seminar(){
        Judul = "N/A";
        Pesertas = new CivitasAkademika[0];
        BanyakPeserta = 0;
    }

    // konstruktor dengan parameter 
    // throws? kalau lebih dari 100
    public Seminar(String Judul, CivitasAkademika[] Pesertas, int BanyakPeserta) throws Exception{
        if(BanyakPeserta <= 100){
            this.Judul = Judul;
            this.Pesertas = Pesertas;
            this.BanyakPeserta = BanyakPeserta;
        }
        else{
            throw new Exception("Gagal membuat objek. Banyak Peserta melebih kapasitas.");
        }
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut Judul
    public String getJudul(){
        return Judul;
    }

    // mengembalikan nilai atribut Pesertas
    public CivitasAkademika[] getPesertas(){
        return Pesertas;
    }

    // mengembalikan nilai atribut BanyakPeserta
    public int getBanyakPeserta(){
        return BanyakPeserta;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut Judul
    public void setJudul(String Judul){
        this.Judul = Judul;
    }

    // mengubah nilai atribut Pesertas
    public void setPesertas(CivitasAkademika[] Pesertas){
        this.Pesertas = Pesertas;
    }

    // mengubah nilai atribut BanyakPeserta
    public void setBanyakPeserta(int BanyakPeserta) throws Exception{
        if(BanyakPeserta <= 100){
            this.BanyakPeserta = BanyakPeserta;
        }
        else{
            throw new Exception("Gagal mengubah variabel. Banyak Peserta melebih kapasitas.");
        }
    }
    
    /*------------------LAINNYA-------------------*/
    // print nilai atribut-atribut (non-static) 
    public void printInfo(){
        System.out.println("----- Info Seminar -----");
        System.out.println("Judul          : " + Judul);
        System.out.println("Banyak Peserta : " +  BanyakPeserta);
        System.out.println("------- Peserta -------");
        for(int i = 0; i < BanyakPeserta; i++){
            Pesertas[i].printInfo();
            System.out.println("-----------------------");
        }
        System.out.println("------------------------");

    }

    // mengembalikan banyaknya peserta seminar
    public int countPeserta(){
        return BanyakPeserta;
    }

    // menambahkan seorang peserta ke sebuah seminar
    public void registrasi(CivitasAkademika P){
        if(BanyakPeserta >= 100){
            System.out.println("Notice: Registrasi batal karena seminar sudah penuh");
        }
        else{ // BanyakPeserta < 100
            BanyakPeserta = BanyakPeserta + 1;
            CivitasAkademika[] temp = new CivitasAkademika[BanyakPeserta];

            for(int i = 0; i < (BanyakPeserta-1); i++){
                temp[i] = Pesertas[i];
            }

            temp[(BanyakPeserta-1)] = P;
            Pesertas = temp;
            temp = null;
            System.out.println("Notice: Registrasi berhasil");
        }
    }

    // menampilkan daftar Nomor dan Nama semua peserta seminar
    public void tampilPeserta(){
        System.out.println("-- Daftar Nomor dan Nama Peserta Seminar --");
        for(int i = 0; i < BanyakPeserta; i++){
            System.out.println("Nomor   : " + Pesertas[i].getNomor());
            System.out.println("Nama    : " + Pesertas[i].getNama());
            System.out.println("----------------------");
        }
        System.out.println("-------------------------------------------");
    }

    // menghitung dan mengembalikan banyaknya peserta mahasiswa
    public int countMahasiswa(){
        int n = 0;
        for(int i = 0; i < BanyakPeserta; i++){
            if(Pesertas[i] instanceof Mahasiswa){
                n = n + 1;
            }
        }
        return n;
    }
    
    // end of class Seminar
}
