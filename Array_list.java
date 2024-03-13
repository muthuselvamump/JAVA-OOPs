import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
public class Array_list {
    public static void main(String args[]){
        int arr[]=new int[5];//array is fixed size
        ArrayList<Integer> all=new ArrayList<Integer>();//arraylist is flexible
        all.add(59);
        System.out.println(all.indexOf(59));
        System.out.println(all.get(0));
        ArrayList<String> str=new ArrayList<String>();
        str.add("java");
        str.add("pyhthon");
        str.add("Linux");
        str.add("bash");
        System.out.println(str);
        ArrayList all1=new ArrayList();
        all1.add(4.5555);
        all1.add('c');
        all1.add(10);
        all1.add("bash");
        //System.out.println(all1);
        for(Object obj:all1){
            System.out.println(obj);
        }
        System.out.println(str);
        Collections.sort(str);
        System.out.println(str);

    }    
}
