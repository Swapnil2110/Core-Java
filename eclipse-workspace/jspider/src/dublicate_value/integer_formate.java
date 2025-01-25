package dublicate_value;
import java.util.*;
public class integer_formate 
{

	public static void main(String[] args) 
	{
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter number");
//		int x = s.nextInt();
		
		int arr[] = {10,12,10,12,10};
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<=4;i++)
		{
			
			hs.add(arr[i]);
		}
		
		System.out.println(hs);
		
//		s.close()/;
		
	}

}
