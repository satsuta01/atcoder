import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        if(n>k){ 
            ans = (x*k)+(y*(n-k));
        }else {
            ans = x*n;
        }
        

        System.out.println(ans);
        sc.close();
        
    }
}