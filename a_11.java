import java.util.Scanner;

public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println((s+1)%12==0?"12":(s+1)%12);
        sc.close();
    }
}