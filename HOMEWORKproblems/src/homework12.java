//四捨五入取得小數點後n位
import java.util.Scanner;

public class homework12 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        double v = scn.nextDouble();
        int x = scn.nextInt();

        System.out.println(Math.round(v*Math.pow(10,x))/(Math.pow(10f,x)));
    }
}
