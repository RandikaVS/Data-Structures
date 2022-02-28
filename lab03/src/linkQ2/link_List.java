package linkQ2;

public class link_List {
	
	private link first;
	
	public link_List() {
		first=null;
	}
	
	public boolean isEmpty() {
		if(first==null) {
			return true;
		}
		else {
			return false;
		}
	}
	public void insertFirst(String name,double avg) {
		link newLink=new link(name,avg);
		newLink.next=first;
		first=newLink;
	}
	public link deleteFirst() {
		link temp=first;
		first=first.next;
		return temp;
	}
	
	public void displayList() {
		
		System.out.println("List from first link to the 1st link");
		link current=first;
		
		while(current!=null) {
			current.displayLink();
			current=current.next;
		}
	}
	
	public link deleteLink(String name) {
		
		link current = first;
		link previous = first;
		
		while(current.name!=name) {
			
			if(current.next==null)
				return null;
			else {
				previous=current;
				current=current.next;
			}
			
		}
		if(current==first) {
			first=first.next;
		}
		else{
			previous.next=current.next;
		}
		return current;
	}
	
}
