package stacks;
class stack {
   private int arr[]=new int[10];
   private int tos;
     stack(){
        tos=-1;
    }

   void push(int a){
       if(tos!=arr.length-1){
           arr[++tos]=a;
        }
       else{
           System.out.println("Stack is full");
        } 

    }
    int pop(){
        if(tos<0){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return arr[tos--];    
        }
        
    }
    
}