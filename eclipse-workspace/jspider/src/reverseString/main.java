package reverseString;
import java.util.*;
public class main {

	public static void main(String[] args)
	{
		int j = 0;
		String arr[] = new String[4];
		String str = "i am java programmer";
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			String s1 = st.nextToken();
			arr[j] = s1;
			j++;
		}
		for(int i=3;0<=i;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
