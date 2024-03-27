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
        System.out.println(i1);
    }
    
    }
}