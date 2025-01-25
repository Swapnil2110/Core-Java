package stringtokenizer;
import java .util.*;
public class reverse {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter your string");
		String str = s.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
//		st.hasMoreTokens();
		while(st.hasMoreTokens())
		{
			String s1 = st.nextToken();
			StringBuffer sb = new StringBuffer(s1);
			System.out.print(sb.reverse()+" ");
		}
		s.close();
	}
}
