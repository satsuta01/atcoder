import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int i = 0;
        sc.close();
        while(true){
            if(i%a==0&&i%b==0&&i>=n){
                System.out.println(i);
            }
            i++;
        }
    }
}