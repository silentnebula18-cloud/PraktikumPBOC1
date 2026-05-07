/*
Nama File : Datum.java 
Deskripsi: atribut dan metode dari kelas generik Datum
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 06 Mei 2026
Lab: C1 
*/

public class Datum<T> {
    /*********************ATRIBUT*********************/
    private T isi;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    public Datum(T isi){
        this.isi = isi;
    }

    /*------------------SELEKTOR-------------------*/
    public T getIsi(){
        return isi;
    }

    /*------------------MUTATOR-------------------*/
    public void setIsi(T isiBaru){
        this.isi = isiBaru;
    }
    
    // end of class Datum
}
