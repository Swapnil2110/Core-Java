package common_element;
import java.util.*;
public class common
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		String arr1[] = {"one","two","three","four","five","six","seven","eight","nine","ten"};
		String arr2[] = {"two","four","six","eight","ten"};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j =0;j<arr2.length;j++)
			{
				if(arr1[i].equals(arr2[j]))
				{
					hs.add(arr1[i]);
				}
			}
		}
		System.out.println("common elements are........");
		System.out.println(hs);
	}
}
