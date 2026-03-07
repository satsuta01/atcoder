import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(a<=x&&x<=a+b?"YES":"NO");
        sc.close();
    }

    public static int maxOfThree(int a, int b, int c){
        //最大の整数of3
        return Math.max(a, Math.max(b, c));
    }
    public static int stringToInt(String s){
        //intへ
        return Integer.parseInt(s);
    }
    public static String intToString(int n){
        //stringへ
        return String.valueOf(n);
    }
    public static int toPlus(int n){
        //正
        if(n<0){return n-(2*n);}
        else{return n;}
    }
    public static String reverse(String a){
        //反転
        return new StringBuilder(a).reverse().toString();
    }
    public static double ceil(double a){
        return Math.ceil(a);//切り上げ
    }
}