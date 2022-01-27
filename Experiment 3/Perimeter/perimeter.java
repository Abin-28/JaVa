package Perimeter;
import java.util.*;
    
class perimeters
{
    public static void main(String args[])
     {
      Scanner in = new Scanner(System.in);
      System.out.println("Circle:-\nRadius:");
      int r = in.nextInt();
      calculation ob = new calculation(r);
      System.out.println("Rectangle:-\nLength:");
      int l = in.nextInt();
      System.out.println("Breadth:");
      int b = in.nextInt();
      ob = new calculation(l,b);
      
     }
}
class calculation
{
     calculation(int a)
     {
      double p=3.14*2*a;
      System.out.println("Perimeter = "+p); 
     }
     calculation(int x,int y)
     {
      System.out.println("Perimeter = "+(2*(x+y)));
     } 
    
}
