package string_input_output_sum;
import java.util.*;
public class first_question {

	public static void main(String[] args) 
	{
		int sum = 0;
		int sum1 = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter your number");
		int num = s.nextInt();
		System.out.println("your number is "+num);
		String s1 = String.valueOf(num);
		System.out.println(s1);
		int len = s1.length();
		System.out.println("length is "+len);
		char arr[] = new char[len];
		for(int i=0;i<len;i++)
		{
			
			arr[i] = s1.charAt(i); 
			int x = Character.getNumericValue(arr[i]);
			System.out.println(" "+x);
			sum = sum+x;
		}
		System.out.println("addition is "+sum);
		String s2 = String.valueOf(sum);
		int len1 = s2.length();
		char arr1[] = new char[len1];
		for(int i=0;i<len1;i++)
		{
			arr1[i] = s2.charAt(i);
			int  y = Character.getNumericValue(arr1[i]);
			sum1 = sum1+y;
		}
		System.out.println("final sum is "+sum1);
		s.close();
	}

}
