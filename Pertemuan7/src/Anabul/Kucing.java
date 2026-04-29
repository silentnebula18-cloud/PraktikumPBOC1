package Anabul;
/*
Nama File : Kucing.java 
Deskripsi: atribut dan metode dari kelas Kucing (anak dari kelas Anabul)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 27 April 2026
Lab: C1 
*/

public class Kucing extends Anabul {
    /*********************ATRIBUT*********************

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Kucing(){
        super();
    }

    // konstruktor dengan parameter
    public Kucing(String Nama){
        super(Nama);
    }

    /*------------------LAINNYA-------------------*/
    // mengembalikan cara gerak Kucing
    public String Gerak(){
        return "melata";
    }

    // mengembalikan suara milik Kucing
    public String Suara(){
        return "meong";
    }

    // end of class Kucing
}
