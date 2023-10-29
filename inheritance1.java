class A1{
    public void display(){
        System.out.println("class A1");
    }

}
class B1 extends A1{
    /*public void display(){
        System.out.println("class B1");
    }*/
}
class c1 extends B1{

}
public class inheritance1 {
    public static void main(String[] args) {
        c1 c=new c1();
        c.display(); //its execute nearest method in base class
    }
    
}
