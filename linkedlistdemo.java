import java.util.LinkedList;
import java.util.Comparator;
import java.util.*;
public class linkedlistdemo{
public static void main(String[] args) {
    LinkedList<Integer> l1=new LinkedList<Integer>();
    l1.add(5);
    l1.add(8);
    l1.add(3);
    l1.add(9);
    l1.add(56);
    System.out.println(l1);
    System.out.println(l1.get(2));
    l1.set(2,46);


    System.out.println("loop");
    for(int i:l1){
        System.out.println("linke list element "+i);
    }
    l1.sort(Comparator.reverseOrder());
    
    System.out.println("after sorted reverse order "+l1);

    LinkedList l2=new LinkedList<>();
    l2.add(5);
    l2.add("hello");
    l2.add(5.6);
    System.out.println(l2);

    LinkedList<String> l3=new LinkedList<String>();
    l3.add("java");
    l3.add("testing");
    l3.add("Selenium");
    l3.add("developer");
    System.out.println(l3);

}
}