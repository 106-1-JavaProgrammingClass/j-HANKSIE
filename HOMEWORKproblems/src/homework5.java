//單位換算:身高及體重
import java.util.Scanner;

public class homework5 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int cm = scn.nextInt();
        int kg = scn.nextInt();

        System.out.println((cm / 2.54d));
        System.out.println((kg / 0.454d));

    }
}
