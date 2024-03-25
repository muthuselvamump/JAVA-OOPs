import java.util.PriorityQueue;

public class queue_demo{
    public static void main(String []args){
    PriorityQueue<Integer> q=new PriorityQueue<Integer>();
    q.add(2);
    q.add(6);
    q.add(4);
    q.add(7);
    System.out.println(q);
    System.out.println(q.peek());
    }
}