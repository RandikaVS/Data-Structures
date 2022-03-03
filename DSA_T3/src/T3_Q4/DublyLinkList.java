package T3_Q4;

public class DublyLinkList {
		
	private Link head;
	private Link tail;
	private int length;
	
	
	public DublyLinkList() {
		
			this.head=null;
			this.tail=null;
			this.length=0;
	}
	public boolean isEmpty() {
		if(length==0) {
			return true;
		}
		else
			return false;
	}
	
	public int length() {
		return this.length;
	}
	
	public void displayForward() {
		
		if(head==null) {
			return;
		}
		
		Link temp=head;
		
		while(temp!=null) {
			System.out.print(temp.Data+"---> ");
			temp=temp.next;
		}
		System.out.println("null");

	}
	
	
	public void displayBackward() {
		
		Link temp=tail;
		
		if(tail==null)
			return;
		
		while(temp!=null) {
			System.out.print(temp.Data+"---> ");
			temp=temp.prev;
		}
		System.out.println("null");
	}
	
	public void insertFirst(int val) {
		Link newLink = new Link(val);
		
		if(isEmpty()) {
			tail=newLink;
		}
		else {
			head.prev=newLink;
		}
		newLink.next=head;
		head=newLink;
		length++;
		
	}
	
	public void insertLast(int val) {
		Link newLink = new Link(val);
		
		if(isEmpty()) {
			head=newLink;
		}
		else {
			newLink.prev=tail;
			tail.next=newLink;
			newLink=tail;
			length++;
		}
	}
	
	public Link deleteFirst() {
		
		Link temp = head;
		head=head.next;
		head.prev=null;
		length--;
		return temp;
		
	}
	
	public Link deleteLast() {
		
		Link temp=tail;
		 tail=tail.prev;
		 tail.next=null;
		 return temp;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
