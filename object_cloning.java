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
    protected Object clonObject(){
        return super.clone();

    }
}
public class object_cloning {
    public static void main(String []args){
        students s1= new students("vijay",1520,2,"physics");


    }
    
}
