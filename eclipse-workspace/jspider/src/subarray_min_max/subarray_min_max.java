package subarray_min_max;

public class subarray_min_max {

	public static void main(String[] args)
	{
		int arr[] = {-1,-2,3,4,5,6,7,8};
		int len =arr.length;
		
		int arr1[] = new int[len];

		for(int i=0;i<len;i++)
		{
			int min = 0, max =0 ;
			for(int j=0;j<=i;j++)
			{
				if(arr[j]<0)
				{
					min = min+arr[j];
				}
				else
				{
					max = max+arr[j];
				}
			}
			int save = min+max;
			arr1[i] = save;

		}

//		for(int i=0;i<len;i++)
//		{
//			System.out.print(arr1[i]+" ");
//		}
		
	}

}
