package trianglenumber;
import java.util.*;
public class main
{
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("inter number of row");
		int x = s.nextInt();
		//System.out.println("assanding order");
		for(int i=1;x>=i;i++)
		{
			for(int j=1;i>=j;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//System.out.println("decending order");
		
		for(int i=x;1<i;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		for(int i=x;0<i;i--)
//		{
//			for(int j = 0;i>j;j++)
//			{
//				System.out.print("-");
//			}
//			
//				for(int l=0;l<5;l++)
//				{
//					System.out.print("*");
//				}
//				
//			System.out.println();
//		}
//		
		
		for(int i=0;5>i;i++)
		{
			for(int j=x;0<j;j--)
			{
				System.out.print("*");
			}
			x--;
			System.out.println();
			
		}
		s.close();
	}

}
