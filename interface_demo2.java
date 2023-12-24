class employee{
    double salary;
    String name;
    employee(String n,double s){
        salary=s;
        name=n;
    }
}
public class interface_demo2{
    public static void main(String []args){
        employee []err=new employee[5];
        err[0]=new employee("Vijay", 100000);
        err[1]=new employee("jadu", 300000);
        err[2]=new employee("mark", 50000);
        err[3]=new employee("elon",800000);
        err[4]=new employee("crist", 100000);
        for(employee e:err){
            System.out.println(e.name + " " + e.salary);
        }
    }
}