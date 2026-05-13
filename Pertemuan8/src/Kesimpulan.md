Nama File : Kesimpulan.md 
Deskripsi: menyimpulkan cara kerja konsep Generik 
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 13 Mei 2026 
Lab: C1

Generik merupakan konsep dimana jenis/tipe belum ditentukan saat 
pendefinisian suatu kelas. Jenis/tipe ditentukan saat kelas generic tersebut digunakan dalam kamus. 
Generik dapat diterapkan pada class (Datum<T>), operator (OperatorGenerik), dan larik (Data<T>).

Datum<T>
Jika suatu objek pertama kali didefinisikan dengan sebuah kelas, maka objek dari anak-anak dari 
kelas tersebut dapat mengisi atribut isi. Pada kasus ini, salah satu contohnya adalah Datum<Anabul>. 
Prosedur setIsi() dapat diterapkan pada objek Anjing, Burung, Kucing, Anggora, dan KembangTelon.

OperatorGenerik
Kelas ini dibuat untuk menyimpan metode-metode generik. 
public static <T> void Tukar(T[] arr) dapat diterapkan pada tipe data apapun.
public static double Bobot2(Kucing K1, Kucing K2) dapat diterapkan
pada objek dari kelas Kucing. Secara lebih spesifik lagi, bisa pada objek dari kelas Anggora 
dan KembangTelon (yang merupakan anak dari kelas Kucing).

Data<T>
Kelas ini dapat digunakan untuk menciptakan objek yang menyimpan
objek-objek lainnya. T dapat berupa tipe data apapun (baik dasar
seperti int dan String, maupun bentukan seperti Anabul).
Atribut ruang dapat diisi objek sesuai dengan T yang didefinisikan
di main. Jika T adalah string, elemen pada ruang akan bertipe string. Jika T adalah Anabul, 
elemen pada ruang dapat berupa objek Anabul, Anjing, Burung, Kucing, Anggora, dan KembangTelon

