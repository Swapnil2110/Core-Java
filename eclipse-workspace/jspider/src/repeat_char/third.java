
package repeat_char;
import java.util.*;
public class third
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter your string");
		String str = s.nextLine();
		int len = str.length();
		String s1 = "";
		for(int i=0;i<len;i++)
		{
			
			char ch = str.charAt(i);
			if( s1.indexOf(ch)==-1)
			{
				s1 = s1+ch;
			}
		}
		System.out.println(" unique latter in the given string "+s1);
		int len1 = s1.length();

		for(int i=0;i<len1;i++)
		{
			int count = 0;
			char ch = s1.charAt(i);
			String ch1 = String.valueOf(ch);
			for(int j=0;j<len;j++) 
			{
				char ah = str.charAt(j);
				String ah1 = String.valueOf(ah);
				if(ch1.equals(ah1))
				{
					count++;
				}
			}
			
			System.out.println("character "+ch+" occur "+count+" times");
			
			
		}
		
		
		
		s.close();
	}

}
