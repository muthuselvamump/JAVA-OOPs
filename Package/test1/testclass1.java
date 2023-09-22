package Package.test1;

import Package.maintestclass;
import Package.maintest2;
import Package.test2.testclass2;

public class testclass1 {
    public static void test(){
        System.out.println("testclass1");
    }
    public static void main(String []args){
        maintestclass.test();
        testclass2.test();
        maintest2.testing();
        
    }
    
}
