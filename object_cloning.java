class departments{
    int id;
    String name;
    departments(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
class students implements Cloneable{
    String name;
    int rollno;
    departments dp;
   // departments dept;
students(String n,int rn,departments dpa/* ,int di,String dn*/){
        name=n;
        rollno=rn;
        dp=dpa;
     //   dept.id=di;
       // dept.name=dn;
    }
    void display(){
        System.out.println(name);
        System.out.println(rollno);
        dp.display();

    }
    protected Object clonObject() throws CloneNotSupportedException{
        return super.clone();

    }
}
public class object_cloning {
    public static void main(String []args) throws CloneNotSupportedException{
        departments dept=new departments(2,"physics");
        students s1= new students("vijay",1520,dept);
        students s2=(students)s1.clonObject();
        dept.name="computer science";
        s1.display();
        s2.display();


    }
    
}
