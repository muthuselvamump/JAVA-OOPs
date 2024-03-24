import java.util.Stack;

public class stacks_demo {
    public static void main(String args[]){
        Stack<Integer> s=new Stack<Integer>();
        System.out.println(s.empty());
        s.push(3);
        s.push(6);
        s.push(7);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
    
}
