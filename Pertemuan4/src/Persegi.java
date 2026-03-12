/*Nama File : Persegi.java */
/*Deskripsi: berisi atribut dan methods dalam class Persegi */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 12 Maret 2026*/
/*Lab: C1 */

public class Persegi extends BangunDatar {
    /*********************ATRIBUT*********************/
    private double sisi;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi (double sisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    /*------------------SELEKTOR-------------------*/
    public double getSisi(){
        return sisi;
    }

    /*------------------MUTATOR-------------------*/
     public void setSisi(double sisi){
        this.sisi = sisi;
    }

    /*------------------LAINNYA-------------------*/
    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return sisi*4;
    }

    public double getDiagonal(){
        return sisi*Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.err.println("Sisi: " + sisi);
    }

    // end of class Persegi
}
