package swap_with_third_veriable;
import java .util.*;
public class Scaner {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter two integer value");
		System.out.println("enter 1st integer value");
		int n1 = s.nextInt();
		System.out.println("enter 2nd integer value");
		int n2 = s.nextInt();
		System.out.println("befor swaping");
		System.out.println("n1 = "+n1+"\nn2 = "+n2);
		int temp;
		temp = n1;
		n1= n2;
		n2 = temp;
		System.out.println("after swaping");
		System.out.println("n1 = "+n1+"\nn2 = "+n2);
		s.close();
	}

}
