class car{
    void ride(){
        System.out.println("riding a car");
    }
}
class bike{
    void ride(){
        System.out.println("riding a bike");
    }
}
class mechanic{
    void check(bike r){
        System.out.println("checking");
        r.ride();
    }
}
public class interfaces {
    public static void main(String[] args) {
        mechanic m=new mechanic();
        bike b=new bike();
        m.check(b);
        
    }
}
