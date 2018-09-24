import java.util.*;
import java.io.*;
public class Number
{
    public static void main (String[] args)
     {
         int n;
         int i=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("entre the number");
         n=sc.nextInt();
         
        while(n!=0)
        {
         n/=10;
         i++;
        }
         System.out.println(+ i);
         
    }
}
