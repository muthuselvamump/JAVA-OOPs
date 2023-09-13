public class adding_number_using_Recursion{
    static int add(int a){
        if(a==0)
            return 0;
        return a+add(a-1);
    }
    public static void main(String []args){
        int a=5;
        System.out.println(add(a));
    }
}