class cycle{
    void display(){
        System.out.println("its cycle clsss");
    }
}
public class Anonymous_class{
    public static void main(String [] args){
        cycle c=new cycle();
        c.display();
        cycle c1=new cycle(){
                void display(){
                    System.out.println("its anonymous class");
                }
        };
        c1.display();
        cycle c3=new cycle();
        c3.display();
        c1.display();

    }
}