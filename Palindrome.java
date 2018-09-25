import java.util.*;
import java.io.*;
public  class Palindrome
{
    public static void main(String[] args)
    {
      int i = 0, n = 0, m = 0, a = 0,x;
  Scanner sc=new Scanner(System.in);
        System.out.print("");
        n=sc.nextInt();
        m=n;
        if(n<=1000)
     {
         while(n > 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        } 
          i++;
        
        if(a==m)
        {
            System.out.print(" palindrome");
                    }
        else
            
        {
              System.out.print("  not palindrome");
        }
            
        
        
        
        
        
    }
        
}