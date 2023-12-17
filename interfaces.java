interface rideable{
    void ride();
}
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
        
    }
}
