import java.util.*;

public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int w = sc.nextInt();
        int ans = 0;
        if(s<=w&&w<=t){
                ans++;
            }
        for(int i = 0;i<n-1;i++){
            w = w + sc.nextInt();
            if(s<=w&&w<=t){
                ans++;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}