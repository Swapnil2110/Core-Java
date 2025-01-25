package maccess;

import java.util.Scanner;
public class DString5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine();
		System.out.println("*****Normal String*****\n"+str.toString());
		System.out.println("*****Reverse String*****");
		
		int len = str.length();
		for(int i=len-1; i>=0; i--)
		{
			char ch = str.charAt(i);
			System.out.print(ch);
		}
		s.close();
	}

}
