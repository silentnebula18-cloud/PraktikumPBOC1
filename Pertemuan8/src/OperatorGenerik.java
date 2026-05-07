/*
Nama File : OperatorGenerik.java 
Deskripsi: kelas berisi prosedur generik
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 07 Mei 2026
Lab: C1 
*/

public class OperatorGenerik {
    /*
    Prosedur Generik: Tukar
    Desc: menerima dua buat parameter bertipe generik kemudian
          melakukan penukaran nilai kedua masukan
          parameter:
          T = tipe data generik
          arr = Array yang berisi dua elemen yang akan ditukar
    */
   public static <T> void Tukar(T[] arr){
        if(arr.length >= 2){
            T temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
   }

   /*
   Fungsi Generik: Bobot2
   Desc: menerima masukan dua objek keturunan 
         kucing lalu mengembalikan jumlah bobot keduanya
         parameter:
         K1, K2 = objek Kucing yang bobotnya akan dijumlahkan
    */

    public static double Bobot2(Kucing K1, Kucing K2){
        return K1.getBobot() +  K2.getBobot();
    }
    
    // end of class OperatorGenerik
}
