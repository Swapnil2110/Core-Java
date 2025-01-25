package reverse_using_for_loop;
import java.util.*;
public class main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String str = s.nextLine();
		int len = str.length();
		char ch[] = new char[len];
		for(int i = 0;len-1>=i ;i++)
		{
			ch[i] = str.charAt(i);
		}
		System.out.println();
		for(int i = len-1;0<=i;i--)
		{
			System.out.print(ch[i]+" ");
		}
		s.close();
	}

}
