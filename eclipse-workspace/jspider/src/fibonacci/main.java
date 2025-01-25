package fibonacci;

public class main {

	public static void main(String[] args) 
	{
		int n1 = 0 , n2 = 1 , i = 1, n3;
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		while(i <= 20)
		{
			n3 = n1 + n2;
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
			i++;
		}
		
	}

}
