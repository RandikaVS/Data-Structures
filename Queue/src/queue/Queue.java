
package queue;


public class Queue {

   public int front;
   public int rare;
   public int maxSize;
   public String Queue_array[];
   
   public Queue(int size){
       this.maxSize=size;
       this.Queue_array = new String[size];
       this.front=0;
       this.rare=-1;
   }
   
   public boolean isEmpty(){
       if(this.rare==-1)
           return true;
       else
           return false;
   }
   
   public boolean isFull(){
       if(this.rare==this.maxSize-1)
           return true;
       else
           return false;
   }
    
   public String remove(){
       
       if(isEmpty()){
           System.out.println("Queue is empty...");
           return null;
       }
       else{
           System.out.println(this.Queue_array[this.front]+" Removed");
           return this.Queue_array[this.front++];
       }
   }
   
   public String peekFront(){
       if(isEmpty()){
           System.out.println("Queue is empty...");
           return null;
       }
       else{
           System.out.println(this.Queue_array[this.front]+" Peeked");
           return this.Queue_array[this.front];
       }
   }
   
   public void insert(String val){
       
       if(isFull()){
           System.out.println("Queue is full...");
       }
       else{
           System.out.println(val +" inserted ");
           this.Queue_array[++rare]=val;
       }
   }
}
