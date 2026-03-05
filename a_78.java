import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        boolean answer = false;
        String ans = "";
        ArrayList<String> ab16 =  new ArrayList<>();
        ab16.add("A");
        ab16.add("B");
        ab16.add("C");
        ab16.add("D");
        ab16.add("E");
        ab16.add("F");

        String n = sc.next();
        String m = sc.next();

        int n16 = ab16.indexOf(n);
        int m16 = ab16.indexOf(m);
        if(n16>m16){
            ans = ">";
        }else if(n16<m16){
            ans = "<";
        }else{
            ans = "=";
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