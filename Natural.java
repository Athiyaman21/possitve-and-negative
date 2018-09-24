import java.util.*;
import java.io.*;
 public class Natural
 {
     public static void main(String[] args)
             
     {
         int i;
         int sum=0;
         Scanner sc= new Scanner(System.in);
         System.out.println("entre the n value");
         int sum1=sc.nextInt();
         for(i=1;i<sum1;++i)
         {             
         sum=sum+i;
         }
         System.out.println("sum ="+sum);
         
     
       }
 }