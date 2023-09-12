public class adding2Matrices {
    public static void main(String[] args) {
        
        int a[][]={  {2,2,2}, {3,3,3,}, {4,4,4} };
        int b[][]={ { 2,2,2,}, {3,3,3,}, {4,4,4,}};

        int c [][]= new int[3][3];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
}
