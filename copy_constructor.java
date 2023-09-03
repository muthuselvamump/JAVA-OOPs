
class box{
    int length;
    int breadth;
    int height;
    box(int a, int b, int c){
        length=a;
        breadth=b;
        height=c;

    }
    box(box a){
        length=a.length;
        height=a.height;
        breadth=a.breadth;
    }

}
public class copy_constructor {
    public static void main(String []args){
        box b1=new box(5,6,7);
        box b2=new box(b1);
        System.out.println(b1.length);
        System.out.println(b1.height);
        System.out.println(b1.breadth);
        System.out.println(b2.length);
        System.out.println(b2.height);
        System.out.println(b2.breadth);


    }
    
}
