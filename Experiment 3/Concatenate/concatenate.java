package Concatenate;
import java.util.*;

public class concatenate 
{
    public static void main(String[] args) 
    {
            concatenate obj = new concatenate();
    
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter two numbers to concatinate: ");
            System.out.print("Number 1: ");
            int a = sc.nextInt();
            System.out.print("Number 2: ");
            int b = sc.nextInt();
            obj.method(a, b);
    
            System.out.println("Enter two strings to concatinate: ");
            System.out.print("String 1: ");
            sc.nextLine();
            String str1 = sc.nextLine();
            System.out.print("String 2: ");
            String str2 = sc.nextLine();
            obj.method(str1, str2);
    }

    void method (int x, int y) 
    {
        System.out.println("The concatenated number is: " +x+y);
    }
    
    void method (String str1, String str2) 
    {
        String str = str1 + str2;
    
        System.out.println("The concatinated string is: " + str);
    }
     
}
