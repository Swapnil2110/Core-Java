package java_collection_framework;
import java.util.*;
public class Hashseet 
{
	public static void main(String[] args)
	{
		int arr[] = {10,50,20,20,90,80,70,70,90,60};
		int len = arr.length;
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		System.out.println(hs);
//		hs.add(arr);
		
		for(int i=0;i<len;i++)
		{
			hs.add(arr[i]);
		}
		System.out.println(hs);
//		Collections.sort(hs);
		System.out.println(hs);
	}
}
