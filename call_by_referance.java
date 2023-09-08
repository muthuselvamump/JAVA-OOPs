class demo{
    int data;
    demo(int a){
        data=a;
    }
    demo(){
    }
    static demo chaangedata(demo data){
       
        data=50;

    }

}
public class call_by_referance {
    public static void main(String []args){

        demo obj=new demo(5);

        chaangedata(obj);
        System.out.println(obj.data);
    }
    
    
}
