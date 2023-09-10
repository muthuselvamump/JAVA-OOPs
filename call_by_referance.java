class demo{
    int length;
    int height;
    int breadth;
    demo(int l,int b,int h){
        length=l;
        height=h;
        breadth=b;
    }
    void changeval1(demo d){
        d.length++;
    }

}
public class call_by_referance {
    public static void main(String []args){

        demo obj=new demo(5,6,8);
        demo obj1=new demo(25,25,25);   
        System.out.println(obj1.length);
        obj.changeval1(obj1);
        System.out.println(obj1.length);
    }
    
    
}
