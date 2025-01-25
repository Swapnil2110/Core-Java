package amstrome_number;
import java.util.*;
public class amstrome_nu
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter your choice \n1st for check number is armstrome or not \n"
				+ "2nd for find armstrome number in between given number ");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter an integer value");
			int num = s.nextInt();
			int temp = num;
			int len, rem;
			double sum =0;
			String str = String.valueOf(num);// any value convert into string
			len = str.length();
			while(0<num)
			{
				rem = num % 10;
				int base = rem;
				int exponent  = len;
				double result = Math.pow(base, exponent);
				sum = sum+result;
				num = num / 10;
				System.out.println(sum);
			}
			int x = (int) Math.round(sum);
			System.out.println(x);
			if(temp == x)
			{
				System.out.println("this is armstrome number ");
			}
			else
			{
				System.err.println("oops sorry this is not a armstrome number");
			}
			break;
		case 2:
			System.out.println("enter starting integer");
			int k = s.nextInt();
			System.out.println("enter ending integer");
			int l = s.nextInt();
			if(k<=l)
			{
				System.out.println("these number are armstrom number **\n");
				for(int i = k;i<=l;i++)
				{
					
					
					
					int temp1 = i;
					int len1, rem1;
					double sum1 =0;
					String str1 = String.valueOf(i);
					len1 = str1.length();
					while(0<i)
					{
						rem1 = i % 10;
						int base1 = rem1;
						int exponent1  = len1;
						double result1 = Math.pow(base1, exponent1);
						sum1 = sum1+result1;
						i = i / 10;
						System.out.println(sum1+"***");
					}
					int y = (int) Math.round(sum1); // here converting doubble to integer
					System.out.println(y);
					if(temp1 == y)
					{
						System.out.print(i+" ");
					}
					else
					{
						System.out.println("*");
					}
					
					
					
					
					
					
					
					
					
					
					
					
				}
			}
			else
			{
				System.out.println("envalid input\n please insert smaller number first \nthen insert greater number");
			}
			
			
			
			
			
			break;
			default:
				System.err.println("invalid input");
		}
		
		
		
		
		
		
		
		
		s.close();
	}
}
