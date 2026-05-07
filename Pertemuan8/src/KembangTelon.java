/*
Nama File : KembangTelon.java 
Deskripsi: atribut dan metode dari kelas KembangTelon (anak dari kelas Kucing)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 06 Mei 2026
Lab: C1 
*/

public class KembangTelon extends Kucing{
    /*********************ATRIBUT*********************/
    private String ras;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public KembangTelon(){
        super();
        ras = "N/A";
    }

    // konstruktor dengan parameter 
    public KembangTelon(String Nama, double bobot, String ras){
        super(Nama, bobot);
        this.ras = ras;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut ras
    public String getRas(){
        return ras;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut ras
    public void setRas(String ras){
        this.ras = ras;
    }
    
    /*------------------LAINNYA-------------------*/
    // print informasi tentang KembangTelon
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Ras     : " + ras);
    }

    // end of class KembangTelon
}