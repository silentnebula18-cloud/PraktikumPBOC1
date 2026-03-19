/*Nama File : BangunDatar.java */
/*Deskripsi: berisi atribut dan methods dalam class BangunDatar */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 12 Maret 2026*/
/*Lab: C1 */

public class BangunDatar {
    /*********************ATRIBUT*********************/
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public BangunDatar(){
        counterBangunDatar++;

    }

    // konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut jmlSisi
    public int getJmlSisi(){
        return jmlSisi;
    }

    // mengembalikan nilai atribut warna
    public String getWarna(){
        return warna;
    }

    // mengembalikan nilai atribut border
    public String getBorder(){
        return border;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut jmlSisi
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    // mengubah nilai atribut warna
    public void setWarna(String warna){
        this.warna = warna;
    }

    // mengubah nilai atribut border
    public void setBorder(String border){
        this.border = border;
    }
    
    /*------------------LAINNYA-------------------*/
    // print nilai atribut-atribut (non-static) BangunDatar
    public void printInfo(){
        System.err.println("Jumlah sisi: " + jmlSisi);
        System.err.println("Warna: " + warna);
        System.err.println("Border: " + border);
    }

    // print nilai atribut counterBangunDatar 
    public static void printCounterBangunDatar(){
        System.err.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    // end of class BangunDatar
}
