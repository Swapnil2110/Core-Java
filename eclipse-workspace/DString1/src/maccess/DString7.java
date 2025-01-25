//to read a String and display Vowels from the given String and also display the count of Vowels
//use for loop and switch cases
package maccess;
import java.util.*;
public class DString7
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine();
		System.out.println("***list of Vowels***");
		int count = 0;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			switch(ch)
			{
				case 'a':
				case 'A':
					System.out.print(ch+" ");
					count++;
					break;
				case 'e':
				case 'E':
					System.out.print(ch+" ");
					count++;
					break;
				case 'i':
				case 'I':
					System.out.print(ch+" ");
					count++;
					break;
				case 'o':
				case 'O':
					System.out.print(ch+" ");
					count++;
					break;
				case 'u':
				case 'U':
					System.out.print(ch+" ");
					count++;
					break;	
			}
		}
		System.out.println("\nNumber of Vowels: "+count);
		s.close();
	}

}
