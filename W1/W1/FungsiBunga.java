import java.util.Scanner;
public class FungsiBunga {

    static void pendapatan(int[][] stokBunga){
        Scanner in = new Scanner(System.in);
        System.out.println("Cabang mana yang ingin dilihat?");
        int cabang= in.nextInt();
        int totalPendapatan=(stokBunga[cabang-1][0]*75000)+(stokBunga[cabang-1][1]*50000)+(stokBunga[cabang-1][2]*60000)+(stokBunga[cabang-1][3]*10000);
        System.out.println("Pendapatan pada cabang "+cabang+" adalah "+totalPendapatan);
    }

    static void stokCabang(int[][] stokBunga,String[] namaBunga){
        Scanner in = new Scanner(System.in);
        System.out.println("Cabang mana yang ingin dilihat?");
        int cabang= in.nextInt();
        cabang-=1;
        System.out.println("===============================================");
        System.out.printf("%-24s %-10s %-10s %-10s %-10s\n","",namaBunga[0],namaBunga[1],namaBunga[2],namaBunga[3]);
            System.out.print("Stok pada cabang "+cabang);
            System.out.printf("%-6s %-10s %-10s %-10s %-10s","",stokBunga[cabang-1][0],stokBunga[cabang-1][1],stokBunga[cabang-1][2],stokBunga[cabang-1][3]);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] stokBunga = new int[4][4];
        String[] namaBunga = {"Aglonema","Keladi","Alocasia","Mawar"};


        for (int i = 0; i < namaBunga.length; i++) {
            System.out.println("Masukkan Stock untuk bunga "+namaBunga[i]+": ");
            for (int j = 0; j < stokBunga[i].length; j++) {
                System.out.print("Stock Cabang "+(j+1)+": ");
                stokBunga[i][j]=in.nextInt();
            }
        }

        System.out.println("Apa yang ingin anda lakukan sekarang?");
        System.out.println("1. Melihat Pendapatan Setiap Cabang jika Semua Bunga Habis Terjual.");
        System.out.println("2. Melihat Stok Bunga Pada Masing-Masing Cabang");
        int menu=in.nextInt();
        switch (menu) {
            case 1:
                pendapatan(stokBunga);
                break;
        
            case 2:
                stokCabang(stokBunga,namaBunga);
                break;
        }
    }
}