/*Nama File : Lingkaran.java */
/*Deskripsi: berisi atribut dan methods dalam class Lingkaran */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 26 Maret 2026 (Updated: 28 Maret 2026)*/
/*Lab: C1 */

public class Lingkaran extends BangunDatar implements IResize{
    /*********************ATRIBUT*********************/
    private double jari;


    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Lingkaran(){
        setJmlSisi(1);
    }

    // konstruktor dengan parameter
    public Lingkaran(double jari, String warna, String border){
        this.jari = jari;
        setJmlSisi(1);
        setWarna(warna);
        setBorder(border);
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut jari
    public double getJari(){
        return jari;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut jari
    public void setJari(double jari){
        this.jari = jari;
    }

    /*------------------LAINNYA-------------------*/
    // mengembalikan luas Lingkaran
    public double getLuas(){
        return Math.PI * jari *jari;
    }

    // mengembalikan keliling Lingkaran
    public double getKeliling(){
        return Math.PI * 2 * jari;
    }

    // print atribut-atribut non-static Lingkaran
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }

    // menambah ukuran Lingkaran menjadi 10% lebih besar
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    // mengurangi ukuran Lingkaran menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    // menskalakan ukuran Lingkaran sesuai dengan input percent yang diberikan
    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }

    // end of class Lingkaran   
}
