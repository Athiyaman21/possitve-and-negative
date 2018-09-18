
import java.util.*;
//import java.util.Scanner;
import java.io.*;
class JavaApplication11
{
	public static void main (String[] args) throws java.lang.Exception
	       {          
            int a, b, c;
        System.out.print("Enter the first number:");
  Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.print("Enter the second number:");
        b = s.nextInt();
        System.out.print("Enter the third number:");
        c = s.nextInt();
           if(a>=b && a>=c)
                         {
              System.out.pritln(a+ "largest number ");
           }
           else if (b>=c && b>=a)
           {
               System.out.pritln(b+" largest number");
           }
           else 
                   {
                        System.out.pritln(c+" largerst number");
                   }
                 
     }
}
 
 
 

