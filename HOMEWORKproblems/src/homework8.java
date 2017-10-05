//單位換算:公斤轉加侖
import java.util.Scanner;

public class homework8 {

    public static void main (String[] args){

        Scanner scn = new Scanner(System.in);
        float l = scn.nextInt();
        System.out.println(Math.round(l*0.26418f*10)/10f);

    }
}

