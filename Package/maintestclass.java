package Package;

import test1.testclass1;
import Package.test2.testclass2;

public class maintestclass {
    public static void test(){
        System.out.println("maintestclass");
    }
    public static void main(String []args){
       test();
        testclass2.test();
    }
    
}
