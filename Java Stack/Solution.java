import java.util.*;
class Solution{
	public static boolean stack(String s)
    {   
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
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            boolean result=stack(input);
            System.out.println(result);
		}
		sc.close();
	}
}




