package maccess;
import java.util.Scanner;

public class String_compare 
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		System.out.println("Enter string 1: ");
		String s1 = s.nextLine();
		sb1.append(s1);
		System.out.println("Enter String 2: ");
		String s2 = s.nextLine();
		sb2.append(s2);
		for(int i=0; i<sb1.length(); i++)
		{
			for(int j=0; j<sb2.length(); j++)
			{
				if(sb1.charAt(i)==sb2.charAt(j))
				{
					sb1 = sb1.deleteCharAt(i);
					sb2 = sb2.deleteCharAt(j);
				}
			}
		}
		System.out.println(sb1);
		s.close();
	}
}
