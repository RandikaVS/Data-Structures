package T3_Q2;

public class LinkMain {

	public static void main(String[] args) {

		LinkList L1 = new LinkList();
		
		L1.insertFirst(5);
		L1.insertFirst(4);
		L1.insertFirst(3);
		L1.insertFirst(2);
		L1.insertFirst(1);
		
		L1.displayLinks();
		
		if(L1.insertAfter(4, 9))
			System.out.println("Data Link added successfully...");
		else {
			System.out.println("New link inserting failed..!!");
		}
		L1.displayLinks();
		
		L1.delete(9);
		
		L1.displayLinks();
		
		Link L2 = L1.find(3);
		System.out.println(L2.iData);
		
		
		
	}

}
