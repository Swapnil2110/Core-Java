//to check whether the string is palindrome or not using StringBuffer class
package maccess;
import java.util.*;
public class Palindrome3 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String str = s.nextLine();
		StringBuffer sb = new StringBuffer(str);
		String str2 = new String(sb.reverse());
		if(str.equalsIgnoreCase(str2))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		
		s.close();
	}
}
