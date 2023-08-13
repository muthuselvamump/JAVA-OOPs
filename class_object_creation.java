class box{ //class
    int length; //instance variable
    int breadth;
    int height;

}
public class class_object_creation{
    public static void main(String [] args){
        box blackbox; //creating object or instance
        blackbox=new box(); //instance memeory intialized

        blackbox.length=20;
        System.out.println(blackbox.length);
        System.out.println(blackbox.breadth);

    }
}