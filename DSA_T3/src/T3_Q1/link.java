package T3_Q1;

public class link {
	
	public String name;
	public link next;
	
	public link(String name) {
		this.name=name;
		this.next=null;
	}
	public void displayLink(){
		System.out.println(this.name);
	}
}
