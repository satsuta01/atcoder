import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * 勉強時間や内容を記録するプログラム。csvを用いて記録する。
 * @author sou_m_11
 */
public class study_log{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.print("勉強した項目を入力してください (例: SG, Java): ");
        String subject = sc.nextLine();//項目

        System.out.print("勉強した時間(分)を入力してください : ");
        String minutes = sc.nextLine();//時間(分)

        System.out.print("一言コメント : ");
        String comment = sc.nextLine();//コメント

        String date = LocalDate.now().toString(); // 今日の日付

        //CSV形式の文字列を作成
        String record = date+","+subject+","+minutes+","+comment;   

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("study_log.csv", true))) {
            bw.write(record);
            bw.newLine();
            System.out.println("保存完了: " + record);
        } catch (IOException e) {
            System.err.println("エラー: " + e.getMessage());
        }

        sc.close();

    }
}
