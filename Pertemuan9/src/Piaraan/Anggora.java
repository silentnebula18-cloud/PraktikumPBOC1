package Piaraan;
/*
Nama File : Anggora.java 
Deskripsi: atribut dan metode dari kelas Anggora (anak dari kelas Kucing)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 13 Mei 2026
Lab: C1 
*/

public class Anggora extends Kucing{
    /*********************ATRIBUT*********************/
    private String warnaMata;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Anggora(){
        super();
        warnaMata = "N/A";
    }

    // konstruktor dengan parameter 
    public Anggora(String panggilan, double bobot, String warnaMata){
        super(panggilan, bobot);
        this.warnaMata = warnaMata;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut warnaMata
    public String getWarnaMata(){
        return warnaMata;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut warnaMata
    public void setWarnaMata(String warnaMata){
        this.warnaMata = warnaMata;
    }
    
    /*------------------LAINNYA-------------------*/
    // print informasi tentang Anggora
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Mata    : Warna " + warnaMata);
    }

    // end of class Anggora
}