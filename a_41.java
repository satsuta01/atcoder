import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        String ans ="";
        ans = s.substring(n-1,n);

        System.out.println(ans);
        sc.close();
    }
}