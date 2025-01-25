package maccess;

import java.util.Scanner; 
public class DString3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String s1 = s.nextLine();
		
		System.out.println("Enter String2 :");
		String s2 = s.nextLine();
		
		System.out.println("***compareTo()***");
		int z = s1.compareTo(s2);
		if(z==0)
		{
			System.out.println("String1 and String 2 are equal");
		}
		else if(z<0)
		{
			System.out.println("String1 is Less than String2");
		}
		else if(z>0)
		{
			System.out.println("String1 is Greater than String2");
		}
		
		System.out.println("***compareToIgnoreCase()***");
		int y = s1.compareToIgnoreCase(s2);
		if(y==0)
		{
			System.out.println("String1 and String 2 are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		s.close();
	}
}
