class testdemo{
    int data1;
    int data2;
    int data3;
    static int count;
    static{
        count=0;
        System.out.println("count intilaized from static block");
    }
    testdemo(int a,int b,int c){
        data1=a;
        data2=b;
        data3=c;
        count++;
    }
    testdemo(){
        count++;

    }
    testdemo(int a){
        data1=data2=data3=a;
        count++;
    }
}

public class static_variable {
    public static void main(String []args){
        System.out.println("main starts ");
        testdemo box;
        System.out.println("before creating object");
        box=new testdemo();
        System.out.println("before creating object");
        testdemo box1=new testdemo(10);
        testdemo box2=new testdemo(20,5,4);
        System.out.println(testdemo.count);
    }
    
}
