// program to display even numbers from 1 to n (input)
import java.util.Scanner;
class Odd
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of 'n': ");
		int n = s.nextInt();
		int i=1;
		while(i<=n)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}