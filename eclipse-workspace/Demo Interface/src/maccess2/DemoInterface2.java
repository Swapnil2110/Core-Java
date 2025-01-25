package maccess2;
import test2.*;
import java.util.Scanner;
public class DemoInterface2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Addition ad = new Addition();
		System.out.println("Enter value v1: ");
		int v1 = s.nextInt();
		System.out.println("Enter value v2: ");
		int v2 = s.nextInt();
		ad.calculate(v1, v2);
		s.close();
	}
}
