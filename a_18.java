import java.util.Scanner;
import java.util.*;
public class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
         if (A > B && B > C) {
            System.out.printf("%d\n%d\n%d\n", 1, 2, 3);
        }
        if (A > C && C > B) {
            System.out.printf("%d\n%d\n%d\n", 1, 3, 2);
        }
        if (B > A && A > C) {
            System.out.printf("%d\n%d\n%d\n", 2, 1, 3);
        }
        if (B > C && C > A) {
            System.out.printf("%d\n%d\n%d\n", 3, 1, 2);
        }
        if (C > A && A > B) {
            System.out.printf("%d\n%d\n%d\n", 2, 3, 1);
        }
        if (C > B && B > A) {
            System.out.printf("%d\n%d\n%d\n", 3, 2, 1);
        }
        sc.close();
    }
}