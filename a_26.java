import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        if(n%2==0){
            ans = (n/2)*(n/2);
        }else{
            ans = (n-1)/2 * ((n-1)/2 + 1);
        }



        System.out.println(ans);
        sc.close();
    }
}