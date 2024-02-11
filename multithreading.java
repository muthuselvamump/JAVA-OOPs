class name extends Thread{//we must declare run method for threding
    public void run(){ // if we start thread using obj.start its search run method that method only excuted via thread
        String []srr={"vijay","ajith","surya","vikram","anirudh","muthuselvam","ganesh","aakhash","vasanth","praveen"};
       // srr[1]="raj";
        for(int i=0;i<10;i++){
            System.out.println(srr[i]);
            try{
            Thread.sleep(6000);
            }catch(Exception e){}
        }
        
    }
}
class numb{
    void printnumb(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

    }
}
public class multithreading{
    public static void main(String args[]){
        name n=new name();//if we extends thread when we create respected class object its behave like thread
        numb num=new numb();
        n.start();
        //n.printname();
        num.printnumb();

    }
}