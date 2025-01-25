package swap_with_third_veriable;
import java.util.*;
public class main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter x integer value");
		int x = s.nextInt();
		System.out.println("enter y integer value");
		int y = s.nextInt();
		System.out.println("1st for with third veriable  \n 2nd for without veriable");
		int ch = s.nextInt();
		switch(ch)
		{
		case 1:
			int temp;
			temp = x;
			x = y;
			y = temp;
			System.out.println("value of x is "+x+"\nvalue of y is "+y);
			break; 
		case 2:
			// x = 4   y = 5
			x = x+y; //4+5 = 9
			y = x-y; //9-5 = 4
			x = x-y; //9-4 = 5
			System.out.println("value of x is "+x+"\nvalue of y is "+y);
			break;
		
		}
		
		s.close();
	}

}
