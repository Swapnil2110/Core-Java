package multidimension;
import java.util.*;
public class rowcolumn {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of row");
		int row = s.nextInt();
		System.out.println("enter number of column");
		int col = s.nextInt();
		int count=1;
		int arr[][] = new int[row][col];
		for(int i=0;row>i;i++)
		{
			for(int j=0;col>j;j++)
			{
				arr[i][j] = count++;
			}
		}
		
		System.out.println("output");
		for(int i=0;row>i;i++)
		{
			for(int j =0;col>j;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		s.close();
	}

}
