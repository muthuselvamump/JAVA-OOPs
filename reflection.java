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
    public static void main(String []args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        A2 new_A=new A2();
        Class cl=new_A.getClass();
        Method []m=cl.getMethods();
        System.out.println(cl.getName());
        for(Method m1:m){
            System.out.println(m1.getName());
        }
            m[1].invoke(new_A,null);

    }
    
}
