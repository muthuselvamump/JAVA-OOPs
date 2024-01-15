public class Exception_handling {
    public static void main(String []args){
        int a=10;
        int b=0;
        int c=0;
        int []arr=null;
        try{
            c=a/b;
            System.out.println(arr[0]);
        }
        catch(Exception d){
            System.out.println("Error");

        }
        try{
            System.out.println(arr[1]);
            c=a/b;
            
            
        }
       /*  catch(ArithmeticException d){
            System.out.println("Error try 2");

        }*/
        catch(NullPointerException n){
            System.out.println("Error null point");
        }
        
        System.out.println(c);
        System.out.println("Program End");
    }
    
}
