package inheritance;
class Employee{
    String name;
    double salary;
    Employee(String n,int s){
        name=n;
        salary=s;
    }
        
}

public class inheritance {
    public static void main(String []args){
        Employee e1=new Employee("RAju", 30000);
        System.out.println(e1.salary);
    }
    
}
