import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String what = sc.next();
        

        System.out.println(what.replace(","," "));
        sc.close();
    }
}