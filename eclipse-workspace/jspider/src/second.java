
public class second
{

	public static void main(String[] args) 
	
	{
		String str = "aabbbfffb";
		System.out.println(newstr(str));
		}

		static String new str(String str)
		{
		char arr[] = str.toCharArray();

		StringBuilder res = new StringBuilder();
		int chcount = 1;
		for(int i=1; i<arr.length; i++)
		{
		if(Character.compare(arr[i-1], arr[i]) == 0)
		{
		chcount++;
		//if(i == arr.length-2)
		if(i==arr.length-1)
		{
		res.append(Integer.toString(chcount) + arr[i]);
		}

		}
		else {
		res.append(Integer.toString(chcount) + arr[i-1]);
		chcount = 1;
		if(i==arr.length-1)
		{
		res.append(Integer.toString(chcount) + arr[i]);
		}
		}
		} 
		 

	}

}
