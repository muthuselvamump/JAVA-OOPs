
public class custom_Exception extends Exception {
    int amo;
    custom_Exception(int a){
        amo=a;
    }
    public static void main(String []args){
        int bal=67,amo=75;
        try{
        if(bal<amo){
            throw new custom_Exception(amo);
        }
        }
        catch(custom_Exception c){
            System.out.println("custom exception");
        }

    }    
}
