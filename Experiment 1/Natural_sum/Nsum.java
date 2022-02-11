import java.util.Scanner;
class Nsum
{
public static void main(String args[])
   {	
	int n,sum=0,i;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number");
	n=obj.nextInt();
	obj.close();
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println("Sum is "+sum);
    }
}




