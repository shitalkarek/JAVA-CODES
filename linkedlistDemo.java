import java.util.*;
public class linkedlistDemo {
    public static void main(String[] args) {
            LinkedList<Integer> l1= new LinkedList <>();
            LinkedList<Integer> l2= new LinkedList<>(List.of(50, 60, 70)); 

            l1.add(3);

            l1.addFirst(22);
            l1.addLast(22);

            System.out.println(l1);
            System.out.println(l2);


            l1.forEach(n-> show(n));
    }    

    static void show (int n)
    {
        System.out.println(n);
    }
}
