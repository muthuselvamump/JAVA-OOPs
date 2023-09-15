class test{
    int data1;
    int data2;
    int data3;
    static int count;
    test(int a,int b,int c){
        data1=a;
        data2=b;
        data3=c;
        count++;
    }
    test(){
        count++;

    }
    test(int a){
        data1=data2=data3=a;
        count++;
    }
}

public class static_variable {
    
}
