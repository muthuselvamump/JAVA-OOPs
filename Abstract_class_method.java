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
       // member m1=new member(); we cant intiate object in abstract class
        s.printstatement();
        t.printstatement();
        String s1="hello"+6+6+6;
        System.out.println(s1);
        member [] m=new member[3];
        
    }
    
}
