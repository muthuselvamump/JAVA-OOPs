package inheritance;
class Employee{//base class,super class,parent class
    String name;
    double salary;
    Employee(String n,int s){
        name=n;
        salary=s;
    }
    Employee(){

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

        
}
class manager extends Employee{ //derived class,sub class,child class
    double bonus;
    manager(String n,int s,double b){
        name=n;
        salary=s;
        bonus=b;

    }
}

public class inheritance {
    public static void main(String []args){
        Employee e1=new Employee("RAju", 30000);
        e1.setSalary(50000);
        e1.raisesalary(50);
        System.out.println(e1.salary);
        manager m1=new manager("vijay", 100000, 0.0);


    }
    
}
