import java.util.Scanner;

public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        System.out.println(Integer.toString(s2)+" "+Integer.toString(s1));
        sc.close();
    }
}