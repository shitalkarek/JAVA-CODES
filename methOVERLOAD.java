public class methOVERLOAD {
    static double area (double radius)
    {
        return Math.PI*radius*radius;
    }

    static double area (double length , double breadth)
    {
        return length * breadth;
    }

    public static void main(String[] args) {
        System.out.println(area(10));
        System.out.println(area(10, 5));
    }
}
