package java_collection_framework;
import java.util.*;
public class Link_list
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println("display");
		System.out.println(ll.toString());
		System.out.println("removal operation");
		ll.remove(1);
		System.out.println("after removal element");
		System.out.println(ll.toString());
	}

}
