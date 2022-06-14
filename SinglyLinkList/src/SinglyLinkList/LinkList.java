
package SinglyLinkList;

public class LinkList {
    
    private Link first;
    private int length;
    
    public LinkList(){
        this.first=null;
        this.length=0;
    }
    
    public boolean isEmpty(){
        if(getLenght()==0)
            return true;
        else
            return false;
    }
    
    public int getLength(){
        return this.length;
    }
    
    public void displayList(){
        Link temp=first;
        
        if(temp==null){
            System.out.print("null");
            return;
        }
        else{
            
            while(temp!=null){
                System.out.print(temp.data+"---> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    
    public void insertFirst(int val){
        Link newLink = new Link(val);
        
        if(isEmpty()){
            first=newLink;
            first.next=null;
            length++;
        }
        else{
            newLink.next=first;
            first=newLink;
            length++;
        }
    }
    
    public void insertLast(int val){
        
        Link newLink = new Link(val);
        
        Link temp=first;
        
        if(temp==null){
            System.out.println("Link list is empty use"+ " insertFirst "+"method..");
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
        }
        temp.next=newLink;
        newLink.next=null;
        length++;
        
    }
    
    public void insertMiddle(int prev,int val){
        
        Link temp=first;
        Link newLink = new Link(val);
        
        while(temp.data!=prev){
            temp=temp.next;
        }
        newLink.next=temp.next;
        temp.next=newLink;
        length++;
    }
    
    public Link deleteFirst(){
        
        Link temp=first;
        first=first.next;
        length--;
        return temp;
    }
    
    public Link deleteLast(){
        
        Link temp=first;
        Link prev=first;
        int count=0;
        
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        for(int i=0;i<count-1;i++){
            prev=prev.next;
        }
        prev.next=null;
        length--;
        return temp;
    }
    
    public Link deleteMiddle(int val){
        
        Link temp=first;
        Link prev=first;
        int count=0;
        while(temp.data!=val){
            temp=temp.next;
            count++;
        }
        for(int i=0;i<count-1;i++){
            prev=prev.next;
        }
        prev.next=temp.next;
        length--;
        return temp;
    }
    
    
    
}
