package inheritance;
class Employee{
    String name;
    double salary;
    Employee(String n,int s){
        name=n;
        salary=s;
    }
    void setName(String name) {
        this.name= name;
    }
    void setSalary(double salary) {
        this.salary = salary;
    }

        
}

public class inheritance {
    public static void main(String []args){
        Employee e1=new Employee("RAju", 30000);
        e1.setSalary(50000);
        System.out.println(e1.salary);
    }
    
}
