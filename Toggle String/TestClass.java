
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     Scanner sc=new Scanner(System.in);
     String input=sc.next();
     String out="";
     char[] ip=input.toCharArray();
     for(int i=0;i<input.length();i++)
     {
        int x=ip[i];
        if(x>=97 && x<=122)
        {   x=x-32;
            out=out+(char)x;
        }
        else
        {
            x=x+32;
            out=out+(char)x;
        } 
     }
     System.out.println(out);
    }
}

