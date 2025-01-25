package p1;

public class Deposit 
{
	public void deposit(int amt)
	{
		if(amt>=0)
		{
			System.out.println("amt deposited: "+amt);
			System.out.println("balnce amount: "+(2000+amt));
			System.out.println("Transaction Completed");
		}
		else
		{
			System.out.println("Invalid Amount, should be equal to OR greater than 0.");
		}
	}
}
