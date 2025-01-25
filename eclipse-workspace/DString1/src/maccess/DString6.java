//to read a String and display Vowels from the given String and also display the count of Vowels
//used simple for loop and if
package maccess;
import java.util.*;
public class DString6 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine();
		System.out.println("String is : "+str.toString());
		System.out.println("Vowels in the above string are: ");
		int count = 0;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
			{
				System.out.print(ch+" ");
				count++;
			}//end of if
		}//end of for_loop
		System.out.println("\nNumber of Vowels are: "+count);
		s.close();
	}

}
