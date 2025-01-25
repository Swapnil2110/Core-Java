package int_rotation;

public class main {

	public static void main(String[] args) 
	{
		
		int x = 1, count = 1;
		int arr[] = {10,20,30,40,50,60};
		System.out.println("original array length is "+arr.length);
		for(int i=0;arr.length-1>=i;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\ntwo number shift ");
		
		while(6>=x)
		{
			int first = arr[0];
//			int second = arr[1];
			for(int j = 0;arr.length-1>j;j++)
			{
				arr[j] = arr[j+1];
			}
//			arr[arr.length-2] = first;
			arr[arr.length-1] = first;
//			System.out.println();
//			for(int i = 0;arr.length-1>=i;i++)
//			{
//				System.out.print(arr[i]+" ");
//			}
			
			System.out.println();

			int one = arr[0];
			for(int k=0;arr.length-1>k;k++)
			{
				arr[k] = arr[k+1];
			}
			arr[arr.length-1] = one;
			
			for(int i = 0;arr.length-1>=i;i++)
			{
				System.out.print(arr[i]+" ");
			}
			x++;
		}

		
		System.out.println("\n one number shift");
		while(count<=6)
		{
			int temp = arr[0];
			
			for(int j=0;arr.length-1>j;j++)
			{
				arr[j] = arr[j+1];
			}
//			System.out.println("reverse array length is "+arr.length);
			arr[arr.length-1] = temp;
			
//			System.out.println(arr[5]);
			
			System.out.println();
			for(int k=0;arr.length>k;k++)
			{
				System.out.print(arr[k]+" ");
			}
			
			count++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
