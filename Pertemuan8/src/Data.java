/*
Nama File : Data.java 
Deskripsi: atribut dan metode dari kelas Data
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 07 Mei 2026
Lab: C1 
*/

public class Data<T> {
    /*********************ATRIBUT*********************/
    private static int Kapasitas = 100;
    private T[] ruang;
    private int banyak;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    @SuppressWarnings("unchecked")
    public Data(){
        ruang = (T[]) new Object[Kapasitas];
        banyak = 0;
    }

    /*------------------getIsi-------------------*/
    // mengembalikan nilai elemen generik 
    // pada posisi sesuai parameter
    public T getIsi(int n){
        if(n >= 1 && n <= Kapasitas && n <= banyak){
            return (T) ruang[n-1];
        }
        return null;
    }

    /*---------------getKapasitas----------------*/
    // mengembalikan nilai atribut Kapasitas (static)
    public static int getKapasitas(){
        return Kapasitas;
    }

    /*------------------getSize-------------------*/
    // mengembalikan banyak elemen
    public int getSize(){
        return banyak;
    }

    /*------------------SetIsi-------------------*/
    // mengisi elemen pada posisi ruang yang tepat
    public void setIsi(int n, T isi){
        if(n >= 1 && n <= Kapasitas){
            ruang[n-1] = isi;
            if(n > banyak){
                banyak = n;
            }
        }
    }

    // end of class Data
}
