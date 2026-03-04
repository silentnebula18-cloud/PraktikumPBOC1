/*Nama File : Garis.java */
/*Deskripsi: berisi atribut dan methods dalam class Garis */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 03 Maret 2026 */

public class Garis {
    /*********************ATRIBUT*********************/
    private Titik TAwal; /*Titik awal*/
    private Titik TAkhir; /*Titik akhir*/
    private static int counterGaris;

    /*********************METHOD*********************/
    // konstruktor tanpa parameter dengan titik awal (0,0) dan titik akhir (1,1)
    public Garis(){
        this.TAwal = new Titik(0.0,0.0);
        this.TAkhir = new Titik(1.0,1.0);
        counterGaris++;
    }

    // konstruktor dengan parameter
    public Garis(Titik T1, Titik T2){
        this.TAwal = T1;
        this.TAkhir = T2;
        counterGaris++;
    }

    // selektor titik awal
    public Titik getTitikAwal(){
        return this.TAwal;
    }

    // selektor titik akhir
   public  Titik getTitikAkhir(){
        return this.TAkhir;
    }

    // mutator titik awal
    public void setTitikAwal(Titik T){
        this.TAwal = T;
    }

    // mutator titik akhir
    public void setTitikAkhir(Titik T){
        this.TAkhir = T;
    }

    // selektor counterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }

    // mengembalikan panjang garis
    public double getPanjang(){
        return Math.sqrt((TAwal.getAbsis()-TAkhir.getAbsis())*(TAwal.getAbsis()-TAkhir.getAbsis())+(TAwal.getOrdinat()-TAkhir.getOrdinat())*(TAwal.getOrdinat()-TAkhir.getOrdinat()));
    }

    // mengembalikan gradien garis
    public double getGradien(){
        return (TAkhir.getOrdinat()-TAwal.getOrdinat())/(TAkhir.getAbsis()-TAwal.getAbsis());
    }

    // mengembalikan titik tengah garis
    public Titik getTitikTengah(){
        Titik TM = new Titik((TAwal.getAbsis()+TAkhir.getAbsis())/2, (TAwal.getOrdinat()+TAkhir.getOrdinat())/2);
        return TM;
    }

    // memeriksa apakah garis sejajar dengan garis lainnya
    public boolean isSejajar(Garis G2){
        return this.getGradien() == G2.getGradien();
    }

    // memeriksa apakah garis tegak lurus dengan garis lainnya
    public boolean isTegakLurus(Garis G2){
        return this.getGradien() * G2.getGradien() == -1;
    }

    // menampilkan titik awal dan titik akhir
    public void printTitikAwalAkhir(){
        System.out.println("Titik Awal (" + TAwal.getAbsis() + "," + TAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir (" + TAkhir.getAbsis() + "," + TAkhir.getOrdinat() + ")");
    }

    // menampilkan persamaan garis dalam  bentuk string y = mx + c
    public void printPersGaris(){
        double c;
        c = TAwal.getOrdinat() - getGradien()*TAwal.getAbsis();

        System.out.println("y = " + getGradien() + "x + " + c);
    }

    // end class Garis
}
