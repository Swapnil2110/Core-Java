package maccess;
import java.util.*;

public class ArrayRot 
{
	public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        //take input from user to create an array
        int N = Integer.parseInt(s.nextLine());
        int arr[] = new int[N];
        for(int i=0; i<N; i++)
        {
            arr[i] = Integer.parseInt(s.nextLine());
        }
        
        
        //take input for P(position) and D(direction)
        System.out.println("Enter position: ");
        int p = Integer.parseInt(s.nextLine());
        System.out.println("Enter direction: ");
        int d = Integer.parseInt(s.nextLine());
        //d could be either 0(to left) or 1(to right)
        
        if(d==0)
        {
            //to left side by p position
            for(int j=0; j<N; j++)
            {
                System.out.print(arr[(j+p)%N] +" ");
            }
        }
        if(d==1)
        {
            //to right side by p position
            for(int k=0; k<N; k++)
            {
                System.out.print(arr[((k+(N-p))%N)] + " ");
            }
        }
        
    }
}
