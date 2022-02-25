package PrinterQueue;
import java.util.*;
public class printerQueueMain {

	public static void main(String[] args) {
		int size;
		
		Scanner myScanner =  new Scanner(System.in);
		
		System.out.print("Enter printer queue size : ");
		size=myScanner.nextInt();
		
		System.out.println("\n");
		
		int[] jobIDs = new int[size];
		
		printerQueue Q1 =new printerQueue(size);
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter Job ID : ");
			jobIDs[i]=myScanner.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			Q1.insert(jobIDs[i]);
		}
		System.out.println("\n");
		for(int i=0;i<size;i++) {
			if(jobIDs[i]%2==0) {
				System.out.println("Job ID "+jobIDs[i]+" is sent to PC1");
			}
			else {
				System.out.println("Job ID "+jobIDs[i]+" is sent to PC2");
			}
		}
		
		System.out.println("\n");
		for(int i=0;i<size;i++) {
			if(jobIDs[i]/2==0) {
				Q1.remove();
				System.out.println("Job ID "+jobIDs[i]+"	"+"(PC1)");
			}
			else {
				Q1.remove();
				System.out.println("Job ID "+jobIDs[i]+"	"+"(PC2)");
			}
		}
		
		

	}

}
