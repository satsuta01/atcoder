import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = 0;
        if(a != b&&b != c&&a != c){
            ans = 3;
        }else if(a == b&&b == c&&a == c){
            ans = 1;
        }else{
            ans = 2;
        }

        System.out.println(ans);
        sc.close();
    }
}