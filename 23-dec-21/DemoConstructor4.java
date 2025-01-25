import java.util.Scanner;
class TrainDetails
{
	String trainName, fromStation, toStation, dTime, aTime;
	int trainNo, price;
	TrainDetails(int a,String b,String c,String d,String e,String f,int g) //constructor
	{
		trainNo = a;
		trainName = b;
		fromStation = c;
		toStation = d;
		dTime = e;
		aTime = f;
		price = g;
	}
	void getTrainDetails()
	{
		System.out.println("***TRAIN_DETAILS***");
		System.out.println("Train no. : "+trainNo);
		System.out.println("Train name : "+trainName);
		System.out.println("From Station: "+fromStation);
		System.out.println("To Station : "+toStation);
		System.out.println("Departure time : "+dTime);
		System.out.println("Arrival time : "+aTime);
		System.out.println("Price : "+price);
	}
}

class DemoConstructor4
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter Train Number: ");
		int tNo = s.nextInt();
		s.nextLine(); //because of nextInt this line is going to be skipped.
		
		System.out.println("enter Train Name: ");
		String name = s.nextLine();
		
		System.out.println("from station: ");
		String fS = s.nextLine();
		
		System.out.println("to station: ");
		String tS = s.nextLine();
		
		System.out.println("enter departure time: ");
		String dT = s.nextLine();
		
		System.out.println("enter arrivel time: ");
		String aT = s.nextLine();
		
		System.out.println("Enter price: ");
		int price = s.nextInt();
		
		TrainDetails td = new TrainDetails(tNo, name, fS,tS, dT, aT, price);
		td.getTrainDetails();
	}
}