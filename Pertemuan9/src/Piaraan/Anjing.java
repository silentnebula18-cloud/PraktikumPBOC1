package Piaraan;
/*
Nama File : Anjing.java 
Deskripsi: atribut dan metode dari kelas Anjing (anak dari kelas Anabul)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 13 Mei 2026
Lab: C1 
*/

public class Anjing extends Anabul {
    /*********************ATRIBUT*********************

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Anjing(){
        super();
    }

    // konstruktor dengan parameter
    public Anjing(String panggilan){
        super(panggilan);
    }

    /*------------------LAINNYA-------------------*/
    // mengembalikan cara gerak Anjing
    @Override
    public String Gerak(){
        return "melata";
    }

    // mengembalikan suara milik Anjing
    @Override
    public String Suara(){
        return "guk-guk";
    }

    // end of class Anjing
}
