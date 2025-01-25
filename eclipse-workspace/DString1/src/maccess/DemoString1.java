//to reverse words in the given string
package maccess;
import java.util.*;
public class DemoString1 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = s.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			StringBuffer str1 = new StringBuffer(st.nextToken());
			System.out.print(str1.reverse()+" ");
		}
		
		s.close();
	}
}
