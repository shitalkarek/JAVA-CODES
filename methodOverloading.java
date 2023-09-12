public class methodOverloading {
     static int max ( int x , int y)
     {
        return x > y ?  x : y ;
     }

     static float max ( float x , float y)
     {
        return x > y ? x : y ;
     }

     static float max ( float x , float y , float z)
     {
        return x > y && x>z ? x : (y>z ? y : z);
     }


     public static void main(String[] args) {
        System.out.println(max(15,10));
     }
}
