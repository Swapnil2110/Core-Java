//to display if number is prime or not
import java.util.Scanner;
public class Prime 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = s.nextInt();
		int count = 0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count = count + 1;
			}
		}
		if(count==2)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
		s.close();
	}
}
