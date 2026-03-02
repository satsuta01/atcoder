import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        List<Integer> a =  new ArrayList<>();
        List<Integer> b =  new ArrayList<>();
        List<Integer> c =  new ArrayList<>();
        a.addAll(Arrays.asList(1,3,5,7,8,10,12));
        b.addAll(Arrays.asList(4,6,9,11));
        c.add(2);
        boolean ans =false;
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(a.contains(x)&&a.contains(y)||b.contains(x)&&b.contains(y)||c.contains(x)&&c.contains(y)){
            ans = true;
        }
        System.out.println(ans?"Yes":"No");
        sc.close();
    }
}