package Addi_Q1;

public class LinkList {
	
	private Link head;
	private Link tail;
	private int length;
	
	public LinkList() {
		this.head=null;
		this.tail=null;
		this.length=0;
		
	}
	
	public boolean isEmpty() {
		if(this.length==0)
			return true;
		else
			return false;
	}
	
	public int length() {
		return length;
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
		newLink.prev=null;
		length++;
	}
	
	public Link deleteFirst() {
		
		Link temp=head;
		head.next=head;
		head.prev=null;
		length--;
		return temp;
	}
	
	public void insertLast(int val) {
		
		Link newLink = new Link(val);
		
		if(isEmpty()) {
			head=newLink;
		}
		else {
			tail.next=newLink;
		}
		newLink.prev=tail;
		newLink=tail;
		length++;
	}
	
	public void displayForward() {
		
		if(head==null)
			return;
		
		Link temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+"---> ");
			temp=temp.next;
		}
		System.out.print("null");
	}
	
	public void displayBackward() {
		
		if(tail==null) {
			return;
		}
		Link temp = tail;
		
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	
	
	
	
	
	
	
	
	
	

}
