interface demo3{
    void display();

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
