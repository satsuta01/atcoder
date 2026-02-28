import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        System.out.println(s1%s2==0?"0":s2-(s1%s2));
        sc.close();
    }
}