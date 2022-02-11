import java.util.*;
class large
{
	public static void main(String args[])
	{
 	 int i,j,temp;
	 Scanner obj=new Scanner(System.in);
	 System.out.println("Enter array size:");
	 int n=obj.nextInt();
	 int a[]=new int[n];
	 System.out.println("Enter array:");
	 
	 for(i=0;i<n;i++)
	 {
 		a[i]=obj.nextInt();
	 	
	 }
	 
	 for(i=0;i<n-1;i++)
	 {
		for(j=0;j<n-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println("the second largest element is:"+a[n-2]);
	 }
}

