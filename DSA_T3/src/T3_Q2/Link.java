package T3_Q2;

public class Link {
	
	public int iData;
	public Link next;
	
	public Link(int i) {
		this.iData=i;
		this.next=null;
	}
	
	public void displayLink() {
		System.out.println(this.iData);
	}

}
