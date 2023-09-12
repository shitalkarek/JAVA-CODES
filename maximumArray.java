public class maximumArray {
    public static void main(String[] args) {
        int max;

        int a [] = { 2,4,8,9,10,30,1};
        max=a[0];

        for(int i = 1 ; i<a.length; i++)
        {
            if (a[i]>max)
            {
                max=a[i];
                
            }
            
        }
        System.out.println("the maximum elements is "  + max );
        
    }
}
