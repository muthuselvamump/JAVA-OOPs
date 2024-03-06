public class multithreading_demo2 extends Thread{
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println("Low Priority");
        }
    }
    public static void main(String []args){
        multithreading_demo2 m1= new multithreading_demo2();
        m1.start();
        multithreading_demo2 m2=new multithreading_demo2(){
          public void run(){
            for(int i=0;i<6;i++){                
                try{Thread.sleep(6000);}catch(Exception e){};
                System.out.println("High priority");            
            } 
        }  
        };
        
        m2.start();
    }
    
}
