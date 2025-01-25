package geeks_for_geeks;
import java.util.*;
public class main 
{

	
	public static void main(String[] args)
	{

		int x = 0;
		HashSet<Character> set=new HashSet<Character>();
		String str = "qsjbmbiwbtuctqxznkvuspszjw";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				
				for(int j=0;j<=i;j++)
				{
			 		set.add(str.charAt(i));		
				}
//				System.out.println(set.toString());
				int len = set.size();
//				System.out.println(len);
				int count = 0;
				for(int k=2;k<len ;k++)
				{
					if(len%k==0 && len!=2)
					{
						count++;
						break;
					}
				}
				if(count==0)
				{x++;} 
					
				}
			}
		System.out.println(x-1);
		
		
//		
//		HashSet<Character> set=new HashSet<Character>();
//		String str = "qsjbmbiwbtuctqxznkvuspszjw";
//		for(int i = 0;i<str.length();i++)
//		{
//			set.add(str.charAt(i));
//		}
//		System.out.println(set.toString());
		}
		
	}


