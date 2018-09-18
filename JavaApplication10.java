import java.util.*;
import java.lang.*;
import java.io.*;
class JavaApplication10
{
	public static void main (String[] args) throws java.lang.Exception
	{
       
        Scanner s= new Scanner(System.in);
                System.out.println("entre the character");
                char c =s.next().charAt(0); 
                {
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
               
               
        else
            System.out.println(c + " is not an alphabet.");
                }
                return(0);
    }
                
}     
