package Piaraan;
/*
Nama File : Burung.java 
Deskripsi: atribut dan metode dari kelas Burung (anak dari kelas Anabul)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 13 Mei 2026
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
    public Burung(String panggilan){
        super(panggilan);
    }

    /*------------------LAINNYA-------------------*/
    // mengembalikan cara gerak Burung
    @Override
    public String Gerak(){
        return "terbang";
    }

    // mengembalikan suara milik Burung
    @Override
    public String Suara(){
        return "cuit";
    }

    // end of class Burung
}
