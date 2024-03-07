class synchro{
    public void table(int a){

        for(int i=1;i<=a;i++){
            System.out.println(a*i);        }

    }
}
public class multithreading_synchronize {
    public static void main(String []args){
        synchro s1=new synchro();
        synchro s2=new synchro();
        Thread t1=new Thread(){
            public void run(){
                s1.table(5);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                s2.table(6);
            }
        };
        t1.start();
        t2.start();

    }
    
}
