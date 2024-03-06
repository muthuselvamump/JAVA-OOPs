public class multithreading_demo2 extends Thread{
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println("Low Priority");
           // try{Thread.sleep(6000);}catch(Exception e){};
        }
    }
    public static void main(String []args){
        multithreading_demo2 m1= new multithreading_demo2();
        
    
        multithreading_demo2 m2=new multithreading_demo2(){
          public void run(){
            for(int i=0;i<6;i++){                
                System.out.println("High priority");
                try{Thread.sleep(6000);}catch(Exception e){};            
            } 
        }  
        };
        m2.setPriority(MAX_PRIORITY);
        m1.setPriority(MIN_PRIORITY);    
        m1.start();
        m2.start();
        
    }
    
}
