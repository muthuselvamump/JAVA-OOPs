class bikes{
    protected void display(){
        System.out.println("Bike class");
    }
}
public class Anonymous_class {
    public static void main(String []args){
        bikes b1=new bikes();
        bikes b=new bikes()
        {
           protected void display(){
        System.out.println("r15v4 class");
        }
        };
        b.display();
        b1.display();
        b.display();
        bikes b3=new bikes()
        {
           protected void display(){
        System.out.println("bmw_s1000rr class");
        }
        };
        b3.display();

    }
    
}
