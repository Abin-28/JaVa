import java.util.*;

public class function 
{
       public static void main(String[] args) 
       {
            Scanner sc = new Scanner(System.in);
    
            function obj = new function();
    
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            
            obj.factorial(n);
            obj.sumofDigits(n);
        }
    
        void factorial(int n) 
        {
            int fact = 1;
            
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
    
            System.out.println("Factorial of " + n + " is " + fact);
        }
                      
        void sumofDigits(int n) 
        {
            int sum = 0, N = n;
            
            while (n != 0) 
            {
                sum += n % 10;
                n /= 10;
            }
    
            System.out.println("Sum of digits of " + N + " is " + sum);
        }
}
    

