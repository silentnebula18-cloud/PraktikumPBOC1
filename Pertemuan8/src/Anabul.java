/*
Nama File : Anabul.java 
Deskripsi: atribut dan metode dari kelas Anabul
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 30 April 2026 (Updated: 06 Mei 2026)
Lab: C1 
*/
public class Anabul {
    /*********************ATRIBUT*********************/
    protected String Nama;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Anabul(){
        Nama = "N/A";
    }

    // konstruktor dengan parameter
    public Anabul(String Nama){
        this.Nama = Nama;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut Nama
    public String getNama(){
        return Nama;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    /*------------------LAINNYA-------------------*/
    // mengembalikan cara gerak Anabul
    public String Gerak(){
        return "Bergerak";
    }

    // mengembalikan suara milik Anabul
    public String Suara(){
        return "Bersuara";
    }

    // print informasi mengenai Anabul
    public void printInfo(){
        System.out.println("Nama    : " + Nama);
        System.out.println("Gerak   : " + Gerak());
        System.out.println("Suara   : " + Suara());
    }

    // end of class Anabul
}
