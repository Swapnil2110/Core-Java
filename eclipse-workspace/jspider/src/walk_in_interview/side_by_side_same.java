package walk_in_interview;

public class side_by_side_same {

	public static void main(String[] args) 
	{
		int c = 0;
		String str = "ramaa";
		int len = str.length();
		int[] arr = new int[len];
		for(int i = 0;i<len;i++)
		{
			char ch = str.charAt(i);
			int assci = (int)ch;
			arr[i] = assci;
		} 
		for(int i =0;i<len;i++)
		{
			
			if(arr[i]==arr[i+1])
			{
				c++;
				System.out.print(c);
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}
	}

}
