
import java.util.*;
class PalindromicString
 {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc =new Scanner(System.in);
        String name = sc.next(); //Getting Input String
        String out="";
        for(int i=name.length()-1;i>=0;i--)
        {
            // Reversing The String name
            String ch=Character.toString(name.charAt(i));
            out=out+ch; 
        }
        // Checking Input And Reversed String Are Same
        // If Same Print "YES"
        // Else Print "No"
        if(name.equals(out))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}

