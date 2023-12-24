import java.util.Arrays;

class employee implements Comparable <employee>{
    double salary;
    String name;
    employee(String n,double s){
        salary=s;
        name=n;
    }
    public int compareTo(employee e){
        if(salary==e.salary){
            return 0;
        }
        if(salary<e.salary){
            return -1;
        }
        return 1;
    }
}
class student implements Comparable <student>{
    String name;
    int rollno;
    student(String n,int r){
        rollno=r;
        name=n;
    }
    public int compareTo(student s){
        return name.compareTo(s.name);
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
        System.out.println("----------");
        Arrays.sort(err);
        for(employee e:err){
            System.out.println(e.name + " " + e.salary);
        }
        System.out.println("\n" + "student data"+"\n");
        student []srr=new student[5];
        srr[0]=new student("vel", 100000);
        srr[1]=new student("raj", 300000);
        srr[2]=new student("anu", 50000);
        srr[3]=new student("ganesh",800000);
        srr[4]=new student("tanu", 100000);
        for(student s:srr){
            System.out.println(s.name + " " + s.rollno);
        }
        Arrays.sort(srr);

        System.out.println("----------");
        for(student s:srr){
            System.out.println(s.name + " " + s.rollno);
        }

    }
}