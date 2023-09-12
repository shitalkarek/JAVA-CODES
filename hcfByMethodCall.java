public class hcfByMethodCall {
    int hcf (int m , int n)
    {
        while (m!=n)
        {

            if (m>n)
            m=m-n;
            else
            n=n-m;
        }
        return m;
    }



    public static void main(String[] args) {
        
        hcfByMethodCall  hc = new  hcfByMethodCall ();
        System.out.println(hc.hcf(25,15));

    }
}
