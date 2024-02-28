class threading1 implements Runnable{
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println(i);
           try{ Thread.sleep(4000);}catch(Exception E){}
        }
    }

}
class threading2 extends Thread{
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println("java");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){}
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
            t2.start();
            t3.setName("interface thred");///we can set name on thread also possible
            System.out.println(t3.getName());
            if(t3.isAlive()){
                System.out.println("t3 is alive");
            }
            else{
                System.out.println("t3 is not alive");
            }
            if(t2.isAlive()){
                System.out.println("alive");
            }
            System.out.println("End of program");

            
    //    t1.run();
    
    }
    
    
}
