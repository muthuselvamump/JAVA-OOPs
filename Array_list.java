import java.util.*;
import java.util.ArrayList;
public class Array_list {
    public static void main(String args[]){
        int arr[]=new int[5];//array is fixed size
        ArrayList<Integer> all=new ArrayList<Integer>();//arraylist is flexible
        all.add(59);
        System.out.println(all.indexOf(59));
        System.out.println(all.get(0));


    }    
}
