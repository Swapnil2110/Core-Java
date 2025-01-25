package int_ritation_sort;

public class sort {

	public static void main(String[] args) 
	{
		int arr[] = {3,4,5,1,2};
		int len = arr.length;
		System.out.println(len);
		int c= 0;
		for(int i=0;i<len-1;i++)
		{
			if(arr[i] == arr[i+1]+1)
			{
				c++;
			}
			else
			{
				
				for(int g=(len-i);0<g;g--)
				{
					int temp = arr[0];
					for(int k = 0;k<len-1;k++)
					{
						arr[k] = arr[k+1];
						
					}
					arr[len-1] = temp;
				}
			
			} 
			
		}
		System.out.println();
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
