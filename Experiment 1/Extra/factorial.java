class factorial
{public static void main(String args[])
{
 int N=5,f;
 int t;
 t=N;
 for(int i=N-1;i>=2;i--)
 {	
        
	f=t*i;
        t=f;
 }
 System.out.println("Factorial"+t);
}
}

