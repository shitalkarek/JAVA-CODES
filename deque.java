import java.util.*;

public class deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);



        dq.offerFirst(5);
        dq.offerFirst(10);
        dq.offerFirst(15);



        dq.pollFirst();
        dq.pollLast();

        dq.forEach((x)-> System.out.println(x));
    }    
}
