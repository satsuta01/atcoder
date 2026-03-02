import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n *800 - (200 * (n/15));



        System.out.println(ans);
        sc.close();
    }
}