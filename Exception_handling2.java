import java.util.Scanner;
public class Exception_handling2{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        //int j=scan.nextDouble();
        //String s="hrllo";
        //double d=(double)s;
        System.out.println(i);
        //important----->>>>>scan.close();//proper closed resources
        //if we use into try it getting automatically close
        int k;
      try(Scanner scanner=new Scanner(System.in)){ //its called try with resources
       int j=scanner.nextInt(); 
         k=scanner.nextInt();  
        }
        System.out.println("its k"+ k );//if we create varaible into try we can use into try only
     try{
        throw new ArithmeticException("demo");//we can throw exception also possible
    }
        catch(ArithmeticException a){
            System.err.println("error throwing");
        }
    }
    
}
