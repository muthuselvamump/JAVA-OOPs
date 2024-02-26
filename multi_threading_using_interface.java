class threading1 implements Runnable{
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println(i);
           try{ Thread.sleep(2000);}catch(Exception E){}
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
        Runnable r1=new threading1();
        Thread t3=new Thread(r1);
            t3.start();
            t2.printname();
    //    t1.run();
    
    }
    
    
}
