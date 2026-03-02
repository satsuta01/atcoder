import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int  rate = sc.nextInt();

        System.out.println(rate<1200?"ABC":"ARC");
        sc.close();
    }
}