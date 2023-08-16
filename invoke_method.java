class box{
    int length;
    int breadth;
    int height;
int volume(){
    return length*breadth*height;
}

}
public class invoke_method {
    public static void main(String []args){
        box box=new box();
        box.length=12;
        box.breadth=5;
        box.height=9;

            System.out.println("volume is: " + box.volume());

    }
    
}
