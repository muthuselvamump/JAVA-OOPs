package queue;

public class queue {
    int arr[]=new int[10];
    int index;
    int index2;
    queue(){
        index=-1;
        index2=0;
    }
    void enqueue(int a){
        if(index==9){
            System.out.println("queue is full");
        }
        else{
            arr[++index]=a;   
        }
    }
    
}
