public class leftRotatingArray {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < a.length; i++) // displaying initial array
        {
            System.out.print(a[i] + ",");
            System.out.print(" ");
        }

        int temp = a[0];

        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];

        }

        a[a.length - 1] = temp;

        // displaying

        for (int i = 0; i < a.length; i++) { 
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
