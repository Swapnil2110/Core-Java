package maccess;
import java.util.*;
public class DemoArray2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements to be stored in array: ");
		int n=s.nextInt();
		String a[] = new String[n];
		//System.out.println(a.length);
		for(int i=0; i<n; i++)
		{
			//System.out.println(i);
			a[i]=s.nextLine();
		}
		//display array elements using for loop
		/*for(String k: a)
		{
			System.out.println(k.toString());
		}*/
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		s.close();
	}
}
