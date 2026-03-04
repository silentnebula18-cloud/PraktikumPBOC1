/*Nama File : Titik.java */
/*Deskripsi: berisi atribut dan method dalam class Titik */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 26 Februari 2026 */

public class Titik {
    /*********************ATRIBUT*********************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;
    
    /*********************METHOD*********************/
    //konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    //konstruktor untuk membuat dengan nilai absis dan ordinat
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //print counterTitik
    public void printCounterTitik(){
        System.out.println(counterTitik);
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }
    
    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik denga nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //mengembalikan kuadran dari suatu titik
    public int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        }
        else if(absis > 0 && ordinat < 0){
            return 4;
        }
        else if(absis < 0 && ordinat > 0){
            return 2;
        }
        else if(absis < 0 && ordinat < 0){
            return 3;
        }
        else{
            return 0;
        }
    }

    // mengembalikan jarak titik terhadap titik pusat
    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    // mengembalikan jarak titik terhadap titik lainnya
    public double getJarak(Titik T){
        return Math.sqrt((this.absis - T.getAbsis())*(this.absis - T.getAbsis()) + (this.ordinat - T.getOrdinat())*(this.ordinat - T.getOrdinat()));
    }

    //merefleksikan titik terhadap sumbu X
    public void refleksiX(){
        this.ordinat = -this.ordinat;
    }
    
    //merefleksikan titik terhadap sumbu y
    public void refleksiY(){
        this.absis = -this.absis;
    }

    //mengembalikan hasil refleksi titik terhadap sumbu X tanpa mengubah data asli titik
    public Titik getRefleksiX(){
        Titik T = new Titik(getAbsis(), -getOrdinat());
        return T;
    }

    //mengembalikan hasil refleksi titik terhadap sumbu y tanpa mengubah data asli titik
    public Titik getRefleksiY(){
        Titik T = new Titik(-getAbsis(), getOrdinat());
        return T;
    }

    //end class Titik
}
