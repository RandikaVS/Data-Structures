package Queue;

public class queue {
	
	private int maxSize;
	private int []queue_array;
	private int front;
	private int rear;
	private int noOfItems;
	
	public queue(int maxSize) {
		this.maxSize=maxSize;
		this.queue_array=new int[maxSize];
		this.front=0;
		this.rear=-1;
		this.noOfItems=0;
	}
	public void insert(int num) {
		if(this.noOfItems==this.maxSize) {
			System.out.println("Queue is full..");
		}
		else {
			this.queue_array[++rear]=num;
			this.noOfItems++;
			System.out.println(num+" "+"Inserted successfully"+" "+"at index of "+this.rear);
		}
	}
	
	public int remove() {
		int num;
		if(rear==-1) {
			System.out.println("Queue is empty...");
		}
		else {
			this.noOfItems--;
			num=this.queue_array[this.front++];
			System.out.println(num+" "+"Removed successfully"+" "+"at index of "+this.front);
			return num;

		}
		return 0;
	}
	
	public int frontPeek() {
		int num;
		if(rear==-1) {
			System.out.println("Queue is empty...");
		}
		else {
			num = this.queue_array[front];
			System.out.println(num+" "+"Peeked"+" "+"at index of "+this.front);
			return num;
		}
		return 0;
	}
	

}
