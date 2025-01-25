package dublicate_value;
import java.util.*;
public class main
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter your string value");
		String str = s.nextLine();
		
		//
		int len = str.length();
		char ch[] = new char[len];
//		for(int i=0;i<len-1;i++)
//		{
//			ch[i] = str.charAt(i+1);
//		}
		
		HashSet<Character> s1 = new HashSet<>();
		System.out.println("repeating elements are");
		for(int i=0;i<=len-1;i++)
		{
			ch[i] = str.charAt(i); // save each character in to a character array. 
			
//			System.out.println(ch[i]);
			
//			s1.add(str.charAt(i));
//			s1.add((ch[i]));
			
			if(s1.add((ch[i]))==false)
			{
				System.out.print(ch[i]+" "); // repeating element
			}
			
			
		}
		System.out.println();
		System.out.println("count ="+s1.size());
		System.out.println("\n +non repeating element are");
		System.out.println(s1); // this is non repeating element
		
		s.close();
	}
}













