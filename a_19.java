import java.util.*;

public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> abc = new ArrayList<>();
        abc.add(sc.nextInt());
        abc.add(sc.nextInt());
        abc.add(sc.nextInt());
        Collections.sort(abc);
        System.out.println(abc.get(1));
        sc.close();
    }
}