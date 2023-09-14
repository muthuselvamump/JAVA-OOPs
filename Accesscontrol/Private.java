package Accesscontrol;
class private1{
    private int data1=50;
     int data=100;
}
class private2{
    private private2(){

    }
}

public class Private {
    private int data=20;
    public static void main(String []args){

        Private p1=new Private();
        private1 p=new private1();
       // private2 p2=new private2();//if constructor is private we cant create object.we can create object within the class
        System.out.println(p.data);
        //System.out.println(p.data1); we cant private data within package. only its possible within the class
        System.out.println(p1.data);
        Public public1=new Public();
        System.out.println(public1.publicdata);
        Default default1=new Default();
        System.out.println(default1.dfaultdata);//we can access default data with in the class and with in the package
    }
    
}
