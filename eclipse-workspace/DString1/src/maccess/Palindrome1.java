//wap to check whether the given number is palindrome or not.
package maccess;
import java.util.*;
public class Palindrome1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		String str = String.valueOf(n);
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse = reverse + str.charAt(i);
		}	
		if(str.equalsIgnoreCase(reverse))
		{
			System.out.println("Number "+n+" is Palindrome");
		}
		else
		{
			System.out.println("Number "+n+" is NOT Palindrome");
		}
		s.close();
	}
}
