 abstract class member{
        abstract void printstatement();

    }
    class student1 extends member{
        void printstatement(){
            System.out.println("student class");
        }
    }
    class teacher extends member{
        void printstatement(){
            System.out.println("teacher class");
        }
    }
public class Abstract_class_method {
    public static void main(String []args){
        student1 s=new student1();
        teacher t=new teacher();
        s.printstatement();
        t.printstatement();
    }
    
}
