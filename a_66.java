import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int bell_a = sc.nextInt();
        int bell_b = sc.nextInt();
        int bell_c = sc.nextInt();


        System.out.println(bell_a + bell_b + bell_c - maxOfThree(bell_a,bell_b,bell_c));
        sc.close();
    } 

    public static int maxOfThree(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
}