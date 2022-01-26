package Search;
import java.util.*;
public class search 
{
  public static void main(String args[])
  {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter string:");
     String s=obj.next();
     System.out.println("Enter character to be searched:");
     char x=obj.next().charAt(0);
     int i=0,n;
     n=s.length();
     for(i=0;i<n;i++)
    {
        if (s.charAt(i)==x)
        {
            System.out.println(x+" is found at "+(i+1));
            break;    
        }
        else
        {
             continue;
        }
    }
    if (i==n)
    System.out.println(x+"is not found");
 
  }
}