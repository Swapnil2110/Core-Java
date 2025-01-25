package commom_number;

import java.util.*;


public class main 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> set = new HashSet<Integer>();
//		HashSet<Integer> set=new HashSet<Integer>();  
		int arr1[] = {10,20,30,40,50,60};
		 int arr2[] = {40,50,60,70,80,90};
//		String str = String.valueOf(arr1);
//		String str = Arrays.toString(arr1);
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(str);
		for(int i=0; i<arr1.length; i++)
		{
		 for(int j=0; j<arr2.length; j++)
		 { 
//			 set.add(arr2[j]);
//			 set.add(arr1[i]);
		      if(arr1[i] == arr2[j])
//			 if(str.contains(arr2[j]));
		      {
		       set.add(arr1[i]);  
		      } 
		      
		  }   
		 }
		System.out.print(set);

	}

}
