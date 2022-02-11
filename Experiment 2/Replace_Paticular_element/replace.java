import java.util.*;
class replace
{
	public static void main(String args[])
	{
 	 int n,i;
	 Scanner obj=new Scanner(System.in);
	 System.out.println("Enter the number of elements in array:");
	 n=obj.nextInt();
	 int a[]=new int[n];
	 System.out.println("Enter array elements");
	 
	 for(i=0;i<n;i++)
	 {
 		a[i]=obj.nextInt();
	 	
	 }
	 System.out.println("Enter the position to be changed:");
	 int c=obj.nextInt();
	 System.out.println("Enter the element at that position:");
	 int x=obj.nextInt();
	 a[c-1]=x;
       	 System.out.println("New Array:");
	 for(i=0;i<n;i++)
	 {
	 System.out.println(a[i]);
	 }
	}
}

