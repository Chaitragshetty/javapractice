import java.util.Scanner;
import java.lang.String;

public class Reverse {
    public static void main(String args[]) {
        String original, reverse = " ";
        Scanner scn = new Scanner(System.in);
        original = scn.nextLine();
        int len = original.length();
        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
            System.out.println("reverse"+reverse);



    }
}