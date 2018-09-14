/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class JavaApplication8
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in); 
         
         System.out.println("enter the string");
       
      char ch =sc.next( ).charAt(0);



                if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='s'
                        ||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'|| ch=='S')
                   
                    {
                        System.out.println("it is vowel");
                      
                    }
             else 
                 {
               System.out.println("it is not vowel");
                }
    
}
}