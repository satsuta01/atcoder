import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int atk = sc.nextInt();
        int def = sc.nextInt();
        int p1 = atk * (def+1);
        int p2 = def * (atk+1);
        System.out.println(p1>p2?p1:p2);
        sc.close();
    }
}