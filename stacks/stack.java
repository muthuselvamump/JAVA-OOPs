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
   
    
}