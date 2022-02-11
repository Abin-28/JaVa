import java.util.*;
class tmatrix
{
	public static void main(String args[])
	{
 	 int i,j;
	 Scanner obj=new Scanner(System.in);
	 System.out.println("Enter order of first matrix:");
	 int m=obj.nextInt();
 	 int n=obj.nextInt();
	 int a[][]=new int[10][10];
	 
	 System.out.println("Enter matrix");
	 for(i=0;i<m;i++)
	 {
		for(j=0;j<n;j++)
	 	{
 			a[i][j]=obj.nextInt();
	 	
	 	}
	 }
		
	        
	 
	int t[][]=new int[10][10]; 	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			t[j][i]=a[i][j];
			
		}
	}
	System.out.println("Transpose matrix");
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			System.out.println(t[i][j]);
		}
	}
	 
       }
}

