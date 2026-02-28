import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int  s1 = sc.nextInt();
        int  m1 = sc.nextInt();
        int  s2 = sc.nextInt();
        int  m2 = sc.nextInt();
        int  s3 = sc.nextInt();
        int  m3 = sc.nextInt();
        int ans = (s1*m1+s2*m2+s3*m3)/10;
        System.out.println(ans);
        sc.close();
    }
}