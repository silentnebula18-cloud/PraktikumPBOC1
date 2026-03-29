/*Nama File : Persegi.java */
/*Deskripsi: berisi atribut dan methods dalam class Persegi */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 26 Maret 2026 (Updated: 28 Maret 2026) */
/*Lab: C1 */

public class Persegi extends BangunDatar implements IResize{
    /*********************ATRIBUT*********************/
    private double sisi;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Persegi(){
        setJmlSisi(4);
    }

    // konstruktor dengan parameter
    public Persegi (double sisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut sisi
    public double getSisi(){
        return sisi;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    /*------------------LAINNYA-------------------*/
    // mengembalikan luas Persegi
    public double getLuas(){
        return sisi*sisi;
    }

    // mengembalikan keliling Persegi
    public double getKeliling(){
        return sisi*4;
    }

    //mengembalikan panjang diagonal Persegi
    public double getDiagonal(){
        return sisi*Math.sqrt(2);
    }

    // print atribut-atribut non-static Persegi
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // menambah ukuran Persegi menjadi 10% lebih besar
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    // mengurangi ukuran Persegi menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    // menskalakan ukuran Persegi sesuai dengan input percent yang diberikan
    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }

    // end of class Persegi
}
