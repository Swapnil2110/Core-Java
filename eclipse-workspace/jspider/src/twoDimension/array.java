package twoDimension;
import java.util.*;
public class array 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[][] arr = new int[3][4];
		for(int i = 0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j] = s.nextInt();
			}
		}
		//System.out.println("your array is");
		for(int i = 0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.err.print(arr[i][j]+" "); 
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("enter a digit for serach");
		int x = s.nextInt();
		for(int i = 0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(arr[i][j] == x)
				{
					System.out.println("number is found at "+i+","+j+" cordinate");
//					break;
				}
				System.out.println("inner");
			}
			System.out.println("outer");
		}
		s.close();
	}

}
