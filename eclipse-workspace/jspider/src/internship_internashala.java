import java.util.StringTokenizer;

public class internship_internashala
{
	
	public static void main(String[] args)
	{
		
		int x=0, y=0, count=0;
		String finl = null;
		String str3 = null;
		String str = "How to remove all whitespace from String in Java?";
		int len = str.length();
		StringBuffer sb = new StringBuffer();
		int arr1[] = new int[len];
		int arr[] = new int[len];
		char ch[] = new char[len];
		char ch1[] = new char[len];
		for(int i=0;i<len;i++)
		{ 
			ch[i] = str.charAt(i);
			arr[i] = (int)ch[i];	
		}		
		for(int i=0;i<len;i++)
		{
			if((97<=arr[i]&&arr[i]<=122)||(129<=arr[i]&&arr[i]<=154)||(arr[i]==32))
			{
				ch1[x] = (char)arr[i];
				x++;
			}			
		}
		String s1 = String.valueOf(ch1);
		StringTokenizer st = new StringTokenizer(s1," ");
		while(st.hasMoreTokens())
		{
			count++;
			String s2 = st.nextToken();
			sb.append( s2+" ");
			int len1 = s2.length();
			arr1[y] = len1;
			y++;
		}
		int temp;
		for(int i=0;i<=count-1;i++)
		{
			for(int j = i+1;j<=count-1;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		int max = arr1[count-1];
		String s2 = sb.toString();
		StringTokenizer st1 = new StringTokenizer(s2," ");
		while(st1.hasMoreTokens())
		{
			String s3 = st1.nextToken();
			int len3 = s3.length();
			
			if(len3 == max)
			{
				str3 = s3.replaceAll("\\s", " ");
				finl = str3;
				break;
			}
		}
		for(int i=max-1 ;i>=0 ;i--)
		{
			char ch3 = finl.charAt(i);
			 
			System.out.print(ch3);
		}
		
	}

}
