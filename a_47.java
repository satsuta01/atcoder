import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean ans = false;
        if(a == b+c||b == a+c||c == a+b){
            ans = true;
        }

        System.out.println(ans?"Yes":"No");
        sc.close();
    }
}