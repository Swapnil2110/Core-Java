//to check whether a string is palindrome or not
package maccess;
import java.util.*;
public class Palindrome2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = s.nextLine().toLowerCase();
		int j = str.length()-1;
		int count = 0;
		for(int i=0; i<str.length(); i++)
		{
			int p = (int)str.charAt(i);
			int q = (int)str.charAt(j);
			if(p==q)
			{
				count++;
			}
			j--;
		}
		if(count==str.length())
		{
			System.out.println("String is palindrome.");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		s.close();
	}
}
