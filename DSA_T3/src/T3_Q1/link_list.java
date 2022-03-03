package T3_Q1;

public class link_list {
	
	private link first;
	
	public link_list() {
		this.first=null;
	}
	
	public void insertFirst(String name) {
		 link newLink= new link(name);
		 newLink.next=first;
		 first=newLink;
	 }
	
	public link deleteLink(String name) {
		link current = first;
		link previous = first;
		
		while(current.name!=name) {
			
			if(current.name==null)
				return null;
			else {
				previous=current;
				current=current.next;
			}
		}
		if(current==first) {
			first=first.next;
		}
		else {
			previous.next=current.next;
		}
		return current;
	}
	
	public void insertAfter(String Lname,String name) {
		 link newLink= new link(name);

		link current=first;
		
		do {
			if(current.name==Lname) {
				newLink.next=current.next;
				current.next=newLink;
				break;
			}
			else {
				current=current.next;
			}
		}while(current.next!=null);
		
		
	}

	public void displayList() {
		System.out.println("List from first link to the 1st link"+"\n");
		link current=first;
		
		while(current!=null) {
			current.displayLink();
			current=current.next;
		}
	}

}
 