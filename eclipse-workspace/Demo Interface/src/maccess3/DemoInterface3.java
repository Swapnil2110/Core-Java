package maccess3;
import java.util.*;
import test3.*;
public class DemoInterface3 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		ImpClass ic = new ImpClass(300);
		System.out.println("Enter value v1: ");
		int v1 = s.nextInt();
		System.out.print("Enter value v2: ");
		int v2 = s.nextInt();
		ic.add(v1, v2);
		ic.mul(v1, v2);
		ic.dis(400);
		s.close();
	}
}
