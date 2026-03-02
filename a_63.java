import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();


        System.out.println(n+c>=10?"error":n+c);
        sc.close();
    }
}