import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        boolean answer = false;

        int coockie_a = sc.nextInt();
        int coockie_b = sc.nextInt();
        
        if(coockie_a%3==0||coockie_b%3==0||(coockie_a+coockie_b)%3==0){
            answer = true;
        }

        System.out.println(answer?"Possible":"Impossible");
        sc.close();
    }

    public static int maxOfThree(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
}