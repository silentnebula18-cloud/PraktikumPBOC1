package CivitasAkademika;
/*
Nama File : CivitasAkademika.java 
Deskripsi: atribut dan metode dari kelas abstrak CivitasAkademika
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 27 April 2026 (Updated: 28 April 2026)
Lab: C1 
*/

public abstract class CivitasAkademika {
    /*********************ATRIBUT*********************/
    protected String Nama;
    protected static int CACounter;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public CivitasAkademika(){
        Nama = "N/A";
        CACounter++;
    }

    // konstruktor dengan parameter 
    public CivitasAkademika(String Nama){
        this.Nama = Nama;
        CACounter++;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut Nama
    public String getNama(){
        return Nama;
    }

    // mengembalikan nilai atribut CACounter (static)
    public static int getCACounter(){
        return CACounter;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    /*------------------LAINNYA-------------------*/
    // print nilai atribut-atribut (non-static) 
    public void printInfo(){
        System.out.println("Nama    : " + Nama);
    }

    // print nilai atribut CACounter (static)
    public static void printCACounter(){
        System.out.println("Banyak Civitas Akademika  : " + CACounter);
    }

    // fungsi abstrak untuk mengembalikan nomor
    public abstract String getNomor();

    // end of class CivitasAkademika
}
