class process
{
	int x=10000;
	synchronized void withdraw(int x)
	{   
        System.out.println("Going to Withdraw...");
		if (this.x<x)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{}
		}
		x=x-this.x;
		System.out.println("Withdraw completed...");
	}
	void deposit(int a)
	{
		synchronized (this)
		{
			x+=this.x;
			System.out.println("Deposit completed...");
			notify();
		}
	}
}
class thread1 extends Thread
{
	process p;
	thread1(process p)
	{
		this.p=p;
	}
	public void run()
	{
		p.withdraw(15000);
	}
}
class thread2 extends Thread
{
	process p;
	thread2(process p)
	{
		this.p=p;
	}
	public void run()
	{
		p.deposit(20000);
	}
}

class bank
{
	public static void main(String args[])
	{
		process obj = new process();
		thread1 t1 = new thread1(obj);
		thread2 t2 = new thread2(obj);
		t1.start();
		t2.start();
	}
}