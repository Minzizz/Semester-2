import java.util.Scanner;
public class ArrayIP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalMatkul=0;
        System.out.print("Masukkan banyaknya Mata Kuliah: ");
        totalMatkul=in.nextInt();
        in.nextLine();
        String[] namaMatkul=new String[totalMatkul];

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan Mata Kuliah ke-"+(i+1)+": ");
            namaMatkul[i]=in.nextLine();
        }
        int totalSKS=0;
        int[] bobotSKS=new int[totalMatkul];
        double[] nilaiAngka=new double[totalMatkul];
        String[] nilaiHuruf=new String[totalMatkul];
        double[] nilaiSetara=new double[totalMatkul];
        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk Mata Kuliah "+namaMatkul[i]+": ");
            nilaiAngka[i]=in.nextInt();   
            if (nilaiAngka[i]>100||nilaiAngka[i]<0) {
                System.out.println("Nilai Tidak Valid, Ulangi lagi!");
                i--;
                continue;
            }
            System.out.print("Masukkan bobot SKS untuk Mata Kuliah "+namaMatkul[i]+": ");
            bobotSKS[i]=in.nextInt();
            totalSKS+=bobotSKS[i];
            
            if (nilaiAngka[i]>80) {
                nilaiHuruf[i]="A";
                nilaiSetara[i]=4.0;
            }
            else if (nilaiAngka[i]>73) {
                nilaiHuruf[i]="B+";
                nilaiSetara[i]=3.5;
            }
            else if (nilaiAngka[i]>65) {
                nilaiHuruf[i]="B";
                nilaiSetara[i]=3.0;
            }
            else if (nilaiAngka[i]>60) {{
                nilaiHuruf[i]="C+";
                nilaiSetara[i]=2.5;
            }}
            else if (nilaiAngka[i]>50) {{
                nilaiHuruf[i]="C";
                nilaiSetara[i]=2.0;
            }}
            else if (nilaiAngka[i]>39) {
                nilaiHuruf[i]="D";
                nilaiSetara[i]=1.0;
            }
            else if (nilaiAngka[i]<=39) {
                nilaiHuruf[i]="E";
                nilaiSetara[i]=0;
            }
                
            
            }

            System.out.println("====================================");
            System.out.println("Hasil Konversi Nilai");
            System.out.println("====================================");
            System.out.println("Mata Kuliah\t\t\t\t Nilai Angka\tNilai Huruf\tBobot Nilai");
            double totalNilai=0;

            for (int i = 0; i < nilaiSetara.length; i++) {
                System.out.printf("%-40s %-14.2f %-15s %-12.2f",namaMatkul[i],nilaiAngka[i],nilaiHuruf[i],nilaiSetara[i]);
                System.out.println();

                totalNilai+=(nilaiSetara[i]*bobotSKS[i]);
            }
        double totalIP=totalNilai/totalSKS;
        System.out.println("====================================");
        System.out.println("IP : "+totalIP);
        in.close();
    }
}
