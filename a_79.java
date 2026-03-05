import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        boolean answer = false;

        int n = sc.nextInt();
        String m = intToString(n);
        if(stringToInt(m.substring(0,3))%111==0||stringToInt(m.substring(1,4))%111==0){
            answer = true;
        }
        System.out.println(answer?"Yes":"No");
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
    public static String reverse(String a){
        return new StringBuilder(a).reverse().toString();
    }
}