package p1;

public class WithDraw 
{
	public void wDraw(int amt)
	{
		if(amt<=2000)
		{
			System.out.println("amt withdrawn: "+amt);
			System.out.println("balnce amount: "+(2000-amt));
			System.out.println("Transaction Completed");
		}
		else
		{
			System.out.println("Insufficient fund");
		}
	}
}
