/*
Nama File : mainDatum.java 
Deskripsi: mengilustrasikan penggunaan Generik pada Class menggunakan
           kelas Datum, Anabul, Anjing, Burung, Kucing, Anggora, KembangTelon
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 06 Mei 2026 (Updated: 07 Mei 2026)
Lab: C1 
*/

public class mainDatum {
    // mengembalikan String berisi informasi keanggotaan object terhadap keluarga Anabul
    // note: input sudah pasti termasuk sebuah Anabul
    public static String cekAnabul(Anabul inp){
        String out = "This object is an instance of Anabul";

        if(inp instanceof Anjing){
            out = out + ", Anjing";
        }
        else if(inp instanceof Burung){
            out = out + ", Burung";
        }
        else if(inp instanceof Kucing){
            out = out + ", Kucing";
            if(inp instanceof Anggora){
                out = out + ", Anggora";
            }
            if(inp instanceof KembangTelon){
                out = out + ", KembangTelon";
            }
        }

        return out;
    }
    public static void main(String[] args) {
        /****************** Implementasi Class Datum ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Datum ******************/");

        // Datum dengan Tipe Data String
        System.out.println("/------------ Datum dengan Tipe Data String ------------/");
        Datum<String> dString = new Datum<>("Halo");
        System.out.println("Isi Datum dString = " + dString.getIsi());
        dString.setIsi("Hai");
        System.out.println("Isi Datum dString setelah di ubah= " + dString.getIsi());
        System.out.println();

        // Datum dengan Tipe Data Integer
        System.out.println("/------------ Datum dengan Tipe Data Integer ------------/");
        Datum<Integer> dInteger = new Datum<>(10);
        System.out.println("Isi Datum dInteger = " + dInteger.getIsi());
        dInteger.setIsi(20);
        System.out.println("Isi Datum dInteger setelah di ubah= " + dInteger.getIsi());
        System.out.println();

        // Datum dengan Tipe Data Double
        System.out.println("/------------ Datum dengan Tipe Data Double ------------/");
        Datum<Double> dDouble = new Datum<>(11.5);
        System.out.println("Isi Datum dDouble = " + dDouble.getIsi());
        dDouble.setIsi(22.5);
        System.out.println("Isi Datum dDouble setelah di ubah= " + dDouble.getIsi());
        System.out.println();

        // Datum dengan Kelas Anabul
        System.out.println("/------------ Datum dengan Tipe Data Anabul ------------/");

        System.out.println();

        System.out.println("            --- Datum<Anabul> dAnabul ---           ");
        System.out.println("--- dAnabul diisi dengan objek dari kelas Anabul ---");
        Datum<Anabul> dAnabul = new Datum<>(new Anabul("Anabool"));
        System.out.println("Nama Anabul : " + dAnabul.getIsi().getNama());
        System.out.println("Gerak       : " + dAnabul.getIsi().Gerak());
        System.out.println("Suara       : " + dAnabul.getIsi().Suara());
        System.out.println(cekAnabul(dAnabul.getIsi()));

        System.out.println();

        System.out.println("--- dAnabul diisi dengan objek dari kelas Anjing ---");
        dAnabul.setIsi(new Anjing("Doc"));
        System.out.println("Nama Anabul : " + dAnabul.getIsi().getNama());
        System.out.println("Gerak       : " + dAnabul.getIsi().Gerak());
        System.out.println("Suara       : " + dAnabul.getIsi().Suara());
        System.out.println(cekAnabul(dAnabul.getIsi()));

        System.out.println();

        System.out.println("--- dAnabul diisi dengan objek dari kelas Burung ---");
        dAnabul.setIsi(new Burung("Booroong"));
        System.out.println("Nama Anabul : " + dAnabul.getIsi().getNama());
        System.out.println("Gerak       : " + dAnabul.getIsi().Gerak());
        System.out.println("Suara       : " + dAnabul.getIsi().Suara());
        System.out.println(cekAnabul(dAnabul.getIsi()));

        System.out.println();

        System.out.println("--- dAnabul diisi dengan objek dari kelas Kucing ---");
        dAnabul.setIsi(new Kucing("Koocing", 4.5));
        System.out.println("Nama Anabul : " + dAnabul.getIsi().getNama());
        System.out.println("Gerak       : " + dAnabul.getIsi().Gerak());
        System.out.println("Suara       : " + dAnabul.getIsi().Suara());
        System.out.println(cekAnabul(dAnabul.getIsi()));
        System.out.println("dAnabul.getIsi().getBobot() tidak bisa dijalankan");

        System.out.println();

        System.out.println("--- dAnabul diisi dengan objek dari kelas Anggora ---");
        dAnabul.setIsi(new Anggora("Dame ungrr", 4.2, "biru"));
        System.out.println("Nama Anabul : " + dAnabul.getIsi().getNama());
        System.out.println("Gerak       : " + dAnabul.getIsi().Gerak());
        System.out.println("Suara       : " + dAnabul.getIsi().Suara());
        System.out.println(cekAnabul(dAnabul.getIsi()));
        System.out.println("dAnabul.getIsi().getBobot() tidak bisa dijalankan");
        System.out.println("dAnabul.getIsi().getWarnaMata() tidak bisa dijalankan");

        System.out.println();

        System.out.println("--- dAnabul diisi dengan objek dari kelas KembangTelon ---");
        dAnabul.setIsi(new KembangTelon("KembarTiga", 4.0, "Persia"));
        System.out.println("Nama Anabul : " + dAnabul.getIsi().getNama());
        System.out.println("Gerak       : " + dAnabul.getIsi().Gerak());
        System.out.println("Suara       : " + dAnabul.getIsi().Suara());
        System.out.println(cekAnabul(dAnabul.getIsi()));
        System.out.println("dAnabul.getIsi().getBobot() tidak bisa dijalankan");
        System.out.println("dAnabul.getIsi().getRas() tidak bisa dijalankan");

        System.out.println();

        System.out.println("            --- Datum<Kucing> dKucing ---           ");
        System.out.println("--- dKucing diisi dengan objek dari kelas Kucing ---");
        Datum<Kucing> dKucing = new Datum<>(new Kucing("Cad", 3.9));
        System.out.println("Nama Kucing : " + dKucing.getIsi().getNama());
        System.out.println("Gerak       : " + dKucing.getIsi().Gerak());
        System.out.println("Suara       : " + dKucing.getIsi().Suara());
        System.out.println("Bobot       : " + dKucing.getIsi().getBobot());
        System.out.println(cekAnabul(dKucing.getIsi()));

        System.out.println();

        System.out.println("--- dKucing diisi dengan objek dari kelas Anggora ---");
        dKucing.setIsi(new Anggora("uNgrr dame", 4.4, "coklat"));
        System.out.println("Nama Kucing : " + dKucing.getIsi().getNama());
        System.out.println("Gerak       : " + dKucing.getIsi().Gerak());
        System.out.println("Suara       : " + dKucing.getIsi().Suara());
        System.out.println("Bobot       : " + dKucing.getIsi().getBobot());
        System.out.println("dKucing.getIsi()getWarnaMata() tidak bisa dijalankan");
        System.out.println(cekAnabul(dKucing.getIsi()));

        System.out.println();

        System.out.println("--- dKucing diisi dengan objek dari kelas KembangTelon ---");
        dKucing.setIsi(new KembangTelon("Kirara", 4.5, "Himalaya"));
        System.out.println("Nama Kucing : " + dKucing.getIsi().getNama());
        System.out.println("Gerak       : " + dKucing.getIsi().Gerak());
        System.out.println("Suara       : " + dKucing.getIsi().Suara());
        System.out.println("Bobot       : " + dKucing.getIsi().getBobot());
        System.out.println("dKucing.getIsi()getRas() tidak bisa dijalankan");
        System.out.println(cekAnabul(dKucing.getIsi()));

        System.out.println();

        System.out.println("            --- Datum<Anggora> dAnggora ---           ");
        System.out.println("--- dAnggora diisi dengan objek dari kelas Anggora ---");
        Datum<Anggora> dAnggora = new Datum<>(new Anggora("Anggrrrr", 4.0, "hijau"));
        System.out.println("Nama Anggora : " + dAnggora.getIsi().getNama());
        System.out.println("Gerak       : " + dAnggora.getIsi().Gerak());
        System.out.println("Suara       : " + dAnggora.getIsi().Suara());
        System.out.println("Bobot       : " + dAnggora.getIsi().getBobot());
        System.out.println("WarnaMata   : " + dAnggora.getIsi().getWarnaMata());
        System.out.println(cekAnabul(dAnggora.getIsi()));

        System.out.println();

        System.out.println("            --- Datum<KembangTelon> dKembangTelon ---           ");
        System.out.println("--- dKembangTelon diisi dengan objek dari kelas KembangTelon ---");
        Datum<KembangTelon> dKembangTelon = new Datum<>(new KembangTelon("KembangTulung", 4.1, "Persia"));
        System.out.println("Nama KembangTelon : " + dKembangTelon.getIsi().getNama());
        System.out.println("Gerak       : " + dKembangTelon.getIsi().Gerak());
        System.out.println("Suara       : " + dKembangTelon.getIsi().Suara());
        System.out.println("Bobot       : " + dKembangTelon.getIsi().getBobot());
        System.out.println("WarnaMata   : " + dKembangTelon.getIsi().getRas());
        System.out.println(cekAnabul(dKembangTelon.getIsi()));

        System.out.println();
    }

    // end of class mainDatum
}
