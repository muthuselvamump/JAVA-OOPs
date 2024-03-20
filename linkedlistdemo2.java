import java.util.*;
public class linkedlistdemo2 {
    public static void main(String []args){
        LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.add(9);l1.add(1);
        l1.add(2);
        l1.add(4);
        l1.add(8);
        l1.add(6);
        l1.add(4);
        System.out.println(l1);
        l1.addFirst(2);
        System.out.println(l1);
        l1.addLast(5);
        System.out.println(l1);
        System.out.println(l1.getLast());
        System.out.println(l1.getFirst());
        System.out.println(l1);
        l1.removeFirst();
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
        List n=new ArrayList<Integer>();
        n.add(7);
        n.add(9);
        n.add(27);
        System.out.println(n);
    }
    
}
