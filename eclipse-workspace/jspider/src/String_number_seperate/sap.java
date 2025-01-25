package String_number_seperate;
import java.util.*;
public class sap {

	public static void main(String[] args) 
	{
		int y =0;
		StringBuffer sb = new StringBuffer();
		Scanner s = new Scanner(System.in);
		System.out.println("enter your string");
		String str = s.nextLine();
//		int len = str.length();
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			String s2 = st.nextToken();
//			System.out.println(s2);
			int len1 = s2.length();
			if(len1>=y)
			{
				y = len1;
			}
		}
		StringTokenizer st1 = new StringTokenizer(str," ");
		while(st1.hasMoreTokens())
		{
//			System.out.println("555555");
			String s1 = st1.nextToken();
			int len1 = s1.length();
//			System.out.println(len1);
			if(len1==y)
			{
				for(int i = 0;i<len1;i++)
				{
					int x = (int)s1.charAt(i);
					if((x>=48 && 57>=x)||(x>=65 && 90>=x)||(x>=97 && 122>=x))
					{
						char ch  = (char)x;
//						System.out.println(ch);
						sb.append(ch); 
						
					}
				}
				break;
			}
		}
		StringBuilder bul = new StringBuilder();
		System.out.println("longest token is");
		System.err.println(sb);
		String tok = "***++";
		
		
		
		
		
		
		
//		System.out.println(sb.length());
		int k = 0;
		for(int i=0;i<sb.length();i++)
		{
			if((i+1)%3==0)
			{
				bul.append(tok.charAt(k));
				k++;
			}
			bul.append(sb.charAt(i));
			
		}
		
		System.out.println(bul);
		
		s.close();
	}

}
