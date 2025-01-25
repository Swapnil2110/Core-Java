package java_collection_framework;
import java.util.*;
public class stack_pick_pop 
{
	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("enter your choice \n1 for add "
				+ "\n2 for display \n3 for delete \n4 for check stack is empty or not"
				+ " \n5 for search element in stack");
		st.add(100);
		st.push(200);
		st.push(300);
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
			st.add(10);
			st.push(20);
			st.push(30);
			break;
		case 2:
			if(st.empty())
			{
				System.out.println("stack is empty");
			}
			else
			{	
				System.out.println("by using toString method");
				System.out.println(st.toString());
				System.out.println("by using peek() method here peek method is show only last element");
				System.out.println(st.peek());
			}
			break;
		case 3:
			System.out.println("pop method is delete only last elements");
			System.out.println(st.toString());
			st.pop();
			System.out.println(st.toString());
			st.pop();
			System.out.println(st.toString());
			break;
		case 4:
			if(st.empty())
			{
				System.out.println("stack is empty");
			}
			else
			{
				System.out.println("stack is not empty");
			}
			break;
		case 5:
			if(st.empty())
			{
				System.out.println("Stack is empty");
			}
			else
			{
				System.out.println("enter your integer");
				int e = s.nextInt();
				int pos = st.search(e);
				System.out.println(pos);
			}
			break;
		default:
			System.err.println("envalid enter choice ");
			break;
		}
		
//		System.out.println(st.toString());
		s.close();
	}
}
