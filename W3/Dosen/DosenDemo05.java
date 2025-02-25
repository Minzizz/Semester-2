package W3.Dosen;
import java.util.Scanner;
public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jmlDosen, usia;
        String dummy, kode, nama;
        boolean jenisKelamin=false;

        System.out.print("Masukkan jumlah dosen yang ingin didata: ");
        jmlDosen=in.nextInt();
        in.nextLine();
        
        Dosen05[] arrayOfDosen = new Dosen05[jmlDosen];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i]=new Dosen05();
            System.out.println("Masukkan Data dosen ke-"+(i+1));
            System.out.print("Kode         : ");
            kode=in.nextLine();
            System.out.print("Nama         : ");
            nama=in.nextLine();
            System.out.print("Jenis Kelamin: ");
            dummy = in.nextLine();
            if (dummy.equalsIgnoreCase("Pria")) {
                jenisKelamin=true;
            }else if (dummy.equalsIgnoreCase("Wanita")){
                jenisKelamin=false;
            }
            System.out.print("Usia         : ");
            usia=in.nextInt();
            in.nextLine();
            System.out.println("=================================");

            arrayOfDosen[i].dosen(kode, nama, jenisKelamin, usia);
        }

        System.out.println("Data Dosen");
        System.out.println("=================================");
        DataDosen05.dataSemuaDosen(arrayOfDosen);
        DataDosen05.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen05.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen05.infoDosenPalingTua(arrayOfDosen);
        DataDosen05.infoDosenPalingMuda(arrayOfDosen);
        in.close();
    }
    
}
