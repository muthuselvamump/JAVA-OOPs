
public class custom_Exception extends Exception {
    public static void main(String []args){
        int bal=67,amo=75;
        try{
        if(bal<amo){
            throw new custom_Exception();
        }
        }
        catch(custom_Exception c){
            System.out.println("custom exception");
        }

    }    
}
