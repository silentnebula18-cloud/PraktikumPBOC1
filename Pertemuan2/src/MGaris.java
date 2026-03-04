/*Nama File : MGaris.java */
/*Deskripsi: main dari kelas Garis */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 03 Maret 2026 */

public class MGaris {
    public static void main(String[] args){
        Garis G1 = new Garis();
        Garis G2 = new Garis(new Titik(-2.0, 0.0), new Titik(0.0, 4.0));

        System.err.println("Garis 1:");
        G1.printTitikAwalAkhir();
        System.err.println("Garis 2:");
        G2.printTitikAwalAkhir();

        System.err.println("Jumlah objek Garis" + Garis.getCounterGaris());

        System.err.println();
        System.err.println("Mengubah Garis G1");
        G1.setTitikAwal(new Titik(3.0, 4.0));
        G1.setTitikAkhir(new Titik(9.0, 12.0));
        System.err.println("Garis 1:");
        G1.printTitikAwalAkhir();

        System.err.println();
        System.err.println("Mengambil elemen Garis G2");
        G2.getTitikAwal().printTitik();
        G2.getTitikAkhir().printTitik();

        System.err.println();
        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());

        System.err.println();
        System.err.println("Panjang Garis G1: " + G1.getPanjang());
        System.err.println("Panjang Garis G2: " + G2.getPanjang());

        System.err.println();
        System.err.println("Titik Tengah Garis G1: ");
        G1.getTitikTengah().printTitik();
        System.err.println("Titik Tengah Garis G2: ");
        G2.getTitikTengah().printTitik();


        System.err.println();
        System.err.println("Gradien Garis G1: " + G1.getGradien());
        System.err.println("Gradien Garis G2: " + G2.getGradien());
        System.err.println("Apakah G1 sejajar dengan G2?: " + G1.isSejajar(G2));
        System.err.println("Apakah G1 tegak lurus dengan G2?: " + G1.isTegakLurus(G2));

        System.err.println();
        System.err.println("Persamaan Garis G1: ");
        G1.printPersGaris();
        System.err.println("Persamaan Garis G2: ");
        G2.printPersGaris();

        System.err.println();





    }
}
