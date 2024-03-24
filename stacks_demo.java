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
        Stack<String> s1=new Stack<String>();
        s1.push("java");
        s1.push("devloper");
        s1.push("spring boot");
        s1.push("rest api");
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.search("java"));
    }
    
}
