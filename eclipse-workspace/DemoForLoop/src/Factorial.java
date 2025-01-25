//displays factorial of given number
import java.util.*;
public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = s.nextInt();
		int fact = 1;
		for(int i=1; i<=n; i++) //for(i=n; i>=1; i--){	fact=fact*i	}
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
		s.close();
	}
}
