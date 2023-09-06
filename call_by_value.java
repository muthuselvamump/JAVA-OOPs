public class call_by_value {
    int a;
    static void changeval(int a){
        a=20;

    }
    public static void main(String [] args){
        int a=10;
        changeval(a);
        System.out.println(a);

    }
    
}
