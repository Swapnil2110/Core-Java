package reverse_string;
import java.util.*;
public class main
{

	public static void main(String[] args) 
	{
		int j =0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String str = s.nextLine();
		int len = str.length();
		System.out.println("1st for string litral  \n2nd for string buffer");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
			char ch[] = new char[len];

			System.out.println("original string is \n"+str);
			for(int i=len-1;0<=i;i--)
			{
				ch[j] = str.charAt(i);
				j++;
			}
			System.out.println("reverse string is \n");
			String str1 = String.valueOf(ch);  // any input but return is string
			System.out.println("****"+str1);
			if(str.equals(str1))
			{
				System.out.println("this is palendome number");
			}
			else
			{
				System.out.println();
				System.err.println("this is not a palendome number");
			}
			break;
		case 2:
			StringBuffer sb = new StringBuffer();
			sb.append(str);
			sb.reverse();
			System.out.println("your reverse number is "+sb);
//			str.equals(sb) // here we can't use equals method because equals method compare address in string buffer.
			if(str.contentEquals(sb))     //here contentEquals method is only use in StringBuffer only to compare two string.
			{
				System.out.println();
				System.out.println("this is palindrome number");
			}
			else
			{
				System.out.println();
				System.out.println("this is not a palindrome number");
			}
			break;
		}
		
		
		s.close();
	}

}
