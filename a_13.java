import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        ArrayList<String> abc = new ArrayList<>();
        abc.add("A");
        abc.add("B");
        abc.add("C");
        abc.add("D");
        abc.add("E");
        System.out.println(abc.indexOf(s1)+1);
        sc.close();
    }
}