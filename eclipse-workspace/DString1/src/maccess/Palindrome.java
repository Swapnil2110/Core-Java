//wap to read a String and check the String is Palindrome String or not
package maccess;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine(), reverse="";
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		if(str.equalsIgnoreCase(reverse))
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
