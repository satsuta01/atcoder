import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String abc = sc.next();
        int n = sc.nextInt();
        ArrayList<String> mm = new ArrayList<>();
        ArrayList<String> ss = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            mm.add(abc.substring(i,i+1));
        }
        for(int o = 0; o < 5; o++){
            for(int y = 0; y < 5; y++){
                String str=mm.get(o)+mm.get(y);
                ss.add(str);
            }
        }



        System.out.println(ss.get(n-1));
        sc.close();
    }
}