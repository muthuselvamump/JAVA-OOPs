import java.io.*;
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
            System.err.println("Error"); // spl error print statement

        }
        try{
            System.out.println(arr[1]);//afdter getting error its got to corresponding catch statement its did not excute next line in try block
            c=a/b;
            
            
        }
        catch(ArithmeticException d){
            System.out.println("Error try 2");

        }
        catch(NullPointerException n){
            System.out.println("Error null point");
        }
        catch(Exception e){// you must give specifig exception first after that yo give exception
            System.out.println("Error occured");
        }
        finally{
            System.out.println("its wheather error came or not what inside finally its getting executed");
        }

            File f=new File("test.txt");
        try{
        
        FileInputStream fs=new FileInputStream(f);
        }
     //   catch(FileNotFoundException f){
     //       f.

       // }
        System.out.println(c);
        System.out.println("Program End");
    }
    
}
