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
        System.out.println(str);//Linux,bash,java.python sort listed because LINUX starting letter is caps so its sort as first
        ArrayList<Integer> num1=new ArrayList<Integer>();
        num1.add(8);
        num1.add(9);
        num1.add(1);
        num1.add(3);
        num1.add(7);
        System.out.println(num1);
        Collections.sort(num1);
        System.out.println(num1);
        for(int i=0;i<num1.size();i++){
            System.out.println(num1.get(i));
        }

    }    
}
