class Returnobj{
    int data1;
    int data2;
    int data3;
    Returnobj(int d1,int d2,int d3){
        data1=d1;
        data2=d2;
        data3=d3;
    }
    Returnobj doubleval(){
        Returnobj temp=new Returnobj(2*data1,2*data2,2*data3);
        return temp;
    }

}
public class returning_object {
    public static void main(String []args){
        Returnobj obj1=new Returnobj(7,5,6);
        Returnobj obj2=obj1.doubleval();
        System.out.println(obj2.data1);
        System.out.println(obj2.data2);
        System.out.println(obj2.data3);

    }
    
}
