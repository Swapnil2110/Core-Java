
public class first 
{

	public static void main(String[] args) 
	{
		
		
		String str = "fun&!! time akdsb sex kr@negaya";
		String [] arr = str.split(" ");
		int size = 0;
		StringBuilder res = new StringBuilder();

		for(int i=0; i<arr.length; i++)
		{
		StringBuilder sb = new StringBuilder();
		for(int j=0; j<arr[i].length(); j++)
		{
		if((int)arr[i].charAt(j) >= 97 && (int)arr[i].charAt(j)<= 122)
		{
		sb.append(arr[i].charAt(j));
		}
		else {
		break;
		}
		}
		arr[i] = sb.toString();

		if(arr[i].length() > size)
		{
		size = arr[i].length();
		res.setLength(0);
		res.append(arr[i]);
		}
		}//end of for

		System.out.println(res.reverse()); 
		

	}

}
