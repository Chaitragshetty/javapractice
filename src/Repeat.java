
import java.util.Scanner;

public class Repeat {
    public static void main(String args[])
    {
        System.out.println("enter the number");
        Scanner scn= new Scanner(System.in);
        int a= scn.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.println(" number is:"+i);
            }
        }

    }


}
