import java.util.*;
class mmatrix
{
	public static void main(String args[])
	{
 	 int i,j,k,temp,max;
	 Scanner obj=new Scanner(System.in);
	 System.out.println("Enter order of first matrix:");
	 int m=obj.nextInt();
 	 int n=obj.nextInt();
	 int a[][]=new int[m][n];
	 System.out.println("Enter the order of second matrix:");
	 int p=obj.nextInt();
	 int q=obj.nextInt();
	 int b[][]=new int[p][q];
	 if(n==p)
	 {
	  	System.out.println("Enter first matrix");
	 
	 	for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
	 		{
 				a[i][j]=obj.nextInt();
	 	
	 		}
	 	}
		
	        System.out.println("Enter second matrix");
	 
	 	for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
	 		{
 				b[i][j]=obj.nextInt();
	 	
	 		}
	 	}
	 	
		int r[][]=new int[10][10];
		for(i=0;i<m;i++)
	 	{
			for(j=0;j<q;j++)
			{       r[i][j]=0;
				for(k=0;k<n;k++)
					r[i][j]+=a[i][k]*b[k][j];
			}
		}
		System.out.print("Resultant array\n");
		for(i=0;i<m;i++)
	 	{
			for(j=0;j<n;j++)
			{
				System.out.print(r[i][j]+"\t");
			}
			System.out.println();
		}
	 }
	}
}

