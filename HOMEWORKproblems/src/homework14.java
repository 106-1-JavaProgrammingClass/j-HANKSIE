//取得中文字萬國碼
import java.util.Scanner;

public class homework14 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        char v1 = scn.next().charAt(0);

        System.out.println(Integer.toHexString((int) v1));

    }
}

