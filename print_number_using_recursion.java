public class print_number_using_recursion {
    static int printnum(int n){
        if(n==10){
            return 10;
        }
        System.out.println(n);
        return printnum(n+1);
    }
    public static void main(String []args){
        //printnum(1);
        System.out.println(printnum(1));

    }
    
}
