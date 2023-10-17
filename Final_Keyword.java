final class finalclass{  //we cant inherit final class
}
class test2{
    final void testingk(){

    }

}

public class Final_Keyword extends test2{
    /*void testingk(){  // we cant override final method in derived class

    }*/
    void testingk(int k){  // but we can overload final method
        System.out.println("testing");

    }
    public static void main(String []args){
        Final_Keyword f=new Final_Keyword();
        f.testingk(5);
        final double PI=3.14;
        //PI=2.5; // we cant change final variable

        
    }
    
}
