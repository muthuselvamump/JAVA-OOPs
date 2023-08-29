public class method_overloading_2 {
    static void test(){
        System.out.println("Method without Arguments");
    }
    static void test(int a){
        System.out.println("Method with one Arguments");
    }
    static void test(int a,int b){
        System.out.println("Method with two Arguments");
    }
    public static void main(String[] args){
        test();
        test(5);
        test(5,6);

    }
    
}
