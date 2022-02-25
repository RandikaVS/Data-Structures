package PrinterQueue;

public class printerQueue {
	
	private int []job_Arr;
	private int front;
	private int rear;
	private int maxSize;
	private int noOfItems;

	public printerQueue(int maxSize) {
		this.maxSize=maxSize;
		this.job_Arr =new int [this.maxSize];
		this.front=0;
		this.rear=-1;
		this.noOfItems=0;
	}
	
	public void insert(int jobID) {
		if(!isFull()) {
			this.job_Arr[++this.rear]=jobID;
			this.noOfItems++;
			
		}
		else {
			System.out.println("Queue is full..!!");
		}
	}
	
	public int remove() {
		if(!isEmpty()) {
			this.noOfItems--;
			return this.job_Arr[front++];
		}
		else {
			System.out.println("Queue is Empty..!!");
		}
		return 0;
	}
	
	public boolean isFull() {
		if(this.rear==this.maxSize-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(this.rear==-1) {
			return true;
		}
		else {
			return false;
		}
	}

}
