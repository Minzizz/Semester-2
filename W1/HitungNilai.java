import java.util.Scanner;
public class HitungNilai{
public static void main(String[] args) {
    int nilaiTgs, nilaiKuis, nilaiUTS, nilaiUAS;
    double nilaiAkhir;
    String nilaiHuruf="F";

    String nama;

    Scanner in = new Scanner(System.in);

    System.out.println("Program Menghitung Nilai Akhir");
    System.out.print("Nama Mahasiswa: ");
    nama=in.nextLine();
    System.out.println("==============================");
    System.out.print("Masukkan Nilai Tugas\t: ");
    nilaiTgs=in.nextInt();
    System.out.print("Masukkan nilai Kuis\t: ");
    nilaiKuis=in.nextInt();
    System.out.print("Masukkan nilai UTS\t: ");
    nilaiUTS=in.nextInt();
    System.out.print("Masukkan nilai UAS\t: ");
    nilaiUAS=in.nextInt();
    System.out.println("==============================");

    if (nilaiKuis>100||nilaiKuis<0||nilaiTgs>100||nilaiTgs<0||nilaiUAS>100||nilaiUAS<0||nilaiUTS>100||nilaiUTS<0) {
        System.out.println("Ada nilai yang tidak valid!");
    }else{
        nilaiAkhir=((nilaiKuis*0.2)+(nilaiTgs*0.2)+(nilaiUTS*0.3)+(nilaiUAS*0.3));
        System.out.println("Nilai Akhir: "+nilaiAkhir);
        if (nilaiAkhir>80) {
            nilaiHuruf="A";
        }else if (nilaiAkhir>73) {
            nilaiHuruf="B+";
        }else if (nilaiAkhir>65) {
            nilaiHuruf="B";
        }else if (nilaiAkhir>60) {
            nilaiHuruf="C+";
        }else if (nilaiAkhir>50) {
            nilaiHuruf="C";
        }else if (nilaiAkhir>39) {
            nilaiHuruf="D";
        }else if (nilaiAkhir<=39) {
            nilaiHuruf="E";
        }
        System.out.println("Nilai Huruf: "+nilaiHuruf);

        if (nilaiAkhir>50) {
            System.out.println("Selamat "+nama+" Lulus!");
        }else{
            System.out.println("Maaf "+nama+" Tidak Lulus!");
        }
    }
    
    }
}