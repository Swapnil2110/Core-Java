//to print all the prime number between 1 to n, where n is taken as a input from user.
import java.util.Scanner;
public class PrimeN 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = s.nextInt();
		System.out.println("Prime numbers between 1 to "+n+" are: ");
		for(int j=1;j<=n;j++)
		{
			int count = 0;
			for(int i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count = count+1;
				}
			}//end of for_loop
			if(count==2)
			{
				System.out.println(j);
			}
		}
		s.close();
	}
}