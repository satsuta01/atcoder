import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = 0;
        if(a>b){
            ans += c/b;
            if(c-(c*b)>a){
                ans += (c-(c*b))/a;
            }
        }else{
            ans += c/a;
            if(c-(c*b)>b){
                ans += (c-(c*b))/b;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}