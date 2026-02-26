/*Nama File : MTitik.java */
/*Deskripsi: main dari kelas Titik */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 26 Februari 2026 */

public class MTitik {
    public static void main(String[] args) {
        // Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        // T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        // T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        // T1.printTitik(); //mencetak koordinat T1 ke layar
        // T1.geser(3, 4); //menggeser t1 sejauh (3,4)
        // T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        // Titik T2 = T1;
        // T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOrdinat(10);
        // T2.printTitik();

        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        Titik T2 = new Titik(3,5); //Membuat objek titik T1 (3,5)

        T1.printTitik();
        T2.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());
        // T2.getCounterTitik() masih bisa berjalan, tetapi terdapat tanda garis kuning

        T2.printCounterTitik();
    }
}
