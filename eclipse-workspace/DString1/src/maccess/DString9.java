/*wap to read a String and count the following:
Count of Vowels
Count of Consonants
Count and sum of Numbers
Count of Special Symbols*/
package maccess;
import java.util.Scanner;
public class DString9 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = s.nextLine();
		int countVowel=0, countConsonant=0, countNumber=0, countSpecial=0, sum=0;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i); //return char value of given index i
			int ch1 = (int)ch;
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
			{
				//System.out.print(ch+" ");
				countVowel++;
			}
			else if((ch1>=65&&ch1<=90) || (ch1>=97&&ch1<=122))
			{
				//char c = (char)ch1;
				//System.out.println(c+" ");
				countConsonant++;
			}
			else if(ch1>=48&&ch1<=57)
			{
				String ch2 = String.valueOf(ch);
				int c1 = Integer.parseInt(ch2);
				sum = sum + c1;
				countNumber++;
			}
			else
			{
				countSpecial++;
			}
		}//end of for_loop
		System.out.println("\nCount of Vowels: "+countVowel);
		System.out.println("\nCount of Consonents: "+countConsonant);
		System.out.println("\nCount of Numbers: "+countNumber);
		System.out.println("\nCount of sum of numbers: "+sum);
		System.out.println("\nCount of Special Symbols: "+countSpecial);
		s.close();
	}
}