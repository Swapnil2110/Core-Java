import java.util.Scanner;
class Fact
{
	int factorial(int n)
	{
		int fact =1,i=1;
		while(i<=n)
		{
			fact = fact*i;
			i++;
		}
		return fact;
	}
}

class Factorial
{
	public static void main(String []args)
	{
		int fact;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = s.nextInt();
		Fact f = new Fact();
		fact = f.factorial(n);
		
		System.out.println(fact);
	}
}