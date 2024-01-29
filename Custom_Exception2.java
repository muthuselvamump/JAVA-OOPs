public class Custom_Exception2 extends Exception{
    int balance;
    Custom_Exception2(int a){
        balance=a;
    }
    public int withdraw(int a){
        if(a>balance){
            return a-balance;
        }
    }
    public static void main(String []args){
        Custom_Exception2 c1=new Custom_Exception2(300);
        c1.withdraw(700);
    }
}