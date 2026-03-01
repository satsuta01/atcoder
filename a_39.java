import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(((a*c)+(b*c)+(b*a))*2);
        sc.close();
    }
}