import java.util.Scanner;

public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(s%2==0?s/2:(s/2)+1);
        sc.close();
    }
}