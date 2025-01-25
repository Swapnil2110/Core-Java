import java.util.Scanner;
class Demo1to_n
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of 'n': ");
		int n = s.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.print(i+" ");
			i++;
		}
	}
}