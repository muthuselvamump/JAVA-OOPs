class vehicle{
    String name;
    double price;

}
class bike extends vehicle{
    bike(String n,int p){
        name=n;
        price=p;
    }

}
class car extends vehicle{

}
public class object_cosmic_super_class {
    public static void main(String []args){
        bike b=new bike("yamaha r15 ",180000);
        bike b1=new bike("yamaha r15 ",180000);
        System.out.println(b.name.equals(b1.name));

        

    }
}
