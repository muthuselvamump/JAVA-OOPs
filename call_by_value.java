public class call_by_value {
   /*  static void changeval(int a){
        a++;

    }*/
    static void changeval(int b){
        b++;

    }
    public static void main(String [] args){
        int a=10;
        changeval(a);
        System.out.println(a);

    }
    
}
