/**
 * deletingArray
 */
public class deletingArray {

    public static void main(String[] args) {
         int a[] = new int[10];
        a[0] = 3;
        a[1] = 9;
        a[2] = 7;
        a[3] = 8;
        a[4] = 12;
        a[5] = 6;

        int n = 6;


        //initial array

        for(int i =0 ; i<a.length; i++)
        {
            System.out.print(a[i] + ",");
        }

        int index =1;
        for(int i=index+1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
         

        //displaying
        for(int i =0 ; i<a.length; i++)
        {
            System.out.print(a[i] + ",");
        }
    }
}