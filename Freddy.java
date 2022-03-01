import java.util.*;

public class Freddy
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		int distance[] = {5,3,1};
		double time [] = {1,2,3.5};
		
		System.out.println("How Long Freddy Jump : ");
		int x = sc.nextInt();
		
		Freddy obj = new Freddy();
		
		obj.countHope(x);
		obj.countTime(x,time);
		
	}
	
	public void countHope(int x)
	{
		int y = (x/9)*3;
		int m =0;
			
		if(x%9==0)
		{
			System.out.println("Numbers of hops freddy jump within "+ x +" is "+ y);
		}
		else
		{
			m=x%9;
				
			if(m<=5)
			{
				System.out.println("Numbers of hops freddy jump within "+ x +" is "+ (y+1));
			}
				
			else
			{
				System.out.println("Numbers of hops freddy jump within "+ x +" is "+ (y+2));
			}
		}
	}
		
	public void countTime(int x, double time[])
	{
		double t =0;
		
		for(int i=0;i<time.length;i++)
		{
			t=t+time[i];
		}
		
		int y = (x/9);
		int m =0;
		double countT=t*y;
			
		if(x%9==0)
		{
			System.out.println("Time is "+ countT);
		}
		else
		{
			m=x%9;
				
			if(m<=5)
			{
				System.out.println("Time is "+ (countT+time[0]));
			}
				
			else
			{
				System.out.println("Time is "+ (countT+time[0])+time[1]);
			}
		}
	}
}