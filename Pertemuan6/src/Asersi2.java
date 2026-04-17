/*
Nama File : Asersi2.java 
Deskripsi: Program untuk demo asersi, yang akan menolak input
           jari-jari lingkaran bernilai nol 
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 17 April 2026
Lab: C1 
*/

// class Lingkaran
class Lingkaran{
    /*********************ATRIBUT*********************/
    private double jariJari;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor dengan parameter
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    /*------------------LAINNYA-------------------*/
    // menghitung dan mengembalikan keliling Lingkaran
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

// Hasil run dengan java -cp bin Asersi 2
// keliling lingkaran = 0.0

// Hasil run dengan java -ea -cp bin Asersi2
// Exception in thread "main" java.lang.AssertionError: jari jari tidak boleh nol!!!
//        at Asersi2.main(Asersi2.java:33)

// PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas. 
// Jelaskan pada lembar laporan praktikum!
// Jawaban :
/*
Tujuan awal dari program Asersi2 dibuat adalah menghitung keliling lingkaran dengan syarat 
jariJari harus lebih dari nol. Jika dijalankan oleh user secara normal (dengan 'java Asersi2') dan 
jariJari berisi angka sama dengan atau kurang dari 0, program akan tetap berjalan dengan normal. 
Hal tersebut berarti program tidak sesuai tujuan. Dalam kata lain program membutuhkan 
pengaktifan asersi agar bisa berjalan dengan benar. Akan tetapi, asersi dan pengaktifannya hanya 
digunakan pada saat pengembangan untuk keperluan debugging. Saat digunakan user, program 
harus bisa mengeluarkan hasil yang benar tanpa pengaktifan asersi. Dengan demikian, terdapat 
beberapa bagian yang perlu dirubah. Contohnya, dengan menambahkan penanganan untuk 
kasus jariJari sama dengan atau kurang dari 0.

Kode setelah diperbaiki

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        if(jariJari > 0){
            Lingkaran l = new Lingkaran(jariJari);
            double kelilingLingkaran = l.hitungKeliling();
            System.out.println("keliling lingkaran = " + kelilingLingkaran);
        }
        else{
            System.out.println("jari jari tidak boleh kurang dari atau sama dengan 0!!!");
        }
    }
}
*/
