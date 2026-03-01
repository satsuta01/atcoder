import java.util.*;

public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k1 = n%10;
        int k2 = n/10;
        System.out.println(k1+k2);
        sc.close();
    }
}