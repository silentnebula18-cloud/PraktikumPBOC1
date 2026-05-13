package Piaraan;
/*
Nama File : Piaraan.java 
Deskripsi: atribut dan metode dari kelas Piaraan.
           Kelas ini memiliki elemen nbelm (banyak elemen) dan
           Lanabul (koleksi antrean (queue) dengan elemen objek Anabul)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 13 Mei 2026
Lab: C1 
*/

import java.util.Queue;
import java.util.LinkedList;

public class Piaraan {
    /*********************ATRIBUT*********************/
    private int nbelm;
    private Queue<Anabul> Lanabul;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor 
    public Piaraan(){
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    // i. getNbelm - mengembalikan atribut nbelm (banyak elemen pada antrean Lanabul)
    public int getNbelm(){
        return nbelm;
    }

    // ii. enqueueAnabul - menambah objek Anabul sebagai elemen terakhir
    public void enqueueAnabul(Anabul anabul){
        if(anabul != null){
            Lanabul.add(anabul);
            nbelm++;
        }
        else{
            System.out.println("Error: anabul (input) tidak boleh null!");
        }
    }

    // iii. isMember - memeriksa apakah suatu objek Anabul merupakan elemen antrean Lanabul
    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    // iv. getAnabul - mengambil data anabul pertama dalam antrean Lanabul
    public Anabul getAnabul(){
        if(nbelm > 0){
            return Lanabul.peek();
        }
        else{
            System.out.println("Error: Antrian Lanabul kosong!");
            return null;
        }
    }

    // v. dequeueAnabul - mengambil anabul pertama sekaligus mengeluarkannya dari antrean Lanabul
    public Anabul dequeueAnabul(){
        if(nbelm > 0){
            Anabul out = Lanabul.poll();
            nbelm--;
            return out;
        }
        else{
            System.out.println("Error: Antrian Lanabul kosong!");
            return null;
        }
    }

    // vi. showAnabul - menampilkan nama-nama panggilan para Anabul dalam antrean
    public void showAnabul(){
        if(nbelm == 0){
            System.out.println("Notice: Tidak ada anabul dalam antrian");
        }
        else{
            System.out.println("---- Daftar Antrian Anabul ----");
            int no = 1;
            for(Anabul anabul : Lanabul){
                System.out.println(no + ". " + anabul.getNama());
                no++;
            }
        }
    }

    // vii. countKucing - menghitung banyak keluarga kucing dalam antrean
    public int countKucing(){
        int out = 0;
        for(Anabul anabul : Lanabul){
            if(anabul instanceof Kucing){
                out++;
            }
        }
        return out;
    }

    // viii. bobotKucing - menghitung bobot keluarga kucing dalam antrean
    public double bobotKucing(){
        double out = 0;
        for(Anabul anabul : Lanabul){
            if(anabul instanceof Kucing){
                out = out + ((Kucing) anabul).getBobot();
            }
        }
        return out;
    }


    // ix. showJenisAnabul - menampilkan nama-nama panggilan para Anabul dalam antrean, 
    // disertai dengan jenis objeknya 
    public void showJenisAnabul(){
        if(nbelm == 0){
            System.out.println("Notice: Tidak ada anabul dalam antrean.");
        }
        else{
            System.out.println("---- Daftar Antrian Anabul (+Jenis) ----");
            int no = 1;
            for(Anabul anabul: Lanabul){
                String jenis = anabul.getClass().getName();
                jenis = jenis.substring(jenis.lastIndexOf(".")+1);
                System.out.println(no + ". " + anabul.getNama() + " (" + jenis + ")");
                no++;
            }
        }
    }

    // end of class Piaraan
    
}
