interface rideable{//into the interface all method is public abstract method
    void ride();
}
class test{
    void tests(){
        System.out.println("testing");
    }

}
class car extends test implements rideable{
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
        c.tests();
        //rideable r1=new rideable();   we cant creat object for interface
        rideable r1=new car();//but wee assign implemnets class object
    }
}
