import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        boolean answer = false;

        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(toPlus(x-a)>toPlus(x-b)?"B":"A");
        sc.close();
    }

    public static int maxOfThree(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
    public static int stringToInt(String s){
        return Integer.parseInt(s);
    }
    public static String intToString(int n){
        return String.valueOf(n);
    }
    public static int toPlus(int n){
        if(n<0){return n-(2*n);}
        else{return n;}
    }
}