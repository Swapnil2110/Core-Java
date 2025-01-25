package java_collection_framework;
import java.util.*;
public class sort_reverse_linkedlist 
{
	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(5);
		ll.add(9);
		ll.add(10);
		ll.add(2);
		ll.add(15);
		System.out.println(ll.toString());
		ll.add(1,55);
		System.out.println("input elements are");	
		System.out.println(ll.toString());
		ll.remove(2);
		System.out.println(ll.toString());
		System.out.println("after removal elements shortlist elements");
		Collections.sort(ll);
		System.err.println(ll.toString());
		System.out.println("reverse if linkedlist");
		Collections.reverse(ll);
		System.out.println(ll.toString());
	}

}
