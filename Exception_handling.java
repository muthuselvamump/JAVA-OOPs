public class Exception_handling {
    public static void main(String []args){
        int a=10;
        int b=0;
        int c=0;
        try{
            c=a/b;
        }
        catch(Exception d){
            System.out.println("Error");

        }
        
        System.out.println(c);
        System.out.println("Program End");
    }
    
}
