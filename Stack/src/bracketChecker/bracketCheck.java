
package bracketChecker;

import Stack.Stack;

public class bracketCheck {
    
    public String inputStr;
    
    public bracketCheck(String Str){
        this.inputStr=Str;
    }
    
    public void Bcheck(){
        int size = this.inputStr.length();
        Stack Bstack = new Stack(size);
        
        for(int i=0;i<size;i++){
            
        if(!Bstack.isFull()){
            if(this.inputStr.charAt(i)=='('){
                Bstack.push('(');
            }
        
            else if(this.inputStr.charAt(i)==')'){
                Bstack.pop();
            }
        }
        else{
                System.out.println("Stack is full..");
            }
        }
        
        if(Bstack.isEmpty()){
            System.out.println("Valid String...");
        }
        else{
            System.out.println("Invalid String...");
        }
    }
    
}
