package stringtokenizer;
import java.util.*;
public class main
{
	public static void main(String[] args) 
	{
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter your string");
		String str = s.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		st.hasMoreTokens();
		while(st.hasMoreTokens())
		{
			count++;
			System.out.print(count+st.nextToken()+" ");
			
		}
		System.out.println();
		System.out.println(count);
		s.close();
	}
}
