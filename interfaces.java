interface rideable{//into the interface all method is public abstract method so all implements class must have all method into th interface
    void ride();    //we can create define method after java1.8 its called default method must use default keyword
    default void display(){
        System.out.println("default method into interface");
    }
}
abstract class avoid implements rideable{ // if you want to avoid for create method you can create abstract class

}
/*class test_extend{
    void tests(){
        System.out.println("testing");
    }

}*/
class car implements rideable{
    public void ride(){
        System.out.println("riding a car");

    }
}
class bike implements rideable{
    public void ride(){
        System.out.println("riding a bike");
    }
}
class mechanic{
    void check(rideable r){
        System.out.println("checking");
        r.ride();
    }
}
public class interfaces {
    public static void main(String[] args) {
        mechanic m=new mechanic();
        bike b=new bike();
        car c=new car();
        m.check(b);
        m.check(c);
      // c.tests();
       // rideable r1=new rideable();   we cant creat object for interface
        rideable r1=new car();//but wee assign implemnets class object
        r1.display();
        c.display();
    }
}
