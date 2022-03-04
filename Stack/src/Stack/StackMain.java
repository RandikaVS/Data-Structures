
package Stack;
import java.util.*;

public class StackMain {
    
    public static void main(String args[]){
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Stack size : ");
        max=sc.nextInt();
        
        Stack ST1 = new Stack(max);
        
        for(int i =0;i<max;i++){
            System.out.print("Enter value : ");
            ST1.push(sc.next().charAt(0));
        }
        for(int i =0 ; i<max ; i++){
            System.out.println(ST1.pop());
        }
        
    }
    
}
