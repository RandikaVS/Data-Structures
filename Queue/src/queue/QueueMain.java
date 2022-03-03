
package queue;
import java.util.*;

public class QueueMain {
    
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int Qsize;
     
        System.out.print("Enter Queue size : ");
        Qsize=Sc.nextInt();
     
        Queue Q1 = new Queue(Qsize);
        
        for(int i=0;i<Qsize;i++){
            System.out.print("Enter Queue value : ");
            String val =Sc.next();
            Q1.insert(val);
        }
        
        Q1.peekFront();
        
        for(int i=0;i<Qsize;i++){
            Q1.remove();
        }
        
    }
    
}
