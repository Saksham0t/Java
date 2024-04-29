package Class_612;
public class Stack{
    int size;
    int []arr;
    int top;
    public Stack(int size){
        this.size=size;
        this.arr=new int[size];
        this.top=-1;
    }
    public boolean isFull(){
        return(size-1==top);
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int peek(){
        return arr[top];
    }
    public void push(int num){
        if(!isFull()){
            arr[++top]=num;
            System.out.println("Element is pushed: "+num);
        }else{
            System.out.println("Stack overflow...");
        }
    }
    public int pop(){
        if(!isEmpty()){
            int val=arr[top];
            top--;
            System.out.println("Element is popped: "+val);
            return val;
        }else {
            System.out.println("Stack underflow...");
            return -1;
        }
    }
    public static void main(String[] args){
        Stack s1 = new Stack(5);
        s1.push(2);
        s1.push(5);
        s1.push(7);
        s1.push(9);
        s1.push(3);
        s1.pop();
        System.out.println("Peek element is: "+s1.peek());

    }
}
