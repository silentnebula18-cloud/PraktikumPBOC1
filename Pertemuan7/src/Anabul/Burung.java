package Anabul;
/*
Nama File : Burung.java 
Deskripsi: atribut dan metode dari kelas Burung (anak dari kelas Anabul)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 27 April 2026
Lab: C1 
*/

public class Burung extends Anabul {
    /*********************ATRIBUT*********************

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Burung(){
        super();
    }

    // konstruktor dengan parameter
    public Burung(String Nama){
        super(Nama);
    }

    /*------------------LAINNYA-------------------*/
    // mengembalikan cara gerak Burung
    public String Gerak(){
        return "terbang";
    }

    // mengembalikan suara milik Burung
    public String Suara(){
        return "cuit";
    }

    // end of class Burung
}
