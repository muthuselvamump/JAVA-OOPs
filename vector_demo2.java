import java.util.*;
public class vector_demo2 {
    public static void main(String []args){
        Vector<String> v1=new Vector<String>();
        v1.add("java");
        v1.add("developer");
        v1.add("tester");
        v1.add("linux");
        v1.add("python");
        for(String str:v1){
            System.out.println(str);
        }
        if(v1.contains("linux")){
            System.out.println("its contains linux");
        }
        else{
            System.out.println("its not contains");
        }
    }
    
}
