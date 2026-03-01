import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String mp = "";
        mp = t.substring(t.length()-1,t.length());
        System.out.println((mp.equals("T"))?"YES":"NO");
      
       
        sc.close();
    }
}