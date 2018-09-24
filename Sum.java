import java.util.*;
import java.io.*;
public class Sum
{
    public static void main (String[] args)
    {
        int N;
        int k;
        int k1=0;
         int[] arr = new int[100];
        
        Scanner sc=new Scanner (System.in);
        System.out.println("entre the N value");
        N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
         System.out.println("entre the k value");
        k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            k1=k1+arr[i];
        }
               System.out.println(k1);

        }            
            
     
        
        
             
        
    }   
    