package arraylist;
import java.util.*;
public class main
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{

		@SuppressWarnings("rawtypes")
		ArrayList<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		System.out.println(list.size());
		System.out.println(list);
//		Iterator itr = list.Iterator();
	}

}
