import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        String g = sc.next();
        String b = sc.next();
        String ans = r+g+b;
        System.out.println(Integer.parseInt(ans)%4==0?"YES":"NO");
        sc.close();
    }
}