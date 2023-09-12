public class areaMETHODOVERLOADING {
    static double area (double length, double breadth)
    {
        return length * breadth ;
    }

    static double area ( double radius)
    {
        return Math.PI *radius*radius;
    }

    public static void main(String[] args) {
        System.out.println(area(10,5));
    }
}
