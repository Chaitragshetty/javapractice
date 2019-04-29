import java.util.Scanner;
import java.lang.String;

public class Capital {
    public static void main(String args[])
    { char current;
        int i=0;
        System.out.println("enter the txt");
        Scanner scn=new Scanner(System.in);

        String str=scn.nextLine();
       char ch= str.charAt(i);
           if(ch>=65 && ch<=90)
               System.out.println("uppercase");


            else  if (ch >= 97 && ch < 122)
                   System.out.println("lower");
               else if(ch>=48 && ch<55)
                   System.out.println("special character");
               else
                   System.out.println("invalid");

           }
    }



