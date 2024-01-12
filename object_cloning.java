class departments implements Cloneable{
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
    protected Object clonObject() throws CloneNotSupportedException{
        return super.clone();

    }
}
class students1 implements Cloneable{
    String name;
    int rollno;
    departments dp;
   // departments dept;
students1(String n,int rn,departments dpa/* ,int di,String dn*/){
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
        students1 s=(students1)super.clone();
       s.dp=(departments)s.dp.clonObject();
       return s;

    }
}
public class object_cloning {
    public static void main(String []args) throws CloneNotSupportedException{
        departments dept=new departments(2,"physics");
        students1 s1= new students1("vijay",1520,dept);
        students1 s2=(students1)s1.clonObject();
        dept.name="computer science";
        s1.display();
        s2.display();


    }
    
}
