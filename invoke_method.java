class box{
    int length;
    int breadth;
    int height;
int volume(){
    return length*breadth*height;
}
int vol(int l,int h,int b){
    return l*h*b;
}

}
public class invoke_method {
    public static void main(String []args){
        box box=new box();
        box.length=12;
        box.breadth=5;
        box.height=9;

            System.out.println("volume is: " + box.volume());
        box n=new box();
        System.out.println(n.vol(5,2,4));


    }
    
}
