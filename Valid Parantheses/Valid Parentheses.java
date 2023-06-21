class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<Character>();
         int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(')
                s1.push(s.charAt(i));
            else if(s.charAt(i)==']' || s.charAt(i)=='}' || s.charAt(i)==')')
            {
                if(s1.size() == 0)
                    return false;
                char b = s1.pop();
                if(s.charAt(i) == ']' && b == '[')
                    continue;
                else if(s.charAt(i) == '}' && b=='{')
                    continue;
                else if (s.charAt(i)==')' && b == '(')
                    continue;
                else
                        return false;

            }
        }
        if(s1.size()==0)
        return true;
        return false;
   
    }
}