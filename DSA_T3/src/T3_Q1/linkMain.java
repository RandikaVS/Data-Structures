package T3_Q1;

public class linkMain {

	public static void main(String[] args) {
		
		link_list L1=new link_list();
		
		L1.insertFirst("Nisha");
		L1.insertFirst("Mihiri");
		L1.insertFirst("Akila");
		L1.insertFirst("Mithila");
		
		L1.displayList();
		
		link temp = L1.deleteLink("Mihiri");
		L1.insertFirst(temp.name);
		L1.displayList();
		
		temp = L1.deleteLink("Mithila");
		L1.insertAfter("Akila",temp.name);
		L1.displayList();
		
		temp = L1.deleteLink("Mihiri");
		L1.insertAfter("Mithila",temp.name);
		L1.displayList();
		
		temp=L1.deleteLink("Mithila");
		L1.insertFirst(temp.name);
		L1.displayList();


	}

}
