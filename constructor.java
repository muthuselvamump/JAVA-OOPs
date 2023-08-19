class woodbox{
    int length;
    int breatdh;
    int height;
    woodbox(int a,int b,int c){

        length=a;
        breatdh=b;
        height=c;
    }
    void volume(){
        System.out.println("volume is: " + length*breatdh*height);
    }
}
public class constructor {
    public static void main(String []args){
        woodbox new1=new woodbox(5,2,4);
        new1.volume();
    }
    
}
