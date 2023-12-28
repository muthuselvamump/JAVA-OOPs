interface demo3{  //does interface have sing abstract method its called single abstract interface method or sam interface or functional interface
    void display();//if have functional interface we can use lambda expression in java 8

}
public class interface_demo3 {
    public static void main(String []args){
        //demo3 d=new demo3(); we cant instantiate object for interface
        demo3 d=new demo3(){
            public void display(){
                System.out.println("anonymous object");
            }
        };
        d.display();

    }
    
}
