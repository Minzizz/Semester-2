import java.util.Scanner;
public class KodePlat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] KODE={'A','B','D','F','G','H','L','N','T'};
        char[][] KOTA={{'B','A','N','T','E','N'},
        {'J','A','K','A','R','T','A'},
        {'B','A','N','D','U','N','G'},
        {'C','I','R','E','B','O','N'},
        {'B','O','G','O','R'},
        {'P','E','K','A','L','O','N','G','A','N'},
        {'S','E','M','A','R','A','N','G'},
        {'S','U','R','A','B','A','Y','A'},
        {'M','A','L','A','N','G'},
        {'T','E','G','A','L'}};


        System.out.println("Kode plat yang ingin dicari?");
        char cariKode=in.next().charAt(0);
        int kodePlat=0;
        for (int i = 0; i < KODE.length; i++) {
            if (cariKode==KODE[i]) {
                kodePlat=i;
            }
        }

        System.out.print("Kota yang memiliki kode plat "+cariKode+" adalah kota ");
        for (int i = 0; i < KOTA.length; i++) {
            System.out.println("\n"+KOTA[kodePlat][i]);
            
        }


    }
}
