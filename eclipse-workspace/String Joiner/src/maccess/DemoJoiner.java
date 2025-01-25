package maccess;
import java.util.StringJoiner;
public class DemoJoiner 
{
	static StringJoiner sj = new StringJoiner("-");
	public static void main(String[] args) 
	{
		//StringJoiner sj = new StringJoiner("-");
		System.out.println("Length of sj : "+sj.length());
		//add String into it
		sj.add("16");
		System.out.println("sj: "+sj);
		System.out.println("Length of sj : "+sj.length());
		sj.add("Jan");
		System.out.println("sj : "+sj);
		System.out.println("Length of sj : "+sj.length());
		sj.add("2022");
		System.out.println("sj: "+sj);
		System.out.println("Length of sj : "+sj.length());
	}
}
