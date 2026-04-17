/*
Nama File : AngkaSialException.java 
Deskripsi: Eksepsi buatan sendiri, menolak masukan angka 13!
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 17 April 2026
Lab: C1 
*/

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial");
    }
}
