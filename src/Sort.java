import java.util.Scanner;
import java.lang.String;

public class Sort {
    public static void main(String args[])
    {
        int temp, j, i,sum=0;
        System.out.println("enter the number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        System.out.println("enter the number");
        for (i = 0; i <n; i++) {
            a[i] = scn.nextInt();
        }

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }


        }
        for (i = 0; i < n-1; i++) {
            System.out.print(a[i]+" ");

        }
        System.out.println(a[n-1]);


for(int k=0;k<n-1;k++)
{
    if (a[k] % 2 == 0)
    {
        sum = sum + a[k];
    }

}
        if(sum>15)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        }

    }


