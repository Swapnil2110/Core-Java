package pilondrom;
import java.util.*;
public class main
{

	public static void main(String[] args)
	{
		System.out.println("enter a integer value");
		Scanner s = new Scanner(System.in);
		int num  = s.nextInt();
//		int num = 121;
		int rev =0 , rem;
		int temp = num;
		while (temp >0)
		{
			rem = temp % 10;
			rev = rev*10+rem;
			temp = temp/10;
			
		}
		if (num == rev)
		{
			System.out.println("yes this is palindrome number");
		}
		else
		{
			System.err.println("sorry this is not a palindrome numeber");
		}
		s.close();
	}

}
