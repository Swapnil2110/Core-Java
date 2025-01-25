package fibonacci;
import java.util.*;
public class dlt 
{

	public static void main(String[] args)
	{
		int s1 = 0, s2 = 1,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a integer");
		int x = s.nextInt();
		while(x>0)
		{
			temp = s1+s2;
			s1 = s2;
			s2 = temp;
			System.out.print(" "+temp);
			x--;
		}
		s.close();
	}

}
