public class meth {
    static void update (int a[])
    {
        a[0]=10;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        update(a);
        System.out.println(a[0]);
    }
}
