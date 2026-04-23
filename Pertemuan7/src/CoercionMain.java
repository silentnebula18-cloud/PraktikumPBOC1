/*
Nama File : CoercionMain.java 
Deskripsi: Mengilustrasikan konsep polimorfisme Ad Hoc Coercion
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 23 April 2026
Lab: C1 
*/

public class CoercionMain {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------- CoercionMain ---------------");
        System.out.println();

        // a. Nilai integer 65 sebagai integer, karakter, dan real
        System.out.println("a. Nilai integer 65 sebagai integer, real, dan string");
        int intV = 65;
        System.out.println("Sebagai integer: " + intV);
        System.out.println("Sebagai karakter: " + (char) intV);
        System.out.println("Sebagai real: " + (double) intV);
        System.out.println();

        // b. Coercion dari nilai integer ke real lalu ke integer lagi
        System.out.println("b. Coercion dari nilai integer ke real lalu ke integer lagi");
        double realV = (double) intV;
        int newIntV = (int) realV;
        System.out.println("Coercion menjadi real: " + realV);
        System.out.println("Coercion menjadi integer kembali: " + newIntV);
        System.out.println();

        // c. Polimorfisme dua objek string (konkatenasi string dan penjumlahan integer)
        System.out.println("c. Polimorfisme dua objek string (konkatenasi string dan penjumlahan integer)");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("String X = " + X);
        System.out.println("String Y = " + Y);
        System.out.println("Konkatenasi String X dan Y: " +  S);
        System.out.println("Penjumlahan Integer X dan Y: " +  Z);
        System.out.println();

        // d. Polimorfisme dua objek string (konkatenasi string dan penjumlahan real)
        System.out.println("d. Polimorfisme dua objek string (konkatenasi string dan penjumlahan real)");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("String P = " + P);
        System.out.println("String Q = " + Q);
        System.out.println("Konkatenasi String P dan Q: " +  R);
        System.out.println("Penjumlahan Real P dan Q: " +  D);
        System.out.println();

        // e. Konversi nilai string S menjadi integer A
        System.out.println("e. Konversi nilai string S menjadi integer A"); 
        Integer A = Integer.parseInt(S);
        System.out.println("String S = " + S);
        System.out.println("Integer A = " + A);
        System.out.println();

        // f. Konversi nilai integer A menjadi string T
        System.out.println("f. Konversi nilai integer A menjadi string T");
        String T = Integer.toString(A);
        System.out.println("Integer A = " + A);
        System.out.println("String T = " + T);
        System.out.println();
    }

    // end of class CoercionMain
}
