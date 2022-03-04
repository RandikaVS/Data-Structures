
package SinglyLinkList;

public class SinglyListMain {
    
    public static void main(String args[]){
    LinkList L1 = new LinkList();
    
    L1.insertFirst(1);
    L1.insertFirst(2);
    L1.insertFirst(3);
    L1.insertFirst(4);
    L1.insertFirst(5);
    
    L1.displayList();
    
    L1.insertLast(0);
    
    L1.displayList();
    
    L1.deleteFirst();

    L1.displayList();
    
    L1.deleteLast();
    
    L1.displayList();
    
    L1.insertMiddle(3, 8);
    
    L1.displayList();
    
    L1.deleteMiddle(8);
    
    L1.displayList();
    
    }
}
