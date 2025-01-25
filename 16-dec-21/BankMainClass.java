import java.util.Scanner;
class WithDraw //sub-class
{
	void wDraw(int amt)
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

class BankMainClass //main class
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);//created object for scanner 
		System.out.println("Enter PIN number: ");
		int pin = s.nextInt();
		
		if(pin==1111 || pin==2222 || pin==3333)
		{
			System.out.println("Enter amount for withdrawl: ");
			int amt = s.nextInt();
			if(amt>=0 && amt%100==0)
			{
				WithDraw w = new WithDraw();
				w.wDraw(amt);
			} //end of if 
			else
			{
				System.out.println("Invalid amt");
			}
			
		}
		else
		{
			System.out.println("Invalid Pin Number, please try again");
		}
		
		

	}
}