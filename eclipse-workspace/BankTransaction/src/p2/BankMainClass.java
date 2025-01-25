package p2;

import java.util.Scanner;
import p1.*;

public class BankMainClass {

	public static void main(String[] args) 
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
						break;
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
						break;
				//end of case2
				
				default:
						System.out.println("Invalid Choice!");
						break;
			}	
		}
		else
		{
			System.out.println("Transaction Blocked...");
		}
		s.close();
	}

}
