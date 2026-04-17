/*
Nama File : ExceptionOnArray.java 
Deskripsi: Program penggunaan eksepsi menggunakan class library Java
Pembuat: Christianna Olivia Juniarti Manullang (24060124140168) 
Tanggal: 17 April 2026
Lab: C1 
*/

public class ExceptionOnArray {
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally{
            System.out.println("clean up code ...");
        }
    }
}

// Hasil run dengan java -cp bin ExceptionOnArray
/*
java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at ExceptionOnArray.main(ExceptionOnArray.java:15)
clean up code ...
*/
