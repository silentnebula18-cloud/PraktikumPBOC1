/*Nama File : Lingkaran.java */
/*Deskripsi: berisi atribut dan methods dalam class Lingkaran */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 12 Maret 2026*/
/*Lab: C1 */

public class Lingkaran extends BangunDatar {
    /*********************ATRIBUT*********************/
    private double jari;


    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double jari, String warna, String border){
        setJmlSisi(1);
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
    }

    /*------------------SELEKTOR-------------------*/
    public double getJari(){
        return jari;
    }

    /*------------------MUTATOR-------------------*/
    public void setJari(double jari){
        this.jari = jari;
    }

    /*------------------LAINNYA-------------------*/
    public double getLuas(){
        return Math.PI * jari *jari;
    }

    public double getKeliling(){
        return Math.PI * 2 * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.err.println("Jari-jari: " + jari);
    }

    // end of class Lingkaran   
}
