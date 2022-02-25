package Queue;

public class stack {
	
	private int maxSize;
	private int stack_array[];
	private int top;
	
	public stack(int maxSize) {
		this.maxSize=maxSize;
		stack_array = new int[this.maxSize];
		top=-1;
		
	}
	
	public void Push(int num) {
		if(!isFull()) {
			this.stack_array[++top]=num;
		}
		else {
			System.out.println("Stack is full..!!");
		}
	}
	
	public int Pop() {
		if(!isEmpty()) {
			return this.stack_array[top--];
		}
		else {
			System.out.println("Stack is Empty..!!");
		}
		return 0;
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(this.top==this.maxSize-1) {
			return true;
		}
		else {
			return false;
		}
	}

}
