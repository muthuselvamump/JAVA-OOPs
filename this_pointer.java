class student{
    int rollnum;
    String department;
    char grade;

    student(int rollnum,String department,char grade){
        this.rollnum=rollnum;
        this.department=department;
        this.grade=grade;
    }
    void Details(){
        System.out.println("Roll number is: " + rollnum);
        System.out.println("Department is: " + department);
        System.out.println(grade + " Grade");
    }
}
public class this_pointer{
    public static void main(String []args){
        student vijay=new student(4303,"CSE",'A');
        student selvam=new student(4301,"IT",'C');

        vijay.Details();
        selvam.Details();
    }
}