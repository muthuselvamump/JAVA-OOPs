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
        levels l1=levels.MEDIUM;
        switch(l1){
            case EASY:
                System.out.println("its easy level");
                break;
            case MEDIUM:
                System.out.println("its medium level");
                break;
            case HARD:
                System.out.println("its hard level");
                break;
        }
    }
    
}
