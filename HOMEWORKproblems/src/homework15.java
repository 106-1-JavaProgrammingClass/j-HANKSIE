//取得16進制萬國碼對應中文字
import java.util.Scanner;


public class homework15 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int v = Integer.valueOf(str,16);
        System.out.println((char)v);
    }
}
