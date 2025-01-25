package walk_in_interview;

public class digit_count {

	public static void main(String[] args)
	{
		int c=0;
		StringBuffer sb = new StringBuffer();
		String str = "sam1son2sun3";
		int len = str.length();
		for(int i = 0;i<len;i++)
		{
			char ch = str.charAt(i);
			int assi = (int)ch;
			if(assi>=49 && assi<=57 )
			{
				c++;
				sb.append(ch);
			}
		}
		System.out.print("number of count is = "+c+" ");
		System.out.println("those are "+sb);
	}

}
