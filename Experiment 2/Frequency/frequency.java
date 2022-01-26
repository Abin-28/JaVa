package Frequency;
import java.util.*;
class frequency
{
     public static void main(String args[])
     {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter string:");
      String str = obj.next();

      System.out.println("Enter the character:");
      char c = obj.next().charAt(0);
      char a[] = str.toCharArray();
      int i,n=str.length(),f=0;
      for(i=0;i<n;i++)
      {
       if (a[i]==c)
          f+=1;
      }
      System.out.println("Frequency of "+c+" is "+f);
     }
    
}
