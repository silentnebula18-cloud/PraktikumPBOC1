/*Nama File : MTitik.java */
/*Deskripsi: main dari kelas Titik */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 26 Februari 2026 */

public class MTitik {
    public static void main(String[] args) {
        Titik T3 = new Titik(); //Membuat objek titik T3 (0,0)
        T3.setAbsis(3); //mengubah absis T3 dengan nilai 3
        T3.setOrdinat(4); //mengubah ordinat T3 dengan nilai 4
        T3.printTitik(); //mencetak koordinat T3 ke layar
        T3.geser(3, 4); //menggeser T3 sejauh (3,4)
        T3.printTitik(); //menampilkan koordinat T3 setelah digeser

        Titik T4 = T3;
        T4.printTitik();
        T3.setAbsis(10);
        T3.setOrdinat(10);
        T4.printTitik();

        System.err.println();
        System.err.println("------------------------");

        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        Titik T2 = new Titik(3,5); //Membuat objek titik T1 (3,5)
        
        System.out.println("Nilai titik T1 dan T2");
        T1.printTitik();
        T2.printTitik();
        
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        T1.printCounterTitik();

        System.out.println();
        System.out.println("T1.getAbsis(): " + T1.getAbsis());
        System.out.println("T1.getOrdinat(): " + T1.getOrdinat());
        System.out.println("T2.getAbsis(): " + T2.getAbsis());
        System.out.println("T2.getOrdinat(): " + T2.getOrdinat());

        System.out.println();
        System.out.println("Mengubah T1 dengan setAbsis dan setOrdinat");
        T1.setAbsis(-1.0);
        T1.setOrdinat(-1.0);
        T1.printTitik();

        System.out.println();
        System.out.println("Menggeser T1 dengan T1.geser(-2.0, -3.0)");
        T1.geser(-2.0, -3.0);
        T1.printTitik();

        System.out.println(); 
        System.out.println("T1 berada di kuadran: " + T1.getKuadran());
        System.out.println("T2 berada di kuadran: " + T2.getKuadran());

        System.out.println(); 
        System.out.println("Jarak T1 terhadap (0,0): " + T1.getJarakPusat()); 
        System.out.println("Jarak T2 terhadap (0,0): " + T2.getJarakPusat());
        System.out.println("Jarak T1 terhadap T2: " + T1.getJarak(T2));
        System.out.println("Jarak T2 terhadap T1: " + T2.getJarak(T1));

        System.out.println();

        System.out.println("Titik T1 saat ini: ");
        T1.printTitik();
        System.out.println("Relfeksi T1 terhadap sumbu x: ");
        T1.getRefleksiX().printTitik();
        System.out.println("Relfeksi T1 terhadap sumbu y: ");
        T1.getRefleksiY().printTitik();

        System.out.println();
        System.out.println("Titik T2 saat ini: ");
        T2.printTitik();
        T2.refleksiX();
        System.out.println("T2 direfleksikan terhadap sumbu x: ");
        T2.printTitik();
        T2.refleksiY();
        System.out.println("Lalu, T2 direfleksikan terhadap sumbu y: ");
        T2.printTitik();
    }
}
