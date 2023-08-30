class circle{
    int diameter;
    circle(int a){
        diameter=a;
    }
    void isequal(circle c){
        if(diameter==c.diameter){
            System.out.println("both object is equal");

        }
        else{
            System.out.println("both object is unequal");
        }
    }
}
public class passing_object{
    public static void main(String[] args){
        circle circle1=new circle(20);
        circle circle2=new circle(30);
        circle circle3=new circle(30);
        circle1.isequal(circle2);
        circle2.isequal(circle3);


        
    }
}