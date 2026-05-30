/**
 * File : MapList.java
 * Deskirpisi: Implementasi Map pada List, digunakan sebagai parameter pada method
 * Pembuat : Christianna Olivia Juniarti Manullang (24060124140168)
 * Tanggal : 31 Mei 2026
 */
import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map untuk menyimpan NIM dan nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124120001","Aggato");
        mahasiswaMap.put("24060124120002","Coco");
        mahasiswaMap.put("24060124120003","Rieche");
        mahasiswaMap.put("24060124120004","Tetia");

        // Menggunakan lambda untuk menampilkan key dan value dari Map
        // print setiap nim dan nama mahasiswa pada mahasiswaMap
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
