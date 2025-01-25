package conatins_method;
import java.util.*;
public class main 
{

	public static void main(String[] args) 
	{
		String str = "my name is rahul kumar";
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string to check the value");
		String s1 = s.nextLine();
		if(str.contains(s1))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		s.close();
		
		
//		int count = 0;
//		for(int i =467;i<=683;i++)
//		{
//			if(i%29==0)
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
	}

}
