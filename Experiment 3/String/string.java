package String;
import java.util.*;
class calculation
{
     Scanner obj = new Scanner(System.in);
     void frequency(String s)
     { 
      System.out.println("Enter the character:");
      char c = obj.next().charAt(0);
      char a[] = s.toCharArray();
      int i,n=s.length(),f=0;
      for(i=0;i<n;i++)
      {
       if (a[i]==c)
          f+=1;
      }
      System.out.println("Frequency of "+c+" is "+f); 
     }
    
     void reverse(String s)
     {
      char a[] = s.toCharArray();
      int i,n=s.length();
      char b[] = new char[n];
      for(i=0;i<n;i++)
      {
        b[i]=a[n-i-1];
      }
      String str=String.valueOf(b);
      System.out.println("Reversed string:\n"+str); 
     }
}
public class string
{
     public static void main(String args[])
     {
      Scanner obj = new Scanner(System.in);
      calculation o=new calculation();
      System.out.println("Enter string:");
      String s = obj.nextLine();
      o.frequency(s);
      o.reverse(s);
     }
}
    
    

