//單位換算:英哩轉公里
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int value = scn.nextInt();
        System.out.println( Math.round(value * 1.6f*10)/10f);

    }
}
