import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
	int a,b,org,rev=0,r;
	Scanner s=new Scanner (System.in);
	System.out.println("Enter number");
	a=s.nextInt();
	org=a;
while(a>0)
{r=a%10;
rev=rev+r;
a=a/10;
}
if(org==rev)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}
