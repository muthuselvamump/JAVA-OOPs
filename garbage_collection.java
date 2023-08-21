class test{
    int testcase1;
    int testcase2;
    int testcase3;
    test(int a,int b,int c){
        testcase1=a;
        testcase2=b;
        testcase3=c;

    }
    void testcasedetails(){
        System.out.println("testcase1 result is: "+ testcase1 + "%");
        System.out.println("testcase2 result is: "+ testcase2 + "%");
        System.out.println("testcase3 result is: "+ testcase3 + "%");
    }
    finalize
}
public class garbage_collection {
    public static void main(String []args){
        test newtest1=new test(80, 40, 64);
        test newtest2=new test(88, 91, 78);

        newtest1.testcasedetails();
        newtest2.testcasedetails();
        newtest1=null; //derefernce method 1
        newtest1=newtest2;   //derefernce method 2
        newtest1.testcasedetails();
        new test(75, 55, 68); //anonymous object


    }
    
}
