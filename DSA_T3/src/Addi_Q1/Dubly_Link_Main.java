package Addi_Q1;

public class Dubly_Link_Main {

	public static void main(String[] args) {
			
		LinkList L1 = new LinkList();
		
		L1.insertFirst(1);
		L1.insertFirst(2);
		L1.insertFirst(3);
		L1.insertFirst(4);
		L1.insertFirst(5);
		
		L1.displayForward();
		L1.deleteFirst();
		L1.displayForward();
	}

}
