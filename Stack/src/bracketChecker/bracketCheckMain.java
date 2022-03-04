
package bracketChecker;
import java.util.*;

public class bracketCheckMain {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String Str;
        System.out.print("Enter String : ");
        Str = sc.next();

        
        bracketCheck B1 = new bracketCheck(Str);
        
        B1.Bcheck();
    }
}
