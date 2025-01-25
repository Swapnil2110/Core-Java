class Product
{
	int pCode = 101;
	String pName = "headphone";
	int pPrice = 2200;
	int pQty = 1;
	public static void main(String args[])
	{
		Product obj = new Product();
		obj.getProduct();
	}
	void getProduct()
	{
		System.out.println("pCode = "+pCode);
		System.out.println("pName = "+pName);
		System.out.println("pPrice = "+pPrice);
		System.out.println("pQty = "+pQty);
	}
}