package linkQ1;

public class Link_list {

	public String name;
	public double avg;
	public Link_list next;
	
	public Link_list(String name, double avg) {
		super();
		this.name = name;
		this.avg = avg;
		this.next = null;
	}
	
	public void displayDetails() {
		System.out.println(name+" "+avg);
	}
	
	
	

}
