package QueueX;

public class QueueX {
	private int []queueArray;
	private int maxSize;
	private int front;
	private int rare;
	private int noOfItems;

	public QueueX(int maxSize) {
		this.maxSize=maxSize;
		this.queueArray=new int[maxSize];
		this.front=0;
		this.rare=-1;
		this.noOfItems=0;
	}
	
	public void insert(int num) {
		
		if(!isFull()) {
			this.queueArray[++this.rare]=num;
			this.noOfItems++;
		}
		else {
			System.out.println("Queue is full..!!");
		}
	}
	
	public int remove() {
		if(!isEmpty()) {
			this.noOfItems--;
			return this.queueArray[front++];
		}
		else {
			System.out.println("Queue is Empty..!");
		}
		return 0;
	}
	
	public boolean isEmpty() {
		if(this.noOfItems==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(this.rare==this.maxSize-1) {
			return true;
		}
		else {
			return false;
		}
	}

}
