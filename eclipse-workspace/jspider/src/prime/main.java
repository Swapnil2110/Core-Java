package prime;
//import java.util.*;
public class main 
{

	public static void main(String[] args)
	{
		int x=0;
		int arr[] = new int[100];
		for(int j=2;j<=100;j++)
		{
//			@SuppressWarnings("unused")
			int k = 0;
//			Scanner s = new Scanner(System.in);
//			System.out.println("enter a integer");
//			int num = s.nextInt();
//			int num = j;
			for(int i=2;i<j;i++)
			{
				if(j%i==0)
				{
					k++;
					break;
				}
				
			}
			if(k > 0 )
			{
//				System.out.println(num+"this is not prime number");
			}
			else 
			{
				System.out.println(j+"this is  a prime number");
				arr[x] = j;
				x++;
			}
//			System.out.println(k+"*");
//			s.close();
			
		}
		
//		int temp;
//		System.out.println(arr[1]+" ");
		
//		int n1 =arr[0], n2 = arr[1], n3;
//		System.out.print(arr[1]+" ");
//		for(int i=0;i<=50;i++)
//		{
//			
//			n3 = n1+n2;
//			System.out.print(n3+" ");
//			n1 = n2;
//			n2 = n3;
//			
//			
////			temp = arr[i] + arr[i+1];
////			System.out.print(temp+" ");
////			arr[i] = arr[i+1];
////			arr[i+1] = temp;
//			
//		}
		
	}

}
