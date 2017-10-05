//稱斤論兩
import java.util.Scanner;


public class homework9 {

    public static void main (String[] args){

        Scanner scn = new Scanner(System.in);
        float g = scn.nextFloat();
        System.out.println(Math.round(g/600*10)/10f);

    }
}
