import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int what = sc.nextInt();
        String is = sc.next();
        int that = sc.nextInt();

        System.out.println(is.equals("+")?what+that:what-that);
        sc.close();
    }
}