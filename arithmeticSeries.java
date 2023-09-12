import java.util.*;

public class arithmeticSeries {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
         
        System.out.println("enter the starting number");
        int a = sc.nextInt();

        System.out.println("enter the difference between  numbers");
        int d = sc.nextInt();

        System.out.println("enter the length of the series");
        int n = sc.nextInt();


        int term = a ;

        for(int i =1 ; i <= n ; i++)
        {
            
            System.out.print(term + " ");
            term = term + d ;
        }
        
    }
}
