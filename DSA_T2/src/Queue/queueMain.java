package Queue;
import java.util.*;
public class queueMain {
	
	public static void main(String [] args) {
		
		int size;
		Scanner myScanner =new Scanner(System.in);
		
		System.out.print("Enter size of Queue : ");
		
		size = myScanner.nextInt();
		
		int[] number = new int [size];
		
		for(int n=0;n<size;n++) {
			System.out.print("Enter Number : ");
			number[n]=myScanner.nextInt();
		}
		
		queue Q1 = new queue(size);
		stack St1 = new stack(size);
		
		//Insert the values
		for(int i=0;i<size;i++) {
			
			Q1.insert(number[i]);
		}	
		
		//array add to the stack
		for(int i=0;i<size;i++) {
			St1.Push(number[i]);
		}
		for(int i=0;i<size;i++) {
			System.out.println("Reversed value : "+St1.Pop());
		}
		//Peek the front value
		//Q1.frontPeek();
			
		//Remove the values
		for(int i=0;i<size;i++) {
			
			Q1.remove();
		}
	}

}
