import java.util.*;
public class BraceChecker {

  public boolean isValid(String s) {
    Stack<Character>lt =new Stack<Character>();
        for(int i=0;i<s.length();i++)
            {   char x=s.charAt(i);
                if(x=='[' || x=='{' || x=='(')
                {
                    
                        lt.push(x);
                }
                else if(lt.empty())
                {
                    return false;
                }
                else 
                {
                   char top = lt.pop();
                   if ((top == '(' && x != ')') || (top == '[' && x != ']')|| (top == '{' && x != '}')) 
                   {
                    return false;
                   }
                }
                }
             
        return lt.empty();
  }

}
