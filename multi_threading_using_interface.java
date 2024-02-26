class threading1{
    public void printnum(){
        for(int i=1;i<11;i++){
            System.out.println(i);
        }
    }

}
class threading2{
    public void printname(){
        for(int i=1;i<11;i++){
            System.out.println("java");
        }

    }

}
public class multi_threading_using_interface {
    public static void main(String []args){
        threading1 t1= new threading1();
        threading2 t2=new threading2();
        t1.printnum();
    }
    
    
}
