class testing1{
    protected String s1="java";

}
public class protected_access_specifier extends testing1{
    public static void main(String []args){
        testing1 t=new testing1();
        System.out.println(t.s1);

    }
    
}
