import java.util.Scanner;

public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int standard = 10000;
        System.out.println((1+n)*standard/2);
        sc.close();
    }
}