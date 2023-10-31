import java.lang.reflect.*;
class A2{
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public void method3(){
        System.out.println("method3");
    }
}
public class reflection {
    public static void main(String []args){
        A2 new_A=new A2();
        Class cl=new_A.getClass();
        Method []m=cl.getMethods();
        System.out.println(cl.getName());

    }
    
}
