import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x%16==00&&y%9==0){
            System.out.println("16:9");
        }else{
            System.out.println("4:3");
        }
        sc.close();
    }
}