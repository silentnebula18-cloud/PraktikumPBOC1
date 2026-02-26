/*Nama File : Titik.java */
/*Deskripsi: berisi atribut dan method berupa dalam class Titik */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 26 Februari 2026 */

public class Titik {
    /*********************ATRIBUT*********************/
    double absis;
    double ordinat;
    static int counterTitik = 0;
    
    /*********************METHOD*********************/
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
        counterTitik++;
    }

    //konstruktor untuk membuat dengan nilai absis dan ordinat
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //print counterTitik
    void printCounterTitik(){
        System.out.println(counterTitik);
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }
    
    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik denga nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
    //end class Titik
}
