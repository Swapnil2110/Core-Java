package find_2s;
import java.util.*;
public class find {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a integer value");
		int num = s.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++)
		{	
			String str = String.valueOf(i);
			int len1 = str.length();
			char arr[] = new char[len1];
			for(int j=0;j<len1;j++)
			{
				arr[j] = str.charAt(j);
				
			}
			
			for(int k=0;k<len1;k++)
			{
				int x = Character.getNumericValue(arr[k]);
				if( x==2 )
				{
					count++;
				}
			}
		
		}
		System.out.println("count is "+count);
		s.close();
	}

}
