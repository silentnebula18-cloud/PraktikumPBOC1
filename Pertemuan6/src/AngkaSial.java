/*
Nama File : AngkaSial.java 
Deskripsi: Program penggunaan exception buatan sendiri
           Pengenalan klausa 'throw' dan 'throws'
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 17 April 2026
Lab: C1 
*/

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            //method getMessage telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }   
}

// Hasil run dengan java -cp bin AngkaSial
/*
10 bukan angka sial
jangan memasukkan angka 13 karena angka sial
hati-hati memasukkan angka!!!
 */

// PERTANYAAN:
/*
*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?  
Jawaban:
Ketika ekspesi terjadi, baris 12 pada AngkaSial.java tidak akan akan dieksekusi. Hal tersebut terjadi 
karena cobaAngka() berhenti setelah AngkaSialException() dilemparkan.

*Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
Jawaban:
Baris 21 pada AngkaSial.java akan dieksekusi karena, dalam blok try, terdapat baris yang 
menyebabkan eksepsi terjadi (baris 19: as.cobaAngka(13)). Baris tersebut memenuhi syarat 
dilemparnya eksepsi yaitu angka == 13. Akibatnya, main() tidak akan mengeksekusi baris 20 
(as.cobaAngka(12)). Program akan mencetak hasil normal untuk as.cobaAngka(10), lalu menjalankan 
blok catch begitu eksepsi dilempar akibat as.cobaAngka(13) (mencetak message eksepsi dan 
mencetak "hati-hati memasukkan angka!!!").
 */
