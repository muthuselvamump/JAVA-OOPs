import java.util.Vector;

public class Vector_demo {
    public static void main(String args[]){
        Vector<Integer> v1=new Vector<Integer>();
        v1.add(55);
        v1.add(7);
        v1.add(55);
        v1.add(7);
        v1.add(55);
        v1.add(7);
        v1.add(55);
        v1.add(7);
        v1.add(55);
        v1.add(7);
        v1.add(55);
        v1.add(7);
        System.out.println(v1);
        System.out.println(v1.size());
        Vector<Integer> v2=new Vector<Integer>(5);
        v2.add(7);
        v2.add(55);
        v2.add(7);
        v2.add(55);
        System.out.println(v2);
        System.out.println("v2 size "+v2.size());
        System.out.println(" v2 capacity "+v2.capacity());
        v2.add(44);
        v2.add(33);
        System.out.println("v2 capacity after "+v2.capacity());
    }
    
}
