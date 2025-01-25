// program to display even numbers from 1 to n (input)
import java.util.Scanner;
class Prime
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of 'n': ");
		int n = s.nextInt();
		int i = 1;
		while(i<=n)
		{
			int j = 2;
			boolean count= false;
			while(j<=i/2)
			{
				if(i%j==0)
				{
					count=true;
					break;
				}
				j++;
			}
			if(count==false && i!=1)
			{
				System.out.println(i);
			}
			i++;
		}
		//below code is to check if given number is prime or  not.
		/*int i=2;
		boolean count = false;
		while(i<=n/2)
		{
			System.out.println("checking for "+i);
			if(n%i==0)
			{
				System.out.println("Yes we found a Factor "+i);
				count = true;
				break;
			}
			
			i++;
		}
		if(count==false && n!=1)
		{
			System.out.println("It is prime "+n);
		}
		else
		{
			System.out.println("It is not Prime "+n);
		}*/
	}
}