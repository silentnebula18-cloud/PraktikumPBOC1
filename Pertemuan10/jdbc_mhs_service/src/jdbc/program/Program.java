/**
 * File: Program.java
 * Deskripsi: kelas program utama untuk simulasi CRUD
 * Pembuat: Christianna Olivia Juniarti Manullang (24060124140168)
 * Tanggal: 28 Mei 2026
 */
package jdbc.program;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import jdbc.utilities.MysqlUtilities;
import java.util.ArrayList;
import java.util.List;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    
    // metode untuk menampilkan data-data dalam tabel mahasiswa
    public static void displayAll(){
        List<Mahasiswa> listMhs = service.getAll();
        
        if(listMhs.isEmpty()){
            System.out.println("Tabel mahasiswa kosong");
        } else{
            for(Mahasiswa m : listMhs){
                System.out.println(m.toString());
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        System.out.println("");
        
        // insert 1
        System.out.println("=== insert 1");
        Mahasiswa mAdd1 = new Mahasiswa(1, "Nina");
        service.add(mAdd1);
        Mahasiswa mAdd2 = new Mahasiswa(2, "Rudi");
        service.add(mAdd2);
        Mahasiswa mAdd3 = new Mahasiswa(3, "Beni");
        service.add(mAdd3);
        displayAll();
        
        // insert 2
        System.out.println("=== insert 2");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();
        
        // update
        System.out.println("=== update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        // delete
        System.out.println("=== delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }
}
