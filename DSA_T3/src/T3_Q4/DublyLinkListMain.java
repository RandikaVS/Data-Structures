package T3_Q4;

public class DublyLinkListMain {

	public static void main(String[] args) {

			DublyLinkList DL1 = new DublyLinkList();
			
			DL1.insertFirst(1);
			DL1.insertFirst(2);
			DL1.insertFirst(3);
			DL1.insertFirst(4);
			DL1.insertFirst(5);
			
			//DL1.displayForward();
			//DL1.displayBackward();
			
			DL1.deleteFirst();
		
			DL1.displayForward();
			
			DL1.insertFirst(5);
			
			DL1.displayForward();
			DL1.deleteLast();
			DL1.displayForward();
	}

}
