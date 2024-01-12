class departments{
    int id;
    String name;
}
class students implements Cloneable{
    String name;
    int rollno;
    departments dept;
students(String n,int rn,int di,String dn){
        name=n;
        rollno=rn;
       dept.id=di;
        dept.name=dn;
    }
    protected Object clonObject() throws CloneNotSupportedException{
        return super.clone();

    }
}
public class object_cloning {
    public static void main(String []args) throws CloneNotSupportedException{
        students s1= new students("vijay",1520,2,"physics");
        //students s2=(students)s1.clonObject();
       // System.out.println(s1.dept.name);
       s1.dept.id=5;
       s1.dept.name="hukhy";
        

    }
    
}
