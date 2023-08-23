package stacks;
class stack {
    int arr[]=new int[10];
    int tos;
    stack(){
        tos=-1;
    }

   void push(int a){
       if(tos!=9){
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