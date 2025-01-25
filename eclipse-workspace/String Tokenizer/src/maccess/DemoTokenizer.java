package maccess;
import java.util.Scanner;
import java.util.StringTokenizer;
public class DemoTokenizer 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("**Enter any String**");
		String str = s.nextLine();
		System.out.println("str: "+str.toString());
		StringTokenizer st = new StringTokenizer(str," ");
		System.out.println("Number of Tokens: "+st.countTokens());
		System.out.println("===Display Tokens===");
		while(st.hasMoreTokens())
		{
			String tk = st.nextToken();
			System.out.println("Token : "+tk);
			System.out.println("Number of Tokens: "+st.countTokens());
		}
		
		s.close();
	}

}
