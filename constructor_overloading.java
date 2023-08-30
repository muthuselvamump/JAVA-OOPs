class box{
    int length;
    int breadth;
    int height;
    box(int a,int b,int c){
        length=a;
        breadth=b;
        height=c;
    }
    box(){
        length=breadth=height=-1;
    }
    box(int a){
        length=height=breadth=a;
    }

}
public class constructor_overloading {
    public static void main(String [] args){
        box newbox1=new box();
        box newbox2=new box(5);
        box newbox3=new box(8,4,6);

        System.out.println(newbox1.length);
        System.out.println(newbox1.breadth);
        System.out.println(newbox1.height);
        System.out.println(newbox2.length);
        System.out.println(newbox2.breadth);
        System.out.println(newbox2.height);
        System.out.println(newbox3.length);
        System.out.println(newbox3.breadth);
        System.out.println(newbox3.height);

    }
    
}
