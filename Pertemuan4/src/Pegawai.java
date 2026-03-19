/*Nama File : Pegawai.java */
/*Deskripsi: berisi atribut dan methods dalam class Pegawai*/
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 19 Maret 2026*/
/*Lab: C1 */

public class Pegawai {
    /*********************ATRIBUT*********************/
    protected String NIP;
    protected String Nama;
    protected Date TglLahir;
    protected Date TMT;
    protected String Jabatan;
    protected float GajiPokok;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Pegawai(){
        this.NIP = "N/A";
        this.Nama = "N/A";
        this.TglLahir = new Date();
        this.TMT = new Date();
        this.Jabatan = "N/A";
        this.GajiPokok = 0;
    }

    // konstruktor dengan parameter 
    public Pegawai(String NIP, String Nama, Date TglLahir, Date TMT, String Jabatan, float GajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.TglLahir = TglLahir;
        this.TMT = TMT;
        this.Jabatan = Jabatan;
        this.GajiPokok = GajiPokok;
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut NIP
    public String getNIP(){
        return this.NIP;
    }

    // mengembalikan nilai atribut Nama
    public String getNama(){
        return this.Nama;
    }

    // mengembalikan nilai atribut TglLahir
    public Date getTglLahir(){
        return this.TglLahir;
    }

    // mengembalikan nilai atribut TMT
    public Date getTMT(){
        return this.TMT;
    }

    // mengembalikan nilai atribut Jabatan
    public String getJabatan(){
        return this.Jabatan;
    }

    // mengembalikan nilai atribut GajiPokok
    public float getGajiPokok(){
        return this.GajiPokok;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    // mengubah nilai atribut Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // mengubah nilai atribut TglLahir
    public void setTglLahir(Date TglLahir){
        this.TglLahir = TglLahir;
    }

    // mengubah nilai atribut TMT
    public void setTMT(Date TMT){
        this.TMT = TMT;
    }

    // mengubah nilai atribut Jabatan
    public void setJabatan(String Jabatan){
        this.Jabatan = Jabatan;
    }

    // mengubah nilai atribut GajiPokok
    public void setGajiPokok(float GajiPokok){
        this.GajiPokok = GajiPokok;
    }
    
    /*------------------LAINNYA-------------------*/
    // mengembalikan semua nilai uang dengan penulisan format Rp ...,00
    public String getSUang(float inp){
        String y = String.format("%.2f", inp);
        int end = y.length() - 4;
        int desf = y.length() - 1;
        int desi = end + 1; 
        String out = "";
        int count = 0;

        for(int i = desf; i >= 0; i--){
            if(i > desi && i <= desf){
                out = y.charAt(i) + out;
            }
            else if(i == desi){
                out = "," + out;
            }
            else{
                if(count == 3){
                    out = "." + out;
                    count = 0;
                }
                out = y.charAt(i) + out;
                count += 1;
            }
        }

        out = "Rp " + out;
        return out;
    }

    // print nilai atribut-atribut (non-static) 
    public void printInfo(){
        System.out.println("NIP               : " + this.NIP);
        System.out.println("Nama              : " + this.Nama);
        System.out.println("Tanggal Lahir     : " + this.TglLahir.getSDate());
        System.out.println("TMT               : " + this.TMT.getSDate());
        System.out.println("Jabatan           : " + this.Jabatan);
        System.out.println("Gaji Pokok        : " + this.getSUang(this.GajiPokok));
    }

    // end of class Pegawai
}
