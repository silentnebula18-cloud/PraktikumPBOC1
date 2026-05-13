package Piaraan;
/*
Nama File : Kucing.java 
Deskripsi: atribut dan metode dari kelas Kucing (anak dari kelas Anabul)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 13 Mei 2026
Lab: C1 
*/

public class Kucing extends Anabul {
    /*********************ATRIBUT*********************/
    protected double bobot;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Kucing(){
        super();
        bobot = 0.0;
    }

    // konstruktor dengan parameter
    public Kucing(String panggilan, double bobot){
        super(panggilan);
        this.bobot = bobot;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut bobot
    public double getBobot(){
        return bobot;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut bobot
    public void setBobot(double bobot){
        this.bobot = bobot;
    }

    /*------------------LAINNYA-------------------*/
    // mengembalikan cara gerak Kucing
    @Override
    public String Gerak(){
        return "melata";
    }

    // mengembalikan suara milik Kucing
    @Override
    public String Suara(){
        return "meong";
    }

    // print informasi tentang Kucing
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Bobot   : " + bobot + " kg");
    }

    // end of class Kucing
}
