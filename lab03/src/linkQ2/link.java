package linkQ2;

public class link{
	
	public String name;
	public double avg;
	public link next;
	
	public link(String name,double avg) {
		this.name=name;
		this.avg=avg;
		this.next=null;
	}
	
	public void displayLink() {
		System.out.println(this.name+" "+this.avg);
	}
}
