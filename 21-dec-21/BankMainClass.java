import java.util.Scanner;
class CheckPin // sub-class
{
	boolean k = false;
	boolean checkPin(int pin)
	{
		switch(pin)
		{
			case 1111:	k=true;
						break;
			case 2222:	k=true;
						break;
			case 3333:	k=true;
						break;
			default:	k=false;
						break;
		}
		return k;
	}
}
class Deposit	//sub-class
{
	void deposit(int amt)
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
		int i=1,amt;
		boolean k=false;
		while(i<=3)
		{
			System.out.println("Enter PIN number: ");
			int pin = s.nextInt();
		
			CheckPin cp = new CheckPin();
			k = cp.checkPin(pin);

			if(k==true)
			{
				break;
			}
			else
			{
				if(i==3)
				{
					System.out.println("Wrong PIN");
					break;
				}
				else
				{
					System.out.println("Wrong PIN, please enter correctly.");
				}
			}
			i++;		
		}
		
		
		
		if(k==true)
		{
			System.out.println("***Choice***\n1.Withdraw\n2.Deposit");
			System.out.println("Enter your Choice: ");
			int choice = s.nextInt();
			switch(choice)
			{
				case 1:
						System.out.println("Enter amount for withdrawl: ");
						amt = s.nextInt();
						if(amt>=0 && amt%100==0)
						{
							WithDraw w = new WithDraw();
							w.wDraw(amt); //wDraw method call
						} //end of if 
						else
						{
							System.out.println("Invalid amt");
						}
				//end of case1
						
				case 2:
						System.out.println("Enter amount to be deposited: ");
						amt = s.nextInt();
						if(amt>=0 && amt%100==0)
						{
							Deposit d = new Deposit();
							d.deposit(amt); //deposit method call
						}//end of if
						else
						{
							System.out.println("Invalid amount.");
						}
				//end of case2
			}	
		}
		else
		{
			System.out.println("Transaction Blocked...");
		}
	}
}