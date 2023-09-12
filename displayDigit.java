import java.util.*;

public class displayDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the digits to display in ulta #haha :");
        int n = sc.nextInt();

        while(n>0)
        {

            int r = n % 10 ;
            n = n/10;

            System.out.println("digits are :" + r);


        }

    }
}
