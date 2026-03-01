import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%1111==0){
           System.out.println("SAME"); 
        }else{
            System.out.println("DIFFERENT");
        }
        sc.close();
    }
}