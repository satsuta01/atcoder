import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        String s = sc.next();
        for(int i = 0;i<3;i++){
            if(s.substring(i,i+1).equals("1")){
                ans +=1;
            }
        }
        System.out.println(ans);
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