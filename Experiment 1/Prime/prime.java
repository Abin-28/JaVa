import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
	 int N,i=2;
 	 Scanner obj=new Scanner(System.in);
	 System.out.println("Enterthe number");
	 N=obj.nextInt();
	 obj.close();
 	 while(i<N)
 	 {
   	 	if ((N%i)==0)
   		{
		 	System.out.println("Not prime");
			break;
   		}
   		i++;
 	 }
	 if (i==N)
	 System.out.println("Prime");
	 
	 }
}

