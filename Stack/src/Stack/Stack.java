
package Stack;


public class Stack {
    
    public char[] stack_Array;
    public int top;
    public int maxSize;
    
    public Stack(int size){
        this.maxSize=size;
        this.top=-1;
        this.stack_Array = new char[size];
    }
    
    public boolean isEmpty(){
        if(this.top==-1)
            return true;
        else
            return false;
    }
    
    public boolean isFull(){
        if(this.top==this.maxSize-1)
            return true;
        else
            return false;
    }
    
    public void push(char val){
        if(!isFull()){
            this.stack_Array[++top]=val;
        }
        else{
            System.out.println("Stack is full...");
        }
    }
    public char pop(){
        if(!isEmpty()){
            return this.stack_Array[top--];
        }
        else{
            System.out.println("Stack is empty...");
        }
        return 0;
    }
    
    public char peek(){
        if(!isEmpty()){
            return this.stack_Array[top];
        }
        else{
            System.out.println("Stack is empty...");
        }
        return 0;
    }
}
