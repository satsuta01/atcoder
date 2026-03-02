import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int  w = sc.nextInt();
        int  h = sc.nextInt();
        int  a = sc.nextInt();
        int  t = sc.nextInt();

        System.out.println(w*h>a*t?w*h:a*t);
        sc.close();
    }
}