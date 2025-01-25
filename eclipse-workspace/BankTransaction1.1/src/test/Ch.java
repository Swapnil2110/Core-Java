package test;
import java.util.*;
import maccess.MainClass;
public class Ch 
{
	static Scanner s = new Scanner(System.in);
	public static void choose()
	{
		System.out.println("choose your choice: \n1.Withdraw\n2.Debit");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
			//withdraw
			withdraw();
			break;
		case 2:
			//debit
			debit();
			break;
		default:
			System.out.println("Invalid Response...");
			break;
		}
	}
	
	public static void withdraw()
	{
		System.out.println("Enter Amount to withdraw : ");
		int amt = s.nextInt();
		
		MainClass.ac.setBalance(MainClass.ac.getBalance()-amt);
		System.out.println("Balance : "+MainClass.ac.getBalance());
		choose();
	}
	
	public static void debit()
	{
		System.out.println("Enter Amount to Debit: ");
		int amt = s.nextInt();
		
		MainClass.ac.setBalance(MainClass.ac.getBalance()+amt);
		System.out.println("Balance : "+MainClass.ac.getBalance());
		choose();
	}
}
