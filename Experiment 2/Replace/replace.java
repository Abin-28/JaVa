import java.util.*;
public class replace 
{

    public static void main (String args[]) 
    {
            Scanner obj = new Scanner(System.in);
    
            System.out.println("Enter a string: ");
            String str = obj.nextLine();
            char a[]=str.toCharArray();
    
            System.out.println("Enter the character to be replaced: ");
            char c = obj.next().charAt(0);
            int index = -1;
            int n=str.length();
            for (int i = 0; i < str.length(); i++) 
            {
                if (str.charAt(i) == c) 
                {
                    index = i;
                    System.out.println("Enter the character to replace: ");
                    char ch = obj.next().charAt(0);
                    a[i]=ch;
                    break;
                }
            }
            
            if (index == -1) 
            {
                System.out.println("Invalid input");
                return;
            }
    
            System.out.println("The new string is: ");
            for(int i=0;i<n;i++)
            {
                   System.out.print(a[i]);
            }
        
    }
    
}
