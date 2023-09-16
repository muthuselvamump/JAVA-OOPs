public class Variable_Length_Arguments{
    static void minvalue(int... val){
        int min=Integer.MAX_VALUE;
        for(int k:val){
            if(k<min){
                min=k;
            }
        }
        if(min == Integer.MAX_VALUE){
            System.out.println("invalid arguments");
        }
        else{
            System.out.println("Minimum Value is : " + min);
        }
    }
    public static void main(String []args){
        minvalue(5,2,8,-1,6,6);
        
    }
}