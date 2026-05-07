/*
Nama File : mainOpGenerik.java 
Deskripsi: mengilustrasikan penggunaan Generik pada Operator menggunakan
           kelas OperatorGenerik, Anabul, Anjing, Burung, Kucing, Anggora, KembangTelon
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 07 Mei 2026
Lab: C1 
*/

public class mainOpGenerik {
    public static void main(String[] args) {
        /****************** Implementasi Class OperatorGenerik ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class OperatorGenerik ******************/");

        System.out.println("/---------------------------- Prosedur Tukar ---------------------------/");
        // Tukar dengan Tipe Data String
        System.out.println("// Tukar dengan Tipe Data String");
        String[] S = {"AAA", "BBB"};
        System.out.println("Sebelum Tukar: S[0] = " + S[0] + ", S[1] = " + S[1]);
        OperatorGenerik.Tukar(S);
        System.out.println("Setelah Tukar: S[0] = " + S[0] + ", S[1] = " + S[1]);

        System.out.println();

        // Tukar dengan Tipe Data Integer
        System.out.println("// Tukar dengan Tipe Data Integer");
        Integer[] I = {1, 2};
        System.out.println("Sebelum Tukar: I[0] = " + I[0] + ", I[1] = " + I[1]);
        OperatorGenerik.Tukar(I);
        System.out.println("Setelah Tukar: I[0] = " + I[0] + ", I[1] = " + I[1]);

        System.out.println();

        // Tukar dengan Tipe Data Double
        System.out.println("// Tukar dengan Tipe Data Double");
        Double[] D = {1.5, 2.5};
        System.out.println("Sebelum Tukar: D[0] = " + D[0] + ", D[1] = " + D[1]);
        OperatorGenerik.Tukar(D);
        System.out.println("Setelah Tukar: D[0] = " + D[0] + ", D[1] = " + D[1]);

        System.out.println();

        // Tukar dengan sesama keluarga Anabul
        System.out.println("/--------- Tukar dengan sesama keluarga Anabul -----------/");
        System.out.println("// Pertukaran dengan objek Anabul dan Anjing (array Anabul[])");
        Anabul[] Anb = {new Anabul("Who"), new Anjing("Guk")};
        System.out.println("Sebelum Tukar: Anb[0] = " + Anb[0].getNama() + ", Anb[1] = " + Anb[1].getNama());
        OperatorGenerik.Tukar(Anb);
        System.out.println("Setelah Tukar: Anb[0] = " + Anb[0].getNama() + ", Anb[1] = " + Anb[1].getNama());
        
        System.out.println();

        System.out.println("// Pertukaran dengan objek Burung dan Anjing (array Anabul[])");
        Anabul[] Anb2 = {new Burung("Whowho"), new Anjing("GukTwo")};
        System.out.println("Sebelum Tukar: Anb2[0] = " + Anb2[0].getNama() + ", Anb2[1] = " + Anb2[1].getNama());
        OperatorGenerik.Tukar(Anb2);
        System.out.println("Setelah Tukar: Anb2[0] = " + Anb2[0].getNama() + ", Anb2[1] = " + Anb2[1].getNama());

        System.out.println();

        System.out.println("// Pertukaran dengan objek Kucing dan Anggora (array Kucing[])");
        Kucing[] Kc = {new Kucing("Why", 4.0), new Anggora("How", 4.5, "hijau")};
        System.out.println("Sebelum Tukar: Kc[0] = " + Kc[0].getNama() + ", Kc[1] = " + Kc[1].getNama());
        OperatorGenerik.Tukar(Kc);
        System.out.println("Setelah Tukar: Kc[0] = " + Kc[0].getNama() + ", Kc[1] = " + Kc[1].getNama());

        System.out.println();

        System.out.println("// Pertukaran dengan objek KembangTelon dan Anggora (array Kucing[])");
        Kucing[] Kc2 = {new KembangTelon("Where", 4.0, "Persia"), new Anggora("When", 4.5, "hijau")};
        System.out.println("Sebelum Tukar: Kc2[0] = " + Kc2[0].getNama() + ", Kc2[1] = " + Kc2[1].getNama());
        OperatorGenerik.Tukar(Kc2);
        System.out.println("Setelah Tukar: Kc2[0] = " + Kc2[0].getNama() + ", Kc2[1] = " + Kc2[1].getNama());

        System.out.println();

        System.out.println("/---------------------------- Prosedur Bobot2 ---------------------------/");
        Kucing C1 = new Kucing("Yeah", 4.0);
        Kucing C2 = new Kucing("Yuh", 4.5);
        C1.printInfo();
        System.out.println("----------------");
        C2.printInfo();
        System.out.println("Jumlah bobot kucing C1 dan C2 = " + OperatorGenerik.Bobot2(C1, C2) + " kg");

        System.out.println();

        Anggora CA = new Anggora("Skrrt", 3.0, "kuning");
        KembangTelon CKT = new KembangTelon("Bruh", 3.0, "Himalaya");
        CA.printInfo();
        System.out.println("----------------");
        CKT.printInfo();
        System.out.println("Jumlah bobot kucing CA dan CKT = " + OperatorGenerik.Bobot2(CA, CKT) + " kg");
    }

    // end of class mainOpGenerik
}
