package wipro_exam;

public class test {

	public static void main(String[] args) 
	{
//		int c = 0;
		StringBuffer sb = new StringBuffer();
		int arr[] = {1,0,0,1};
		int q[] = {2,1,2,1,2};
		int len = arr.length;
		for(int i=0;i<q.length;i++)
		{
			int x = q[i];
			switch(x)
			{ 
			case 2:
				int c=0;
					if(arr[0]==1 )
					{
						for(int j=0;j<len;j++)
						{
							if(arr[j]==1)
							{
								c++;
							}
							else
							{              										
							  	break;
							}
						}	 
					}
					else
					{
						sb.append(0);
						break;
					}
				sb.append(c);
				break;
			case 1:
				int temp = arr[len-1];
				for(int j=len-1;0<j;j--)
				{
					arr[j] = arr[j-1];
				}
				arr[0] = temp;
				
//				System.out.println("\nyour new array is\n");
//				for(int j=0;j<len;j++)
//				{
//					System.out.print(arr[j]+" ");
//				}
				break;
			}
		}
//		System.out.println();
		System.out.println(sb);
	}

}
