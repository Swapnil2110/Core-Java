//to display the numbers available in the given String and print Sum of those numbers
package maccess;
import java.util.Scanner;
public class DString8
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String with Numbers: ");
		String str = s.nextLine();
		System.out.println("***Numbers from given String***");
		int sum = 0;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			int k = (int)ch; //type-casting
			//check ASCII value of integers 0-9
			if(k>=48 && k<=57)
			{
				char ch1 = (char)k;
				String s1 = String.valueOf(ch1);//converting char into String
				int z = Integer.parseInt(s1);//converting String into Integer value
				System.out.print(ch1+" ");
				sum = sum+z;
			}
		}
		System.out.println("\nSum of numbers = "+sum);
		s.close();
	}

}
