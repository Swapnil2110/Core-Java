package java_collection_framework;
import java.util.*;
public class Arraylist 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(new Integer(10));
		al.add(20);
		al.add(30);
		System.out.println("diplay operation");
		System.out.println(al.toString());
		System.out.println("removal operation");
		al.remove(0);
		System.out.println(al.toString());
		
	}

}
