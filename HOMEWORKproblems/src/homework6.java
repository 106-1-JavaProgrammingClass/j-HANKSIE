//字串切割
import java.util.Scanner;

public class homework6 {

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char ch = scn.next().charAt(0);
        str = str.replace(ch,'\n');
        System.out.println(str);

    }
}
