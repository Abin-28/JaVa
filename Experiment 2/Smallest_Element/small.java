import java.util.*;
class small
{
	public static void main(String args[])
	{int N,i;
	 Scanner obj=new Scanner(System.in);
	 System.out.println("Enter the number of elements in array:");
	 N=obj.nextInt();
	 int a[]=new int[N];
	 System.out.println("Enter array elements");
	 
	 for(i=0;i<N;i++)
	 {
 		a[i]=obj.nextInt();
	 	
	 }
	 int min=a[0];
	 for(i=0;i<N;i++)
	 {	if(a[i]<min)
			min=a[i];
		else
			continue;
	 	
	 }
       	System.out.println("Smallest element="+min);
	 
	 }
}

