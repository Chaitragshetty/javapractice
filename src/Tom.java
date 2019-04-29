import java.util.Scanner;

public class Tom {
    public static void main(String args[]) {
        System.out.println("ente");

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

            if (n >= 20 && n <= 30) {
                if (n%2==0){
                    System.out.println("tom");

                }
            }else {
                System.out.println("jerry");


            }
        }
    }



