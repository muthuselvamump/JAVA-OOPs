package queue;

public class queue_implementation {
    public static void main(String []args){
    queue q=new queue();
    q.enqueue(5);
    q.enqueue(2);
    q.enqueue(7);
    q.enqueue(87);
    q.enqueue(8);
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());

    
    }
}
