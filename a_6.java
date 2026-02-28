import java.util.Scanner;

public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n%3==0||n==3)?"YES":"NO");
        sc.close();

    }
}