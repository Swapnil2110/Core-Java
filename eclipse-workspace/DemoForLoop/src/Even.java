//to display all even numbers from 1 to n, where n is input
import java.util.Scanner;
public class Even 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = s.nextInt();
		System.out.println("Even number from 1 to "+n);
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		s.close();
	}

}
