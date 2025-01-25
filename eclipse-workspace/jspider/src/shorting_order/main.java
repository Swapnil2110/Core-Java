package shorting_order;

public class main 
{
	public static void main(String[] args)
	{
		int temp;
	Integer arr[] = {5, 4, 8, 1, 0, 6, 9 }; //  4 5 8 1 0 6 9  // 1 5 8 4 0 6 9  //0 5 8 4 1 6 9
	int len = arr.length;
	System.out.println("before shorting");
	for(int i=0;i<=len-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	for(int i=0;i<=len-1;i++)
	{
		for(int j = i+1;j<=len-1;j++)
		{
			if(arr[i]>arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	System.out.println("\nafter shorting");
	for(int i=0;i<=len-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println("\nlast second highest elements"+arr[len-2]);
	}
}
