package W3.Mahasiswa;
import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Mahasiswa05[] arrayOfMahasiswa = new Mahasiswa05[3];
        String dummy;

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i]=new Mahasiswa05();
            
            System.out.println("Masukkan data Mahasiswa ke-"+(i+1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = in.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = in.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = in.nextLine();
            System.out.print("IPK     : ");
            dummy = in.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------");
        }

        Mahasiswa05[] myArrayOfMahasiswa = new Mahasiswa05[3];
        myArrayOfMahasiswa[0].nim = "24407060033";
        myArrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa[0].kelas = "SIB-1E";
        myArrayOfMahasiswa[0].ipk = (float) 3.75;

        System.out.println();
        System.out.println("Data Mahasiswa");
        System.out.println("----------------------------------");
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i].cetakInfo();
        }
        in.close();
    }
}
