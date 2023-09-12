public class creatingObjectOfMethodClass {

    int max (int x , int y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }

    }

    public static void main(String[] args) {
        int a =10;
        int b=15;
        creatingObjectOfMethodClass co = new creatingObjectOfMethodClass();
        System.out.println(co.max(a,b));
    }

}
