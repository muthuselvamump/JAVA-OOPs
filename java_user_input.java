import java.util.Scanner;
public class java_user_input {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a name");
        String name=scan.nextLine();
        System.out.println("your name is: " + name);

    }
    
}
