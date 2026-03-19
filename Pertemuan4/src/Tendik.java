/*Nama File : Tendik.java */
/*Deskripsi: berisi atribut dan methods dalam class Tendik*/
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 19 Maret 2026*/
/*Lab: C1 */

public class Tendik extends Pegawai {
    /*********************ATRIBUT*********************/
    protected String Bidang;
    protected static int BUP = 55;
    protected static float Pt = 0.01f;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Tendik(){
        super();
        this.setJabatan("Tenaga Kependidikan");
        this.Bidang = "N/A";
    }

    // konstruktor dengan parameter 
    public Tendik(String NIP, String Nama, Date TglLahir, Date TMT, float GajiPokok, String Bidang){
        super(NIP, Nama, TglLahir, TMT, "Tenaga Kependidikan", GajiPokok);
        this.Bidang = Bidang;
    }
    
    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut Bidang
    public String getBidang(){
        return this.Bidang;
    }

    // mengembalikan nilai atribut BUP
    public static int getBUP(){
        return BUP;
    }

    // mengembalikan nilai atribut Pt
    public static float getPt(){
        return Pt;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut Bidang
    public void setBidang(String Bidang){
        this.Bidang = Bidang;
    }

    // mengubah nilai atribut BUP
    public static void setBUP(int iBUP){
        BUP = iBUP;
    }

    // mengubah nilai atribut Pt
    public static void setPt(float iPt){
        Pt = iPt;
    }
    
    /*------------------LAINNYA-------------------*/
    // mengembalikan string berisi masa kerja Tendik
    public String getSMasaKerja(Date today){
        int year = 0;
        int month = 0;
        int AThn = this.getTMT().getTahun();
        int BThn = today.getTahun();
        int ABln = this.getTMT().getBulan();
        int BBln = today.getBulan();

        if(AThn < BThn){
            if(BBln > ABln){
                year = BThn - AThn;
                month = BBln - ABln;
            }
            else if (ABln > BBln){
                year = BThn - 1 - AThn;
                month = 12 - ABln + BBln - 1;
            }
            else{
                int Atgl = this.getTMT().getTgl();
                int Btgl = today.getTgl();
                if (Atgl <= Btgl){
                    year = BThn - AThn;
                    month = 0;
                }
                else{
                    year = BThn - 1 - AThn;
                    month = 11;
                }
            }
        }
        else if(AThn == BThn){
            year = 0;
            if(BBln > ABln){
                month = BBln - ABln;
            }
            else if (ABln == BBln){
                month = 0;
            }
        }

        String out = year + " tahun " + month + " bulan ";
        return out;
    }

    // mengembalikan string berisi Tanggal Pensiun Tendik
    public String getSTglPensiun(){
        int year = this.getTMT().getTahun() + BUP;
        int month = this.getTMT().getBulan() + 1;

        String out = new Date(1, month, year).getSDate();
        return out;
    }

    // mengembalikan string untuk Tunjangan 
    public String getSTunjangan(Date today){
        // percentage tunjangan
        String pct = String.format("%.1f", Pt*100) + "%";

        // tahun
        int year = 0;
        int AThn = this.getTMT().getTahun();
        int BThn = today.getTahun();
        int ABln = this.getTMT().getBulan();
        int BBln = today.getBulan();

        if(AThn < BThn){
            if(BBln > ABln){
                year = BThn - AThn;
            }
            else if (ABln > BBln){
                year = BThn - 1 - AThn;
            }
            else{
                int Atgl = this.getTMT().getTgl();
                int Btgl = today.getTgl();
                if (Atgl <= Btgl){
                    year = BThn - AThn;
                }
                else{
                    year = BThn - 1 - AThn;
                }
            }
        }

        // menghitung tunjangan
        float T = Pt * year * this.GajiPokok; 


        String out = pct + " x " + year + " x " + this.getSUang(this.getGajiPokok()) + " = " + this.getSUang(T);
        return out;
    }

    // printInfo untuk Pegawai
    @Override
    public void printInfo(){
        System.out.println("NIP               : " + this.NIP);
        System.out.println("Nama              : " + this.Nama);
        System.out.println("Tanggal Lahir     : " + this.TglLahir.getSDate());
        System.out.println("TMT               : " + this.TMT.getSDate());
        System.out.println("Jabatan           : " + this.Jabatan);
        System.out.println("Bidang            : " + this.Bidang);

        // Masa Kerja
        if(this.getTMT().getTgl() == 0){
            System.out.println("Masa Kerja        : 0 tahun 0 bulan" );
        }
        else{
            System.out.println("Masa Kerja        : " + this.getSMasaKerja(new Date(19, 3, 2026)));
        }

        // Tanggal Pensiun
        if(this.getTglLahir().getTgl() == 0){
            System.out.println("Tanggal Pensiun   : 0 N/A 0");
        }
        else{
            System.out.println("Tanggal Pensiun   : " + this.getSTglPensiun());
        }

        // Gaji Pokok
        System.out.println("Gaji Pokok        : " + this.getSUang(this.GajiPokok));

        // Tunjangan
        if(this.GajiPokok == 0){
            System.out.println("Tunjangan         : 0.0% x 0 x Rp 0,00 = Rp 0,00" );
        }
        else{
            System.out.println("Tunjangan         : " + this.getSTunjangan(new Date(19, 3, 2026)));
        }
    }

    // print nilai atribut BUP
    public static void printBUP(){
       System.out.println(BUP);
    }

    // print nilai atribut Pt
    public static void printPt(){
       System.out.println(Pt);
    }

    // end of Class Tendik
}
