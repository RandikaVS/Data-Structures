package linkQ2;

public class linkMain {

	public static void main(String[] args) {
	
		link_List L1=new link_List();
		
		L1.insertFirst("Prashani",69.5);
		L1.insertFirst("Aravinda",78.0);
		L1.insertFirst("Nipuna",53.5);
		
		L1.displayList();
		
		L1.deleteLink("Aravinda");
		
		L1.displayList();
	}
	
	
}
