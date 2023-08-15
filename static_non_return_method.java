public class static_non_return_method {
    static void boxvolume(int length,int breadth,int height){
        System.out.println("volume is: " + length*breadth*height);
    }
    public static void main(String[] args){
        boxvolume(10,12,8);
    }
    
}