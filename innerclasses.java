class outer{
    int data;
    void display(){
        System.out.println("outer class");
    }
    class inner{
    void display(){
        System.out.println("inner class");
    } 
    }
    static class Static{
        void display(){
        System.out.println("static class");
    } 
    }

}

public class innerclasses {
    public static void main(String [] args){
        outer o=new outer();
        outer.inner i=o.new inner();
        outer.Static s=new outer.Static();

    }
    
}
