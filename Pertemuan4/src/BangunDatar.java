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
    private static int counterBangunDatar = 0;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    public BangunDatar(){
        counterBangunDatar++;

    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /*------------------SELEKTOR-------------------*/
    public int getJmlSisi(){
        return jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public String getBorder(){
        return border;
    }

    /*------------------MUTATOR-------------------*/
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String border){
        this.border = border;
    }
    
    /*------------------LAINNYA-------------------*/
    public void printInfo(){
        System.err.println("Jumlah sisi: " + jmlSisi);
        System.err.println("Warna: " + warna);
        System.err.println("Border: " + border);
    }

    public static void printCounterBangunDatar(){
        System.err.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    // end of class BangunDatar
}
