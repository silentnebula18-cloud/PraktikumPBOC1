/**
 * File : DiskonLambda.java
 * Deskirpisi: Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 * Pembuat : Christianna Olivia Juniarti Manullang (24060124140168)
 * Tanggal : 31 Mei 2026
 */

interface IDiskon{
    public double hitungDiskon(int harga);
    // end of interface IDiskon
}

public class DiskonLambda {
    public static void main(String[] args) throws Exception {
        // tanpa lambda
        // Anonymous class yang mengimplementasikan interface IDiskon
        // hitungDiskon pada diskonMerdeka memberikan diskon 30%
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };

        // dengan lambda
        // penggunaan lambda (Anonymous function) yang mengimplementasikan interface IDiskon
        // hitungDiskon pada diskonLebaran memberikan diskon 40%
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // dengan lambda dengan blok statement
        // penggunaan lambda (Anonymous function) yang mengimplementasikan interface IDiskon
        // hitungDiskon pada diskonBiasa memberikan diskon 10%
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        // dengan lambda dengan blok statement
        // penggunaan lambda (Anonymous function) yang mengimplementasikan interface IDiskon
        // hitungDiskon pada diskonBertingkat memberikan diskon yang berbeda-beda berdasarkan harga
        IDiskon diskonBertingkat = (harga) -> {
            if(harga >= 100000){
                return harga - (harga * 0.3); // diskon 30% untuk harga >= 100000
            }
            else if (harga >= 50000){
                return harga - (harga * 0.15); // diskon 15% untuk 50000 <= harga < 100000
            }
            else{
                return harga; // tidak ada diskon untuk harga < 50000 
            }
        };

        // Aplikasi 
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
        System.out.println("Diskon Bertingkat: " + diskonBertingkat.hitungDiskon(45000));

        // end of class DiskonLambda
    }
}
