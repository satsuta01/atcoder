import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ans ="";
        if(b-a<=0){
            ans = "delicious";
        }else if(b<=a+x){
            ans = "safe";
        }else{
            ans = "dangerous";
        }
        System.out.println(ans);
        sc.close();
    }
}