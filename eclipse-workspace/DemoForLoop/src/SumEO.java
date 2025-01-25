//to display sum of Even and Odd Number
import java.util.Scanner;
public class SumEO 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = s.nextInt();
		int evenS=0, oddS=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				evenS = evenS + i;
			}
			else
			{
				oddS = oddS + i;
			}
		}
		System.out.println("Sum of Even numbers between 1 and "+n+" is "+evenS);
		System.out.println("Sum of Odd Numbers between 1 and "+n+" is "+oddS);
		s.close();
	}

}
