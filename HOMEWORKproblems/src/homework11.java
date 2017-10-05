//輸出三數輸出最大值與最小值
import java.util.Scanner;

public class homework11 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println(Math.max(a,Math.max(b,c)));
        System.out.println(Math.min(a,Math.min(b,c)));

    }
}
