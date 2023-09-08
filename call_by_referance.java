class demo{
    int data;
    demo(int a){
        data=a;
    }
    void chaangedata(){
        data++;

    }

}
public class call_by_referance {
    public static void main(String []args){

        demo obj=new demo(5);
        obj.chaangedata();
        System.out.println(obj.data);
    }
    
    
}
