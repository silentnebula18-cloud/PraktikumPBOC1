/*
Nama File : mainTeman.java 
Deskripsi: file main untuk menjalankan kelas Teman (ilustrasi koleksi kelas dasar)
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 07 Mei 2026 (Updated: 12 Mei 2026)
Lab: C1 
*/

public class mainTeman {
    public static void main(String[] args) {
        /****************** Aplikasi Class Teman ******************/
        System.out.println();
        System.out.println("/****************** Aplikasi Class Teman ******************/");
        // Pembuatan Objek
        Teman T = new Teman();
        System.out.println("// membuat objek Teman baru (T)");
        System.out.println();

        // a. Aplikasi getNbelm
        System.out.println("// a. Aplikasi getNbelm");
        System.out.println("Banyak teman = " + T.getNbelm());

        System.out.println();

        // d. Aplikasi addNama
        System.out.println("// d. Aplikasi addNama");
        try{
            T.addNama("Annis"); 
            T.addNama("Binar");
            T.addNama("Mimo");
            System.out.println();
            System.out.println("Mencoba addNama(null)");
            T.addNama(null);
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Banyak teman = " + T.getNbelm());

        System.out.println();

        // i. Aplikasi showTeman
        System.out.println("// i. Aplikasi showTeman");
        T.showTeman();

        System.out.println();

        // b. Aplikasi getNama
        System.out.println("// b. Aplikasi getNama");
        try{
            for(int i = 0; i < T.getNbelm(); i++){
                System.out.println("Nama pada indeks " + i + ": " + T.getNama(i));
            }

            System.out.println();
            System.out.println("*Mencoba getNama(4)");
            System.out.println("Nama pada indeks 4: " + T.getNama(4));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();

        // c. Aplikasi setNama
        System.out.println("// c. Aplikasi setNama");
        try{
            System.out.println("(before) Nama pada indeks 2 : " + T.getNama(2));
            System.out.println("*Mencoba mengubah nama pada indeks 2");
            T.setNama(2, "Dian Aulya");
            System.out.println("(after) Nama pada indeks 2 : " + T.getNama(2));
            System.out.println();

            System.out.println("*Mencoba mengubah nama pada indeks 4");
            T.setNama(4, "Tobi");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();

        // tambah nama "Cupapi", "Munyenyo"
        System.out.println("// tambah nama \"Cupapi\", \"Munyenyo\"");
        try{
            T.addNama("Cupapi"); 
            T.addNama("Munyenyo"); 
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Banyak teman = " + T.getNbelm());

        System.out.println();

        // e. Aplikasi delNama
        System.out.println("// e. Aplikasi delNama");
        System.out.println("--- Sebelum ---");
        T.showTeman();
        System.out.println("*Mencoba menghapus \"Cupapi\"");
        T.delNama("Cupapi");
        System.out.println("--- Setelah ---");
        T.showTeman();

        System.out.println();

        System.out.println("*Mencoba menghapus \"Tobi\"");
        T.delNama("Tobi");

        System.out.println();

        // f. Aplikasi isMember
        System.out.println("// f. Aplikasi isMember");
        try{
            System.out.println("Apakah nama \"Annis\" ada?");
            System.out.println(T.isMember("Annis"));
            System.out.println();
            System.out.println("Apakah nama \"Cupapi\" ada?");
            System.out.println(T.isMember("Cupapi"));System.out.println();
            System.out.println("Apakah nama null ada?");
            System.out.println(T.isMember(null));

        }
         catch(IllegalArgumentException e){
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();

        // g. Aplikasi gantiNama
        System.out.println("// g. Aplikasi gantiNama");
        System.out.println("--- Sebelum ---");
        T.showTeman();
        System.out.println();
        try{
            System.out.println("*Mencoba mengubah nama \"Munyenyo\" menjadi \"Cupapi\"");
            T.gantiNama("Munyenyo", "Cupapi");
            System.out.println();

            System.out.println("*Mencoba mengubah nama yang tidak ada (\"Raye\")");
            T.gantiNama("Raye", "Munyenyo");
            System.out.println();

            System.out.println("*Mencoba mengisi parameter input dengan null");
            T.gantiNama(null, null);
            System.out.println();
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        System.out.println("--- Setelah ---");
        T.showTeman();

        System.out.println();

        // tambah nama "Cupapi"
        System.out.println("// tambah nama \"Cupapi\"");
        try{
            T.addNama("Cupapi"); 
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Banyak teman = " + T.getNbelm());

        System.out.println();

        // h. Aplikasi countNama
        System.out.println("// h. Aplikasi countNama");
        try{
            System.out.println("Banyak nama \"Binar\": " + T.countNama("Binar"));
            System.out.println("Banyak nama \"Cupapi\": " + T.countNama("Cupapi"));
            System.out.println("Banyak nama null: ");
            System.out.println(T.countNama(null));
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // end of class mainTeman
}
