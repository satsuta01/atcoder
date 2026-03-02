import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();


        System.out.println(a.equals(b)?"H":"D");
        sc.close();
    }
}