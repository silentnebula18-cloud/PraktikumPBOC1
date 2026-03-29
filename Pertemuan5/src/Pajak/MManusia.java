/*Nama File : MManusia.java */
/*Deskripsi: main untuk menggunakan class Manusia, PNS, Pengusaha, Petani 
             dan Interface Pajak */
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 29 Maret 2026*/
/*Lab: C1 */

package Pajak;

public class MManusia {
    public static void main(String[] args){
        PNS p1 = new PNS("Satriyo", "01-04-2006", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", "01-01-2000", "Jl.Air", 55000000, "000-556-773-212-000-5"); 
        Petani pt1 = new Petani("Nugraha", "09-01-1977", "Jl. Bunga 9 Tembalang", 5000000, "wonogiri"); 
        PNS p2 = new PNS("Panji", "01-04-2010", 10000000, "198004212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("----- Banyak Objek per Kelas -----");
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns()); 
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS()); 
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha()); 
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        System.out.println();

        System.out.println("----- Pajak p1, pe1, dan pt1 -----");
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak()); 
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak()); 
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println();

        System.out.println("----- Masa Kerja p1, pe1, dan pt1 -----");
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja()); 
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja()); 
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja()); 
        System.out.println();

        System.out.println("----- cetakInfo() p1, pe1, dan pt1 -----");
        p1.cetakInfo(); 
        System.out.println();
        pe1.cetakInfo(); 
        System.out.println();
        pt1.cetakInfo();
    }

    // end of class MManusia
}
