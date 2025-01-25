package amstrome_number;
import java.util.*;
public class main 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter one three digit number");
		int num = s.nextInt();
//		int temp = num;
		int  rem;
		int temp = num;
//		int i = 0;
		int sum = 0;
	
		
		while (num>0)
		{
			rem = num%10;
			sum = sum+rem*rem*rem;
			num = num/10;
			
		}
		
//		System.out.print(sum);
		if(temp == sum)
		{
			System.out.println("this is amstrome number");
		}
		else
		{
			System.err.println("sorry this is not a armstrome number");
		}
		s.close();
	}

}
