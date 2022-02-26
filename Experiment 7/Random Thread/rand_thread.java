import java.util.*;

class Square extends Thread
{
	int n;
	Square(int n)
	{
		this.n = n;
	}
	public void run()
	{
        int s = this.n * this.n;
		System.out.println("Square of " + this.n + " = " + s );
	}
}
class Cube extends Thread
{
    int n;
	Cube(int n)
	{
		this.n = n;
    }	
	public void run()
	{
		int c = this.n * this.n * this.n;
		System.out.println("Cube of " + this.n + " = " + c );
	}
	
}
class Number extends Thread
{	
	public void run()
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many Random Integers needed : ");
		int x = sc.nextInt();
		Random random = new Random();
		System.out.print("Set the limit upto which random digits should be generated : ");
		int l = sc.nextInt();
        sc.close();
		for(int i =0; i<x; i++)
		{
            int ranInt = random.nextInt(l);
			System.out.println("The random integer: " + ranInt);
			if(ranInt%2==0)
			{
                Square t2 = new Square(ranInt);
				t2.start();
			}
			else
			{
				Cube t3 = new Cube(ranInt);
				t3.start();
			}
			try 
			{
				Thread.sleep(1000);
            } 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
        }
    }
}
public class rand_thread
{
    public static void main(String args[]) throws Exception
	{
        Number t1 = new Number();
		t1.start();
	}
}