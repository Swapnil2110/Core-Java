package maccess;

import java.util.*;

public class ArrayRotation 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int N = s.nextInt();
		
		int [] arr = new int[N];
		
		for(int i=0; i<N; i++)
		{
		    arr[i] = s.nextInt();
		}
		
		for(int j=0; j<N; j++)
		{
		    System.out.print(arr[j]+" ");
		}
	}
}
