import java.util.*;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digits to count");
        int n = sc.nextInt();

            int count = 0;
        while(n>0)
        {

            n = n/10;
            count++;

        }
        System.out.println("total digits are   "+ count);
    }
}
