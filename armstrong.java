import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number to check armstrong :");
        int n = sc.nextInt();
        int m = n ;
        int sum = 0;

        while(n>0)
        {
            int r = n%10;
            sum = sum + r*r*r;
            n = n / 10;
        }

        if(sum == m)
        {
            System.out.println(sum +  " its a armstrong number");
        }
        else
        {
            System.out.println(m+ " its not a armstrong number");
        }

    }
}
