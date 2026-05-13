/*
Nama File : Teman.java 
Deskripsi: atribut dan metode di dalam kelas Teman
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 07 Mei 2026 (Updated: 12 Mei 2026)
Lab: C1 
*/

import java.util.ArrayList;
import java.util.List;

public class Teman {
    /*********************ATRIBUT*********************/
    private int nbelm;
    private List<String> Lnama;

    /*********************METHOD*********************/
    // Konstruktor
    public Teman(){
        nbelm = 0;
        Lnama = new ArrayList<>();
    }

    // a. mengembalikan banyak elemen pada List
    public int getNbelm(){
        return nbelm;
    }

    // b. mengembalikan nama sesuai indeks
    public String getNama(int indeks){
        if(indeks >= 0 && indeks < nbelm){
            return Lnama.get(indeks);
        }
        else{
            throw new IndexOutOfBoundsException("Indeks " + indeks + " di luar batas");
        }
    }

    // c. menaruh nama pada Lnama di indeks yang diinginkan
    public void setNama(int indeks, String nama){
        if(indeks >= 0 && indeks < nbelm){
            Lnama.set(indeks, nama);
        }
        else{
            throw new IndexOutOfBoundsException("Indeks " + indeks + " di luar batas");
        }
    }

    // d. menambah nama baru pada Lnama
    public void addNama(String nama){
        if(nama != null && !nama.isEmpty()){
            Lnama.add(nama);
            System.out.println("\"" + nama + "\"" + " berhasil ditambahkan");
            nbelm++;
        }
        else{
            throw new IllegalArgumentException("nama tidak boleh kosong");
        }
    }

    // e. menghapus nama dalam Lnama (jika ada)
    public void delNama(String nama){
        if(Lnama.remove(nama)){
            nbelm --;
        }
        else{
            System.out.println("nama \"" + nama + "\" tidak ada di dalam Lnama");
        }
    }

    // f. memeriksa apakah nama merupakan member Lnama
    public boolean isMember(String nama){
        if(nama != null && !nama.isEmpty()){
            return Lnama.contains(nama);
        }
        else{
            throw new IllegalArgumentException("nama tidak boleh kosong");
        }
    }

    // g. mengganti nama yang sudah ada di Lnama dengan namabaru
    public void gantiNama(String nama, String namabaru){
        if((nama != null && !nama.isEmpty()) && (namabaru != null && !namabaru.isEmpty())){
            int indeks = Lnama.indexOf(nama);
            if (indeks != -1){
                Lnama.set(indeks, namabaru);
                System.out.println("(nama berhasil diganti)");
            }
            else{
                System.out.println("(nama \"" + nama + "\" tidak terdapat pada list)");
            }
        }
        else{
            throw new IllegalArgumentException("nama dan/ atau namabaru tidak boleh kosong");
        }
    }


    // h. menghitung nama dalam Lnama
    public int countNama(String nama){
        if(nama != null && !nama.isEmpty()){
            int out = 0;
            if(Lnama.contains(nama)){
                for(String n : Lnama){
                    if(n.equals(nama)){
                        out++;
                    }
                }
            }
            return out;
        }
        else{
            throw new IllegalArgumentException("nama tidak boleh kosong");
        }
    }

    // i. menampilkan semua nama teman dalam Lnama
    public void showTeman(){
        if(!Lnama.isEmpty()){
            System.out.println("--- Daftar Teman ---");
            for(int i = 0; i < nbelm; i++){
                System.out.println((i+1) + ". " + Lnama.get(i));
            }
        }
        else{
            System.out.println("Daftar teman kosong");
        }
    }

    // end of class Teman
}

