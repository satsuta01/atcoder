import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1.length()>s2.length()?s1:s2);
        sc.close();
    }
}