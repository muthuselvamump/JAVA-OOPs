package inheritance;
class A{
    void printstat(){
        System.out.println("class a");
    }

}
class B extends A{
    void printstat(){
        System.out.println("class b");
    }

}
public class hierarchical_inherit extends A {
    public static void main(String []args){
        A new1=new A();
        B new2=new B();
        A n1=new B();
       
        new1.printstat();
        new2.printstat();
        n1.printstat();
       

    }
}
