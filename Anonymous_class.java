class bikes{
    protected void display(){
        System.out.println("Bike class");
    }
}
public class Anonymous_class {
    public static void main(String []args){
        bikes b=new bikes()
        {
           protected void display(){
        System.out.println("r15v4 class");
    }
        };
        b.display();


    }
    
}
