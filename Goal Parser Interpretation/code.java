class Solution {
    public String interpret(String command) {
        String res="";
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
            {
                res+="G";
            }
            else if(command.charAt(i)=='(')
            {
                if(command.charAt(i+1)==')')
                {
                    i++;
                    res+="o";
                }
                else if(command.charAt(i+1)=='a')
                {
                        i+=2;
                        res+="al";
                    }
                }
            }
        return res;
        }
}