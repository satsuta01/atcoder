import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        String ans = "";
        if(a==1){
            a+=13;
        }
        if(b==1){
            b+=13;
        }
        if(a>b)ans = "Alice";
        else if(a<b)ans = "Bob";
        else ans = "Draw";
        System.out.println(ans);
        sc.close();
    }
}