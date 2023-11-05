public class wrapper_class_demo{
    static public void main(String []args){
        int i=10;
        Integer i1=Integer.valueOf(15);
        Integer i2=Integer.valueOf(i);//boxing or wrapping
        Integer i3=20;//autoboxing

        int i4=i3.intValue();//unboxing
        int i5=i2;//autounboxing
        System.out.println(i4);
        String num="12345";
        int i6=Integer.parseInt(num);
        System.out.println(i6+25);


    }

}