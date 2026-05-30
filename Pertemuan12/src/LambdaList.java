/**
 * File : LambdaList.java
 * Deskirpisi: Implementasi lambda pada List, digunakan sebagai parameter pada method
 * Pembuat : Christianna Olivia Juniarti Manullang (24060124140168)
 * Tanggal : 31 Mei 2026
 */
import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebagai paramater
        // print setiap nama mahasiswa pada mahasiswaList
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
