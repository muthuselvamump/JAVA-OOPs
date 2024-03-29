import java.util.*;

public class queue_demo{
    public static void main(String []args){
    PriorityQueue<Integer> q=new PriorityQueue<Integer>();
    q.add(2);
    q.add(6);
    q.add(4);
    q.add(7);
    System.out.println(q);
    System.out.println(q.peek());
    Iterator i1=q.iterator();
    while(i1.hasNext()){
        System.out.println(i1.next());
    }
    System.out.println("Size of the queue " +q.size());
    Queue<String> q1=new PriorityQueue<String>();
    q1.add("java");
    q1.add("developer");
    q1.add("python");
    q1.add("linux");
    System.out.println(q1);
    q1.remove("python");
    System.out.println(q1);
    q1.remove();
    System.out.println(q1);

}
}