package T3_Q2;

public class LinkList {
	
	private Link first;
	
	public LinkList() {
		first=null;
	}
	
	public boolean isEmpty() {
		if(first!=null)
			return false;
		else
			return true;
	}
	
	public boolean insertAfter(int key,int newData) {
		
		Link newLink = new Link(newData);
		Link current=first;
		boolean isSuccess=false;
		
		while(current.next!=null) {
			if(current.iData==key) {
				newLink.next=current.next;
				current.next=newLink;
				isSuccess=true;
				break;
			}
			else {
				current=current.next;
			}
		}
		return isSuccess;
	}
	
	public void insertFirst(int data) {
		Link newLink = new Link(data);
		newLink.next=first;
		first=newLink;
	}
	

	public void displayLinks() {
		System.out.println("This is link list : ");
		Link current=first;
		
		while(current!=null) {
			current.displayLink();
			current=current.next;
		}
	}
	
	public Link delete(int key) {
		
		Link current=first;
		Link pervious=first;
		
		while(current!=null) {
			if(current.iData==key) {
				break;
			}
			else {
				pervious=current;
				current=current.next;
			}
		}
		if(current==first) {
			first=current.next;
		}
		else {
			pervious.next=current.next;
		}
		return current;
	}
	
	public Link find(int key) {
		
		Link current=first;
		
		while(current!=null) {
			if(current.iData==key)
				break;
			else {
				current=current.next;
			}
		}
		return current;
	}

}
