package sum_equals_zero;
import java.util.*;
public class forth 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int arr[] = {28, 43, -12, -6, 3, -42, 68, 17, 12};
		int len = arr.length;
//		System.out.println(len);
		for(int i=0;i<len;i++)
		{
			for(int j =i+1;j<len;j++)
			{
				int result = arr[i] + arr[j];
				
				if(0<result && result<=4)
				{
					System.out.println("pair of number "+arr[i]+
							"and"+arr[j]+"whose sum is near to zero");
				}
			}
		}
		s.close();
		
	}

}
