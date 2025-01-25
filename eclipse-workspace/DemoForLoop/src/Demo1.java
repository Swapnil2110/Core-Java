//to display number from 1 to n, where n is taken as a input from user.
import java.util.Scanner;
public class Demo1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n : ");
		int n = s.nextInt();
		//for loop
		for(int i=1; i<=n; i++)
		{
			System.out.println(i);
		}
		s.close();
	}
}
