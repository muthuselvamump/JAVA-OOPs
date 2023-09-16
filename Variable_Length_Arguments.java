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
    static void minvalue(double... val){
        double min=Double.MAX_VALUE;
        for(double k:val){
            if(k<min){
                min=k;
            }
        }
        if(min == Double.MAX_VALUE){
            System.out.println("invalid arguments");
        }
        else{
            System.out.println("Minimum Value is : " + min);
        }
    }
    public static void main(String []args){
        minvalue(5,2,8,-1,6,6);
        minvalue(4.56,5.67,8.2,5.2,6.5);
        
    }
}