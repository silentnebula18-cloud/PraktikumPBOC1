/*Nama File : DosenTamu.java */
/*Deskripsi: berisi atribut dan methods dalam class DosenTamu*/
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 20 Maret 2026*/
/*Lab: C1 */

public class DosenTamu extends Dosen{
    /*********************ATRIBUT*********************/
    protected String NIDK;
    protected Date TglAkhirKontrak;
    protected static float Pt = 0.025f;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public DosenTamu(){
        super();
        this.setJabatan("Dosen Tamu");
        this.NIDK = "N/A";
        this.TglAkhirKontrak = new Date(0, 0, 0);
    }

    // konstruktor dengan parameter 
    public DosenTamu(String NIP, String Nama, Date TglLahir, Date TMT, float GajiPokok, String Fakultas, String NIDK, Date TglAkhirKontrak){
        super(NIP, Nama, TglLahir, TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.setJabatan("Dosen Tamu");
        this.TglAkhirKontrak = TglAkhirKontrak;
    } 

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut NIDK
    public String getNIDK(){
        return this.NIDK;
    }

    // mengembalikan nilai atribut TglAkhirKontrak
    public Date getTglAkhirKontrak(){
        return this.TglAkhirKontrak;
    }

    // mengembalikan nilai atribut Pt
    public static float getPt(){
        return Pt;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut NIDK
    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    // mengubah nilai atribu TglAkhirKontrak
    public void setTglAkhirKontrak(Date TglAkhirKontrak){
        this.TglAkhirKontrak = TglAkhirKontrak;
    }

    // mengubah nilai atribut Pt
    public static void setPt(float iPt){
        Pt = iPt;
    }
    
    /*------------------LAINNYA-------------------*/
    // mengembalikan string berisi masa kerja Dosen Tamu
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

    // mengembalikan string masa berakhir kontrak Dosen Tamu
    public String getSMasaEndKontrak(Date today){
        int m = this.TglAkhirKontrak.getBulan() - today.getBulan();
        String out = m + " bulan";

        return out;
    }

    // mengembalikan string untuk Tunjangan Dosen Tamu
    public String getSTunjangan(){
        // percentage tunjangan
        String pct = String.format("%.1f", Pt*100) + "%";

        // menghitung tunjangan
        float T = Pt * this.GajiPokok; 


        String out = pct + " x " + this.getSUang(this.getGajiPokok()) + " = " + this.getSUang(T);
        return out;
    }

    // print nilai atribut-atribut (non-static) 
    @Override
    public void printInfo(){
        System.out.println("NIP                        : " + this.NIP);
        System.out.println("NIDK                       : " + this.NIDK);
        System.out.println("Nama                       : " + this.Nama);
        System.out.println("Tanggal Lahir              : " + this.TglLahir.getSDate());
        System.out.println("TMT                        : " + this.TMT.getSDate());
        System.out.println("Jabatan                    : " + this.Jabatan);
        System.out.println("Fakultas                   : " + this.Fakultas);
        
        // Masa Kerja
        if(this.getTMT().getTgl() == 0){
            System.out.println("Masa Kerja                 : 0 tahun 0 bulan" );
        }
        else{
            System.out.println("Masa Kerja                 : " + this.getSMasaKerja(new Date(19, 3, 2026)));
        }

        // Tanggal Berakhir Kontrak
        if(this.getTglAkhirKontrak().getTgl() == 0){
            System.out.println("Tanggal Akhir Kontrak      : 0 N/A 0" );
        }
        else{
            System.out.println("Tanggal Akhir Kontrak      : " + this.TglAkhirKontrak.getSDate());
        }

        // Masa Kontrak Berakhir
        if(this.getTglAkhirKontrak().getTgl() == 0){
            System.out.println("Masa Akhir Kontrak         : 0 N/A 0" );
        }
        else{
            System.out.println("Masa Akhir Kontrak         : " + this.getSMasaEndKontrak(new Date(19, 3, 2026)));
        }

        // Gaji Pokok
        System.out.println("Gaji Pokok                 : " + this.getSUang(this.GajiPokok));

        // Tunjangan
        if(this.GajiPokok == 0){
            System.out.println("Tunjangan                  : 0.0% x Rp 0,00 = Rp 0,00" );
        }
        else{
            System.out.println("Tunjangan                  : " + this.getSTunjangan());
        }

    }

    // print nilai atribut Pt
    public static void printPt(){
       System.out.println(Pt);
    }

    // end of Class DosenTamu
}
