import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        if(n >= x*2){
            System.out.println(x-1);
        }else{
            System.out.println(n-x);
        }

       
        sc.close();
    }
}