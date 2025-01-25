package max_product_three_number;

public class main 
{

	public static void main(String[] args) 
	{
		int arr[] = {6,3,2,0,10};
	
		int len = arr.length;
		int arr1[] = new int[len];
		int temp =0 ; int mul =1;
		for(int i=0;i<len;i++)
		{
			for(int j=1+i;j<len;j++)
			{
				if(arr[i] < arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		
			arr1[i] = temp;
//			System.out.println(arr1[i]);
		}
		
		for(int i=0;i<3;i++)
		{
			mul = mul*arr[i];
		}
		
		System.out.println(mul);
	}

}
