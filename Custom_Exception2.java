public class Custom_Exception2 extends Exception{
    int balance;
    Custom_Exception2(int a){
        balance=a;
    }
    Custom_Exception2(){

    }
    public int withdraw(int a){
        if(a<balance){
            return a-balance;
        }
        else{
            Custom_Exception2.withdraw1();
            return -1;
        }
    }
    public static void withdraw1(){
        try{
        throw new Custom_Exception2();
        }
        catch(Custom_Exception2 c){
            System.out.println("balance is not sufficent");
        }

    }
    public static void main(String []args){
        Custom_Exception2 c1=new Custom_Exception2(300);
        System.out.println(c1.withdraw(700));
    }
}