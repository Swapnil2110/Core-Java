package odd_even;

public class fifth 
{

	public static void main(String[] args) 
	{
		int e = 0;
		int o = 0;
		int arr[] = {3,6,7,9,2,13,17};
		int len = arr.length;
		int odd[] = new int[len];
		int even[] = new int[len];
		for(int i =0;i<len;i++)
		{
			if(i%2==0)
			{
				even[e] = arr[i];
				e++;
			}
			else
			{
				odd[o] = arr[i];
				o++;
			}
			
		}
		
		int elen = even.length;
		int olen = odd.length;
		int emax =0, omax =0;
		for(int i=0;i<elen;i++)
		{
			if(emax<even[i])
			{
				emax = even[i];
			}
		
		}
		System.out.println("largest even number is "+emax);
		
		
		for(int i=0;i<olen;i++)
		{
			if(omax<odd[i])
			{
				omax = odd[i];
			}
		}
		System.out.println("lagest odd number is "+omax);
	}

}
