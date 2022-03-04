
package SinglyLinkList;

public class Link {
    
    public Link next;
    public int data;
    
    public Link(int data){
        this.data=data;
    }
    
    public void displayLink(){
        System.out.println(this.data);
    }
    
}
