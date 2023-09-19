public class static_medhod {
    static void printstate(){
        System.out.println("print static medhod");
    }
    static int boxvolume(int length, int breadth,int height){ //we didnt create any object so its an static method
        int vol;
        vol=length*breadth*height;
        printstate();
        return vol;
    }
    public static void main(String[] args){
        int volume=boxvolume(10,15,3); //assing parametre or argument
        System.out.println(volume);
    }
    
}
