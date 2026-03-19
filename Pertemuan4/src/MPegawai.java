/*Nama File : MPegawai.java */
/*Deskripsi: main untuk menggunakan class Date, Pegawai, Tendik, Dosen, DosenTetap, DosenTamu*/
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 19 Maret 2026*/
/*Lab: C1 */

public class MPegawai {
    public static void main(String[] args){
        /****************** Implementasi Class Date ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Date ******************/");
        // contoh implementasi konstruktor tanpa parameter
        Date DT1 = new Date();

        // contoh implementasi konstruktor dengan parameter
        Date DT2 = new Date(12, 5, 2026);
        
        // contoh implementasi printDate
        System.out.println();
        System.out.println("----- Contoh Implementasi printDate  -----");
        System.out.println("----- Isi DT1 Saat Ini  -----");
        DT1.printDate();
        System.out.println("----- Isi DT2 Saat Ini  -----");
        DT2.printDate();
        System.out.println();

        // contoh implementasi selektor
        System.out.println("----- Contoh Implementasi Selektor  -----");
        System.out.println("Hari ini tanggal " + DT1.getTgl() + " bulan " + DT1.getBulan() + " tahun " + DT1.getTahun());
        System.out.println("Hari ini tanggal " + DT2.getTgl() + " bulan " + DT2.getBulan() + " tahun " + DT2.getTahun());
        System.out.println();

        // contoh implementasi mutator
        System.out.println("----- Contoh Implementasi Mutator  -----");
        DT1.setTahun(2045);
        DT1.setBulan(12);
        DT1.setTgl(31);
        System.out.println("----- Isi DT1 setelah dimutasi  -----");
        DT1.printDate();
        System.out.println();

        DT2.setBulan(2);
        DT2.setTahun(1900);
        System.out.println("Mencoba mengisi atribut tgl DT2 dengan input yang tidak valid");
        DT2.setTgl(29);
        System.out.println("----- Isi DT2 setelah dimutasi  -----");
        DT2.printDate();
        System.out.println();

        // contoh implementasi getSDate
        System.out.println("----- Contoh Implementasi getSDate  -----");
        System.out.println("Besok tanggal " + DT1.getSDate());
        System.out.println("Besok tanggal " + DT2.getSDate());

        /****************** Implementasi Class Pegawai ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Pegawai ******************/");
        // contoh implementasi konstruktor tanpa parameter
        Pegawai PGW1 = new Pegawai();

        // contoh implementasi konstruktor dengan parameter
        Date testTglLahir = new Date(12, 3, 1995);
        Date testTMT = new Date(17, 9, 2023);
        Pegawai PGW2 = new Pegawai("1213456789", "Tania", testTglLahir, testTMT, "Dosen Tetap", 5000000);
        
        // contoh implementasi printInfo
        System.out.println();
        System.out.println("----- Contoh Implementasi printInfo  -----");
        System.out.println("----- Isi PGW1 Saat Ini  -----");
        PGW1.printInfo();
        System.out.println("----- Isi PGW2 Saat Ini  -----");
        PGW2.printInfo();
        System.out.println();

        // contoh implementasi selektor
        System.out.println("----- Contoh Implementasi Selektor  -----");
        System.out.println(PGW1.getJabatan() + " bernama " + PGW1.getNama() + " dengan NIP " + PGW1.getNIP() + " lahir pada " + PGW1.getTglLahir().getSDate() + "."); 
        System.out.println("Bekerja terhitung mulai tanggal " + PGW1.getTMT().getSDate() + " dengan gaji pokok " + PGW1.getGajiPokok() + "."); 
        System.out.println(PGW2.getJabatan() + " bernama " + PGW2.getNama() + " dengan NIP " + PGW2.getNIP() + " lahir pada " + PGW2.getTglLahir().getSDate() + "."); 
        System.out.println("Bekerja terhitung mulai tanggal " + PGW2.getTMT().getSDate() + " dengan gaji pokok " + PGW2.getGajiPokok() + "."); 
        System.out.println();

        // contoh implementasi mutator
        System.out.println("----- Contoh Implementasi Mutator  -----");
        PGW1.setNIP("9897654321");
        PGW1.setNama("Alejandro");
        PGW1.setTglLahir(new Date(5, 5, 1993));
        PGW1.setTMT(new Date(31, 1, 2019));
        PGW1.setJabatan("Dosen Tetap");
        PGW1.setGajiPokok(5000000);
        System.out.println("----- Isi PGW1 setelah dimutasi  -----");
        PGW1.printInfo();

        PGW2.setNIP("1231231234");
        PGW2.setNama("Diluc");
        PGW2.setTglLahir(new Date(3, 4, 1994));
        PGW2.setTMT(new Date(24, 4, 2021));
        PGW2.setJabatan("Dosen Tamu");
        PGW2.setGajiPokok(1000000);
        System.out.println("----- Isi PGW2 setelah dimutasi  -----");
        PGW2.printInfo();
        System.out.println();

        // contoh implementasi getSUang(float inp)
        System.out.println("----- Contoh Implementasi getSUang(float inp)  -----");
        System.out.println("Gaji Pokok pegawai dengan NIP " + PGW1.getNIP() + " adalah " + PGW1.getSUang(PGW1.getGajiPokok()));
        System.out.println("Gaji Pokok pegawai dengan NIP " + PGW2.getNIP() + " adalah " + PGW2.getSUang(PGW2.getGajiPokok()));
        System.out.println();

        /****************** Implementasi Class Tendik ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Tendik ******************/");
        // contoh implementasi konstruktor tanpa parameter
        Tendik TD1 = new Tendik();

        // contoh implementasi konstruktor dengan parameter
        Tendik TD2 = new Tendik("3213213218", "Dina", new Date(1, 1, 2001), new Date(5, 5, 2020), 2000000, "Tata Usaha");

        // contoh implementasi printInfo
        System.out.println();
        System.out.println("----- Contoh Implementasi printInfo  -----");
        System.out.println("----- Isi TD1 Saat Ini  -----");
        TD1.printInfo();
        System.out.println("----- Isi TD2 Saat Ini  -----");
        TD2.printInfo();
        System.out.println();

        // contoh implementasi selektor
        System.out.println("----- Contoh Implementasi Selektor  -----");
        System.out.println(TD1.getJabatan() + " bernama " + TD1.getNama() + " dengan NIP " + TD1.getNIP() + " lahir pada " + TD1.getTglLahir().getSDate() + "."); 
        System.out.println("Bekerja pada Bidang" + TD1.getBidang() + " terhitung mulai tanggal " + TD1.getTMT().getSDate() + " dengan gaji pokok " + TD1.getGajiPokok() + "."); 
        System.out.println();
        System.out.println(TD2.getJabatan() + " bernama " + TD2.getNama() + " dengan NIP " + TD2.getNIP() + " lahir pada " + TD2.getTglLahir().getSDate() + "."); 
        System.out.println("Bekerja pada Bidang" + TD2.getBidang() + " terhitung mulai tanggal " + TD2.getTMT().getSDate() + " dengan gaji pokok " + TD2.getGajiPokok() + "."); 
        System.out.println();
        System.out.println("BUP Tenaga Kependidikan adalah " +  Tendik.getBUP());
        System.out.println("Presentase Tunjangan Tenaga Kependidikan adalah " +  Tendik.getPt());
        System.out.println();

        // contoh implementasi mutator
        System.out.println("----- Contoh Implementasi Mutator  -----");
        
        System.out.println("----- Isi TD1 setelah dimutasi  -----");
        TD1.setNIP("1091091098");
        TD1.setNama("Paimon");
        TD1.setTglLahir(new Date(2,2, 1997));
        TD1.setTMT(new Date(3, 5, 2023));
        TD1.setGajiPokok(2000000);
        TD1.setBidang("Tata Usaha");
        TD1.printInfo();
        
        System.out.println("----- Isi TD2 setelah dimutasi  -----");
        TD2.setNIP("1921921924");
        TD2.setNama("Venti");
        TD2.setTglLahir(new Date(3,3, 1997));
        TD2.setTMT(new Date(17, 6, 2022));
        TD2.setGajiPokok(2500000);
        TD2.setBidang("Perpustakaan");
        TD2.printInfo();

        System.out.println("----- Isi Atribut BUP dan Pt setelah dimutasi  -----");
        Tendik.setBUP(60);
        Tendik.setPt(0.02f);
        System.out.println("BUP: " +  Tendik.getBUP());
        System.out.println("Pt: " +  Tendik.getPt());
        System.out.println();

        // mengembalikan BUP dan Pt ke nilai semula agar sesuai soal
        Tendik.setBUP(55);
        Tendik.setPt(0.01f);

        // contoh implementasi getSMasaKerja(Date today)
        System.out.println("----- Contoh Implementasi getSMasaKerja(Date today)  -----");
        System.out.println("Misalkan hari ini adalah 31 Maret 2026");
        System.out.println("Masa Kerja Tendik dengan NIP " + TD1.getNIP() + " adalah " + TD1.getSMasaKerja(new Date(31, 3, 2026)));
        System.out.println("Masa Kerja Tendik dengan NIP " + TD2.getNIP() + " adalah " + TD2.getSMasaKerja(new Date(31, 3, 2026)));
        System.out.println();

        // contoh implementasi getSTglPensiun()
        System.out.println("----- Contoh Implementasi getSTglPensiun()  -----");
        System.out.println("Tanggal Pensiun Tendik dengan NIP " + TD1.getNIP() + " adalah " + TD1.getSTglPensiun());
        System.out.println("Tanggal Pensiun Tendik dengan NIP " + TD2.getNIP() + " adalah " + TD2.getSTglPensiun());
        System.out.println();

        // contoh implementasi getSTunjangan(Date today)
        System.out.println("----- Contoh Implementasi getSTunjangan(Date today)  -----");
        System.out.println("Misalkan hari ini adalah 1 April 2026");
        System.out.println("Tunjangan Tendik dengan NIP " + TD1.getNIP() + " adalah " + TD1.getSTunjangan(new Date(1, 4, 2026)));
        System.out.println("Tunjangan Tendik dengan NIP " + TD2.getNIP() + " adalah " + TD2.getSTunjangan(new Date(1, 4, 2026)));
        System.out.println();

        // contoh implementasi printBUP()
        System.out.println("----- Contoh Implementasi printBUP()  -----");
        Tendik.printBUP();
        System.out.println();

        // contoh implementasi printPt()
        System.out.println("----- Contoh Implementasi printPt()  -----");
        Tendik.printPt();

        /****************** Implementasi Class Dosen ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class Dosen ******************/");
        // contoh implementasi konstruktor tanpa parameter
        Dosen DS1 = new Dosen();

        // contoh implementasi konstruktor dengan parameter
        Dosen DS2 = new Dosen("9879879871", "Fern", new Date(14, 5, 1985), new Date(5, 4, 2015), 5000000, "Fakultas Sains dan Matematika");
        
        // contoh implementasi printInfo
        System.out.println();
        System.out.println("----- Contoh Implementasi printInfo  -----");
        System.out.println("----- Isi DS1 Saat Ini  -----");
        DS1.printInfo();
        System.out.println("----- Isi DS2 Saat Ini  -----");
        DS2.printInfo();
        System.out.println();

        // contoh implementasi selektor
        System.out.println("----- Contoh Implementasi Selektor  -----");
        System.out.println(DS1.getJabatan() + " bernama " + DS1.getNama() + " dengan NIP " + DS1.getNIP() + " lahir pada " + DS1.getTglLahir().getSDate() + "."); 
        System.out.println("Dosen di " + DS1.getFakultas() + " terhitung mulai tanggal " + DS1.getTMT().getSDate() + " dengan gaji pokok " + DS1.getGajiPokok() + ".");
        System.out.println();

        System.out.println(DS2.getJabatan() + " bernama " + DS2.getNama() + " dengan NIP " + DS2.getNIP() + " lahir pada " + DS2.getTglLahir().getSDate() + "."); 
        System.out.println("Dosen di " + DS2.getFakultas() + " terhitung mulai tanggal " + DS2.getTMT().getSDate() + " dengan gaji pokok " + DS2.getGajiPokok() + ".");
        System.out.println();

        // contoh implementasi mutator
        System.out.println("----- Contoh Implementasi Mutator  -----");
        System.out.println("----- Isi DS1 setelah dimutasi  -----");
        DS1.setNIP("3453453457");
        DS1.setNama("Stark");
        DS1.setTglLahir(new Date(6,10, 1983));
        DS1.setTMT(new Date(25, 8, 2010));
        DS1.setGajiPokok(6000000);
        DS1.setFakultas("Fakultas Hukum");
        DS1.printInfo();

        System.out.println("----- Isi DS2 setelah dimutasi  -----");
        DS2.setNIP("4844844842");
        DS2.setNama("Genau");
        DS2.setTglLahir(new Date(31,7, 1984));
        DS2.setTMT(new Date(21, 7, 2012));
        DS2.setGajiPokok(6500000);
        DS2.setFakultas("Fakultas Teknik");
        DS2.printInfo();
        System.out.println();

        /****************** Implementasi Class DosenTetap ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class DosenTetap ******************/");
        // contoh implementasi konstruktor tanpa parameter
        DosenTetap DSI1 = new DosenTetap();

        // contoh implementasi konstruktor dengan parameter
        DosenTetap DSI2 = new DosenTetap("5675675678", "Methode", new Date(17, 7, 1993), new Date(13, 6, 2014), 6000000, "Fakultas Ilmu Sosial dan Ilmu Politik", "1231234");
        
        // contoh implementasi printInfo
        System.out.println();
        System.out.println("----- Contoh Implementasi printInfo  -----");
        System.out.println("----- Isi DSI1 Saat Ini  -----");
        DSI1.printInfo();
        System.out.println("----- Isi DSI2 Saat Ini  -----");
        DSI2.printInfo();
        System.out.println();

        // contoh implementasi selektor
        System.out.println("----- Contoh Implementasi Selektor  -----");
        System.out.println(DSI1.getJabatan() + " bernama " + DSI1.getNama() + " dengan NIP " + DSI1.getNIP());
        System.out.println("dan NIDN " + DSI1.getNIDN() + " lahir pada " + DSI1.getTglLahir().getSDate() + "."); 
        System.out.println("Mengajar " + DSI1.getFakultas() + " terhitung mulai tanggal " + DSI1.getTMT().getSDate());
        System.out.println("dengan gaji pokok " + DSI1.getGajiPokok() + ".");
        System.out.println();

        System.out.println(DSI2.getJabatan() + " bernama " + DSI2.getNama() + " dengan NIP " + DSI2.getNIP());
        System.out.println("dan NIDN " + DSI2.getNIDN() + " lahir pada " + DSI2.getTglLahir().getSDate() + "."); 
        System.out.println("Mengajar " + DSI2.getFakultas() + " terhitung mulai tanggal " + DSI2.getTMT().getSDate());
        System.out.println("dengan gaji pokok " + DSI2.getGajiPokok() + ".");
        System.out.println();

        // contoh implementasi mutator
        System.out.println("----- Contoh Implementasi Mutator  -----");
        System.out.println("----- Isi DSI1 setelah dimutasi  -----");
        DSI1.setNIP("7867867865");
        DSI1.setNama("Serie");
        DSI1.setTglLahir(new Date(2,12, 1975));
        DSI1.setTMT(new Date(2, 4, 2010));
        DSI1.setGajiPokok(7000000);
        DSI1.setFakultas("Fakultas Hukum");
        DSI1.setNIDN("3833834");
        DSI1.printInfo();

        System.out.println("----- Isi DSI2 setelah dimutasi  -----");
        DSI1.setNIP("4354354356");
        DSI1.setNama("Himmel");
        DSI1.setTglLahir(new Date(26,11, 1979));
        DSI1.setTMT(new Date(19, 7, 2014));
        DSI1.setGajiPokok(6500000);
        DSI1.setFakultas("Fakultas Psikologi");
        DSI1.setNIDN("2032034");
        DSI2.printInfo();
        System.out.println();

        System.out.println("----- Isi Atribut BUP dan Pt setelah dimutasi  -----");
        DosenTetap.setBUP(60);
        DosenTetap.setPt(0.01f);
        System.out.println("BUP: " +  DosenTetap.getBUP());
        System.out.println("Pt: " +  DosenTetap.getPt());
        System.out.println();

        // mengembalikan BUP dan Pt ke nilai semula agar sesuai soal
        DosenTetap.setBUP(65);
        DosenTetap.setPt(0.02f);

        // contoh implementasi getSMasaKerja(Date today)
        System.out.println("----- Contoh Implementasi getSMasaKerja(Date today)  -----");
        System.out.println("Misalkan hari ini adalah 27 Oktober 2026");
        System.out.println("Masa Kerja Dosen Tetap dengan NIP " + DSI1.getNIP() + " adalah " + DSI1.getSMasaKerja(new Date(27, 10, 2026)));
        System.out.println("Masa Kerja Dosen Tetap dengan NIP " + DSI2.getNIP() + " adalah " + DSI2.getSMasaKerja(new Date(27, 10, 2026)));
        System.out.println();

        // contoh implementasi getSTglPensiun()
        System.out.println("----- Contoh Implementasi getSTglPensiun()  -----");
        System.out.println("Tanggal Pensiun Dosen Tetap dengan NIP " + DSI1.getNIP() + " adalah " + DSI1.getSTglPensiun());
        System.out.println("Tanggal Pensiun Dosen Tetap dengan NIP " + DSI2.getNIP() + " adalah " + DSI2.getSTglPensiun());
        System.out.println();

        // contoh implementasi getSTunjangan(Date today)
        System.out.println("----- Contoh Implementasi getSTunjangan(Date today)  -----");
        System.out.println("Misalkan hari ini adalah 1 Juni 2026");
        System.out.println("Tunjangan Dosen Tetap dengan NIP " + DSI1.getNIP() + " adalah " + DSI1.getSTunjangan(new Date(1, 6, 2026)));
        System.out.println("Tunjangan Dosen Tetap dengan NIP " + DSI2.getNIP() + " adalah " + DSI2.getSTunjangan(new Date(1, 6, 2026)));
        System.out.println();

        // contoh implementasi printBUP()
        System.out.println("----- Contoh Implementasi printBUP()  -----");
        DosenTetap.printBUP();
        System.out.println();

        // contoh implementasi printPt()
        System.out.println("----- Contoh Implementasi printPt()  -----");
        DosenTetap.printPt();

        /****************** Implementasi Class DosenTamu ******************/
        System.out.println();
        System.out.println("/****************** Implementasi Class DosenTamu ******************/");
        // contoh implementasi konstruktor tanpa parameter
        DosenTamu DSO1 = new DosenTamu();

        // contoh implementasi konstruktor dengan parameter
        DosenTamu DSO2 = new DosenTamu("4564564567", "Heeseung", new Date(12, 3, 1994), new Date(23, 6, 2025), 500000, "Fakultas Pendidikan", "2052054", new Date(31, 5, 2026));
        
        // contoh implementasi printInfo
        System.out.println();
        System.out.println("----- Contoh Implementasi printInfo  -----");
        System.out.println("----- Isi DSO1 Saat Ini  -----");
        DSO1.printInfo();
        System.out.println("----- Isi DSO2 Saat Ini  -----");
        DSO2.printInfo();
        System.out.println();

        // contoh implementasi selektor
        System.out.println("----- Contoh Implementasi Selektor  -----");
        System.out.println(DSO1.getJabatan() + " bernama " + DSO1.getNama() + " dengan NIP " + DSO1.getNIP());
        System.out.println("dan NIDK " + DSO1.getNIDK() + " lahir pada " + DSO1.getTglLahir().getSDate() + "."); 
        System.out.println("Mengajar " + DSO1.getFakultas() + " terhitung mulai tanggal " + DSO1.getTMT().getSDate());
        System.out.println("dengan gaji pokok " + DSO1.getGajiPokok() + ". Kontrak berarkhir pada " + DSO1.getNIDK());
        System.out.println();

        System.out.println(DSO2.getJabatan() + " bernama " + DSO2.getNama() + " dengan NIP " + DSO2.getNIP());
        System.out.println("dan NIDK " + DSO2.getNIDK() + " lahir pada " + DSO2.getTglLahir().getSDate() + "."); 
        System.out.println("Mengajar " + DSO2.getFakultas() + " terhitung mulai tanggal " + DSO2.getTMT().getSDate());
        System.out.println("dengan gaji pokok " + DSO2.getGajiPokok() + ". Kontrak berarkhir pada " + DSO2.getNIDK());
        System.out.println();

        // contoh implementasi mutator
        System.out.println("----- Contoh Implementasi Mutator  -----");
        System.out.println("----- Isi DSO1 setelah dimutasi  -----");
        DSO1.setNIP("8908908901");
        DSO1.setNama("Lugner");
        DSO1.setTglLahir(new Date(3,1, 1976));
        DSO1.setTMT(new Date(1, 10, 2024));
        DSO1.setGajiPokok(550000);
        DSO1.setFakultas("Fakultas Hukum");
        DSO1.setNIDK("3023021");
        DSO1.setTglAkhirKontrak(new Date(1, 10, 2026));
        DSO1.printInfo();
        System.out.println();

        System.out.println("----- Isi DSO2 setelah dimutasi  -----");
        DSO2.setNIP("7897897895");
        DSO2.setNama("Clorinde");
        DSO2.setTglLahir(new Date(23,12, 1979));
        DSO2.setTMT(new Date(23, 11, 2025));
        DSO2.setGajiPokok(650000);
        DSO2.setFakultas("Fakultas Seni/Desain");
        DSO2.setNIDK("7817817");
        DSO2.setTglAkhirKontrak(new Date(1, 10, 2026));
        DSO2.printInfo();
        System.out.println();

        System.out.println("----- Isi Atribut BUP dan Pt setelah dimutasi  -----");
        DosenTamu.setPt(0.01f);
        System.out.println("Pt: " +  DosenTamu.getPt());
        System.out.println();

        // mengembalikan Pt ke nilai semula agar sesuai soal
        DosenTamu.setPt(0.25f);

        // contoh implementasi getSMasaKerja(Date today)
        System.out.println("----- Contoh Implementasi getSMasaKerja(Date today)  -----");
        System.out.println("Misalkan hari ini adalah 2 September 2026");
        System.out.println("Masa Kerja Dosen Tamu dengan NIP " + DSO1.getNIP() + " adalah " + DSO1.getSMasaKerja(new Date(2, 9, 2026)));
        System.out.println("Masa Kerja Dosen Tamu dengan NIP " + DSO2.getNIP() + " adalah " + DSO2.getSMasaKerja(new Date(2, 9, 2026)));
        System.out.println();

        // contoh implementasi getSMasaEndKontrak(Date today)
        System.out.println("----- Contoh Implementasi getSMasaEndKontrak(Date today)  -----");
        System.out.println("Misalkan hari ini adalah 20 Maret 2026");
        System.out.println("Masa berakhir kontrak Dosen Tamu dengan NIP " + DSO1.getNIP() + " adalah " + DSO1.getSMasaEndKontrak(new Date(2, 9, 2026)));
        System.out.println("Masa berakhir kontrak Dosen Tamu dengan NIP " + DSO2.getNIP() + " adalah " + DSO2.getSMasaEndKontrak(new Date(2, 9, 2026)));
        System.out.println();

        // contoh implementasi getSTunjangan()
        System.out.println("----- Contoh Implementasi getSTunjangan()  -----");
        System.out.println("Tunjangan Dosen Tamu dengan NIP " + DSO1.getNIP() + " adalah " + DSO1.getSTunjangan());
        System.out.println("Tunjangan Dosen Tamu dengan NIP " + DSO2.getNIP() + " adalah " + DSO2.getSTunjangan());
        System.out.println();
        
        // contoh implementasi printPt()
        System.out.println("----- Contoh Implementasi printPt()  -----");
        DosenTamu.printPt();
    }
}
