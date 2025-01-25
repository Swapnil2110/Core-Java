package mountail_array;

public class test {

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		int arr[] = {1,3,1,3,4,5,6,7,8,9,8,7,6,5};
		int len = arr.length;
		for(int i=0;i<len-1;i++)
		{
			int x = arr[i];
			int y = arr[i+1];
			if(x+1 == y)
			{
				sb.append(arr[i]);
			}
			else if(x == y+1)
			{
				sb.append(arr[i]);
				if(len-2 == i) {
//					System.out.println("000");
					sb.append(arr[i+1]);
				}
			}

		}
		
		System.out.println(sb);
		System.out.println("length is "+sb.length());

	}

}
