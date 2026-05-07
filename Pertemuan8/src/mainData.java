/*
Nama File : mainData.java 
Deskripsi: mengilustrasikan penggunaan Larik Generik menggunakan
           kelas Data, Anabul, Anjing, Burung, Kucing, Anggora, KembangTelon
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 07 Mei 2026 
Lab: C1 
*/

public class mainData {
    public static void main(String[] args) {
        /****************** Implementasi Class Data ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Data ******************/");
        
        System.out.println();

        // Aplikasi Class Data dengan String
        System.out.println("------------- Aplikasi Class Data dengan String -------------");
        Data<String> S = new Data<>();
        System.out.println("Kapasitas S = " + Data.getKapasitas());
        System.out.println("Ukuran sekarang = " + S.getSize());
        System.out.println("-----------------------------");
        System.out.println("Menambahkan elemen ('AAA', 'BBB', 'CCC')");
        S.setIsi(1, "AAA");
        S.setIsi(2, "BBB");
        S.setIsi(3, "CCC");
        System.out.println("-----------------------------");
        System.out.println("Ukuran sekarang = " + S.getSize());
        System.out.println("Elemen S posisi ke-1 = " + S.getIsi(1));
        System.out.println("Elemen S posisi ke-2 = " + S.getIsi(2));
        System.out.println("Elemen S posisi ke-3 = " + S.getIsi(3));

        System.out.println();

        // Aplikasi Class Data dengan Integer
        System.out.println("------------- Aplikasi Class Data dengan Integer -------------");
        Data<Integer> I = new Data<>();
        System.out.println("Kapasitas I = " + Data.getKapasitas());
        System.out.println("Ukuran sekarang = " + I.getSize());
        System.out.println("-----------------------------");
        System.out.println("Menambahkan elemen (1, 2, 3)");
        I.setIsi(1, 1);
        I.setIsi(2, 2);
        I.setIsi(3, 3);
        System.out.println("-----------------------------");
        System.out.println("Ukuran sekarang = " + I.getSize());
        System.out.println("Elemen I posisi ke-1 = " + I.getIsi(1));
        System.out.println("Elemen I posisi ke-2 = " + I.getIsi(2));
        System.out.println("Elemen I posisi ke-3 = " + I.getIsi(3));

        System.out.println();

        // Aplikasi Class Data dengan Double
        System.out.println("------------- Aplikasi Class Data dengan Double -------------");
        Data<Double> D = new Data<>();
        System.out.println("Kapasitas D = " + Data.getKapasitas());
        System.out.println("Ukuran sekarang = " + D.getSize());
        System.out.println("-----------------------------");
        System.out.println("Menambahkan elemen (1.1, 2.2, 3.3)");
        D.setIsi(1, 1.1);
        D.setIsi(2, 2.2);
        D.setIsi(3, 3.3);
        System.out.println("-----------------------------");
        System.out.println("Ukuran sekarang = " + D.getSize());
        System.out.println("Elemen D posisi ke-1 = " + D.getIsi(1));
        System.out.println("Elemen D posisi ke-2 = " + D.getIsi(2));
        System.out.println("Elemen D posisi ke-3 = " + D.getIsi(3));

        System.out.println();
        
        // Aplikasi Class Data dengan Keluarga Objek Anabul
        System.out.println("------------- Aplikasi Class Data dengan Keluarga Objek Anabul -------------");
        Data<Anabul> DA = new Data<>();
        System.out.println("Kapasitas DA = " + Data.getKapasitas());
        System.out.println("Ukuran sekarang = " + DA.getSize());
        System.out.println("-----------------------------");
        System.out.println("Menambahkan elemen");
        DA.setIsi(1, new Anabul("Ali"));
        DA.setIsi(2, new Anjing("Boni"));
        DA.setIsi(3, new Burung("Ciki"));
        DA.setIsi(4, new Kucing("Daisy", 4.1));
        DA.setIsi(5, new Anggora("Emmie", 4.2, "biru"));
        DA.setIsi(6, new KembangTelon("Ferry", 4.3, "Persia"));
        System.out.println("-----------------------------");
        System.out.println("Ukuran sekarang = " + DA.getSize());
        System.out.println("Isi DA sekarang: ");
        for(int i = 1; i <= DA.getSize(); i++){
            DA.getIsi(i).printInfo();
            System.out.println("------------------");
        }
    }
    // end of class mainData
}

