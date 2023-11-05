public class wrapper_class_demo{
    static public void main(String []args){
        int i=10;
        Integer i1=Integer.valueOf(15);
        Integer i2=Integer.valueOf(i);//boxing or wrapping
        Integer i3=20;//autoboxing

        int i4=i3.intValue();
        System.out.println(i4);


    }

}