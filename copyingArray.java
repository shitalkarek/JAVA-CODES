public class copyingArray {
    public static void main(String[] args) {
        
        int a [] = {1,2,3,4,5,6,7,8,9,};

        int b[]=new int [9];

        for(int i=0; i<a.length ;i++)
        {
            b[i]=a[i];
        }

        //displaying

        for(int i=0 ; i<a.length;i++)
        {
            System.out.print(b[i]+",");
        }
    }
}
