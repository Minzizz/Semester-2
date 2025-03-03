import java.util.Scanner;
public class VolumeKubus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sisi;

        System.out.println("Masukkan Panjang Sisi Kubus: ");
        sisi = in.nextInt();

        System.out.println("================================");
        System.out.println("Apa yang ingin anda lakukan?");
        System.out.println("1. Mencari Volume.");
        System.out.println("2. Mencari luas permukaan.");
        System.out.println("3. Mencari Keliling");

        int menu =in.nextInt();

        switch (menu) {
            case 1:
                Volume(sisi);
                break;
        
            case 2:
                LuasPermukaan(sisi);
                break;
            case 3:
                Keliling(sisi);
                break;
        }
    }
    static void Volume(int sisi){
        int volume=sisi*sisi*sisi;
        System.out.println("Volume Kubus adalah "+volume+" unit");
    }
    static void LuasPermukaan(int sisi){
        int luasPermukaan=sisi*sisi*6;
        System.out.println("Luas Permukaan kubus adalah "+luasPermukaan+" unit");
    }
    static void Keliling(int sisi){
        int Keliling=sisi*12;
        System.out.println("Keliling kubus adalah "+Keliling+" unit");
    }
}
