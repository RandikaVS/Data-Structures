package linkQ1;

public class Link_main {

	public static void main(String[] args) {
		Link_list L1 = new Link_list("Nipuna",53.5);
		Link_list L2 = new Link_list("Aravinda",78.0);
		Link_list L3 = new Link_list("Prashani",69.5);
		
		L1.next=L2;
		L2.next=L3;
		L3.next=null;
		
		L1.displayDetails();
		L2.displayDetails();
		L3.displayDetails();
	
	}

}
