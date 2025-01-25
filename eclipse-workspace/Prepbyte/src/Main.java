import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException 
  {
    Scanner s = new Scanner(System.in);
    System.out.println();
    int T = s.nextInt();
    /*while(T>=1 && T<=10)*/
    if(T<=10 && T>=1)
    {
      System.out.println();
      String S = s.nextLine();
      Count c = new Count();
      int c_num = c.counta(S);
      System.out.println(c_num);
      
      T--;
    }
   
    s.close();
  }
}
class Count//to count 'a' in string
{
  int counta(String S)
  {
    int counta_num=0;
    StringBuffer sb = new StringBuffer();
    sb.append(S);
    for(int i=0; i<=sb.length(); i++)
    {
      if(sb.charAt(i)=='a')
      {
        counta_num++;
        //System.out.println();
      }
      
    }
    return counta_num;
  }
}