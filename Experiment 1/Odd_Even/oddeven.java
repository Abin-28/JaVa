import java.util.Scanner;
class oddeven
{
public static void main(String args[])
   {	
	int a;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	a=s.nextInt();
	s.close();
	while(a!=0)
	{
		if((a%2)==0)
		{	
			System.out.println("The number is even");
			break;
		}
		else
		{
			System.out.println("The number is odd");
			break;
		}
	}
    }
}




