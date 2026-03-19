/*Nama File : Date.java */
/*Deskripsi: berisi atribut dan methods dalam class Date */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 19 Maret 2026*/
/*Lab: C1 */

public class Date {
    /*********************ATRIBUT*********************/
    private int tgl;
    private int bulan;
    private int tahun;

    /*********************METHOD*********************/
    /*------------------KONSTRUKTOR-----------------*/
    // konstruktor tanpa parameter
    public Date(){
        this.tgl = 0;
        this.bulan = 0;
        this.tahun = 0;
    }

    // konstruktor dengan parameter
    public Date(int tgl, int bulan, int tahun){
        setTahun(tahun);
        setBulan(bulan);
        setTgl(tgl);
    }

    /*------------------SELEKTOR-------------------*/
    // mengembalikan nilai atribut tgl
    public int getTgl(){
        return this.tgl;
    }

    // mengembalikan nilai atribut bulan
    public int getBulan(){
        return this.bulan;
    }

    // mengembalikan nilai atribut tahun
    public int getTahun(){
        return this.tahun;
    }

    /*------------------MUTATOR-------------------*/
    // mengubah nilai atribut tgl
    public void setTgl(int tgl){
        if(this.bulan == 1 || this.bulan == 3 || this.bulan == 5 || this.bulan == 7 || this.bulan == 8 || this.bulan == 10 || this.bulan == 12){
            if(1 <= tgl && tgl <= 31){
                this.tgl = tgl;
            }
            else{
                System.out.println("Tanggal tidak valid");
            }
        }
        else if(this.bulan == 4 || this.bulan == 6 || this.bulan == 9 || this.bulan == 11){
            if(1 <= tgl && tgl <= 30){
                this.tgl = tgl;
            }
            else{
                System.out.println("Tanggal tidak valid");
            }
        }
        else if(this.bulan == 2){
            if((this.tahun % 4 == 0 && this.tahun % 100 != 0) || (this.tahun % 400 == 0)){
                if(1 <= tgl && tgl <= 29){
                    this.tgl = tgl;
                }
                else{
                    System.out.println("Tanggal tidak valid");
                }
            }
            else{
                if(1 <= tgl && tgl <= 28){
                    this.tgl = tgl;
                }
                else{
                    System.out.println("Tanggal tidak valid");
                }
            }
        }
    }
    
    // mengubah nilai atribut bulan
    public void setBulan(int bulan){
        if(1 <= bulan && bulan <= 12){
            this.bulan = bulan;
        }
        else{
            System.out.println("Bulan tidak valid");
        }
    }

    // mengubah nilai atribut tahun
    public void setTahun(int tahun){
        if (tahun > 0){
            this.tahun = tahun;
        }
        else{
            System.out.println("Tahun tidak valid");
        }
    }
    
    /*------------------LAINNYA-------------------*/
    // mengembalikan string nama bulan berdasarkan angka bulan 
    public String getNamaBulan(){
        String nb = "N/A";
        if(this.bulan == 1){
            nb = "Januari";
        }
        else if(this.bulan == 2){
            nb = "Februari";
        }
        else if(this.bulan == 3){
            nb = "Maret";
        }
        else if(this.bulan == 4){
            nb = "April";
        }
        else if(this.bulan == 5){
            nb = "Mei";
        }
        else if(this.bulan == 6){
            nb = "Juni";
        }
        else if(this.bulan == 7){
            nb = "Juli";
        }
        else if(this.bulan == 8){
            nb = "Agustus";
        }
        else if(this.bulan == 9){
            nb = "September";
        }
        else if(this.bulan == 10){
            nb = "Oktober";
        }
        else if(this.bulan == 11){
            nb = "November";
        }
        else if(this.bulan == 12){
            nb = "Desember";
        }

        return nb;
    }

    // mengembalikan string dengan format <angka hari> <nama bulan> <angka tahun>
    public String getSDate(){
        String out = this.tgl + " " + getNamaBulan() + " " + this.tahun;
        return out;
    }
    // print nilai atribut-atribut dengan bulan dalam alfabet
    public void printDate(){
        System.out.println(getSDate());
    }

    // end of class Date
}
