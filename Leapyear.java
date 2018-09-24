import java.util.*;
import java.io.*;

public class Leapyear
{
    public static void main(String[] args)
    {
        int  year;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year");
        year= sc.nextInt(); 
        if(year%4 ==0)
        {
            System.out.println("yes");
        }
          
    else        
            System.out.println("no");
        }
    }
