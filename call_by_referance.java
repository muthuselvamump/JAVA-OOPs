class demo{
    int data;
    demo(int a){
        data=a;
    }
    demo(){
    }
    void chaangedata(int data){
       
        data=data;

    }

}
public class call_by_referance {
    public static void main(String []args){

        demo obj=new demo(5);
        obj.chaangedata(50);
        System.out.println(obj.data);
    }
    
    
}
