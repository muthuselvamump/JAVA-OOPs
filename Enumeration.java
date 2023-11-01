enum levels{
    EASY("low level"),MEDIUM("intermediate level"),HARD("high level");
    private String names;
    levels(String s){
        names=s;
    }
    public String names(){
        return names;
    }

}
public class Enumeration {
    public static void main(String []args){
        levels l=levels.EASY;

        System.out.println(l);
        System.out.println(l.names());
    }
    
}
