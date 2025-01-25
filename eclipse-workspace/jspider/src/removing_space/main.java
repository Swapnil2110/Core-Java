package removing_space;
import java.util.*;
public class main 
{
	public static void main(String[] args)
	{
		int count =0;
		Scanner s =  new Scanner(System.in);
		System.out.println("by using replaceAll() method");
		System.out.println("enter your string");
		String str = s.nextLine();
		System.err.println(str);
		String str1 = str.replaceAll("\\s","");
		System.out.println(str1);
		
		System.out.println("by using replaceAll() method");
		System.out.println();
		int len = str.length();
		String arr[] = new String[len];
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			arr[count] = st.nextToken();
			System.out.print(arr[count]);
			count++;
		}

		s.close();
	}
}
