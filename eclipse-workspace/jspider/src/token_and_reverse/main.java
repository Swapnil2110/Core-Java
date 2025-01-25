package token_and_reverse;
import java.util.*;
public class main 
{

	public static void main(String[] args) 
	{
		String s1 = "red blue orange yellow black";
		StringTokenizer st = new StringTokenizer(s1," ");
		while(st.hasMoreTokens())
		{
			String s2 = st.nextToken();
			StringBuffer sb = new StringBuffer(s2);
			StringBuffer s3 = sb.reverse();
			System.out.println(s3);
			
		}
	}

}
