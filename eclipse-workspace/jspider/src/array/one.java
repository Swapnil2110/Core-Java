package array;
import java.util.*;
public class one
{

	public static void main(String[] args) 
	{
		System.out.println("enter your integer values");
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;arr.length>i;i++)
		{
			arr[i] = s.nextInt();
			
		}
		
		System.out.println("forword direction");
		
		for(int i=0;arr.length>i;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("reverse direction");
		
		for(int i=arr.length-1;0<=i;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		s.close();
		
		
		
		
		
		
		
//		int arr[] = {1,2,3,4};
//		for(int i=0;arr.length>i;i++)
//		{
//			System.out.print(" "+arr[i]);
//		}
	}

}
