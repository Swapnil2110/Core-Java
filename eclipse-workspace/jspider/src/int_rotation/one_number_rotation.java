package int_rotation;

public class one_number_rotation 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50,60};
		
		
		
		
		
		
		
		
		
		
		
		
		
		int len = arr.length;
		
		
		
		System.out.println(len);
		
		
		
		
		System.out.println("input string is");
		for(int i=0;i<=len-1;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
		System.out.println();
		int j=0;
		while(j < 6)
		{
			
			int temp;
			temp = arr[0]; 
			for(int i=0;i<len-1;i++)
			{
				arr[i] = arr[i+1];	
			}
			arr[len-1] = temp;
			
			
			
			for(int i=0;i<len;i++)
			{ 
				System.out.print(arr[i]+" ");
			}
			
			System.out.println();
			j++;
		}
		
		

		
	}
	
}
