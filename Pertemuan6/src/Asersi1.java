/*Nama File : Asersi1.java */
/*Deskripsi: Program untuk menunjukkan asersi */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 16 April 2026*/
/*Lab: C1 */

public class Asersi1 {
    public static void main(String[] args) throws Exception {
        int x = 0;
        if(x>0){
            System.out.println("x bilangan positif");
        } else{
            assert(x<0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}

// Hasil run dengan java -cp bin Asersi1
// x bilangan negatif

// Hasil run dengan java -ea -cp bin Asersi1
// Exception in thread "main" java.lang.AssertionError: ada kesalahan kode
//        at Asersi1.main(Asersi1.java:13