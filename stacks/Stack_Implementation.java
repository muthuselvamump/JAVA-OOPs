package stacks;
public class Stack_Implementation{
    public static void main(String []args){
        stack s=new stack();
        stack s1=new stack();
        s.push(5);
        s.push(8);
        s.push(7);
        System.out.println(s.pop());
        System.out.println(s.pop());
        s1.push(15);
        s1.push(82);
        s1.push(27);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s.pop());
        s.push(87);
        System.out.println(s.pop());
        

    }

}