package inheritance;
class Employee{//base class,super class,parent class
    private String name;
    private double salary;
    Employee(String n,int s){
        name=n;
        salary=s;
    }
    /*Employee(){
        // we didnt call a constructor super its try to call without parameter so we should create a emptu constructor in base class
    }*/
    void Display(){
        System.out.println("Emloyer Name: " + name);
        System.out.println("Employer salory: " + salary);
    }
    
    void setName(String name) {
        this.name= name;
    }
    void setSalary(double salary) {
        this.salary = salary;
    }
    void raisesalary(double s){
        salary +=salary*s/100;
    }
    double getsalary(){
        return salary;
    }

        
}
class manager extends Employee{ //derived class,sub class,child class
    double bonus;
    manager(String n,int s,double b){
        super(n,s);
        bonus=b;

    }
    double getsalary(){
        return super.getsalary()+bonus;
    }
    void Display(){
        System.out.println()
    }
}

public class inheritance {
    public static void main(String []args){
        Employee e1=new Employee("RAju", 30000);
        e1.setSalary(50000);
        e1.raisesalary(50);
        System.out.println(e1.getsalary());
        manager m1=new manager("vijay", 100000, 55.5);
        System.out.println(m1.getsalary());
        m1.raisesalary(20);
        m1.setSalary(200000);



    }
    
}
