import java.util.*;

public class geometricSeries{

    public static void main (String args [])
    {

        Scanner sc = new Scanner ( System.in);

        System.out.println("enter the starting number ");
        int a = sc.nextInt();

        System.out.println("enter the common ratio number ");
        int cr = sc.nextInt();   //cr=common ratio 

        System.out.println("enter the series  number ");
        int n = sc.nextInt();
        
        int term = a;

        for(int i = 1 ; i <= n ; i++)
        {
            System.out.print(term + " ");
            term = term * cr;
        }

    }
}