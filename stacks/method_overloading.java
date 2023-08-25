package stacks;
public class method_overloading {
    static int max(int a,int b){
        return a>b?a:b;
    }
    static double max(double a,double b){
        return a>b?a:b;
    }
    static long max(long a,long b){
        return a>b?a:b;
    }
    public static void main(String []args){
        System.out.println(max(5,6));
        System.out.println(max(5.5,6.8));
        System.out.println(max(65424524,85542425));
        
        
    }
    
}
