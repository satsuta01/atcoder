import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String ans = "";
        ans+=a.substring(0,1)+b.substring(0,1)+c.substring(0,1);
        
        System.out.println(ans.toUpperCase());
        sc.close();
    }
}