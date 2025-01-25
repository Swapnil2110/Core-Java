package Upper_lower_case;
import java.util.*;
public class second 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String str =s.nextLine();
		int len = str.length();
		char arr[] = new char[len];
		for(int i=0;i<len;i++)
		{
			arr[i] = str.charAt(i);
			String s1 = String.valueOf(arr[i]);
			
			if(i%2==0)
			{
				
				System.out.print(s1.toLowerCase());
			}
			else
			{
			System.out.print(s1.toUpperCase());
			}
		}
		
		s.close();

	}

}
