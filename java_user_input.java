import java.util.Scanner;
public class java_user_input {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a name");
        String name=scan.nextLine();
        System.out.println("Enter a age");
        int age=scan.nextInt();
        System.out.println("Enter a salary");
        double salary=scan.nextDouble();
        System.out.println("your name is: " + name);
        System.out.println("your age is: " + age);
        System.out.println("your salary is: " + salary);

    }
    
}
