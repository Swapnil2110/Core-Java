package practice;
import java.util.*;
public class first 
{

	public static void main(String[] args)
	{
		
		
		Scanner s = new Scanner(System.in);
		boolean a=false;
		System.out.println("enter a number");
		int num = s.nextInt();
		for(int i=2;i<num;i++)
		{
		 if(num%i==0)
		 {
		   a= true;
		   break;   
		 }   
		 else
		 {
		     a = false;
		 }
		 
		}
		if(a == true)
		{
		 System.out.println("not a prime number");   
		}
		else
		{
			System.out.println("this is a prime number");
		}
		
		s.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		boolean a =false;
//		int n = 7;
//		for(int i=2;i<n;i++)
//		{
//			if(n % i==0)
//			{
//				a = true;	
//				break;
//			}
//		}
//		if(a==true)
//		{
//			System.out.println("not a prime number");
//		}
//		else
//		{
//			System.out.println("prime number");
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		boolean a = false;
//		int n = 123456;
//		String str = String.valueOf(n);
//		char arr[] = str.toCharArray();
////		System.out.println(arr[]);
//		for(int i=0;i<arr.length;i++)
//		{
//			int x = Character.getNumericValue(arr[i]);
//			for(int j=2;j<x;j++)
//			{
//				if(x%j==0)
//				{
//					break;
//				}
//				else
//				{
//					
//				}
//				
//			}
//		}
	}

}
