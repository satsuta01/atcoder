import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if ((long)b * c > (long)d * a) {
            System.out.println("TAKAHASHI");
        } else if ((long)b * c == (long)d * a) {
            System.out.println("DRAW");
        } else {
            System.out.println("AOKI");
        }

        sc.close();
    }
}