package W3.Matakuliah;
import java.util.Scanner;
public class MataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String kode, nama, dummy;
        int sks, jumlahJam, totalMK;
        System.out.print("Masukkan Jumlah Mata Kuliah yang ingin didata: ");
        totalMK = in.nextInt();
        in.nextLine();
        MataKuliah05[] arrayOfMatakuliah= new MataKuliah05[totalMK];

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            arrayOfMatakuliah[i] = new MataKuliah05();
            System.out.println("Masukkan Data Matakuliah ke-"+(i+1));
            System.out.print("Kode       : ");
            kode = in.nextLine();
            System.out.print("Nama       : ");
            nama = in.nextLine();
            System.out.print("SKS        : ");
            dummy = in.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = in.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------");

            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        System.out.println();
        System.out.println("Data Mata Kuliah");
        System.out.println("----------------------------------");
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            arrayOfMatakuliah[i].cetakInfo();
        }

        in.close();
    }
    

}
