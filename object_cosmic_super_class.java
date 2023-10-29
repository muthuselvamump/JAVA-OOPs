class vehicle{
    String name;
    double price;
    vehicle(String n,int p){
        name=n;
        price=p;
    }
    vehicle(){}
}
class bike extends vehicle{
    bike(String n,int p){
       super(n,p);
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(this.getClass()!=obj.getClass())
            return false;
        bike b=(bike)obj;
        return this.name.equals(b.name) && this.price==b.price;
        
    }
}
class car extends vehicle{

}
public class object_cosmic_super_class {
    public static void main(String []args){
        bike b=new bike("yamaha r15 ",180000);
        bike b1=new bike("yamaha r15 ",180000);
        vehicle v1=new bike("sz 100",100000);
        
        System.out.println(v1.getClass());
        System.out.println(b.equals(b1));
        System.out.println(b.name.equals(b1.name));

        

    }
}
