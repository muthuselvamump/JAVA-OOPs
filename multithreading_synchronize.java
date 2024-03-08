class synchro{
    synchronized public void table(int a){

        for(int i=1;i<=a;i++){
            System.out.println(a*i); 
            try{Thread.sleep(1000);}catch(Exception e){}
        }


    }
}
public class multithreading_synchronize {
    public static void main(String []args){
        synchro s1=new synchro();//if two thread access method with same object 
        synchro s2=new synchro();//if we want at a time one thread can be access method we can use synchronized method
        Thread t1=new Thread(){
     
    }
    
}
