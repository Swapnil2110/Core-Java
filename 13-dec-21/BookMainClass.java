import java.util.Scanner;

class BookData
{
	String bCode, bName, bAuthor;
	float bPrice;
	int bQty;
	
	void setBookData(String a,String b,String c,float d,int e)
	{
		bCode = a;
		bName = b;
		bAuthor = c;
		bPrice = d;
		bQty = e;
	}
	
	void getBookData()
	{
		System.out.println("===BOOK DETAILS===");
		System.out.println("Book Code: "+bCode);
		System.out.println("Book Name: "+bName);
		System.out.println("Book Author: "+bAuthor);
		System.out.println("Book Price: "+bPrice);
		System.out.println("Book Quantity: "+bQty);
	}
}

class BookMainClass
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Book Code: ");
		String code = s.nextLine();
		
		System.out.println("Enter Book Name: ");
		String name = s.nextLine();
		
		System.out.println("Enter Book Author: ");
		String author = s.nextLine();
		
		System.out.println("Enter Book Price: ");
		float price = s.nextFloat();
		
		System.out.println("Enter Book Quantity: ");
		int qty = s.nextInt();
		
		BookData bd = new BookData();
		bd.setBookData(code,name,author,price,qty);
		bd.getBookData();
	}
}