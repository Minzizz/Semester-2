import java.util.Scanner;
public class PerulanganDeretBil {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long nim;
        int n;

        System.out.print("Input NIM: ");
        nim=in.nextLong();
        n=(int)(nim%100);
        if (n%100<10) {
            n+=10;
            System.out.println("n = "+n);
        }
        
        for (int i = 1; i <= n; i++) {
            if (i==6||i==10) {
                continue;
            }
            if (i%2!=0) {
                System.out.print("*");
            }else{
                System.out.print(i);
            }
        }
    }
}