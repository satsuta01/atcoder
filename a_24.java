import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int m = 0;
        if(s+t>=k){
            m = (s+t)*c;
        }

        System.out.println((s*a)+(t*b)-m);
        sc.close();
    }
}