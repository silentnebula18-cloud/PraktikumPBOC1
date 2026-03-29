/*Nama File : IResize.java */
/*Deskripsi: interface dengan metode zoomIn, zoomOut, dan zoom
/*Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) */
/*Tanggal: 28 Maret 2026*/
/*Lab: C1 */
public interface IResize {
    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);

    // end of Interface IResize
}
