package QueueX;
import java.util.*;

public class mainQueue {
	
	public static void main(String[] args) {
		
		Scanner Scr=new Scanner(System.in);
		int size,input;
		System.out.print("Enter Queue size : ");
		size=Scr.nextInt();
		System.out.println("");

		QueueX Q1 = new QueueX(size);
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter transaction ID "+i+1+" "+": ");
			input=Scr.nextInt();
			Q1.insert(input);
		}
		
		QueueX evenQueue=new QueueX(size);
		QueueX oddQueue =new QueueX(size);
		int value;
		System.out.println("");
		while(!Q1.isEmpty()) {
			value=Q1.remove();
			if(value%2==0) {
				evenQueue.insert(value);
				}
			else {
				oddQueue.insert(value);
			}
		}
		
		System.out.println("PC1");
		System.out.println("");
		while(!evenQueue.isEmpty()) {
			System.out.println("Transaction "+evenQueue.remove());
		}
		System.out.println("PC2");
		System.out.println("");
		while(!oddQueue.isEmpty()) {
			System.out.println("Transaction "+oddQueue.remove());
		}
		
	}

}
